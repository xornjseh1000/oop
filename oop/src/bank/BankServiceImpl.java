package bank;

import java.util.ArrayList;
import java.util.List;


public class BankServiceImpl implements BankService {
	List<AccountBean> list;
	
	public BankServiceImpl() {
		list = new ArrayList<AccountBean>();
	}

	@Override
	public void openAccount(AccountBean acc) {
		// 11번개설 (은행창구 개설)

		list.add(acc);
	}

	@Override
	public String accountList() {
		return list.toString();
	}

	@Override
	public String findByAccountNo(String searchAcc) {
		AccountBean search = new AccountBean();
		String result = "조회 계좌번호 없음";
		for (int i = 0; i < list.size(); i++) {
			if (Integer.toString(list.get(i).getAccountNo()).equals(searchAcc)) {
				search = list.get(i);
				break;
			} 
		}
			if (search.getId() != null) {
				result = search.toString();
			} 
		return result;

	}

	@Override
	public void findByName(String name) {

	}

	@Override
	public int count() {
		// 15 계좌수
		return list.size();

	}

	@Override
	public void showAccount() {

	}

	@Override
	public void updateAccount() {

	}

	@Override
	public void deleteaccount() {

	}

}
