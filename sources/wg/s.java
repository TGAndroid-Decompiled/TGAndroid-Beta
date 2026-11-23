package wg;

import android.text.TextUtils;
import android.util.Pair;
import bi.q1;
import di.m7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.r1;
import org.telegram.messenger.s2;
import org.telegram.messenger.v3;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
public abstract class s {
    public static HashMap f59864a;

    public static void a(long j3, List list, y10 y10Var, y10 y10Var2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.f24968t0);
        np u12 = np.u1(k10.f24968t0);
        TL_stories.TL_premium_applyBoost tL_premium_applyBoost = new TL_stories.TL_premium_applyBoost();
        tL_premium_applyBoost.peer = u12.l1(-j3);
        tL_premium_applyBoost.flags |= 1;
        tL_premium_applyBoost.slots.addAll(list);
        connectionsManager.sendRequest(tL_premium_applyBoost, new q1(y10Var2, u12, y10Var, 24), 66);
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

    public static void d(gj gjVar, y10 y10Var, y10 y10Var2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.f24968t0);
        np u12 = np.u1(k10.f24968t0);
        TLRPC.TL_payments_getGiveawayInfo tL_payments_getGiveawayInfo = new TLRPC.TL_payments_getGiveawayInfo();
        tL_payments_getGiveawayInfo.msg_id = gjVar.e1();
        tL_payments_getGiveawayInfo.peer = u12.l1(gj.B1(gjVar.f24213k.peer_id));
        connectionsManager.sendRequest(tL_payments_getGiveawayInfo, new n(y10Var2, y10Var, 1));
    }

    public static ArrayList e(long j3) {
        ArrayList arrayList = new ArrayList();
        np u12 = np.u1(k10.f24968t0);
        ArrayList arrayList2 = u12.f26008y;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i7);
            if (n5.z(dialog.f28438id) && v3.R(u12.O0(Long.valueOf(-dialog.f28438id)))) {
                long j10 = dialog.f28438id;
                if ((-j10) != j3) {
                    arrayList.add(u12.l1(j10));
                }
            }
        }
        return arrayList;
    }

    public static long f() {
        return np.u1(k10.f24968t0).f25917o0;
    }

    public static int g() {
        return (int) np.u1(k10.f24968t0).f25944r0;
    }

    public static boolean h() {
        if (s2.b()) {
            return false;
        }
        return r1.i().k();
    }

    public static boolean i() {
        if (np.u1(k10.f24968t0).f25954s0 > 0) {
            return true;
        }
        return false;
    }

    public static int j(int i7, TLRPC.Chat chat, y10 y10Var) {
        Pair pair;
        if (chat == null) {
            HashMap hashMap = f59864a;
            List list = null;
            if (hashMap != null && (pair = (Pair) hashMap.get(Integer.valueOf(i7))) != null && System.currentTimeMillis() - ((Long) pair.first).longValue() < 1800000) {
                list = (List) pair.second;
            }
            if (list != null) {
                y10Var.a(list);
                return -1;
            }
        }
        np u12 = np.u1(i7);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        TLRPC.TL_payments_getPremiumGiftCodeOptions tL_payments_getPremiumGiftCodeOptions = new TLRPC.TL_payments_getPremiumGiftCodeOptions();
        if (chat != null) {
            tL_payments_getPremiumGiftCodeOptions.flags = 1;
            tL_payments_getPremiumGiftCodeOptions.boost_peer = u12.l1(-chat.f28434id);
        }
        return connectionsManager.sendRequest(tL_payments_getPremiumGiftCodeOptions, new jg.u(chat, i7, y10Var, 9));
    }

    public static void k(ArrayList arrayList, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.Chat chat, TLRPC.TL_textWithEntities tL_textWithEntities, g2 g2Var, y10 y10Var, y10 y10Var2) {
        int i7 = k10.f24968t0;
        HashMap hashMap = f59864a;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i7));
        }
        if (!h()) {
            np u12 = np.u1(k10.f24968t0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.f24968t0);
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
                    tL_inputStorePaymentPremiumGiftCode.users.add(u12.s1((TLRPC.User) tLObject));
                }
            }
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 2;
                tL_inputStorePaymentPremiumGiftCode.message = tL_textWithEntities;
            }
            if (chat != null) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 1;
                tL_inputStorePaymentPremiumGiftCode.boost_peer = u12.l1(-chat.f28434id);
            }
            tL_inputStorePaymentPremiumGiftCode.currency = tL_premiumGiftCodeOption.currency;
            tL_inputStorePaymentPremiumGiftCode.amount = tL_premiumGiftCodeOption.amount;
            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiftCode;
            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
            JSONObject u10 = ki.s2.u(g2Var.getResourceProvider(), false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
            connectionsManager.sendRequest(tL_payments_getPaymentForm, new m7(y10Var2, u12, tL_inputInvoicePremiumGiftCode, g2Var, y10Var));
            return;
        }
        np u13 = np.u1(k10.f24968t0);
        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(k10.f24968t0);
        TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode2 = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
        tL_inputStorePaymentPremiumGiftCode2.users = new ArrayList<>();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            TLObject tLObject2 = (TLObject) obj2;
            if (tLObject2 instanceof TLRPC.User) {
                tL_inputStorePaymentPremiumGiftCode2.users.add(u13.s1((TLRPC.User) tLObject2));
            }
        }
        if (chat != null) {
            tL_inputStorePaymentPremiumGiftCode2.flags = 1;
            tL_inputStorePaymentPremiumGiftCode2.boost_peer = u13.l1(-chat.f28434id);
        }
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputStorePaymentPremiumGiftCode2.flags |= 2;
            tL_inputStorePaymentPremiumGiftCode2.message = tL_textWithEntities;
        }
        f5.a aVar = new f5.a();
        aVar.f11277c = "inapp";
        aVar.f11276b = tL_premiumGiftCodeOption.store_product;
        r1.i().o(Arrays.asList(aVar.a()), new org.telegram.ui.Components.c1(tL_inputStorePaymentPremiumGiftCode2, tL_premiumGiftCodeOption, connectionsManager2, y10Var2, y10Var, g2Var, 2));
    }

    public static int l(long j3) {
        if (j3 < System.currentTimeMillis() + 120000) {
            j3 = System.currentTimeMillis() + 120000;
        }
        return (int) (j3 / 1000);
    }

    public static void m(int i7, ArrayList arrayList) {
        if (f59864a == null) {
            f59864a = new HashMap();
        }
        f59864a.put(Integer.valueOf(i7), new Pair(Long.valueOf(System.currentTimeMillis()), arrayList));
    }
}
