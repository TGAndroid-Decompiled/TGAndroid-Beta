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
import ki.t2;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.r1;
import org.telegram.messenger.s2;
import org.telegram.messenger.v3;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
public abstract class r {
    public static HashMap f59924a;

    public static void a(long j3, List list, w10 w10Var, w10 w10Var2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10.f24637t0);
        mp u12 = mp.u1(i10.f24637t0);
        TL_stories.TL_premium_applyBoost tL_premium_applyBoost = new TL_stories.TL_premium_applyBoost();
        tL_premium_applyBoost.peer = u12.l1(-j3);
        tL_premium_applyBoost.flags |= 1;
        tL_premium_applyBoost.slots.addAll(list);
        connectionsManager.sendRequest(tL_premium_applyBoost, new q1(w10Var2, u12, w10Var, 24), 66);
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

    public static void d(fj fjVar, w10 w10Var, w10 w10Var2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10.f24637t0);
        mp u12 = mp.u1(i10.f24637t0);
        TLRPC.TL_payments_getGiveawayInfo tL_payments_getGiveawayInfo = new TLRPC.TL_payments_getGiveawayInfo();
        tL_payments_getGiveawayInfo.msg_id = fjVar.e1();
        tL_payments_getGiveawayInfo.peer = u12.l1(fj.B1(fjVar.f24073k.peer_id));
        connectionsManager.sendRequest(tL_payments_getGiveawayInfo, new n(w10Var2, w10Var, 1));
    }

    public static ArrayList e(long j3) {
        ArrayList arrayList = new ArrayList();
        mp u12 = mp.u1(i10.f24637t0);
        ArrayList arrayList2 = u12.f25904y;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i7);
            if (n5.z(dialog.f28496id) && v3.R(u12.O0(Long.valueOf(-dialog.f28496id)))) {
                long j10 = dialog.f28496id;
                if ((-j10) != j3) {
                    arrayList.add(u12.l1(j10));
                }
            }
        }
        return arrayList;
    }

    public static long f() {
        return mp.u1(i10.f24637t0).f25813o0;
    }

    public static int g() {
        return (int) mp.u1(i10.f24637t0).f25840r0;
    }

    public static boolean h() {
        if (s2.b()) {
            return false;
        }
        return r1.i().k();
    }

    public static boolean i() {
        if (mp.u1(i10.f24637t0).f25850s0 > 0) {
            return true;
        }
        return false;
    }

    public static int j(int i7, TLRPC.Chat chat, w10 w10Var) {
        Pair pair;
        if (chat == null) {
            HashMap hashMap = f59924a;
            List list = null;
            if (hashMap != null && (pair = (Pair) hashMap.get(Integer.valueOf(i7))) != null && System.currentTimeMillis() - ((Long) pair.first).longValue() < 1800000) {
                list = (List) pair.second;
            }
            if (list != null) {
                w10Var.a(list);
                return -1;
            }
        }
        mp u12 = mp.u1(i7);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
        TLRPC.TL_payments_getPremiumGiftCodeOptions tL_payments_getPremiumGiftCodeOptions = new TLRPC.TL_payments_getPremiumGiftCodeOptions();
        if (chat != null) {
            tL_payments_getPremiumGiftCodeOptions.flags = 1;
            tL_payments_getPremiumGiftCodeOptions.boost_peer = u12.l1(-chat.f28492id);
        }
        return connectionsManager.sendRequest(tL_payments_getPremiumGiftCodeOptions, new jg.u(chat, i7, w10Var, 9));
    }

    public static void k(ArrayList arrayList, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.Chat chat, TLRPC.TL_textWithEntities tL_textWithEntities, g2 g2Var, w10 w10Var, w10 w10Var2) {
        int i7 = i10.f24637t0;
        HashMap hashMap = f59924a;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i7));
        }
        if (!h()) {
            mp u12 = mp.u1(i10.f24637t0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10.f24637t0);
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
                tL_inputStorePaymentPremiumGiftCode.boost_peer = u12.l1(-chat.f28492id);
            }
            tL_inputStorePaymentPremiumGiftCode.currency = tL_premiumGiftCodeOption.currency;
            tL_inputStorePaymentPremiumGiftCode.amount = tL_premiumGiftCodeOption.amount;
            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiftCode;
            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
            JSONObject u10 = t2.u(g2Var.getResourceProvider(), false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
            connectionsManager.sendRequest(tL_payments_getPaymentForm, new m7(w10Var2, u12, tL_inputInvoicePremiumGiftCode, g2Var, w10Var));
            return;
        }
        mp u13 = mp.u1(i10.f24637t0);
        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i10.f24637t0);
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
            tL_inputStorePaymentPremiumGiftCode2.boost_peer = u13.l1(-chat.f28492id);
        }
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputStorePaymentPremiumGiftCode2.flags |= 2;
            tL_inputStorePaymentPremiumGiftCode2.message = tL_textWithEntities;
        }
        f5.a aVar = new f5.a();
        aVar.f11239c = "inapp";
        aVar.f11238b = tL_premiumGiftCodeOption.store_product;
        r1.i().o(Arrays.asList(aVar.a()), new org.telegram.ui.Components.b1(tL_inputStorePaymentPremiumGiftCode2, tL_premiumGiftCodeOption, connectionsManager2, w10Var2, w10Var, g2Var, 2));
    }

    public static int l(long j3) {
        if (j3 < System.currentTimeMillis() + 120000) {
            j3 = System.currentTimeMillis() + 120000;
        }
        return (int) (j3 / 1000);
    }

    public static void m(int i7, ArrayList arrayList) {
        if (f59924a == null) {
            f59924a = new HashMap();
        }
        f59924a.put(Integer.valueOf(i7), new Pair(Long.valueOf(System.currentTimeMillis()), arrayList));
    }
}
