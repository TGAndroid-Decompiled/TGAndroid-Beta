package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.o20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ny;
import org.telegram.ui.rv0;
import w7.b6;
public final class q3 extends ha {
    public static final int f45280c2 = 0;
    public final String P1;
    public final p3 Q1;
    public final HorizontalScrollView R1;
    public final z2 S1;
    public final z2 T1;
    public final z2 U1;
    public final z2 V1;
    public final rh.n2 W1;
    public rh.e1 X1;
    public final HashSet Y1;
    public boolean Z1;
    public o3 a2;
    public boolean f45281b2;

    public q3(final Context context, String str, final p3 p3Var) {
        super(2, context, (p6) null, false);
        this.Y1 = new HashSet();
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        O();
        this.P1 = str;
        this.Q1 = p3Var;
        this.l1.setTitle(O0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.R1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        z2 z2Var = new z2(context, this.I0);
        this.S1 = z2Var;
        z2Var.setSorting(p3Var.f45271c.f45101p);
        linearLayout.addView(z2Var, b6.t(-2, -2, 16, 0, 0, 6, 0));
        z2Var.setOnClickListener(new rv0(21, this, p3Var));
        z2 z2Var2 = new z2(context, this.I0);
        this.T1 = z2Var2;
        z2Var2.setValue(cd.L0(2131750396, null));
        linearLayout.addView(z2Var2, b6.t(-2, -2, 16, 0, 0, 6, 0));
        z2Var2.setOnClickListener(new View.OnClickListener(this) {
            public final q3 f45251b;

            {
                this.f45251b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r4;
                final p3 p3Var2 = p3Var;
                q3 q3Var = this.f45251b;
                switch (i10) {
                    case 0:
                        h3 h3Var = p3Var2.f45271c;
                        if (!h3Var.f45092f.isEmpty()) {
                            final z60 z60Var = new z60(q3Var.f21589c, q3Var.I0, q3Var.T1, false, true, false);
                            z60Var.f32942t = false;
                            z60Var.Y = true;
                            z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var.R = true;
                            z60Var.f32936p = new bi.j(z60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(h3Var.f45092f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19799id));
                                            Integer num4 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19799id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19799id));
                                            Integer num6 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19799id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i11 = q3Var.f21583a;
                            j20 j20Var = new j20() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i12;
                                    int i13 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList2 = arrayList;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr2 = strArr;
                                    switch (i13) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            p51 p51Var = (p51) obj2;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var2 = p3Var3.f45271c;
                                            boolean isEmpty = h3Var2.f45095j.isEmpty();
                                            int size = arrayList2.size();
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj3 = arrayList2.get(i14);
                                                i14++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var2.f45095j.contains(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var2.f45098m.get(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i15 = b3.f44981b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f24292l = lowerCase;
                                                    K.f24305z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(x2.i(cd.L0(2131750019, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p51 p51Var2 = (p51) obj2;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var3 = p3Var3.f45271c;
                                            boolean isEmpty2 = h3Var3.f45096k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i16 = 0;
                                            while (i16 < size2) {
                                                Object obj4 = arrayList2.get(i16);
                                                i16++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var3.f45096k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var3.f45099n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i17 = v2.f45331b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f24292l = lowerCase2;
                                                    K2.f24305z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p51 p51Var3 = (p51) obj2;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.f45271c;
                                            boolean isEmpty3 = h3Var4.f45097l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i18 = 0;
                                            while (i18 < size3) {
                                                Object obj5 = arrayList2.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.f45097l.contains(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.f45100o.get(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                    if (num3 == null) {
                                                        i12 = z13;
                                                    } else {
                                                        i12 = num3.intValue();
                                                    }
                                                    int i19 = e3.f45029b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f24292l = lowerCase3;
                                                    K3.f24305z = i12;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            o20 o20Var = new o20() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f7 = (Float) serializable;
                                    Float f10 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.f19799id;
                                            h3 h3Var2 = p3Var2.f45271c;
                                            HashSet hashSet = h3Var2.f45095j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = h3Var2.f45092f;
                                                    int size = arrayList2.size();
                                                    int i12 = 0;
                                                    while (i12 < size) {
                                                        Object obj3 = arrayList2.get(i12);
                                                        i12++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f19799id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            h3Var2.h();
                                            z60Var.u();
                                            return;
                                        case 1:
                                            int i13 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var3 = p3Var2.f45271c;
                                            HashSet hashSet2 = h3Var3.f45096k;
                                            if (!hashSet2.contains(Integer.valueOf(i13))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = h3Var3.f45093g;
                                                    int size2 = arrayList3.size();
                                                    int i14 = 0;
                                                    while (i14 < size2) {
                                                        Object obj4 = arrayList3.get(i14);
                                                        i14++;
                                                        int i15 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i15 != i13) {
                                                            hashSet2.add(Integer.valueOf(i15));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i13));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i13));
                                            }
                                            h3Var3.h();
                                            z60Var.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.f19799id;
                                            h3 h3Var4 = p3Var2.f45271c;
                                            HashSet hashSet3 = h3Var4.f45097l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = h3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i16 = 0;
                                                    while (i16 < size3) {
                                                        Object obj5 = arrayList4.get(i16);
                                                        i16++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f19799id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var.u();
                                            return;
                                    }
                                }
                            };
                            p6 p6Var = q3Var.I0;
                            Context context2 = context;
                            ny nyVar = new ny(context2, i11, 0, false, j20Var, o20Var, null, p6Var, 6);
                            nyVar.f30819f3.f29295r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232734);
                            a7.t(imageView, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, q3Var.I0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            a7.E(mtVar, t6.A6, q3Var.I0);
                            a7.m(mtVar, 30, t6.G6, q3Var.I0);
                            mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar, t6.E8, q3Var.I0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new ag.u2(14, strArr, nyVar));
                            if (arrayList.size() > 8) {
                                z60Var.r(frameLayout, b6.o(-1, 44));
                                z60Var.k();
                            }
                            if (!h3Var.f45095j.isEmpty()) {
                                z60Var.c(2131232356, cd.L0(2131745687, null), new k3(p3Var2, 0), false);
                            }
                            z60Var.q(nyVar);
                            z60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        h3 h3Var2 = p3Var2.f45271c;
                        if (!h3Var2.f45093g.isEmpty()) {
                            final z60 z60Var2 = new z60(q3Var.f21589c, q3Var.I0, q3Var.U1, false, true, false);
                            z60Var2.f32942t = false;
                            z60Var2.Y = true;
                            z60Var2.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var2.R = true;
                            z60Var2.f32936p = new bi.j(z60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(h3Var2.f45093g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19799id));
                                            Integer num4 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19799id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19799id));
                                            Integer num6 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19799id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i12 = q3Var.f21583a;
                            j20 j20Var2 = new j20() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i122;
                                    int i13 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i13) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            p51 p51Var = (p51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.f45271c;
                                            boolean isEmpty = h3Var22.f45095j.isEmpty();
                                            int size = arrayList22.size();
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj3 = arrayList22.get(i14);
                                                i14++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.f45095j.contains(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.f45098m.get(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i15 = b3.f44981b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f24292l = lowerCase;
                                                    K.f24305z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(x2.i(cd.L0(2131750019, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p51 p51Var2 = (p51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var3 = p3Var3.f45271c;
                                            boolean isEmpty2 = h3Var3.f45096k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i16 = 0;
                                            while (i16 < size2) {
                                                Object obj4 = arrayList22.get(i16);
                                                i16++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var3.f45096k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var3.f45099n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i17 = v2.f45331b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f24292l = lowerCase2;
                                                    K2.f24305z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p51 p51Var3 = (p51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.f45271c;
                                            boolean isEmpty3 = h3Var4.f45097l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i18 = 0;
                                            while (i18 < size3) {
                                                Object obj5 = arrayList22.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.f45097l.contains(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.f45100o.get(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                    if (num3 == null) {
                                                        i122 = z13;
                                                    } else {
                                                        i122 = num3.intValue();
                                                    }
                                                    int i19 = e3.f45029b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f24292l = lowerCase3;
                                                    K3.f24305z = i122;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            o20 o20Var2 = new o20() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f7 = (Float) serializable;
                                    Float f10 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.f19799id;
                                            h3 h3Var22 = p3Var2.f45271c;
                                            HashSet hashSet = h3Var22.f45095j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = h3Var22.f45092f;
                                                    int size = arrayList22.size();
                                                    int i122 = 0;
                                                    while (i122 < size) {
                                                        Object obj3 = arrayList22.get(i122);
                                                        i122++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f19799id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var2.u();
                                            return;
                                        case 1:
                                            int i13 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var3 = p3Var2.f45271c;
                                            HashSet hashSet2 = h3Var3.f45096k;
                                            if (!hashSet2.contains(Integer.valueOf(i13))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = h3Var3.f45093g;
                                                    int size2 = arrayList3.size();
                                                    int i14 = 0;
                                                    while (i14 < size2) {
                                                        Object obj4 = arrayList3.get(i14);
                                                        i14++;
                                                        int i15 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i15 != i13) {
                                                            hashSet2.add(Integer.valueOf(i15));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i13));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i13));
                                            }
                                            h3Var3.h();
                                            z60Var2.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.f19799id;
                                            h3 h3Var4 = p3Var2.f45271c;
                                            HashSet hashSet3 = h3Var4.f45097l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = h3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i16 = 0;
                                                    while (i16 < size3) {
                                                        Object obj5 = arrayList4.get(i16);
                                                        i16++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f19799id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var2.u();
                                            return;
                                    }
                                }
                            };
                            p6 p6Var2 = q3Var.I0;
                            Context context3 = context;
                            ny nyVar2 = new ny(context3, i12, 0, false, j20Var2, o20Var2, null, p6Var2, 7);
                            nyVar2.f30819f3.f29295r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232734);
                            a7.t(imageView2, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, q3Var.I0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            a7.E(mtVar2, t6.A6, q3Var.I0);
                            a7.m(mtVar2, 30, t6.G6, q3Var.I0);
                            mtVar2.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar2, t6.E8, q3Var.I0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new ag.u2(15, strArr2, nyVar2));
                            if (arrayList2.size() > 8) {
                                z60Var2.r(frameLayout2, b6.o(-1, 44));
                                z60Var2.k();
                            }
                            if (!h3Var2.f45096k.isEmpty()) {
                                z60Var2.c(2131232356, cd.L0(2131745687, null), new k3(p3Var2, 1), false);
                            }
                            z60Var2.q(nyVar2);
                            z60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        h3 h3Var3 = p3Var2.f45271c;
                        if (!h3Var3.h.isEmpty()) {
                            final z60 z60Var3 = new z60(q3Var.f21589c, q3Var.I0, q3Var.V1, false, true, false);
                            z60Var3.f32942t = false;
                            z60Var3.Y = true;
                            z60Var3.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var3.R = true;
                            z60Var3.f32936p = new bi.j(z60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(h3Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19799id));
                                            Integer num4 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19799id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19799id));
                                            Integer num6 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19799id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i13 = q3Var.f21583a;
                            j20 j20Var3 = new j20() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i122;
                                    int i132 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i132) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p51 p51Var = (p51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.f45271c;
                                            boolean isEmpty = h3Var22.f45095j.isEmpty();
                                            int size = arrayList22.size();
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj3 = arrayList22.get(i14);
                                                i14++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.f45095j.contains(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.f45098m.get(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i15 = b3.f44981b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f24292l = lowerCase;
                                                    K.f24305z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p51 p51Var2 = (p51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.f45271c;
                                            boolean isEmpty2 = h3Var32.f45096k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i16 = 0;
                                            while (i16 < size2) {
                                                Object obj4 = arrayList22.get(i16);
                                                i16++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.f45096k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.f45099n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i17 = v2.f45331b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f24292l = lowerCase2;
                                                    K2.f24305z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p51 p51Var3 = (p51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.f45271c;
                                            boolean isEmpty3 = h3Var4.f45097l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i18 = 0;
                                            while (i18 < size3) {
                                                Object obj5 = arrayList22.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.f45097l.contains(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.f45100o.get(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                    if (num3 == null) {
                                                        i122 = z13;
                                                    } else {
                                                        i122 = num3.intValue();
                                                    }
                                                    int i19 = e3.f45029b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f24292l = lowerCase3;
                                                    K3.f24305z = i122;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            o20 o20Var3 = new o20() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f7 = (Float) serializable;
                                    Float f10 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.f19799id;
                                            h3 h3Var22 = p3Var2.f45271c;
                                            HashSet hashSet = h3Var22.f45095j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = h3Var22.f45092f;
                                                    int size = arrayList22.size();
                                                    int i122 = 0;
                                                    while (i122 < size) {
                                                        Object obj3 = arrayList22.get(i122);
                                                        i122++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f19799id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var3.u();
                                            return;
                                        case 1:
                                            int i132 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.f45271c;
                                            HashSet hashSet2 = h3Var32.f45096k;
                                            if (!hashSet2.contains(Integer.valueOf(i132))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = h3Var32.f45093g;
                                                    int size2 = arrayList32.size();
                                                    int i14 = 0;
                                                    while (i14 < size2) {
                                                        Object obj4 = arrayList32.get(i14);
                                                        i14++;
                                                        int i15 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i15 != i132) {
                                                            hashSet2.add(Integer.valueOf(i15));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i132));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i132));
                                            }
                                            h3Var32.h();
                                            z60Var3.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.f19799id;
                                            h3 h3Var4 = p3Var2.f45271c;
                                            HashSet hashSet3 = h3Var4.f45097l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = h3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i16 = 0;
                                                    while (i16 < size3) {
                                                        Object obj5 = arrayList4.get(i16);
                                                        i16++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f19799id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var3.u();
                                            return;
                                    }
                                }
                            };
                            p6 p6Var3 = q3Var.I0;
                            Context context4 = context;
                            ny nyVar3 = new ny(context4, i13, 0, false, j20Var3, o20Var3, null, p6Var3, 8);
                            nyVar3.f30819f3.f29295r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232734);
                            a7.t(imageView3, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, q3Var.I0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            a7.E(mtVar3, t6.A6, q3Var.I0);
                            a7.m(mtVar3, 30, t6.G6, q3Var.I0);
                            mtVar3.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar3, t6.E8, q3Var.I0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new ag.u2(16, strArr3, nyVar3));
                            if (arrayList3.size() > 8) {
                                z60Var3.r(frameLayout3, b6.o(-1, 44));
                                z60Var3.k();
                            }
                            if (!h3Var3.f45097l.isEmpty()) {
                                z60Var3.c(2131232356, cd.L0(2131745687, null), new k3(p3Var2, 2), false);
                            }
                            z60Var3.q(nyVar3);
                            z60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        z2 z2Var3 = new z2(context, this.I0);
        this.U1 = z2Var3;
        z2Var3.setValue(cd.L0(2131750397, null));
        linearLayout.addView(z2Var3, b6.t(-2, -2, 16, 0, 0, 6, 0));
        z2Var3.setOnClickListener(new View.OnClickListener(this) {
            public final q3 f45251b;

            {
                this.f45251b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r4;
                final p3 p3Var2 = p3Var;
                q3 q3Var = this.f45251b;
                switch (i10) {
                    case 0:
                        h3 h3Var = p3Var2.f45271c;
                        if (!h3Var.f45092f.isEmpty()) {
                            final z60 z60Var = new z60(q3Var.f21589c, q3Var.I0, q3Var.T1, false, true, false);
                            z60Var.f32942t = false;
                            z60Var.Y = true;
                            z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var.R = true;
                            z60Var.f32936p = new bi.j(z60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(h3Var.f45092f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19799id));
                                            Integer num4 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19799id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19799id));
                                            Integer num6 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19799id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i11 = q3Var.f21583a;
                            j20 j20Var = new j20() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i122;
                                    int i132 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr;
                                    switch (i132) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p51 p51Var = (p51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.f45271c;
                                            boolean isEmpty = h3Var22.f45095j.isEmpty();
                                            int size = arrayList22.size();
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj3 = arrayList22.get(i14);
                                                i14++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.f45095j.contains(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.f45098m.get(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i15 = b3.f44981b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f24292l = lowerCase;
                                                    K.f24305z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p51 p51Var2 = (p51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.f45271c;
                                            boolean isEmpty2 = h3Var32.f45096k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i16 = 0;
                                            while (i16 < size2) {
                                                Object obj4 = arrayList22.get(i16);
                                                i16++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.f45096k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.f45099n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i17 = v2.f45331b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f24292l = lowerCase2;
                                                    K2.f24305z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p51 p51Var3 = (p51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.f45271c;
                                            boolean isEmpty3 = h3Var4.f45097l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i18 = 0;
                                            while (i18 < size3) {
                                                Object obj5 = arrayList22.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.f45097l.contains(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.f45100o.get(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                    if (num3 == null) {
                                                        i122 = z13;
                                                    } else {
                                                        i122 = num3.intValue();
                                                    }
                                                    int i19 = e3.f45029b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f24292l = lowerCase3;
                                                    K3.f24305z = i122;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            o20 o20Var = new o20() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f7 = (Float) serializable;
                                    Float f10 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.f19799id;
                                            h3 h3Var22 = p3Var2.f45271c;
                                            HashSet hashSet = h3Var22.f45095j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = h3Var22.f45092f;
                                                    int size = arrayList22.size();
                                                    int i122 = 0;
                                                    while (i122 < size) {
                                                        Object obj3 = arrayList22.get(i122);
                                                        i122++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f19799id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var.u();
                                            return;
                                        case 1:
                                            int i132 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.f45271c;
                                            HashSet hashSet2 = h3Var32.f45096k;
                                            if (!hashSet2.contains(Integer.valueOf(i132))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = h3Var32.f45093g;
                                                    int size2 = arrayList32.size();
                                                    int i14 = 0;
                                                    while (i14 < size2) {
                                                        Object obj4 = arrayList32.get(i14);
                                                        i14++;
                                                        int i15 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i15 != i132) {
                                                            hashSet2.add(Integer.valueOf(i15));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i132));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i132));
                                            }
                                            h3Var32.h();
                                            z60Var.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.f19799id;
                                            h3 h3Var4 = p3Var2.f45271c;
                                            HashSet hashSet3 = h3Var4.f45097l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = h3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i16 = 0;
                                                    while (i16 < size3) {
                                                        Object obj5 = arrayList4.get(i16);
                                                        i16++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f19799id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var.u();
                                            return;
                                    }
                                }
                            };
                            p6 p6Var = q3Var.I0;
                            Context context2 = context;
                            ny nyVar = new ny(context2, i11, 0, false, j20Var, o20Var, null, p6Var, 6);
                            nyVar.f30819f3.f29295r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232734);
                            a7.t(imageView, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, q3Var.I0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            a7.E(mtVar, t6.A6, q3Var.I0);
                            a7.m(mtVar, 30, t6.G6, q3Var.I0);
                            mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar, t6.E8, q3Var.I0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new ag.u2(14, strArr, nyVar));
                            if (arrayList.size() > 8) {
                                z60Var.r(frameLayout, b6.o(-1, 44));
                                z60Var.k();
                            }
                            if (!h3Var.f45095j.isEmpty()) {
                                z60Var.c(2131232356, cd.L0(2131745687, null), new k3(p3Var2, 0), false);
                            }
                            z60Var.q(nyVar);
                            z60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        h3 h3Var2 = p3Var2.f45271c;
                        if (!h3Var2.f45093g.isEmpty()) {
                            final z60 z60Var2 = new z60(q3Var.f21589c, q3Var.I0, q3Var.U1, false, true, false);
                            z60Var2.f32942t = false;
                            z60Var2.Y = true;
                            z60Var2.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var2.R = true;
                            z60Var2.f32936p = new bi.j(z60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(h3Var2.f45093g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19799id));
                                            Integer num4 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19799id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19799id));
                                            Integer num6 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19799id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i12 = q3Var.f21583a;
                            j20 j20Var2 = new j20() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i122;
                                    int i132 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i132) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p51 p51Var = (p51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.f45271c;
                                            boolean isEmpty = h3Var22.f45095j.isEmpty();
                                            int size = arrayList22.size();
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj3 = arrayList22.get(i14);
                                                i14++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.f45095j.contains(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.f45098m.get(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i15 = b3.f44981b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f24292l = lowerCase;
                                                    K.f24305z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p51 p51Var2 = (p51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.f45271c;
                                            boolean isEmpty2 = h3Var32.f45096k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i16 = 0;
                                            while (i16 < size2) {
                                                Object obj4 = arrayList22.get(i16);
                                                i16++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.f45096k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.f45099n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i17 = v2.f45331b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f24292l = lowerCase2;
                                                    K2.f24305z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p51 p51Var3 = (p51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.f45271c;
                                            boolean isEmpty3 = h3Var4.f45097l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i18 = 0;
                                            while (i18 < size3) {
                                                Object obj5 = arrayList22.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.f45097l.contains(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.f45100o.get(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                    if (num3 == null) {
                                                        i122 = z13;
                                                    } else {
                                                        i122 = num3.intValue();
                                                    }
                                                    int i19 = e3.f45029b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f24292l = lowerCase3;
                                                    K3.f24305z = i122;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            o20 o20Var2 = new o20() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f7 = (Float) serializable;
                                    Float f10 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.f19799id;
                                            h3 h3Var22 = p3Var2.f45271c;
                                            HashSet hashSet = h3Var22.f45095j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = h3Var22.f45092f;
                                                    int size = arrayList22.size();
                                                    int i122 = 0;
                                                    while (i122 < size) {
                                                        Object obj3 = arrayList22.get(i122);
                                                        i122++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f19799id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var2.u();
                                            return;
                                        case 1:
                                            int i132 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.f45271c;
                                            HashSet hashSet2 = h3Var32.f45096k;
                                            if (!hashSet2.contains(Integer.valueOf(i132))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = h3Var32.f45093g;
                                                    int size2 = arrayList32.size();
                                                    int i14 = 0;
                                                    while (i14 < size2) {
                                                        Object obj4 = arrayList32.get(i14);
                                                        i14++;
                                                        int i15 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i15 != i132) {
                                                            hashSet2.add(Integer.valueOf(i15));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i132));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i132));
                                            }
                                            h3Var32.h();
                                            z60Var2.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.f19799id;
                                            h3 h3Var4 = p3Var2.f45271c;
                                            HashSet hashSet3 = h3Var4.f45097l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = h3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i16 = 0;
                                                    while (i16 < size3) {
                                                        Object obj5 = arrayList4.get(i16);
                                                        i16++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f19799id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var2.u();
                                            return;
                                    }
                                }
                            };
                            p6 p6Var2 = q3Var.I0;
                            Context context3 = context;
                            ny nyVar2 = new ny(context3, i12, 0, false, j20Var2, o20Var2, null, p6Var2, 7);
                            nyVar2.f30819f3.f29295r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232734);
                            a7.t(imageView2, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, q3Var.I0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            a7.E(mtVar2, t6.A6, q3Var.I0);
                            a7.m(mtVar2, 30, t6.G6, q3Var.I0);
                            mtVar2.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar2, t6.E8, q3Var.I0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new ag.u2(15, strArr2, nyVar2));
                            if (arrayList2.size() > 8) {
                                z60Var2.r(frameLayout2, b6.o(-1, 44));
                                z60Var2.k();
                            }
                            if (!h3Var2.f45096k.isEmpty()) {
                                z60Var2.c(2131232356, cd.L0(2131745687, null), new k3(p3Var2, 1), false);
                            }
                            z60Var2.q(nyVar2);
                            z60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        h3 h3Var3 = p3Var2.f45271c;
                        if (!h3Var3.h.isEmpty()) {
                            final z60 z60Var3 = new z60(q3Var.f21589c, q3Var.I0, q3Var.V1, false, true, false);
                            z60Var3.f32942t = false;
                            z60Var3.Y = true;
                            z60Var3.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var3.R = true;
                            z60Var3.f32936p = new bi.j(z60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(h3Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19799id));
                                            Integer num4 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19799id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19799id));
                                            Integer num6 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19799id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i13 = q3Var.f21583a;
                            j20 j20Var3 = new j20() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i122;
                                    int i132 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i132) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p51 p51Var = (p51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.f45271c;
                                            boolean isEmpty = h3Var22.f45095j.isEmpty();
                                            int size = arrayList22.size();
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj3 = arrayList22.get(i14);
                                                i14++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.f45095j.contains(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.f45098m.get(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i15 = b3.f44981b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f24292l = lowerCase;
                                                    K.f24305z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p51 p51Var2 = (p51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.f45271c;
                                            boolean isEmpty2 = h3Var32.f45096k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i16 = 0;
                                            while (i16 < size2) {
                                                Object obj4 = arrayList22.get(i16);
                                                i16++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.f45096k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.f45099n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i17 = v2.f45331b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f24292l = lowerCase2;
                                                    K2.f24305z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p51 p51Var3 = (p51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.f45271c;
                                            boolean isEmpty3 = h3Var4.f45097l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i18 = 0;
                                            while (i18 < size3) {
                                                Object obj5 = arrayList22.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.f45097l.contains(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.f45100o.get(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                    if (num3 == null) {
                                                        i122 = z13;
                                                    } else {
                                                        i122 = num3.intValue();
                                                    }
                                                    int i19 = e3.f45029b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f24292l = lowerCase3;
                                                    K3.f24305z = i122;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            o20 o20Var3 = new o20() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f7 = (Float) serializable;
                                    Float f10 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.f19799id;
                                            h3 h3Var22 = p3Var2.f45271c;
                                            HashSet hashSet = h3Var22.f45095j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = h3Var22.f45092f;
                                                    int size = arrayList22.size();
                                                    int i122 = 0;
                                                    while (i122 < size) {
                                                        Object obj3 = arrayList22.get(i122);
                                                        i122++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f19799id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var3.u();
                                            return;
                                        case 1:
                                            int i132 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.f45271c;
                                            HashSet hashSet2 = h3Var32.f45096k;
                                            if (!hashSet2.contains(Integer.valueOf(i132))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = h3Var32.f45093g;
                                                    int size2 = arrayList32.size();
                                                    int i14 = 0;
                                                    while (i14 < size2) {
                                                        Object obj4 = arrayList32.get(i14);
                                                        i14++;
                                                        int i15 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i15 != i132) {
                                                            hashSet2.add(Integer.valueOf(i15));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i132));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i132));
                                            }
                                            h3Var32.h();
                                            z60Var3.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.f19799id;
                                            h3 h3Var4 = p3Var2.f45271c;
                                            HashSet hashSet3 = h3Var4.f45097l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = h3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i16 = 0;
                                                    while (i16 < size3) {
                                                        Object obj5 = arrayList4.get(i16);
                                                        i16++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f19799id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var3.u();
                                            return;
                                    }
                                }
                            };
                            p6 p6Var3 = q3Var.I0;
                            Context context4 = context;
                            ny nyVar3 = new ny(context4, i13, 0, false, j20Var3, o20Var3, null, p6Var3, 8);
                            nyVar3.f30819f3.f29295r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232734);
                            a7.t(imageView3, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, q3Var.I0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            a7.E(mtVar3, t6.A6, q3Var.I0);
                            a7.m(mtVar3, 30, t6.G6, q3Var.I0);
                            mtVar3.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar3, t6.E8, q3Var.I0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new ag.u2(16, strArr3, nyVar3));
                            if (arrayList3.size() > 8) {
                                z60Var3.r(frameLayout3, b6.o(-1, 44));
                                z60Var3.k();
                            }
                            if (!h3Var3.f45097l.isEmpty()) {
                                z60Var3.c(2131232356, cd.L0(2131745687, null), new k3(p3Var2, 2), false);
                            }
                            z60Var3.q(nyVar3);
                            z60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        z2 z2Var4 = new z2(context, this.I0);
        this.V1 = z2Var4;
        z2Var4.setValue(cd.L0(2131750389, null));
        linearLayout.addView(z2Var4, b6.t(-2, -2, 16, 0, 0, 0, 0));
        z2Var4.setOnClickListener(new View.OnClickListener(this) {
            public final q3 f45251b;

            {
                this.f45251b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10 = r4;
                final p3 p3Var2 = p3Var;
                q3 q3Var = this.f45251b;
                switch (i10) {
                    case 0:
                        h3 h3Var = p3Var2.f45271c;
                        if (!h3Var.f45092f.isEmpty()) {
                            final z60 z60Var = new z60(q3Var.f21589c, q3Var.I0, q3Var.T1, false, true, false);
                            z60Var.f32942t = false;
                            z60Var.Y = true;
                            z60Var.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var.R = true;
                            z60Var.f32936p = new bi.j(z60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(h3Var.f45092f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19799id));
                                            Integer num4 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19799id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19799id));
                                            Integer num6 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19799id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i11 = q3Var.f21583a;
                            j20 j20Var = new j20() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i122;
                                    int i132 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr;
                                    switch (i132) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p51 p51Var = (p51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.f45271c;
                                            boolean isEmpty = h3Var22.f45095j.isEmpty();
                                            int size = arrayList22.size();
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj3 = arrayList22.get(i14);
                                                i14++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.f45095j.contains(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.f45098m.get(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i15 = b3.f44981b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f24292l = lowerCase;
                                                    K.f24305z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p51 p51Var2 = (p51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.f45271c;
                                            boolean isEmpty2 = h3Var32.f45096k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i16 = 0;
                                            while (i16 < size2) {
                                                Object obj4 = arrayList22.get(i16);
                                                i16++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.f45096k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.f45099n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i17 = v2.f45331b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f24292l = lowerCase2;
                                                    K2.f24305z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p51 p51Var3 = (p51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.f45271c;
                                            boolean isEmpty3 = h3Var4.f45097l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i18 = 0;
                                            while (i18 < size3) {
                                                Object obj5 = arrayList22.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.f45097l.contains(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.f45100o.get(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                    if (num3 == null) {
                                                        i122 = z13;
                                                    } else {
                                                        i122 = num3.intValue();
                                                    }
                                                    int i19 = e3.f45029b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f24292l = lowerCase3;
                                                    K3.f24305z = i122;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            o20 o20Var = new o20() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f7 = (Float) serializable;
                                    Float f10 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.f19799id;
                                            h3 h3Var22 = p3Var2.f45271c;
                                            HashSet hashSet = h3Var22.f45095j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = h3Var22.f45092f;
                                                    int size = arrayList22.size();
                                                    int i122 = 0;
                                                    while (i122 < size) {
                                                        Object obj3 = arrayList22.get(i122);
                                                        i122++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f19799id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var.u();
                                            return;
                                        case 1:
                                            int i132 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.f45271c;
                                            HashSet hashSet2 = h3Var32.f45096k;
                                            if (!hashSet2.contains(Integer.valueOf(i132))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = h3Var32.f45093g;
                                                    int size2 = arrayList32.size();
                                                    int i14 = 0;
                                                    while (i14 < size2) {
                                                        Object obj4 = arrayList32.get(i14);
                                                        i14++;
                                                        int i15 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i15 != i132) {
                                                            hashSet2.add(Integer.valueOf(i15));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i132));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i132));
                                            }
                                            h3Var32.h();
                                            z60Var.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.f19799id;
                                            h3 h3Var4 = p3Var2.f45271c;
                                            HashSet hashSet3 = h3Var4.f45097l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = h3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i16 = 0;
                                                    while (i16 < size3) {
                                                        Object obj5 = arrayList4.get(i16);
                                                        i16++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f19799id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var.u();
                                            return;
                                    }
                                }
                            };
                            p6 p6Var = q3Var.I0;
                            Context context2 = context;
                            ny nyVar = new ny(context2, i11, 0, false, j20Var, o20Var, null, p6Var, 6);
                            nyVar.f30819f3.f29295r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232734);
                            a7.t(imageView, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, q3Var.I0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            a7.E(mtVar, t6.A6, q3Var.I0);
                            a7.m(mtVar, 30, t6.G6, q3Var.I0);
                            mtVar.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar, t6.E8, q3Var.I0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new ag.u2(14, strArr, nyVar));
                            if (arrayList.size() > 8) {
                                z60Var.r(frameLayout, b6.o(-1, 44));
                                z60Var.k();
                            }
                            if (!h3Var.f45095j.isEmpty()) {
                                z60Var.c(2131232356, cd.L0(2131745687, null), new k3(p3Var2, 0), false);
                            }
                            z60Var.q(nyVar);
                            z60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        h3 h3Var2 = p3Var2.f45271c;
                        if (!h3Var2.f45093g.isEmpty()) {
                            final z60 z60Var2 = new z60(q3Var.f21589c, q3Var.I0, q3Var.U1, false, true, false);
                            z60Var2.f32942t = false;
                            z60Var2.Y = true;
                            z60Var2.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var2.R = true;
                            z60Var2.f32936p = new bi.j(z60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(h3Var2.f45093g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19799id));
                                            Integer num4 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19799id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19799id));
                                            Integer num6 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19799id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i12 = q3Var.f21583a;
                            j20 j20Var2 = new j20() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i122;
                                    int i132 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i132) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p51 p51Var = (p51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.f45271c;
                                            boolean isEmpty = h3Var22.f45095j.isEmpty();
                                            int size = arrayList22.size();
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj3 = arrayList22.get(i14);
                                                i14++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.f45095j.contains(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.f45098m.get(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i15 = b3.f44981b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f24292l = lowerCase;
                                                    K.f24305z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p51 p51Var2 = (p51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.f45271c;
                                            boolean isEmpty2 = h3Var32.f45096k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i16 = 0;
                                            while (i16 < size2) {
                                                Object obj4 = arrayList22.get(i16);
                                                i16++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.f45096k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.f45099n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i17 = v2.f45331b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f24292l = lowerCase2;
                                                    K2.f24305z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p51 p51Var3 = (p51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.f45271c;
                                            boolean isEmpty3 = h3Var4.f45097l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i18 = 0;
                                            while (i18 < size3) {
                                                Object obj5 = arrayList22.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.f45097l.contains(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.f45100o.get(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                    if (num3 == null) {
                                                        i122 = z13;
                                                    } else {
                                                        i122 = num3.intValue();
                                                    }
                                                    int i19 = e3.f45029b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f24292l = lowerCase3;
                                                    K3.f24305z = i122;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            o20 o20Var2 = new o20() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f7 = (Float) serializable;
                                    Float f10 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.f19799id;
                                            h3 h3Var22 = p3Var2.f45271c;
                                            HashSet hashSet = h3Var22.f45095j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = h3Var22.f45092f;
                                                    int size = arrayList22.size();
                                                    int i122 = 0;
                                                    while (i122 < size) {
                                                        Object obj3 = arrayList22.get(i122);
                                                        i122++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f19799id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var2.u();
                                            return;
                                        case 1:
                                            int i132 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.f45271c;
                                            HashSet hashSet2 = h3Var32.f45096k;
                                            if (!hashSet2.contains(Integer.valueOf(i132))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = h3Var32.f45093g;
                                                    int size2 = arrayList32.size();
                                                    int i14 = 0;
                                                    while (i14 < size2) {
                                                        Object obj4 = arrayList32.get(i14);
                                                        i14++;
                                                        int i15 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i15 != i132) {
                                                            hashSet2.add(Integer.valueOf(i15));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i132));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i132));
                                            }
                                            h3Var32.h();
                                            z60Var2.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.f19799id;
                                            h3 h3Var4 = p3Var2.f45271c;
                                            HashSet hashSet3 = h3Var4.f45097l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = h3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i16 = 0;
                                                    while (i16 < size3) {
                                                        Object obj5 = arrayList4.get(i16);
                                                        i16++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f19799id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var2.u();
                                            return;
                                    }
                                }
                            };
                            p6 p6Var2 = q3Var.I0;
                            Context context3 = context;
                            ny nyVar2 = new ny(context3, i12, 0, false, j20Var2, o20Var2, null, p6Var2, 7);
                            nyVar2.f30819f3.f29295r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232734);
                            a7.t(imageView2, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, q3Var.I0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            a7.E(mtVar2, t6.A6, q3Var.I0);
                            a7.m(mtVar2, 30, t6.G6, q3Var.I0);
                            mtVar2.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar2, t6.E8, q3Var.I0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new ag.u2(15, strArr2, nyVar2));
                            if (arrayList2.size() > 8) {
                                z60Var2.r(frameLayout2, b6.o(-1, 44));
                                z60Var2.k();
                            }
                            if (!h3Var2.f45096k.isEmpty()) {
                                z60Var2.c(2131232356, cd.L0(2131745687, null), new k3(p3Var2, 1), false);
                            }
                            z60Var2.q(nyVar2);
                            z60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        h3 h3Var3 = p3Var2.f45271c;
                        if (!h3Var3.h.isEmpty()) {
                            final z60 z60Var3 = new z60(q3Var.f21589c, q3Var.I0, q3Var.V1, false, true, false);
                            z60Var3.f32942t = false;
                            z60Var3.Y = true;
                            z60Var3.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                            z60Var3.R = true;
                            z60Var3.f32936p = new bi.j(z60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(h3Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            p3 p3Var3 = p3Var2;
                                            Integer num = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) p3Var3.f45271c.f45099n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            p3 p3Var4 = p3Var2;
                                            Integer num3 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19799id));
                                            Integer num4 = (Integer) p3Var4.f45271c.f45100o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19799id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            p3 p3Var5 = p3Var2;
                                            Integer num5 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19799id));
                                            Integer num6 = (Integer) p3Var5.f45271c.f45098m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19799id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i13 = q3Var.f21583a;
                            j20 j20Var3 = new j20() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i122;
                                    int i132 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    p3 p3Var3 = p3Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i132) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p51 p51Var = (p51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.i0.N3(lowerCase);
                                            h3 h3Var22 = p3Var3.f45271c;
                                            boolean isEmpty = h3Var22.f45095j.isEmpty();
                                            int size = arrayList22.size();
                                            int i14 = 0;
                                            while (i14 < size) {
                                                Object obj3 = arrayList22.get(i14);
                                                i14++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = h3Var22.f45095j.contains(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || sc.e.y(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) h3Var22.f45098m.get(Long.valueOf(stargiftattributemodel.document.f19799id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i15 = b3.f44981b;
                                                    a51 K = a51.K(b3.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f24292l = lowerCase;
                                                    K.f24305z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(x2.i(cd.L0(2131750019, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p51 p51Var2 = (p51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                            h3 h3Var32 = p3Var3.f45271c;
                                            boolean isEmpty2 = h3Var32.f45096k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i16 = 0;
                                            while (i16 < size2) {
                                                Object obj4 = arrayList22.get(i16);
                                                i16++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = h3Var32.f45096k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || sc.e.y(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) h3Var32.f45099n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i17 = v2.f45331b;
                                                    a51 K2 = a51.K(v2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f24292l = lowerCase2;
                                                    K2.f24305z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(x2.i(cd.L0(2131750024, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p51 p51Var3 = (p51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.i0.N3(lowerCase3);
                                            h3 h3Var4 = p3Var3.f45271c;
                                            boolean isEmpty3 = h3Var4.f45097l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i18 = 0;
                                            while (i18 < size3) {
                                                Object obj5 = arrayList22.get(i18);
                                                i18++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = h3Var4.f45097l.contains(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || sc.e.y(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) h3Var4.f45100o.get(Long.valueOf(stargiftattributepattern.document.f19799id));
                                                    if (num3 == null) {
                                                        i122 = z13;
                                                    } else {
                                                        i122 = num3.intValue();
                                                    }
                                                    int i19 = e3.f45029b;
                                                    a51 K3 = a51.K(e3.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f24292l = lowerCase3;
                                                    K3.f24305z = i122;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(x2.i(cd.L0(2131750017, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            o20 o20Var3 = new o20() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    a51 a51Var = (a51) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f7 = (Float) serializable;
                                    Float f10 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) a51Var.G).document.f19799id;
                                            h3 h3Var22 = p3Var2.f45271c;
                                            HashSet hashSet = h3Var22.f45095j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = h3Var22.f45092f;
                                                    int size = arrayList22.size();
                                                    int i122 = 0;
                                                    while (i122 < size) {
                                                        Object obj3 = arrayList22.get(i122);
                                                        i122++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f19799id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            h3Var22.h();
                                            z60Var3.u();
                                            return;
                                        case 1:
                                            int i132 = ((TL_stars.starGiftAttributeBackdrop) a51Var.G).backdrop_id;
                                            h3 h3Var32 = p3Var2.f45271c;
                                            HashSet hashSet2 = h3Var32.f45096k;
                                            if (!hashSet2.contains(Integer.valueOf(i132))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = h3Var32.f45093g;
                                                    int size2 = arrayList32.size();
                                                    int i14 = 0;
                                                    while (i14 < size2) {
                                                        Object obj4 = arrayList32.get(i14);
                                                        i14++;
                                                        int i15 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i15 != i132) {
                                                            hashSet2.add(Integer.valueOf(i15));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i132));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i132));
                                            }
                                            h3Var32.h();
                                            z60Var3.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) a51Var.G).document.f19799id;
                                            h3 h3Var4 = p3Var2.f45271c;
                                            HashSet hashSet3 = h3Var4.f45097l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = h3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i16 = 0;
                                                    while (i16 < size3) {
                                                        Object obj5 = arrayList4.get(i16);
                                                        i16++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f19799id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            h3Var4.h();
                                            z60Var3.u();
                                            return;
                                    }
                                }
                            };
                            p6 p6Var3 = q3Var.I0;
                            Context context4 = context;
                            ny nyVar3 = new ny(context4, i13, 0, false, j20Var3, o20Var3, null, p6Var3, 8);
                            nyVar3.f30819f3.f29295r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232734);
                            a7.t(imageView3, t6.F8, q3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, b6.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, q3Var.I0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            a7.E(mtVar3, t6.A6, q3Var.I0);
                            a7.m(mtVar3, 30, t6.G6, q3Var.I0);
                            mtVar3.setCursorSize(org.telegram.messenger.i0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(cd.L0(2131750018, null));
                            a7.V(mtVar3, t6.E8, q3Var.I0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, b6.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new ag.u2(16, strArr3, nyVar3));
                            if (arrayList3.size() > 8) {
                                z60Var3.r(frameLayout3, b6.o(-1, 44));
                                z60Var3.k();
                            }
                            if (!h3Var3.f45097l.isEmpty()) {
                                z60Var3.c(2131232356, cd.L0(2131745687, null), new k3(p3Var2, 2), false);
                            }
                            z60Var3.q(nyVar3);
                            z60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        getContext();
        s4.r rVar = new s4.r(3);
        rVar.O = new jg.h1(this, 12);
        this.f26666k1.setLayoutManager(rVar);
        this.f26666k1.setOnItemClickListener(new org.telegram.ui.web.k0(6, this, p3Var));
        this.f26666k1.setPadding(org.telegram.messenger.i0.L(8.0f) + this.f21615t0, 0, org.telegram.messenger.i0.L(8.0f) + this.f21615t0, 0);
        this.f26666k1.setOnScrollListener(new bu0(this, 12));
        s4.j jVar = new s4.j();
        jVar.f47927m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.f26666k1.setItemAnimator(jVar);
        this.f26666k1.setItemSelectorColorProvider(new org.telegram.utils.twidget.t(9));
        rh.n2 n2Var = new rh.n2(context);
        this.W1 = n2Var;
        int L = org.telegram.messenger.i0.L(20.0f);
        int L2 = org.telegram.messenger.i0.L(9.0f);
        n2Var.h = L;
        n2Var.f47228n = L2;
        n2Var.setRoundRadius(org.telegram.messenger.i0.L(22.0f));
        n2Var.setFullRect(true);
        org.telegram.messenger.i0.m2(new h1(n2Var, 10), 12.0f, 12, new ArrayList());
        n2Var.setPivotY(0.0f);
        this.f21589c.addView(n2Var, b6.e(-1, -2, 55));
        this.a2.O(false);
        p3Var.d = new l3(this, 1);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        o3 o3Var = new o3(this, tk0Var, getContext(), this.f21583a, new ag.a(this, 28), this.I0, 0);
        this.a2 = o3Var;
        return o3Var;
    }

    @Override
    public final CharSequence O0() {
        String str = this.P1;
        if (str != null) {
            return str;
        }
        return cd.L0(2131749780, null);
    }

    @Override
    public final void T0(float f7) {
        float y3 = this.f21586b.getY() + f7;
        rh.n2 n2Var = this.W1;
        float measuredHeight = y3 - n2Var.getMeasuredHeight();
        float l4 = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + org.telegram.messenger.i0.L(8.0f)) / n2Var.getMeasuredHeight());
        float height = this.f21589c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l4 = Math.min(l4, Utilities.l(1.0f - ((measuredHeight - height) / org.telegram.messenger.i0.N(128.0f))));
        }
        n2Var.setScaleX(l4);
        n2Var.setScaleY(l4);
        n2Var.setAlpha(org.telegram.messenger.i0.z1(l4, 0.5f, 1.0f));
        n2Var.setTranslationY(measuredHeight);
    }

    public final void d1() {
        int R;
        a51 G;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            tk0 tk0Var = this.f26666k1;
            if (i10 >= tk0Var.getChildCount()) {
                break;
            }
            View childAt = tk0Var.getChildAt(i10);
            if ((childAt instanceof zz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.a2.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i10++;
        }
        p3 p3Var = this.Q1;
        if (z10) {
            p3Var.f45270b.b();
        }
        if (z11) {
            p3Var.f45271c.g(false);
        }
    }
}
