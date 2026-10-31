package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x41;
import org.telegram.ui.hk;
public final class w6 extends org.telegram.ui.ActionBar.z2 implements us {
    public static final int U1 = 0;
    public final ArrayList A1;
    public boolean B1;
    public boolean C1;
    public int D1;
    public int E1;
    public boolean F1;
    public HashMap G1;
    public int H1;
    public final Paint I1;
    public ArrayList J1;
    public e6 K1;
    public q20 L1;
    public j6 M1;
    public q20 N1;
    public z6 O1;
    public final boolean P1;
    public boolean Q1;
    public boolean R1;
    public BitmapDrawable S1;
    public y6 T1;
    public hk f52100i1;
    public TLRPC.InputPeer f52101j1;
    public final ArrayList f52102k1;
    public final HashMap l1;
    public int f52103m1;
    public final ArrayList f52104n1;
    public final ArrayList f52105o1;
    public final HashMap f52106p1;
    public int f52107q1;
    public final HashSet f52108r1;
    public boolean f52109s1;
    public boolean f52110t1;
    public boolean f52111u1;
    public boolean f52112v1;
    public boolean f52113w1;
    public boolean f52114x1;
    public int f52115y1;
    public int f52116z1;

    public w6(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, true);
        boolean z10;
        char c10;
        boolean z11 = true;
        ArrayList arrayList = new ArrayList();
        this.f52102k1 = arrayList;
        HashMap hashMap = new HashMap();
        this.l1 = hashMap;
        char c11 = 0;
        this.f52103m1 = 0;
        ArrayList arrayList2 = new ArrayList();
        this.f52104n1 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f52105o1 = arrayList3;
        HashMap hashMap2 = new HashMap();
        this.f52106p1 = hashMap2;
        this.f52107q1 = 0;
        this.f52108r1 = new HashSet();
        this.f52109s1 = true;
        this.f52110t1 = true;
        this.f52111u1 = false;
        this.f52112v1 = true;
        this.f52113w1 = true;
        this.f52114x1 = false;
        this.f52115y1 = 0;
        this.f52116z1 = 1;
        this.A1 = new ArrayList();
        this.D1 = 1;
        this.E1 = 4;
        this.G1 = new HashMap();
        this.H1 = 86400;
        this.I1 = new Paint(1);
        this.P1 = true;
        this.Q1 = false;
        this.H1 = i10;
        String string = vp.r1(this.f21583a).f7.getString("story_prv_contacts", null);
        if (string != null) {
            String[] split = string.split(",");
            arrayList3.clear();
            for (String str : split) {
                try {
                    arrayList3.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        String string2 = vp.r1(this.f21583a).f7.getString("story_prv_grpcontacts", null);
        if (string2 != null) {
            String[] split2 = string2.split(";");
            hashMap2.clear();
            int i11 = 0;
            while (i11 < split2.length) {
                String[] split3 = split2[i11].split(",");
                if (split3.length > 0) {
                    try {
                        long parseLong = Long.parseLong(split3[c11]);
                        z10 = z11;
                        ArrayList arrayList4 = new ArrayList();
                        c10 = c11;
                        for (int i12 = z10; i12 < split3.length; i12++) {
                            arrayList4.add(Long.valueOf(Long.parseLong(split3[i12])));
                        }
                        hashMap2.put(Long.valueOf(parseLong), arrayList4);
                    } catch (Exception unused2) {
                    }
                    i11++;
                    c11 = c10;
                    z11 = z10;
                }
                z10 = z11;
                c10 = c11;
                i11++;
                c11 = c10;
                z11 = z10;
            }
        }
        boolean z12 = z11;
        ?? r23 = c11;
        String string3 = vp.r1(this.f21583a).f7.getString("story_prv_everyoneexcept", null);
        if (string3 != null) {
            String[] split4 = string3.split(",");
            arrayList.clear();
            for (int i13 = r23 == true ? 1 : 0; i13 < split4.length; i13++) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(split4[i13])));
                } catch (Exception unused3) {
                }
            }
        }
        String string4 = vp.r1(this.f21583a).f7.getString("story_prv_grpeveryoneexcept", null);
        if (string4 != null) {
            String[] split5 = string4.split(";");
            hashMap.clear();
            for (int i14 = r23 == true ? 1 : 0; i14 < split5.length; i14++) {
                String[] split6 = split5[i14].split(",");
                if (split6.length > 0) {
                    try {
                        long parseLong2 = Long.parseLong(split6[r23 == true ? 1 : 0]);
                        ArrayList arrayList5 = new ArrayList();
                        for (int i15 = z12; i15 < split6.length; i15++) {
                            arrayList5.add(Long.valueOf(Long.parseLong(split6[i15])));
                        }
                        hashMap.put(Long.valueOf(parseLong2), arrayList5);
                    } catch (Exception unused4) {
                    }
                }
            }
        }
        String string5 = vp.r1(this.f21583a).f7.getString("story_prv_excluded", null);
        if (string5 != null) {
            String[] split7 = string5.split(",");
            arrayList2.clear();
            for (int i16 = r23 == true ? 1 : 0; i16 < split7.length; i16++) {
                try {
                    arrayList2.add(Long.valueOf(Long.parseLong(split7[i16])));
                } catch (Exception unused5) {
                }
            }
        }
        this.f52107q1 = R0(arrayList3, hashMap2).size();
        this.f52103m1 = R0(arrayList, hashMap).size();
        this.f52110t1 = !vp.r1(this.f21583a).f7.getBoolean("story_noforwards", r23);
        this.f52111u1 = vp.r1(this.f21583a).f7.getBoolean("story_keep", z12);
        P0(context);
        this.f52100i1.setAdapter(new x5(this, context, 0));
        hs a02 = hs.a0(this.f21583a);
        a02.f15938a.c(new d1(15, this, a02));
        vp.r1(this.f21583a).O1().S();
        vp.r1(this.f21583a).O1().U();
    }

    public static void I0(w6 w6Var) {
        super.dismiss();
    }

    public static ArrayList J0(w6 w6Var) {
        ArrayList O0 = w6Var.O0();
        int i10 = 0;
        while (i10 < O0.size()) {
            TLObject tLObject = (TLObject) O0.get(i10);
            if ((tLObject instanceof TLRPC.User) && !((TLRPC.User) tLObject).close_friend) {
                O0.remove(i10);
                i10--;
            }
            i10++;
        }
        return O0;
    }

    public static int K0(w6 w6Var, TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull M0 = vp.r1(w6Var.f21583a).M0(chat.f19793id);
        if (M0 != null && (i10 = M0.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = w6Var.G1;
        if (hashMap != null && (num = (Integer) hashMap.get(Long.valueOf(chat.f19793id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public static HashSet R0(ArrayList arrayList, HashMap hashMap) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        if (hashMap != null) {
            for (ArrayList arrayList2 : hashMap.values()) {
                hashSet.addAll(arrayList2);
            }
        }
        return hashSet;
    }

    @Override
    public final boolean H() {
        View currentView = this.f52100i1.getCurrentView();
        if (currentView instanceof r6) {
            return ((r6) currentView).S;
        }
        return true;
    }

    @Override
    public final void L() {
        zs.f(this.f21583a).n(this, zs.O);
        zs.f(this.f21583a).n(this, zs.f19581a3);
        zs.f(this.f21583a).n(this, zs.f19593c3);
        super.L();
    }

    public final void L0(boolean z10) {
        View[] viewPages;
        this.f52112v1 = z10;
        hk hkVar = this.f52100i1;
        if (hkVar != null) {
            for (View view : hkVar.getViewPages()) {
                if (view instanceof r6) {
                    ((r6) view).f(false);
                }
            }
        }
    }

    public final void M0() {
        View[] viewPages;
        k6 k6Var;
        for (View view : this.f52100i1.getViewPages()) {
            if ((view instanceof r6) && (k6Var = ((r6) view).f51895y) != null) {
                org.telegram.messenger.i0.v1(k6Var.f51972b);
            }
        }
    }

    public final void N0(u6 u6Var, Runnable runnable, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.J1 != null) {
            vp r12 = vp.r1(this.f21583a);
            for (int i10 = 0; i10 < this.J1.size(); i10++) {
                String str = (String) this.J1.get(i10);
                TLObject e22 = r12.e2(str);
                if (e22 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) e22;
                    TLRPC.User Z1 = r12.Z1(Long.valueOf(user.f19942id));
                    if (Z1 != null) {
                        user = Z1;
                    }
                    if (!user.bot && !u6Var.b(user)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        d dVar = null;
        if (!arrayList.isEmpty() && !z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < Math.min(2, arrayList.size()); i11++) {
                if (i11 > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                SpannableString spannableString = new SpannableString("@" + ((String) arrayList.get(i11)));
                spannableString.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String L0 = cd.L0(2131744515, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.i0.J2(cd.L0(2131744514, null), spannableStringBuilder, "%s");
            alertDialog$Builder.k(cd.L0(2131746758, null), new q5.a(this, u6Var, runnable, 9));
            i0.a.s(null, 2131752589, alertDialog$Builder, null);
            return;
        }
        View view = this.f52100i1.getViewPages()[0];
        if (view instanceof r6) {
            dVar = ((r6) view).f51893w;
        }
        if (dVar != null) {
            dVar.setLoading(true);
        }
        e6 e6Var = this.K1;
        if (e6Var != null) {
            e6Var.a(u6Var, this.f52109s1, this.f52110t1, this.f52111u1, this.f52114x1, this.f52101j1, this.f52115y1, new d1(17, dVar, runnable), new d0(dVar, 13));
        } else {
            runnable.run();
        }
    }

    public final ArrayList O0() {
        TLRPC.User Z1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = org.telegram.messenger.i5.r(this.f21583a).f16065e0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            org.telegram.messenger.i5.r(this.f21583a).A(0L, false);
        }
        vp r12 = vp.r1(this.f21583a);
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i10);
                if (tL_contact != null && (Z1 = r12.Z1(Long.valueOf(tL_contact.user_id))) != null && !h20.B(Z1) && !Z1.bot && Z1.f19942id != 777000) {
                    arrayList.add(Z1);
                }
            }
        }
        return arrayList;
    }

    public final void P0(Context context) {
        wb.a(this.f21589c, new mg.u(11));
        zs.f(this.f21583a).c(this, zs.O);
        zs.f(this.f21583a).c(this, zs.f19581a3);
        zs.f(this.f21583a).c(this, zs.f19593c3);
        int i10 = org.telegram.ui.ActionBar.t6.f21001h5;
        this.I1.setColor(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
        Q(i10);
        this.f21586b = new d6(this, context);
        hk hkVar = new hk(this, context, 8);
        this.f52100i1 = hkVar;
        int i11 = this.f21615t0;
        hkVar.setPadding(i11, 0, i11, 0);
        this.f21586b.addView(this.f52100i1, w7.b6.e(-1, -1, 119));
    }

    public final void Q0(boolean z10) {
        View[] viewPages;
        this.Q1 = z10;
        hk hkVar = this.f52100i1;
        if (hkVar != null) {
            for (View view : hkVar.getViewPages()) {
                if (view instanceof r6) {
                    r6 r6Var = (r6) view;
                    r6Var.h(false);
                    r6Var.f(false);
                }
            }
        }
    }

    public final void S0(int i10) {
        View[] viewPages;
        this.f52116z1 = i10;
        hk hkVar = this.f52100i1;
        if (hkVar != null) {
            for (View view : hkVar.getViewPages()) {
                if (view instanceof r6) {
                    ((r6) view).f(false);
                }
            }
        }
    }

    public final void T0(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        View[] viewPages;
        if (bitmap == null) {
            bitmapDrawable = null;
        } else {
            bitmapDrawable = new BitmapDrawable(bitmap);
        }
        this.S1 = bitmapDrawable;
        hk hkVar = this.f52100i1;
        if (hkVar != null) {
            for (View view : hkVar.getViewPages()) {
                if (view instanceof r6) {
                    r6 r6Var = (r6) view;
                    r6Var.h(false);
                    r6Var.f(false);
                }
            }
        }
    }

    public final void U0() {
        this.B1 = true;
        View[] viewPages = this.f52100i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof r6) {
            r6 r6Var = (r6) view;
            r6Var.b(r6Var.f51886a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof r6) {
            r6 r6Var2 = (r6) view2;
            r6Var2.b(r6Var2.f51886a);
        }
    }

    public final void V0(TLRPC.InputPeer inputPeer) {
        this.f52101j1 = inputPeer;
        this.f52108r1.clear();
        View[] viewPages = this.f52100i1.getViewPages();
        View view = viewPages[0];
        if (view instanceof r6) {
            r6 r6Var = (r6) view;
            r6Var.b(r6Var.f51886a);
        }
        View view2 = viewPages[1];
        if (view2 instanceof r6) {
            r6 r6Var2 = (r6) view2;
            r6Var2.b(r6Var2.f51886a);
        }
    }

    public final void W0(u6 u6Var) {
        if (u6Var != null) {
            HashMap hashMap = u6Var.d;
            int i10 = u6Var.f52017a;
            ArrayList arrayList = u6Var.f52019c;
            this.E1 = i10;
            if (i10 == 2) {
                ArrayList arrayList2 = this.f52104n1;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            } else if (i10 == 3) {
                ArrayList arrayList3 = this.f52105o1;
                arrayList3.clear();
                arrayList3.addAll(arrayList);
                HashMap hashMap2 = this.f52106p1;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                this.f52107q1 = R0(arrayList3, hashMap2).size();
            } else if (i10 == 4) {
                ArrayList arrayList4 = this.f52102k1;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                HashMap hashMap3 = this.l1;
                hashMap3.clear();
                hashMap3.putAll(hashMap);
                this.f52103m1 = R0(arrayList4, hashMap3).size();
            }
            if (i10 == 5) {
                this.F1 = true;
                this.D1 = 5;
                ArrayList arrayList5 = this.A1;
                arrayList5.clear();
                arrayList5.addAll(u6Var.f52020f);
                this.f52100i1.setPosition(1);
            }
            View[] viewPages = this.f52100i1.getViewPages();
            View view = viewPages[0];
            if (view instanceof r6) {
                r6 r6Var = (r6) view;
                r6Var.b(r6Var.f51886a);
            }
            View view2 = viewPages[1];
            if (view2 instanceof r6) {
                r6 r6Var2 = (r6) view2;
                r6Var2.b(r6Var2.f51886a);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        hk hkVar = this.f52100i1;
        if (hkVar != null) {
            int i12 = 0;
            if (i10 == zs.O) {
                View[] viewPages = hkVar.getViewPages();
                View view = viewPages[0];
                if (view instanceof r6) {
                    ((r6) view).h(true);
                }
                View view2 = viewPages[1];
                if (view2 instanceof r6) {
                    ((r6) view2).h(true);
                }
            } else if (i10 == zs.f19581a3) {
                View[] viewPages2 = hkVar.getViewPages();
                while (i12 < viewPages2.length) {
                    View view3 = viewPages2[i12];
                    if (view3 instanceof r6) {
                        r6 r6Var = (r6) view3;
                        int i13 = r6Var.f51886a;
                        if (i13 == 6) {
                            r6Var.a(true);
                        } else if (i13 == 0) {
                            r6Var.h(true);
                        }
                    }
                    i12++;
                }
            } else if (i10 == zs.f19593c3) {
                View[] viewPages3 = hkVar.getViewPages();
                while (i12 < viewPages3.length) {
                    View view4 = viewPages3[i12];
                    if (view4 instanceof r6) {
                        r6 r6Var2 = (r6) view4;
                        if (r6Var2.f51886a == 0) {
                            r6Var2.h(true);
                        }
                    }
                    i12++;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        u6 u6Var;
        q20 q20Var = this.L1;
        ArrayList arrayList = this.f52104n1;
        HashMap hashMap = this.l1;
        ArrayList arrayList2 = this.f52102k1;
        HashMap hashMap2 = this.f52106p1;
        ArrayList arrayList3 = this.f52105o1;
        if (q20Var != null) {
            int i10 = this.E1;
            if (i10 == 3) {
                u6Var = new u6(this.E1, this.f21583a, new ArrayList(R0(arrayList3, hashMap2)));
                ArrayList arrayList4 = u6Var.f52019c;
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                HashMap hashMap3 = u6Var.d;
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
            } else if (i10 == 4) {
                u6Var = new u6(this.E1, this.f21583a, new ArrayList(R0(arrayList2, hashMap)));
                ArrayList arrayList5 = u6Var.f52019c;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                HashMap hashMap4 = u6Var.d;
                hashMap4.clear();
                hashMap4.putAll(hashMap);
            } else if (i10 == 2) {
                u6Var = new u6(i10, this.f21583a, arrayList);
            } else {
                u6Var = new u6(i10, this.f21583a, (ArrayList) null);
            }
            this.L1.a(u6Var);
            this.L1 = null;
        }
        wb.h(this.f21589c);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(entry.getKey());
            sb2.append(",");
            sb2.append(TextUtils.join(",", (Iterable) entry.getValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (sb3.length() > 0) {
                sb3.append(";");
            }
            sb3.append(entry2.getKey());
            sb3.append(",");
            sb3.append(TextUtils.join(",", (Iterable) entry2.getValue()));
        }
        vp.r1(this.f21583a).f7.edit().putString("story_prv_everyoneexcept", TextUtils.join(",", arrayList2)).putString("story_prv_grpeveryoneexcept", sb3.toString()).putString("story_prv_contacts", TextUtils.join(",", arrayList3)).putString("story_prv_grpcontacts", sb2.toString()).putString("story_prv_excluded", TextUtils.join(",", arrayList)).putBoolean("story_noforwards", !this.f52110t1).putBoolean("story_keep", this.f52111u1).apply();
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        if (this.f52100i1.getCurrentPosition() > 0) {
            M0();
            hk hkVar = this.f52100i1;
            hkVar.E(hkVar.getCurrentPosition() - 1);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            this.I1.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.I0));
            ViewGroup viewGroup = this.f21586b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public w6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, true);
        this.f52102k1 = new ArrayList();
        this.l1 = new HashMap();
        this.f52103m1 = 0;
        this.f52104n1 = new ArrayList();
        this.f52105o1 = new ArrayList();
        this.f52106p1 = new HashMap();
        this.f52107q1 = 0;
        this.f52108r1 = new HashSet();
        this.f52109s1 = true;
        this.f52110t1 = true;
        this.f52111u1 = false;
        this.f52112v1 = true;
        this.f52113w1 = true;
        this.f52114x1 = false;
        this.f52115y1 = 0;
        this.f52116z1 = 1;
        this.A1 = new ArrayList();
        this.D1 = 1;
        this.E1 = 4;
        this.G1 = new HashMap();
        this.H1 = 86400;
        this.I1 = new Paint(1);
        this.P1 = true;
        this.Q1 = false;
        P0(context);
        this.f52100i1.setAdapter(new x5(this, context, 1));
    }
}
