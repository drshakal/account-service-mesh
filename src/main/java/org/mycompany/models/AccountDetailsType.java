package org.mycompany.models;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AccountDetailsType {
	    protected String accountId;
	    protected String accountType;
	    protected String accountTypeDescription;
	    protected String branch;
	    protected CustomerID customerId;
	    protected String segment;
	    protected String isoCurrencyCode;
	    protected String accountStatus;
	    protected String accountStatusDescription;
	    protected String accountIntCat;
	    protected String accountIntCatDescription;
	    protected String accountStmtFrequency;
	    protected String atmFlag;
	    protected String calendar;
	    protected String languageCode;
	    protected String noStops;
	    protected String stopDescription;
	    protected BigInteger noOfMessages;
	    protected MoneyOptional accountAvgClBalChPer;
	    protected MoneyOptional accountAvgBalYTD;
	    protected MoneyOptional accountHeld;
	    protected MoneyOptional accountUncleared;
	    protected MoneyOptional accountBalance;
	    protected MoneyOptional accountOverdraft;
	    protected MoneyOptional accountAvailable;
	    protected String accountLastFinDate;
	    protected String accountLastStmtDate;
	    protected String accountOpenDate;
	    protected String name1;
	    protected String name2;
	    protected String accountInd1;
	    protected String accountInd2;
	    protected String ivrFlag;
	    protected String accountUnclaimCloseDate;
	    protected String accountGLClassificationCode;
	    protected MoneyOptional accountAverageLastSixMonths;
	    protected UserCodeType accountUserCode;
	    protected ChequeBookType accountChequeBook;
	    protected MoneyOptional accountSARBalance;
	    protected MoneyOptional accountSARAvailable;
	    protected MoneyOptional accountCreditLimit;
	    protected BigInteger accountGroupIndicator;
	    protected BigInteger accountAgentCode;
	    protected String accountNoticeIndicator;
	    protected AccountAddressType accountAddress;
	    protected String accountTitleCode;
	    protected String accountTitleDesc;
	    protected String accountDivisionCode;
	    protected String accountOverDraftShadowFlag;
	    protected String accountManager;
	    protected OverdraftDetailType accountOverdraftDetail;
	    protected String accountSubStatus;
	    protected String accountSubStatusDescription;
	    protected Boolean accountIsPayroll;
	    protected Boolean accountIsCashAdvance;
	    protected MoneyOptional accountCashAdvanceAvailable;
	    protected MoneyOptional minBalance;
	    protected MoneyOptional maxBalance;
	    protected MoneyOptional returnsAccrued;
	    protected BigDecimal profitRate;
	    protected String creditReturnDate;
	    protected String sadadCollectionFlag;
	    protected String sadadCreditFlag;
	    protected String sadadDebitFlag;
	    protected String linkedAccount;
	    protected String currencyKhayrat;
	    protected String maturityDateKhayrat;
	    protected String profitAmount;
	    protected String maturityAmount;
	    protected String rollOverOption;
	    protected String commodityName;
	    protected String commoditySupplier;
	    protected String commodityPrice;
	    protected String commodityDefferedPrice;
	    protected String commodityQuantity;
	    protected String treasuryReferenceNumber;
		public String getAccountId() {
			return accountId;
		}
		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public String getAccountTypeDescription() {
			return accountTypeDescription;
		}
		public void setAccountTypeDescription(String accountTypeDescription) {
			this.accountTypeDescription = accountTypeDescription;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public CustomerID getCustomerId() {
			return customerId;
		}
		public void setCustomerId(CustomerID customerId) {
			this.customerId = customerId;
		}
		public String getSegment() {
			return segment;
		}
		public void setSegment(String segment) {
			this.segment = segment;
		}
		public String getIsoCurrencyCode() {
			return isoCurrencyCode;
		}
		public void setIsoCurrencyCode(String isoCurrencyCode) {
			this.isoCurrencyCode = isoCurrencyCode;
		}
		public String getAccountStatus() {
			return accountStatus;
		}
		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}
		public String getAccountStatusDescription() {
			return accountStatusDescription;
		}
		public void setAccountStatusDescription(String accountStatusDescription) {
			this.accountStatusDescription = accountStatusDescription;
		}
		public String getAccountIntCat() {
			return accountIntCat;
		}
		public void setAccountIntCat(String accountIntCat) {
			this.accountIntCat = accountIntCat;
		}
		public String getAccountIntCatDescription() {
			return accountIntCatDescription;
		}
		public void setAccountIntCatDescription(String accountIntCatDescription) {
			this.accountIntCatDescription = accountIntCatDescription;
		}
		public String getAccountStmtFrequency() {
			return accountStmtFrequency;
		}
		public void setAccountStmtFrequency(String accountStmtFrequency) {
			this.accountStmtFrequency = accountStmtFrequency;
		}
		public String getAtmFlag() {
			return atmFlag;
		}
		public void setAtmFlag(String atmFlag) {
			this.atmFlag = atmFlag;
		}
		public String getCalendar() {
			return calendar;
		}
		public void setCalendar(String calendar) {
			this.calendar = calendar;
		}
		public String getLanguageCode() {
			return languageCode;
		}
		public void setLanguageCode(String languageCode) {
			this.languageCode = languageCode;
		}
		public String getNoStops() {
			return noStops;
		}
		public void setNoStops(String noStops) {
			this.noStops = noStops;
		}
		public String getStopDescription() {
			return stopDescription;
		}
		public void setStopDescription(String stopDescription) {
			this.stopDescription = stopDescription;
		}
		public BigInteger getNoOfMessages() {
			return noOfMessages;
		}
		public void setNoOfMessages(BigInteger noOfMessages) {
			this.noOfMessages = noOfMessages;
		}
		public MoneyOptional getAccountAvgClBalChPer() {
			return accountAvgClBalChPer;
		}
		public void setAccountAvgClBalChPer(MoneyOptional accountAvgClBalChPer) {
			this.accountAvgClBalChPer = accountAvgClBalChPer;
		}
		public MoneyOptional getAccountAvgBalYTD() {
			return accountAvgBalYTD;
		}
		public void setAccountAvgBalYTD(MoneyOptional accountAvgBalYTD) {
			this.accountAvgBalYTD = accountAvgBalYTD;
		}
		public MoneyOptional getAccountHeld() {
			return accountHeld;
		}
		public void setAccountHeld(MoneyOptional accountHeld) {
			this.accountHeld = accountHeld;
		}
		public MoneyOptional getAccountUncleared() {
			return accountUncleared;
		}
		public void setAccountUncleared(MoneyOptional accountUncleared) {
			this.accountUncleared = accountUncleared;
		}
		public MoneyOptional getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(MoneyOptional accountBalance) {
			this.accountBalance = accountBalance;
		}
		public MoneyOptional getAccountOverdraft() {
			return accountOverdraft;
		}
		public void setAccountOverdraft(MoneyOptional accountOverdraft) {
			this.accountOverdraft = accountOverdraft;
		}
		public MoneyOptional getAccountAvailable() {
			return accountAvailable;
		}
		public void setAccountAvailable(MoneyOptional accountAvailable) {
			this.accountAvailable = accountAvailable;
		}
		public String getAccountLastFinDate() {
			return accountLastFinDate;
		}
		public void setAccountLastFinDate(String accountLastFinDate) {
			this.accountLastFinDate = accountLastFinDate;
		}
		public String getAccountLastStmtDate() {
			return accountLastStmtDate;
		}
		public void setAccountLastStmtDate(String accountLastStmtDate) {
			this.accountLastStmtDate = accountLastStmtDate;
		}
		public String getAccountOpenDate() {
			return accountOpenDate;
		}
		public void setAccountOpenDate(String accountOpenDate) {
			this.accountOpenDate = accountOpenDate;
		}
		public String getName1() {
			return name1;
		}
		public void setName1(String name1) {
			this.name1 = name1;
		}
		public String getName2() {
			return name2;
		}
		public void setName2(String name2) {
			this.name2 = name2;
		}
		public String getAccountInd1() {
			return accountInd1;
		}
		public void setAccountInd1(String accountInd1) {
			this.accountInd1 = accountInd1;
		}
		public String getAccountInd2() {
			return accountInd2;
		}
		public void setAccountInd2(String accountInd2) {
			this.accountInd2 = accountInd2;
		}
		public String getIvrFlag() {
			return ivrFlag;
		}
		public void setIvrFlag(String ivrFlag) {
			this.ivrFlag = ivrFlag;
		}
		public String getAccountUnclaimCloseDate() {
			return accountUnclaimCloseDate;
		}
		public void setAccountUnclaimCloseDate(String accountUnclaimCloseDate) {
			this.accountUnclaimCloseDate = accountUnclaimCloseDate;
		}
		public String getAccountGLClassificationCode() {
			return accountGLClassificationCode;
		}
		public void setAccountGLClassificationCode(String accountGLClassificationCode) {
			this.accountGLClassificationCode = accountGLClassificationCode;
		}
		public MoneyOptional getAccountAverageLastSixMonths() {
			return accountAverageLastSixMonths;
		}
		public void setAccountAverageLastSixMonths(MoneyOptional accountAverageLastSixMonths) {
			this.accountAverageLastSixMonths = accountAverageLastSixMonths;
		}
		public UserCodeType getAccountUserCode() {
			return accountUserCode;
		}
		public void setAccountUserCode(UserCodeType accountUserCode) {
			this.accountUserCode = accountUserCode;
		}
		public ChequeBookType getAccountChequeBook() {
			return accountChequeBook;
		}
		public void setAccountChequeBook(ChequeBookType accountChequeBook) {
			this.accountChequeBook = accountChequeBook;
		}
		public MoneyOptional getAccountSARBalance() {
			return accountSARBalance;
		}
		public void setAccountSARBalance(MoneyOptional accountSARBalance) {
			this.accountSARBalance = accountSARBalance;
		}
		public MoneyOptional getAccountSARAvailable() {
			return accountSARAvailable;
		}
		public void setAccountSARAvailable(MoneyOptional accountSARAvailable) {
			this.accountSARAvailable = accountSARAvailable;
		}
		public MoneyOptional getAccountCreditLimit() {
			return accountCreditLimit;
		}
		public void setAccountCreditLimit(MoneyOptional accountCreditLimit) {
			this.accountCreditLimit = accountCreditLimit;
		}
		public BigInteger getAccountGroupIndicator() {
			return accountGroupIndicator;
		}
		public void setAccountGroupIndicator(BigInteger accountGroupIndicator) {
			this.accountGroupIndicator = accountGroupIndicator;
		}
		public BigInteger getAccountAgentCode() {
			return accountAgentCode;
		}
		public void setAccountAgentCode(BigInteger accountAgentCode) {
			this.accountAgentCode = accountAgentCode;
		}
		public String getAccountNoticeIndicator() {
			return accountNoticeIndicator;
		}
		public void setAccountNoticeIndicator(String accountNoticeIndicator) {
			this.accountNoticeIndicator = accountNoticeIndicator;
		}
		public AccountAddressType getAccountAddress() {
			return accountAddress;
		}
		public void setAccountAddress(AccountAddressType accountAddress) {
			this.accountAddress = accountAddress;
		}
		public String getAccountTitleCode() {
			return accountTitleCode;
		}
		public void setAccountTitleCode(String accountTitleCode) {
			this.accountTitleCode = accountTitleCode;
		}
		public String getAccountTitleDesc() {
			return accountTitleDesc;
		}
		public void setAccountTitleDesc(String accountTitleDesc) {
			this.accountTitleDesc = accountTitleDesc;
		}
		public String getAccountDivisionCode() {
			return accountDivisionCode;
		}
		public void setAccountDivisionCode(String accountDivisionCode) {
			this.accountDivisionCode = accountDivisionCode;
		}
		public String getAccountOverDraftShadowFlag() {
			return accountOverDraftShadowFlag;
		}
		public void setAccountOverDraftShadowFlag(String accountOverDraftShadowFlag) {
			this.accountOverDraftShadowFlag = accountOverDraftShadowFlag;
		}
		public String getAccountManager() {
			return accountManager;
		}
		public void setAccountManager(String accountManager) {
			this.accountManager = accountManager;
		}
		public OverdraftDetailType getAccountOverdraftDetail() {
			return accountOverdraftDetail;
		}
		public void setAccountOverdraftDetail(OverdraftDetailType accountOverdraftDetail) {
			this.accountOverdraftDetail = accountOverdraftDetail;
		}
		public String getAccountSubStatus() {
			return accountSubStatus;
		}
		public void setAccountSubStatus(String accountSubStatus) {
			this.accountSubStatus = accountSubStatus;
		}
		public String getAccountSubStatusDescription() {
			return accountSubStatusDescription;
		}
		public void setAccountSubStatusDescription(String accountSubStatusDescription) {
			this.accountSubStatusDescription = accountSubStatusDescription;
		}
		public Boolean getAccountIsPayroll() {
			return accountIsPayroll;
		}
		public void setAccountIsPayroll(Boolean accountIsPayroll) {
			this.accountIsPayroll = accountIsPayroll;
		}
		public Boolean getAccountIsCashAdvance() {
			return accountIsCashAdvance;
		}
		public void setAccountIsCashAdvance(Boolean accountIsCashAdvance) {
			this.accountIsCashAdvance = accountIsCashAdvance;
		}
		public MoneyOptional getAccountCashAdvanceAvailable() {
			return accountCashAdvanceAvailable;
		}
		public void setAccountCashAdvanceAvailable(MoneyOptional accountCashAdvanceAvailable) {
			this.accountCashAdvanceAvailable = accountCashAdvanceAvailable;
		}
		public MoneyOptional getMinBalance() {
			return minBalance;
		}
		public void setMinBalance(MoneyOptional minBalance) {
			this.minBalance = minBalance;
		}
		public MoneyOptional getMaxBalance() {
			return maxBalance;
		}
		public void setMaxBalance(MoneyOptional maxBalance) {
			this.maxBalance = maxBalance;
		}
		public MoneyOptional getReturnsAccrued() {
			return returnsAccrued;
		}
		public void setReturnsAccrued(MoneyOptional returnsAccrued) {
			this.returnsAccrued = returnsAccrued;
		}
		public BigDecimal getProfitRate() {
			return profitRate;
		}
		public void setProfitRate(BigDecimal profitRate) {
			this.profitRate = profitRate;
		}
		public String getCreditReturnDate() {
			return creditReturnDate;
		}
		public void setCreditReturnDate(String creditReturnDate) {
			this.creditReturnDate = creditReturnDate;
		}
		public String getSadadCollectionFlag() {
			return sadadCollectionFlag;
		}
		public void setSadadCollectionFlag(String sadadCollectionFlag) {
			this.sadadCollectionFlag = sadadCollectionFlag;
		}
		public String getSadadCreditFlag() {
			return sadadCreditFlag;
		}
		public void setSadadCreditFlag(String sadadCreditFlag) {
			this.sadadCreditFlag = sadadCreditFlag;
		}
		public String getSadadDebitFlag() {
			return sadadDebitFlag;
		}
		public void setSadadDebitFlag(String sadadDebitFlag) {
			this.sadadDebitFlag = sadadDebitFlag;
		}
		public String getLinkedAccount() {
			return linkedAccount;
		}
		public void setLinkedAccount(String linkedAccount) {
			this.linkedAccount = linkedAccount;
		}
		public String getCurrencyKhayrat() {
			return currencyKhayrat;
		}
		public void setCurrencyKhayrat(String currencyKhayrat) {
			this.currencyKhayrat = currencyKhayrat;
		}
		public String getMaturityDateKhayrat() {
			return maturityDateKhayrat;
		}
		public void setMaturityDateKhayrat(String maturityDateKhayrat) {
			this.maturityDateKhayrat = maturityDateKhayrat;
		}
		public String getProfitAmount() {
			return profitAmount;
		}
		public void setProfitAmount(String profitAmount) {
			this.profitAmount = profitAmount;
		}
		public String getMaturityAmount() {
			return maturityAmount;
		}
		public void setMaturityAmount(String maturityAmount) {
			this.maturityAmount = maturityAmount;
		}
		public String getRollOverOption() {
			return rollOverOption;
		}
		public void setRollOverOption(String rollOverOption) {
			this.rollOverOption = rollOverOption;
		}
		public String getCommodityName() {
			return commodityName;
		}
		public void setCommodityName(String commodityName) {
			this.commodityName = commodityName;
		}
		public String getCommoditySupplier() {
			return commoditySupplier;
		}
		public void setCommoditySupplier(String commoditySupplier) {
			this.commoditySupplier = commoditySupplier;
		}
		public String getCommodityPrice() {
			return commodityPrice;
		}
		public void setCommodityPrice(String commodityPrice) {
			this.commodityPrice = commodityPrice;
		}
		public String getCommodityDefferedPrice() {
			return commodityDefferedPrice;
		}
		public void setCommodityDefferedPrice(String commodityDefferedPrice) {
			this.commodityDefferedPrice = commodityDefferedPrice;
		}
		public String getCommodityQuantity() {
			return commodityQuantity;
		}
		public void setCommodityQuantity(String commodityQuantity) {
			this.commodityQuantity = commodityQuantity;
		}
		public String getTreasuryReferenceNumber() {
			return treasuryReferenceNumber;
		}
		public void setTreasuryReferenceNumber(String treasuryReferenceNumber) {
			this.treasuryReferenceNumber = treasuryReferenceNumber;
		}
	    
	    
	    
}
