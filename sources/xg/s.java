package xg;

import ai.r6;
import android.text.TextUtils;
import android.util.Pair;
import ci.s7;
import ii.a3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.r1;
import org.telegram.messenger.r2;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d2;
public abstract class s {
    public static HashMap f58756a;

    public static void a(long j10, List list, u10 u10Var, u10 u10Var2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.f22829t0);
        hp s12 = hp.s1(h10.f22829t0);
        TL_stories.TL_premium_applyBoost tL_premium_applyBoost = new TL_stories.TL_premium_applyBoost();
        tL_premium_applyBoost.peer = s12.j1(-j10);
        tL_premium_applyBoost.flags |= 1;
        tL_premium_applyBoost.slots.addAll(list);
        connectionsManager.sendRequest(tL_premium_applyBoost, new r6(u10Var2, s12, u10Var, 22), 66);
    }

    public static ArrayList b(int i3, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
            String str = tL_premiumGiftCodeOption.store_product;
            if (tL_premiumGiftCodeOption.users == i3) {
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
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                if (tL_premiumGiftCodeOption.store_product != null) {
                    arrayList2.add(tL_premiumGiftCodeOption);
                }
            }
            return arrayList2;
        }
        return arrayList;
    }

    public static void d(zi ziVar, u10 u10Var, u10 u10Var2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.f22829t0);
        hp s12 = hp.s1(h10.f22829t0);
        TLRPC.TL_payments_getGiveawayInfo tL_payments_getGiveawayInfo = new TLRPC.TL_payments_getGiveawayInfo();
        tL_payments_getGiveawayInfo.msg_id = ziVar.f1();
        tL_payments_getGiveawayInfo.peer = s12.j1(zi.C1(ziVar.f26868k.peer_id));
        connectionsManager.sendRequest(tL_payments_getGiveawayInfo, new p(u10Var2, u10Var, 1));
    }

    public static ArrayList e(long j10) {
        ArrayList arrayList = new ArrayList();
        hp s12 = hp.s1(h10.f22829t0);
        ArrayList arrayList2 = s12.f23169y;
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i3);
            if (m5.z(dialog.f27005id) && t3.R(s12.M0(Long.valueOf(-dialog.f27005id)))) {
                long j11 = dialog.f27005id;
                if ((-j11) != j10) {
                    arrayList.add(s12.j1(j11));
                }
            }
        }
        return arrayList;
    }

    public static long f() {
        return hp.s1(h10.f22829t0).f23077o0;
    }

    public static int g() {
        return (int) hp.s1(h10.f22829t0).f23105r0;
    }

    public static boolean h() {
        if (r2.b()) {
            return false;
        }
        return r1.i().k();
    }

    public static boolean i() {
        if (hp.s1(h10.f22829t0).f23114s0 > 0) {
            return true;
        }
        return false;
    }

    public static int j(int i3, TLRPC.Chat chat, u10 u10Var) {
        Pair pair;
        if (chat == null) {
            HashMap hashMap = f58756a;
            List list = null;
            if (hashMap != null && (pair = (Pair) hashMap.get(Integer.valueOf(i3))) != null && System.currentTimeMillis() - ((Long) pair.first).longValue() < 1800000) {
                list = (List) pair.second;
            }
            if (list != null) {
                u10Var.a(list);
                return -1;
            }
        }
        hp s12 = hp.s1(i3);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
        TLRPC.TL_payments_getPremiumGiftCodeOptions tL_payments_getPremiumGiftCodeOptions = new TLRPC.TL_payments_getPremiumGiftCodeOptions();
        if (chat != null) {
            tL_payments_getPremiumGiftCodeOptions.flags = 1;
            tL_payments_getPremiumGiftCodeOptions.boost_peer = s12.j1(-chat.f27001id);
        }
        return connectionsManager.sendRequest(tL_payments_getPremiumGiftCodeOptions, new kg.t(chat, i3, u10Var, 9));
    }

    public static void k(ArrayList arrayList, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.Chat chat, TLRPC.TL_textWithEntities tL_textWithEntities, d2 d2Var, u10 u10Var, u10 u10Var2) {
        int i3 = h10.f22829t0;
        HashMap hashMap = f58756a;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i3));
        }
        if (!h()) {
            hp s12 = hp.s1(h10.f22829t0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.f22829t0);
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
                tL_inputStorePaymentPremiumGiftCode.boost_peer = s12.j1(-chat.f27001id);
            }
            tL_inputStorePaymentPremiumGiftCode.currency = tL_premiumGiftCodeOption.currency;
            tL_inputStorePaymentPremiumGiftCode.amount = tL_premiumGiftCodeOption.amount;
            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiftCode;
            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
            JSONObject u10 = a3.u(d2Var.getResourceProvider(), false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
            connectionsManager.sendRequest(tL_payments_getPaymentForm, new s7(u10Var2, s12, tL_inputInvoicePremiumGiftCode, d2Var, u10Var));
            return;
        }
        hp s13 = hp.s1(h10.f22829t0);
        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(h10.f22829t0);
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
            tL_inputStorePaymentPremiumGiftCode2.boost_peer = s13.j1(-chat.f27001id);
        }
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputStorePaymentPremiumGiftCode2.flags |= 2;
            tL_inputStorePaymentPremiumGiftCode2.message = tL_textWithEntities;
        }
        e5.a aVar = new e5.a();
        aVar.f9555c = "inapp";
        aVar.f9554b = tL_premiumGiftCodeOption.store_product;
        r1.i().o(Arrays.asList(aVar.a()), new org.telegram.ui.Components.r0(tL_inputStorePaymentPremiumGiftCode2, tL_premiumGiftCodeOption, connectionsManager2, u10Var2, u10Var, d2Var, 2));
    }

    public static int l(long j10) {
        if (j10 < System.currentTimeMillis() + 120000) {
            j10 = System.currentTimeMillis() + 120000;
        }
        return (int) (j10 / 1000);
    }

    public static void m(int i3, ArrayList arrayList) {
        if (f58756a == null) {
            f58756a = new HashMap();
        }
        f58756a.put(Integer.valueOf(i3), new Pair(Long.valueOf(System.currentTimeMillis()), arrayList));
    }
}
