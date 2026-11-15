package wg;

import android.text.TextUtils;
import android.util.Pair;
import bi.j6;
import di.k7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ki.x2;
import org.json.JSONObject;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.r1;
import org.telegram.messenger.r2;
import org.telegram.messenger.t3;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
public abstract class q {
    public static HashMap f59228a;

    public static void a(long j3, List list, z10 z10Var, z10 z10Var2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.f24940t0);
        np s12 = np.s1(m10.f24940t0);
        TL_stories.TL_premium_applyBoost tL_premium_applyBoost = new TL_stories.TL_premium_applyBoost();
        tL_premium_applyBoost.peer = s12.j1(-j3);
        tL_premium_applyBoost.flags |= 1;
        tL_premium_applyBoost.slots.addAll(list);
        connectionsManager.sendRequest(tL_premium_applyBoost, new j6(z10Var2, s12, z10Var, 22), 66);
    }

    public static ArrayList b(int i7, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
            String str = tL_premiumGiftCodeOption.store_product;
            if (tL_premiumGiftCodeOption.users == i7) {
                arrayList.add(tL_premiumGiftCodeOption);
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) it2.next();
                if (tL_premiumGiftCodeOption2.users == 1) {
                    arrayList.add(tL_premiumGiftCodeOption2);
                }
            }
        }
        return arrayList;
    }

    public static List c(ArrayList arrayList) {
        if (h()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                if (tL_premiumGiftCodeOption.store_product != null) {
                    arrayList2.add(tL_premiumGiftCodeOption);
                }
            }
            return arrayList2;
        }
        return arrayList;
    }

    public static void d(gj gjVar, z10 z10Var, z10 z10Var2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.f24940t0);
        np s12 = np.s1(m10.f24940t0);
        TLRPC.TL_payments_getGiveawayInfo tL_payments_getGiveawayInfo = new TLRPC.TL_payments_getGiveawayInfo();
        tL_payments_getGiveawayInfo.msg_id = gjVar.e1();
        tL_payments_getGiveawayInfo.peer = s12.j1(gj.B1(gjVar.f23819k.peer_id));
        connectionsManager.sendRequest(tL_payments_getGiveawayInfo, new n(z10Var2, z10Var, 1));
    }

    public static ArrayList e(long j3) {
        ArrayList arrayList = new ArrayList();
        np s12 = np.s1(m10.f24940t0);
        ArrayList arrayList2 = s12.f25443y;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i7);
            if (m5.z(dialog.f28055id) && t3.R(s12.M0(Long.valueOf(-dialog.f28055id)))) {
                long j10 = dialog.f28055id;
                if ((-j10) != j3) {
                    arrayList.add(s12.j1(j10));
                }
            }
        }
        return arrayList;
    }

    public static long f() {
        return np.s1(m10.f24940t0).f25352o0;
    }

    public static int g() {
        return (int) np.s1(m10.f24940t0).f25379r0;
    }

    public static boolean h() {
        if (r2.b()) {
            return false;
        }
        return r1.i().k();
    }

    public static boolean i() {
        if (np.s1(m10.f24940t0).f25389s0 > 0) {
            return true;
        }
        return false;
    }

    public static int j(int i7, TLRPC.Chat chat, z10 z10Var) {
        Pair pair;
        if (chat == null) {
            HashMap hashMap = f59228a;
            List list = null;
            if (hashMap != null && (pair = (Pair) hashMap.get(Integer.valueOf(i7))) != null && System.currentTimeMillis() - ((Long) pair.first).longValue() < 1800000) {
                list = (List) pair.second;
            }
            if (list != null) {
                z10Var.a(list);
                return -1;
            }
        }
        np s12 = np.s1(i7);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        TLRPC.TL_payments_getPremiumGiftCodeOptions tL_payments_getPremiumGiftCodeOptions = new TLRPC.TL_payments_getPremiumGiftCodeOptions();
        if (chat != null) {
            tL_payments_getPremiumGiftCodeOptions.flags = 1;
            tL_payments_getPremiumGiftCodeOptions.boost_peer = s12.j1(-chat.f28051id);
        }
        return connectionsManager.sendRequest(tL_payments_getPremiumGiftCodeOptions, new jg.u(chat, i7, z10Var, 9));
    }

    public static void k(ArrayList arrayList, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.Chat chat, TLRPC.TL_textWithEntities tL_textWithEntities, e2 e2Var, z10 z10Var, z10 z10Var2) {
        int i7 = m10.f24940t0;
        HashMap hashMap = f59228a;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i7));
        }
        if (!h()) {
            np s12 = np.s1(m10.f24940t0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.f24940t0);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
            TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
            tL_inputStorePaymentPremiumGiftCode.users = new ArrayList<>();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    tL_inputStorePaymentPremiumGiftCode.users.add(s12.q1((TLRPC.User) tLObject));
                }
            }
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 2;
                tL_inputStorePaymentPremiumGiftCode.message = tL_textWithEntities;
            }
            if (chat != null) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 1;
                tL_inputStorePaymentPremiumGiftCode.boost_peer = s12.j1(-chat.f28051id);
            }
            tL_inputStorePaymentPremiumGiftCode.currency = tL_premiumGiftCodeOption.currency;
            tL_inputStorePaymentPremiumGiftCode.amount = tL_premiumGiftCodeOption.amount;
            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiftCode;
            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
            JSONObject u10 = x2.u(e2Var.getResourceProvider(), false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
            connectionsManager.sendRequest(tL_payments_getPaymentForm, new k7(z10Var2, s12, tL_inputInvoicePremiumGiftCode, e2Var, z10Var));
            return;
        }
        np s13 = np.s1(m10.f24940t0);
        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(m10.f24940t0);
        TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode2 = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
        tL_inputStorePaymentPremiumGiftCode2.users = new ArrayList<>();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            TLObject tLObject2 = (TLObject) obj2;
            if (tLObject2 instanceof TLRPC.User) {
                tL_inputStorePaymentPremiumGiftCode2.users.add(s13.q1((TLRPC.User) tLObject2));
            }
        }
        if (chat != null) {
            tL_inputStorePaymentPremiumGiftCode2.flags = 1;
            tL_inputStorePaymentPremiumGiftCode2.boost_peer = s13.j1(-chat.f28051id);
        }
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputStorePaymentPremiumGiftCode2.flags |= 2;
            tL_inputStorePaymentPremiumGiftCode2.message = tL_textWithEntities;
        }
        f5.a aVar = new f5.a();
        aVar.f10926c = "inapp";
        aVar.f10925b = tL_premiumGiftCodeOption.store_product;
        r1.i().o(Arrays.asList(aVar.a()), new org.telegram.ui.Components.p0(tL_inputStorePaymentPremiumGiftCode2, tL_premiumGiftCodeOption, connectionsManager2, z10Var2, z10Var, e2Var, 2));
    }

    public static int l(long j3) {
        if (j3 < System.currentTimeMillis() + 120000) {
            j3 = System.currentTimeMillis() + 120000;
        }
        return (int) (j3 / 1000);
    }

    public static void m(int i7, ArrayList arrayList) {
        if (f59228a == null) {
            f59228a = new HashMap();
        }
        f59228a.put(Integer.valueOf(i7), new Pair(Long.valueOf(System.currentTimeMillis()), arrayList));
    }
}
