package rh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.at;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
public final class k5 implements Runnable {
    public final int f47171a;
    public final e6 f47172b;
    public final TLObject f47173c;

    public k5(e6 e6Var, TLObject tLObject, int i10) {
        this.f47171a = i10;
        this.f47172b = e6Var;
        this.f47173c = tLObject;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f47171a) {
            case 0:
                e6 e6Var = this.f47172b;
                int i10 = e6Var.f46863a;
                e6Var.A = false;
                TLObject tLObject = this.f47173c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    wp.r1(i10).V3(starsStatus.users, false);
                    wp.r1(i10).P3(starsStatus.chats, false);
                    e6Var.f46884z.addAll(starsStatus.subscriptions);
                    e6Var.i0(starsStatus.balance);
                    at.f(i10).k(223, new Object[0]);
                    return;
                }
                return;
            case 1:
                e6 e6Var2 = this.f47172b;
                int i11 = e6Var2.f46863a;
                e6Var2.f46882x = false;
                TLObject tLObject2 = this.f47173c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    wp.r1(i11).V3(starsStatus2.users, false);
                    wp.r1(i11).P3(starsStatus2.chats, false);
                    e6Var2.v.addAll(starsStatus2.subscriptions);
                    if ((starsStatus2.flags & 4) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e6Var2.f46883y = z10;
                    e6Var2.f46881w = starsStatus2.subscriptions_next_offset;
                    e6Var2.i0(starsStatus2.balance);
                    at.f(i11).k(223, new Object[0]);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.f47173c;
                boolean z11 = tLObject3 instanceof Vector;
                final e6 e6Var3 = this.f47172b;
                if (z11) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject3).objects;
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList3.get(i12);
                        i12++;
                        if (obj instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                            arrayList.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !org.telegram.messenger.v2.b()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    e6Var3.f46868i = true;
                }
                e6Var3.f46869j = arrayList;
                e6Var3.h = false;
                at.f(e6Var3.f46863a).k(218, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ArrayList arrayList4 = new ArrayList();
                                    int i13 = 0;
                                    while (true) {
                                        final ArrayList arrayList5 = arrayList2;
                                        if (i13 < arrayList5.size()) {
                                            c5.a aVar = new c5.a();
                                            aVar.f3732c = "inapp";
                                            aVar.f3731b = ((TL_stars.TL_starsTopupOption) arrayList5.get(i13)).store_product;
                                            arrayList4.add(aVar.a());
                                            i13++;
                                        } else {
                                            org.telegram.messenger.u1 i14 = org.telegram.messenger.u1.i();
                                            final e6 e6Var4 = e6Var3;
                                            i14.o(arrayList4, new org.telegram.messenger.t1() {
                                                @Override
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e6 e6Var5 = e6Var4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i15 = gVar.f3785a;
                                                                            if (i15 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i15)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7 = arrayList6;
                                                                                        if (i17 < arrayList7.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7.get(i17)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f3790c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var6 = e6Var5;
                                                                            if (e6Var6.f46872m != null) {
                                                                                for (int i18 = 0; i18 < e6Var6.f46872m.size(); i18++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var6.f46872m.get(i18);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var6.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList6;
                                                                                        if (i21 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var7 = e6Var5;
                                                                            if (e6Var7.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var7.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var7.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var7.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList6;
                                                                                        if (i25 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var5;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e6 e6Var6 = e6Var4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i15 = gVar.f3785a;
                                                                            if (i15 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i15)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList7;
                                                                                        if (i17 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i17)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f3790c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var62 = e6Var6;
                                                                            if (e6Var62.f46872m != null) {
                                                                                for (int i18 = 0; i18 < e6Var62.f46872m.size(); i18++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.f46872m.get(i18);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var62.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8 = arrayList7;
                                                                                        if (i21 < arrayList8.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var7 = e6Var6;
                                                                            if (e6Var7.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var7.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var7.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var7.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList7;
                                                                                        if (i25 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var6;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e6 e6Var7 = e6Var4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i15 = gVar.f3785a;
                                                                            if (i15 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i15)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i16);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList8;
                                                                                        if (i17 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i17)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f3790c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var62 = e6Var7;
                                                                            if (e6Var62.f46872m != null) {
                                                                                for (int i18 = 0; i18 < e6Var62.f46872m.size(); i18++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.f46872m.get(i18);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var62.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i21 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var7;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i25 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var7;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList6 = new ArrayList();
                                    int i15 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList2;
                                        if (i15 < arrayList7.size()) {
                                            c5.a aVar2 = new c5.a();
                                            aVar2.f3732c = "inapp";
                                            aVar2.f3731b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i15)).store_product;
                                            arrayList6.add(aVar2.a());
                                            i15++;
                                        } else {
                                            org.telegram.messenger.u1 i16 = org.telegram.messenger.u1.i();
                                            final e6 e6Var5 = e6Var3;
                                            i16.o(arrayList6, new org.telegram.messenger.t1() {
                                                @Override
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e6 e6Var52 = e6Var5;
                                                            final ArrayList arrayList62 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList72 = arrayList62;
                                                                                        if (i17 < arrayList72.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList72.get(i17)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f3790c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var62 = e6Var52;
                                                                            if (e6Var62.f46872m != null) {
                                                                                for (int i18 = 0; i18 < e6Var62.f46872m.size(); i18++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.f46872m.get(i18);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var62.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i21 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var52;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList62;
                                                                                        if (i25 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var52;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e6 e6Var6 = e6Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i17 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i17)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f3790c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var62 = e6Var6;
                                                                            if (e6Var62.f46872m != null) {
                                                                                for (int i18 = 0; i18 < e6Var62.f46872m.size(); i18++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.f46872m.get(i18);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var62.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i21 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var6;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList72;
                                                                                        if (i25 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var6;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e6 e6Var7 = e6Var5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i17 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList8;
                                                                                        if (i17 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i17)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f3790c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var62 = e6Var7;
                                                                            if (e6Var62.f46872m != null) {
                                                                                for (int i18 = 0; i18 < e6Var62.f46872m.size(); i18++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.f46872m.get(i18);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var62.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList8;
                                                                                        if (i21 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var7;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList9 = arrayList8;
                                                                                        if (i25 < arrayList9.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList9.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var7;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i17 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList2;
                                        if (i17 < arrayList9.size()) {
                                            c5.a aVar3 = new c5.a();
                                            aVar3.f3732c = "inapp";
                                            aVar3.f3731b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i17)).store_product;
                                            arrayList8.add(aVar3.a());
                                            i17++;
                                        } else {
                                            org.telegram.messenger.u1 i18 = org.telegram.messenger.u1.i();
                                            final e6 e6Var6 = e6Var3;
                                            i18.o(arrayList8, new org.telegram.messenger.t1() {
                                                @Override
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e6 e6Var52 = e6Var6;
                                                            final ArrayList arrayList62 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f3790c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var62 = e6Var52;
                                                                            if (e6Var62.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var62.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var62.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var62.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList62;
                                                                                        if (i21 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var52;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var52;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e6 e6Var62 = e6Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f3790c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var62;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList82 = arrayList72;
                                                                                        if (i21 < arrayList82.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var62;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var62;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e6 e6Var7 = e6Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption.currency = a2.f3790c;
                                                                                        tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var7;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                        tL_starsGiftOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var7;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var7;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                            }
                        }
                    };
                    if (!org.telegram.messenger.u1.i().k()) {
                        org.telegram.messenger.u1.i().f18347i.add(runnable);
                        return;
                    } else {
                        runnable.run();
                        return;
                    }
                }
                return;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                TLObject tLObject4 = this.f47173c;
                boolean z12 = tLObject4 instanceof Vector;
                final e6 e6Var4 = this.f47172b;
                if (z12) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject4).objects;
                    int size2 = arrayList6.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList6.get(i13);
                        i13++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !org.telegram.messenger.v2.b()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    e6Var4.f46871l = true;
                }
                e6Var4.f46872m = arrayList4;
                e6Var4.f46870k = false;
                at.f(e6Var4.f46863a).k(219, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i132 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList5;
                                        if (i132 < arrayList52.size()) {
                                            c5.a aVar = new c5.a();
                                            aVar.f3732c = "inapp";
                                            aVar.f3731b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i132)).store_product;
                                            arrayList42.add(aVar.a());
                                            i132++;
                                        } else {
                                            org.telegram.messenger.u1 i14 = org.telegram.messenger.u1.i();
                                            final e6 e6Var42 = e6Var4;
                                            i14.o(arrayList42, new org.telegram.messenger.t1() {
                                                @Override
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e6 e6Var52 = e6Var42;
                                                            final ArrayList arrayList62 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList62;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var52;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList62;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var52;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList62;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var52;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e6 e6Var62 = e6Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var62;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var62;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var62;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e6 e6Var7 = e6Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var7;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var7;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var7;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i15 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList5;
                                        if (i15 < arrayList7.size()) {
                                            c5.a aVar2 = new c5.a();
                                            aVar2.f3732c = "inapp";
                                            aVar2.f3731b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i15)).store_product;
                                            arrayList62.add(aVar2.a());
                                            i15++;
                                        } else {
                                            org.telegram.messenger.u1 i16 = org.telegram.messenger.u1.i();
                                            final e6 e6Var5 = e6Var4;
                                            i16.o(arrayList62, new org.telegram.messenger.t1() {
                                                @Override
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e6 e6Var52 = e6Var5;
                                                            final ArrayList arrayList622 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var52;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var52;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var52;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e6 e6Var62 = e6Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var62;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var62;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var62;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e6 e6Var7 = e6Var5;
                                                            final ArrayList arrayList82 = arrayList7;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var7;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var7;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var7;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i17 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList5;
                                        if (i17 < arrayList9.size()) {
                                            c5.a aVar3 = new c5.a();
                                            aVar3.f3732c = "inapp";
                                            aVar3.f3731b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i17)).store_product;
                                            arrayList8.add(aVar3.a());
                                            i17++;
                                        } else {
                                            org.telegram.messenger.u1 i18 = org.telegram.messenger.u1.i();
                                            final e6 e6Var6 = e6Var4;
                                            i18.o(arrayList8, new org.telegram.messenger.t1() {
                                                @Override
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e6 e6Var52 = e6Var6;
                                                            final ArrayList arrayList622 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var52;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var52;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var52;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e6 e6Var62 = e6Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var62;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var62;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var62;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e6 e6Var7 = e6Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var7;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var7;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var7;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                            }
                        }
                    };
                    if (!org.telegram.messenger.u1.i().k()) {
                        org.telegram.messenger.u1.i().f18347i.add(runnable2);
                        return;
                    } else {
                        runnable2.run();
                        return;
                    }
                }
                return;
            case 4:
                ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                TLObject tLObject5 = this.f47173c;
                boolean z13 = tLObject5 instanceof Vector;
                final e6 e6Var5 = this.f47172b;
                if (z13) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject5).objects;
                    int size3 = arrayList9.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj3 = arrayList9.get(i14);
                        i14++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !org.telegram.messenger.v2.b()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    e6Var5.f46874o = true;
                }
                e6Var5.f46875p = arrayList7;
                e6Var5.f46873n = false;
                at.f(e6Var5.f46863a).k(220, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    Runnable runnable3 = new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i132 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList8;
                                        if (i132 < arrayList52.size()) {
                                            c5.a aVar = new c5.a();
                                            aVar.f3732c = "inapp";
                                            aVar.f3731b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i132)).store_product;
                                            arrayList42.add(aVar.a());
                                            i132++;
                                        } else {
                                            org.telegram.messenger.u1 i142 = org.telegram.messenger.u1.i();
                                            final e6 e6Var42 = e6Var5;
                                            i142.o(arrayList42, new org.telegram.messenger.t1() {
                                                @Override
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e6 e6Var52 = e6Var42;
                                                            final ArrayList arrayList622 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var52;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var52;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var52;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e6 e6Var62 = e6Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList72;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var62;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList72;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var62;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList72;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var62;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e6 e6Var7 = e6Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList82;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var7;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var7;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var7;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i15 = 0;
                                    while (true) {
                                        final ArrayList arrayList72 = arrayList8;
                                        if (i15 < arrayList72.size()) {
                                            c5.a aVar2 = new c5.a();
                                            aVar2.f3732c = "inapp";
                                            aVar2.f3731b = ((TL_stars.TL_starsGiftOption) arrayList72.get(i15)).store_product;
                                            arrayList62.add(aVar2.a());
                                            i15++;
                                        } else {
                                            org.telegram.messenger.u1 i16 = org.telegram.messenger.u1.i();
                                            final e6 e6Var52 = e6Var5;
                                            i16.o(arrayList62, new org.telegram.messenger.t1() {
                                                @Override
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e6 e6Var522 = e6Var52;
                                                            final ArrayList arrayList622 = arrayList72;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList722 = arrayList622;
                                                                                        if (i172 < arrayList722.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var522;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var522;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList622;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var522;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e6 e6Var62 = e6Var52;
                                                            final ArrayList arrayList722 = arrayList72;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i172 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var62;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var62;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList722;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var62;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e6 e6Var7 = e6Var52;
                                                            final ArrayList arrayList82 = arrayList72;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList82;
                                                                                        if (i172 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var7;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList82;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var7;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList92 = arrayList82;
                                                                                        if (i25 < arrayList92.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList92.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var7;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                default:
                                    ArrayList arrayList82 = new ArrayList();
                                    int i17 = 0;
                                    while (true) {
                                        final ArrayList arrayList92 = arrayList8;
                                        if (i17 < arrayList92.size()) {
                                            c5.a aVar3 = new c5.a();
                                            aVar3.f3732c = "inapp";
                                            aVar3.f3731b = ((TL_stars.TL_starsGiveawayOption) arrayList92.get(i17)).store_product;
                                            arrayList82.add(aVar3.a());
                                            i17++;
                                        } else {
                                            org.telegram.messenger.u1 i18 = org.telegram.messenger.u1.i();
                                            final e6 e6Var6 = e6Var5;
                                            i18.o(arrayList82, new org.telegram.messenger.t1() {
                                                @Override
                                                public final void a(final c5.g gVar, final List list) {
                                                    switch (r3) {
                                                        case 0:
                                                            final e6 e6Var522 = e6Var6;
                                                            final ArrayList arrayList622 = arrayList92;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList622;
                                                                                        if (i172 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var522;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList622;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var522;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList622;
                                                                                        if (i25 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var522;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        case 1:
                                                            final e6 e6Var62 = e6Var6;
                                                            final ArrayList arrayList722 = arrayList92;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList722;
                                                                                        if (i172 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var62;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList822 = arrayList722;
                                                                                        if (i21 < arrayList822.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var62;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList722;
                                                                                        if (i25 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var62;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        default:
                                                            final e6 e6Var7 = e6Var6;
                                                            final ArrayList arrayList822 = arrayList92;
                                                            org.telegram.messenger.i0.g3(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    c5.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    c5.i a10;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    c5.i a11;
                                                                    switch (r5) {
                                                                        case 0:
                                                                            int i152 = gVar.f3785a;
                                                                            if (i152 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i152)));
                                                                                return;
                                                                            }
                                                                            List list2 = list;
                                                                            if (list2 != null) {
                                                                                for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                    c5.m mVar = (c5.m) list2.get(i162);
                                                                                    int i172 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList7222 = arrayList822;
                                                                                        if (i172 < arrayList7222.size()) {
                                                                                            if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i172)).store_product.equals(mVar.f3801c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiftOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiftOption2 != null && (a2 = mVar.a()) != null) {
                                                                                        tL_starsGiftOption2.currency = a2.f3790c;
                                                                                        tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiftOption2.currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiftOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var622 = e6Var7;
                                                                            if (e6Var622.f46872m != null) {
                                                                                for (int i182 = 0; i182 < e6Var622.f46872m.size(); i182++) {
                                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) e6Var622.f46872m.get(i182);
                                                                                    if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                        tL_starsGiftOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var622.f46863a).k(219, new Object[0]);
                                                                            return;
                                                                        case 1:
                                                                            int i19 = gVar.f3785a;
                                                                            if (i19 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i19)));
                                                                                return;
                                                                            }
                                                                            List list3 = list;
                                                                            if (list3 != null) {
                                                                                for (int i20 = 0; i20 < list3.size(); i20++) {
                                                                                    c5.m mVar2 = (c5.m) list3.get(i20);
                                                                                    int i21 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList8222 = arrayList822;
                                                                                        if (i21 < arrayList8222.size()) {
                                                                                            if (((TL_stars.TL_starsGiveawayOption) arrayList8222.get(i21)).store_product.equals(mVar2.f3801c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList8222.get(i21);
                                                                                            } else {
                                                                                                i21++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsGiveawayOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsGiveawayOption2 != null && (a10 = mVar2.a()) != null) {
                                                                                        tL_starsGiveawayOption2.currency = a10.f3790c;
                                                                                        tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsGiveawayOption2.currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var72 = e6Var7;
                                                                            if (e6Var72.f46875p != null) {
                                                                                for (int i22 = 0; i22 < e6Var72.f46875p.size(); i22++) {
                                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) e6Var72.f46875p.get(i22);
                                                                                    if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                        tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var72.f46863a).k(220, new Object[0]);
                                                                            return;
                                                                        default:
                                                                            int i23 = gVar.f3785a;
                                                                            if (i23 != 0) {
                                                                                e6.e("BILLING_".concat(org.telegram.messenger.u1.j(i23)));
                                                                                return;
                                                                            }
                                                                            List list4 = list;
                                                                            if (list4 != null) {
                                                                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                                                                    c5.m mVar3 = (c5.m) list4.get(i24);
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        ArrayList arrayList922 = arrayList822;
                                                                                        if (i25 < arrayList922.size()) {
                                                                                            if (((TL_stars.TL_starsTopupOption) arrayList922.get(i25)).store_product.equals(mVar3.f3801c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i25);
                                                                                            } else {
                                                                                                i25++;
                                                                                            }
                                                                                        } else {
                                                                                            tL_starsTopupOption2 = null;
                                                                                        }
                                                                                    }
                                                                                    if (tL_starsTopupOption2 != null && (a11 = mVar3.a()) != null) {
                                                                                        tL_starsTopupOption2.currency = a11.f3790c;
                                                                                        tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_starsTopupOption2.currency)) * (a11.f3789b / Math.pow(10.0d, 6.0d)));
                                                                                        tL_starsTopupOption2.loadingStorePrice = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            e6 e6Var8 = e6Var7;
                                                                            if (e6Var8.f46869j != null) {
                                                                                for (int i26 = 0; i26 < e6Var8.f46869j.size(); i26++) {
                                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) e6Var8.f46869j.get(i26);
                                                                                    if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                        tL_starsTopupOption3.missingStorePrice = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            at.f(e6Var8.f46863a).k(218, new Object[0]);
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                            }
                        }
                    };
                    if (!org.telegram.messenger.u1.i().k()) {
                        org.telegram.messenger.u1.i().f18347i.add(runnable3);
                        return;
                    } else {
                        runnable3.run();
                        return;
                    }
                }
                return;
            default:
                wp.r1(this.f47172b.f46863a).L3((TLRPC.Updates) this.f47173c, false);
                return;
        }
    }
}
