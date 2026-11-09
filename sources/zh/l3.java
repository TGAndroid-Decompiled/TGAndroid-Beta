package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.hc;
import bi.j5;
import c8.ha;
import fi.h7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zs;
import org.telegram.ui.mx;
public final class l3 extends na {
    public static final int f60456c2 = 0;
    public final String P1;
    public final k3 Q1;
    public final HorizontalScrollView R1;
    public final u2 S1;
    public final u2 T1;
    public final u2 U1;
    public final u2 V1;
    public final j5 W1;
    public bi.n2 X1;
    public final HashSet Y1;
    public boolean Z1;
    public hc f60457a2;
    public boolean f60458b2;

    public l3(final Context context, String str, final k3 k3Var) {
        super(2, context, (g6) null, false);
        this.Y1 = new HashSet();
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        N();
        this.P1 = str;
        this.Q1 = k3Var;
        this.l1.setTitle(O0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.R1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        u2 u2Var = new u2(context, this.I0, false);
        this.S1 = u2Var;
        u2Var.setSorting(k3Var.f60428c.f60274p);
        linearLayout.addView(u2Var, ha.t(-2, -2, 16, 0, 0, 6, 0));
        u2Var.setOnClickListener(new wg.z0(8, this, k3Var));
        u2 u2Var2 = new u2(context, this.I0, false);
        this.T1 = u2Var2;
        u2Var2.setValue(id.M0(2131750387, null));
        linearLayout.addView(u2Var2, ha.t(-2, -2, 16, 0, 0, 6, 0));
        u2Var2.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60402b;

            {
                this.f60402b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final k3 k3Var2 = k3Var;
                l3 l3Var = this.f60402b;
                switch (i7) {
                    case 0:
                        c3 c3Var = k3Var2.f60428c;
                        if (!c3Var.f60265f.isEmpty()) {
                            final l60 l60Var = new l60(l3Var.f28627c, l3Var.I0, l3Var.T1, false, true, false);
                            l60Var.f35618t = false;
                            l60Var.Y = true;
                            l60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            l60Var.R = true;
                            l60Var.f35612p = new li.h(l60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(c3Var.f60265f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                                            Integer num4 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                                            Integer num6 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
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
                            int i10 = l3Var.f28621a;
                            v10 v10Var = new v10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i11;
                                    int i12 = r4;
                                    boolean z9 = false;
                                    ArrayList arrayList2 = arrayList;
                                    k3 k3Var3 = k3Var2;
                                    String[] strArr2 = strArr;
                                    switch (i12) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            m41 m41Var = (m41) obj2;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            c3 c3Var2 = k3Var3.f60428c;
                                            boolean isEmpty = c3Var2.f60268j.isEmpty();
                                            int size = arrayList2.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList2.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var2.f60268j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var2.f60271m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60593b;
                                                    y31 K = y31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40568l = lowerCase;
                                                    K.f40581z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                    }
                                                    K.L(z10);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(s2.i(id.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            m41 m41Var2 = (m41) obj2;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            c3 c3Var3 = k3Var3.f60428c;
                                            boolean isEmpty2 = c3Var3.f60269k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList2.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var3.f60269k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var3.f60272n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60512b;
                                                    y31 K2 = y31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40568l = lowerCase2;
                                                    K2.f40581z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K2.L(z11);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(s2.i(id.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            m41 m41Var3 = (m41) obj2;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            c3 c3Var4 = k3Var3.f60428c;
                                            boolean isEmpty3 = c3Var4.f60270l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList2.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60270l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60273o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                    if (num3 == null) {
                                                        i11 = z12;
                                                    } else {
                                                        i11 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60650b;
                                                    y31 K3 = y31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40568l = lowerCase3;
                                                    K3.f40581z = i11;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                    }
                                                    K3.L(z13);
                                                    arrayList5.add(K3);
                                                }
                                                z9 = z12;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(s2.i(id.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            a20 a20Var = new a20() {
                                @Override
                                public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    y31 y31Var = (y31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) y31Var.G).document.f26962id;
                                            c3 c3Var2 = k3Var2.f60428c;
                                            HashSet hashSet = c3Var2.f60268j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = c3Var2.f60265f;
                                                    int size = arrayList2.size();
                                                    int i11 = 0;
                                                    while (i11 < size) {
                                                        Object obj3 = arrayList2.get(i11);
                                                        i11++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26962id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            c3Var2.h();
                                            l60Var.u();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) y31Var.G).backdrop_id;
                                            c3 c3Var3 = k3Var2.f60428c;
                                            HashSet hashSet2 = c3Var3.f60269k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = c3Var3.f60266g;
                                                    int size2 = arrayList3.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList3.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i12) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i12));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i12));
                                            }
                                            c3Var3.h();
                                            l60Var.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) y31Var.G).document.f26962id;
                                            c3 c3Var4 = k3Var2.f60428c;
                                            HashSet hashSet3 = c3Var4.f60270l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26962id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            c3Var4.h();
                                            l60Var.u();
                                            return;
                                    }
                                }
                            };
                            g6 g6Var = l3Var.I0;
                            Context context2 = context;
                            mx mxVar = new mx(context2, i10, 0, false, v10Var, a20Var, null, g6Var, 6);
                            mxVar.f37556f3.f35945r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232737);
                            s6.s(imageView, l6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            zs zsVar = new zs(context2, l3Var.I0);
                            zsVar.setTextSize(1, 16.0f);
                            zsVar.setInputType(573441);
                            zsVar.setRawInputType(573441);
                            s6.D(zsVar, l6.A6, l3Var.I0);
                            s6.l(zsVar, 30, l6.G6, l3Var.I0);
                            zsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            zsVar.setCursorWidth(1.5f);
                            zsVar.setHint(id.M0(2131750009, null));
                            s6.U(zsVar, l6.E8, l3Var.I0);
                            zsVar.setBackground(null);
                            frameLayout.addView(zsVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            zsVar.addTextChangedListener(new h7(strArr, mxVar, false, 15));
                            if (arrayList.size() > 8) {
                                l60Var.r(frameLayout, ha.o(-1, 44));
                                l60Var.k();
                            }
                            if (!c3Var.f60268j.isEmpty()) {
                                l60Var.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 0), false);
                            }
                            l60Var.q(mxVar);
                            l60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        c3 c3Var2 = k3Var2.f60428c;
                        if (!c3Var2.f60266g.isEmpty()) {
                            final l60 l60Var2 = new l60(l3Var.f28627c, l3Var.I0, l3Var.U1, false, true, false);
                            l60Var2.f35618t = false;
                            l60Var2.Y = true;
                            l60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            l60Var2.R = true;
                            l60Var2.f35612p = new li.h(l60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(c3Var2.f60266g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                                            Integer num4 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                                            Integer num6 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
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
                            int i11 = l3Var.f28621a;
                            v10 v10Var2 = new v10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i12 = r4;
                                    boolean z9 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    k3 k3Var3 = k3Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i12) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            m41 m41Var = (m41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            c3 c3Var22 = k3Var3.f60428c;
                                            boolean isEmpty = c3Var22.f60268j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60268j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60271m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60593b;
                                                    y31 K = y31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40568l = lowerCase;
                                                    K.f40581z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                    }
                                                    K.L(z10);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(s2.i(id.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            m41 m41Var2 = (m41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            c3 c3Var3 = k3Var3.f60428c;
                                            boolean isEmpty2 = c3Var3.f60269k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var3.f60269k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var3.f60272n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60512b;
                                                    y31 K2 = y31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40568l = lowerCase2;
                                                    K2.f40581z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K2.L(z11);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(s2.i(id.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            m41 m41Var3 = (m41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            c3 c3Var4 = k3Var3.f60428c;
                                            boolean isEmpty3 = c3Var4.f60270l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60270l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60273o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60650b;
                                                    y31 K3 = y31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40568l = lowerCase3;
                                                    K3.f40581z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                    }
                                                    K3.L(z13);
                                                    arrayList5.add(K3);
                                                }
                                                z9 = z12;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(s2.i(id.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            a20 a20Var2 = new a20() {
                                @Override
                                public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    y31 y31Var = (y31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) y31Var.G).document.f26962id;
                                            c3 c3Var22 = k3Var2.f60428c;
                                            HashSet hashSet = c3Var22.f60268j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60265f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26962id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            c3Var22.h();
                                            l60Var2.u();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) y31Var.G).backdrop_id;
                                            c3 c3Var3 = k3Var2.f60428c;
                                            HashSet hashSet2 = c3Var3.f60269k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = c3Var3.f60266g;
                                                    int size2 = arrayList3.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList3.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i12) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i12));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i12));
                                            }
                                            c3Var3.h();
                                            l60Var2.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) y31Var.G).document.f26962id;
                                            c3 c3Var4 = k3Var2.f60428c;
                                            HashSet hashSet3 = c3Var4.f60270l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26962id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            c3Var4.h();
                                            l60Var2.u();
                                            return;
                                    }
                                }
                            };
                            g6 g6Var2 = l3Var.I0;
                            Context context3 = context;
                            mx mxVar2 = new mx(context3, i11, 0, false, v10Var2, a20Var2, null, g6Var2, 7);
                            mxVar2.f37556f3.f35945r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232737);
                            s6.s(imageView2, l6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            zs zsVar2 = new zs(context3, l3Var.I0);
                            zsVar2.setTextSize(1, 16.0f);
                            zsVar2.setInputType(573441);
                            zsVar2.setRawInputType(573441);
                            s6.D(zsVar2, l6.A6, l3Var.I0);
                            s6.l(zsVar2, 30, l6.G6, l3Var.I0);
                            zsVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            zsVar2.setCursorWidth(1.5f);
                            zsVar2.setHint(id.M0(2131750009, null));
                            s6.U(zsVar2, l6.E8, l3Var.I0);
                            zsVar2.setBackground(null);
                            frameLayout2.addView(zsVar2, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            zsVar2.addTextChangedListener(new h7(strArr2, mxVar2, false, 16));
                            if (arrayList2.size() > 8) {
                                l60Var2.r(frameLayout2, ha.o(-1, 44));
                                l60Var2.k();
                            }
                            if (!c3Var2.f60269k.isEmpty()) {
                                l60Var2.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 1), false);
                            }
                            l60Var2.q(mxVar2);
                            l60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        c3 c3Var3 = k3Var2.f60428c;
                        if (!c3Var3.h.isEmpty()) {
                            final l60 l60Var3 = new l60(l3Var.f28627c, l3Var.I0, l3Var.V1, false, true, false);
                            l60Var3.f35618t = false;
                            l60Var3.Y = true;
                            l60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            l60Var3.R = true;
                            l60Var3.f35612p = new li.h(l60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(c3Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                                            Integer num4 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                                            Integer num6 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
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
                            int i12 = l3Var.f28621a;
                            v10 v10Var3 = new v10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z9 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    k3 k3Var3 = k3Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            m41 m41Var = (m41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            c3 c3Var22 = k3Var3.f60428c;
                                            boolean isEmpty = c3Var22.f60268j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60268j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60271m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60593b;
                                                    y31 K = y31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40568l = lowerCase;
                                                    K.f40581z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                    }
                                                    K.L(z10);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(s2.i(id.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            m41 m41Var2 = (m41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            c3 c3Var32 = k3Var3.f60428c;
                                            boolean isEmpty2 = c3Var32.f60269k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60269k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60272n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60512b;
                                                    y31 K2 = y31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40568l = lowerCase2;
                                                    K2.f40581z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K2.L(z11);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(s2.i(id.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            m41 m41Var3 = (m41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            c3 c3Var4 = k3Var3.f60428c;
                                            boolean isEmpty3 = c3Var4.f60270l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60270l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60273o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60650b;
                                                    y31 K3 = y31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40568l = lowerCase3;
                                                    K3.f40581z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                    }
                                                    K3.L(z13);
                                                    arrayList5.add(K3);
                                                }
                                                z9 = z12;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(s2.i(id.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            a20 a20Var3 = new a20() {
                                @Override
                                public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    y31 y31Var = (y31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) y31Var.G).document.f26962id;
                                            c3 c3Var22 = k3Var2.f60428c;
                                            HashSet hashSet = c3Var22.f60268j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60265f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26962id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            c3Var22.h();
                                            l60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) y31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60428c;
                                            HashSet hashSet2 = c3Var32.f60269k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60266g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            c3Var32.h();
                                            l60Var3.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) y31Var.G).document.f26962id;
                                            c3 c3Var4 = k3Var2.f60428c;
                                            HashSet hashSet3 = c3Var4.f60270l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26962id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            c3Var4.h();
                                            l60Var3.u();
                                            return;
                                    }
                                }
                            };
                            g6 g6Var3 = l3Var.I0;
                            Context context4 = context;
                            mx mxVar3 = new mx(context4, i12, 0, false, v10Var3, a20Var3, null, g6Var3, 8);
                            mxVar3.f37556f3.f35945r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232737);
                            s6.s(imageView3, l6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            zs zsVar3 = new zs(context4, l3Var.I0);
                            zsVar3.setTextSize(1, 16.0f);
                            zsVar3.setInputType(573441);
                            zsVar3.setRawInputType(573441);
                            s6.D(zsVar3, l6.A6, l3Var.I0);
                            s6.l(zsVar3, 30, l6.G6, l3Var.I0);
                            zsVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            zsVar3.setCursorWidth(1.5f);
                            zsVar3.setHint(id.M0(2131750009, null));
                            s6.U(zsVar3, l6.E8, l3Var.I0);
                            zsVar3.setBackground(null);
                            frameLayout3.addView(zsVar3, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            zsVar3.addTextChangedListener(new h7(strArr3, mxVar3, false, 17));
                            if (arrayList3.size() > 8) {
                                l60Var3.r(frameLayout3, ha.o(-1, 44));
                                l60Var3.k();
                            }
                            if (!c3Var3.f60270l.isEmpty()) {
                                l60Var3.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 2), false);
                            }
                            l60Var3.q(mxVar3);
                            l60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        u2 u2Var3 = new u2(context, this.I0, false);
        this.U1 = u2Var3;
        u2Var3.setValue(id.M0(2131750388, null));
        linearLayout.addView(u2Var3, ha.t(-2, -2, 16, 0, 0, 6, 0));
        u2Var3.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60402b;

            {
                this.f60402b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final k3 k3Var2 = k3Var;
                l3 l3Var = this.f60402b;
                switch (i7) {
                    case 0:
                        c3 c3Var = k3Var2.f60428c;
                        if (!c3Var.f60265f.isEmpty()) {
                            final l60 l60Var = new l60(l3Var.f28627c, l3Var.I0, l3Var.T1, false, true, false);
                            l60Var.f35618t = false;
                            l60Var.Y = true;
                            l60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            l60Var.R = true;
                            l60Var.f35612p = new li.h(l60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(c3Var.f60265f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                                            Integer num4 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                                            Integer num6 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
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
                            int i10 = l3Var.f28621a;
                            v10 v10Var = new v10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z9 = false;
                                    ArrayList arrayList22 = arrayList;
                                    k3 k3Var3 = k3Var2;
                                    String[] strArr22 = strArr;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            m41 m41Var = (m41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            c3 c3Var22 = k3Var3.f60428c;
                                            boolean isEmpty = c3Var22.f60268j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60268j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60271m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60593b;
                                                    y31 K = y31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40568l = lowerCase;
                                                    K.f40581z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                    }
                                                    K.L(z10);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(s2.i(id.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            m41 m41Var2 = (m41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            c3 c3Var32 = k3Var3.f60428c;
                                            boolean isEmpty2 = c3Var32.f60269k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60269k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60272n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60512b;
                                                    y31 K2 = y31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40568l = lowerCase2;
                                                    K2.f40581z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K2.L(z11);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(s2.i(id.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            m41 m41Var3 = (m41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            c3 c3Var4 = k3Var3.f60428c;
                                            boolean isEmpty3 = c3Var4.f60270l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60270l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60273o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60650b;
                                                    y31 K3 = y31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40568l = lowerCase3;
                                                    K3.f40581z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                    }
                                                    K3.L(z13);
                                                    arrayList5.add(K3);
                                                }
                                                z9 = z12;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(s2.i(id.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            a20 a20Var = new a20() {
                                @Override
                                public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    y31 y31Var = (y31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) y31Var.G).document.f26962id;
                                            c3 c3Var22 = k3Var2.f60428c;
                                            HashSet hashSet = c3Var22.f60268j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60265f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26962id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            c3Var22.h();
                                            l60Var.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) y31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60428c;
                                            HashSet hashSet2 = c3Var32.f60269k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60266g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            c3Var32.h();
                                            l60Var.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) y31Var.G).document.f26962id;
                                            c3 c3Var4 = k3Var2.f60428c;
                                            HashSet hashSet3 = c3Var4.f60270l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26962id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            c3Var4.h();
                                            l60Var.u();
                                            return;
                                    }
                                }
                            };
                            g6 g6Var = l3Var.I0;
                            Context context2 = context;
                            mx mxVar = new mx(context2, i10, 0, false, v10Var, a20Var, null, g6Var, 6);
                            mxVar.f37556f3.f35945r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232737);
                            s6.s(imageView, l6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            zs zsVar = new zs(context2, l3Var.I0);
                            zsVar.setTextSize(1, 16.0f);
                            zsVar.setInputType(573441);
                            zsVar.setRawInputType(573441);
                            s6.D(zsVar, l6.A6, l3Var.I0);
                            s6.l(zsVar, 30, l6.G6, l3Var.I0);
                            zsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            zsVar.setCursorWidth(1.5f);
                            zsVar.setHint(id.M0(2131750009, null));
                            s6.U(zsVar, l6.E8, l3Var.I0);
                            zsVar.setBackground(null);
                            frameLayout.addView(zsVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            zsVar.addTextChangedListener(new h7(strArr, mxVar, false, 15));
                            if (arrayList.size() > 8) {
                                l60Var.r(frameLayout, ha.o(-1, 44));
                                l60Var.k();
                            }
                            if (!c3Var.f60268j.isEmpty()) {
                                l60Var.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 0), false);
                            }
                            l60Var.q(mxVar);
                            l60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        c3 c3Var2 = k3Var2.f60428c;
                        if (!c3Var2.f60266g.isEmpty()) {
                            final l60 l60Var2 = new l60(l3Var.f28627c, l3Var.I0, l3Var.U1, false, true, false);
                            l60Var2.f35618t = false;
                            l60Var2.Y = true;
                            l60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            l60Var2.R = true;
                            l60Var2.f35612p = new li.h(l60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(c3Var2.f60266g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                                            Integer num4 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                                            Integer num6 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
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
                            int i11 = l3Var.f28621a;
                            v10 v10Var2 = new v10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z9 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    k3 k3Var3 = k3Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            m41 m41Var = (m41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            c3 c3Var22 = k3Var3.f60428c;
                                            boolean isEmpty = c3Var22.f60268j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60268j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60271m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60593b;
                                                    y31 K = y31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40568l = lowerCase;
                                                    K.f40581z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                    }
                                                    K.L(z10);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(s2.i(id.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            m41 m41Var2 = (m41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            c3 c3Var32 = k3Var3.f60428c;
                                            boolean isEmpty2 = c3Var32.f60269k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60269k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60272n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60512b;
                                                    y31 K2 = y31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40568l = lowerCase2;
                                                    K2.f40581z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K2.L(z11);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(s2.i(id.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            m41 m41Var3 = (m41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            c3 c3Var4 = k3Var3.f60428c;
                                            boolean isEmpty3 = c3Var4.f60270l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60270l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60273o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60650b;
                                                    y31 K3 = y31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40568l = lowerCase3;
                                                    K3.f40581z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                    }
                                                    K3.L(z13);
                                                    arrayList5.add(K3);
                                                }
                                                z9 = z12;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(s2.i(id.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            a20 a20Var2 = new a20() {
                                @Override
                                public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    y31 y31Var = (y31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) y31Var.G).document.f26962id;
                                            c3 c3Var22 = k3Var2.f60428c;
                                            HashSet hashSet = c3Var22.f60268j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60265f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26962id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            c3Var22.h();
                                            l60Var2.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) y31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60428c;
                                            HashSet hashSet2 = c3Var32.f60269k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60266g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            c3Var32.h();
                                            l60Var2.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) y31Var.G).document.f26962id;
                                            c3 c3Var4 = k3Var2.f60428c;
                                            HashSet hashSet3 = c3Var4.f60270l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26962id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            c3Var4.h();
                                            l60Var2.u();
                                            return;
                                    }
                                }
                            };
                            g6 g6Var2 = l3Var.I0;
                            Context context3 = context;
                            mx mxVar2 = new mx(context3, i11, 0, false, v10Var2, a20Var2, null, g6Var2, 7);
                            mxVar2.f37556f3.f35945r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232737);
                            s6.s(imageView2, l6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            zs zsVar2 = new zs(context3, l3Var.I0);
                            zsVar2.setTextSize(1, 16.0f);
                            zsVar2.setInputType(573441);
                            zsVar2.setRawInputType(573441);
                            s6.D(zsVar2, l6.A6, l3Var.I0);
                            s6.l(zsVar2, 30, l6.G6, l3Var.I0);
                            zsVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            zsVar2.setCursorWidth(1.5f);
                            zsVar2.setHint(id.M0(2131750009, null));
                            s6.U(zsVar2, l6.E8, l3Var.I0);
                            zsVar2.setBackground(null);
                            frameLayout2.addView(zsVar2, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            zsVar2.addTextChangedListener(new h7(strArr2, mxVar2, false, 16));
                            if (arrayList2.size() > 8) {
                                l60Var2.r(frameLayout2, ha.o(-1, 44));
                                l60Var2.k();
                            }
                            if (!c3Var2.f60269k.isEmpty()) {
                                l60Var2.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 1), false);
                            }
                            l60Var2.q(mxVar2);
                            l60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        c3 c3Var3 = k3Var2.f60428c;
                        if (!c3Var3.h.isEmpty()) {
                            final l60 l60Var3 = new l60(l3Var.f28627c, l3Var.I0, l3Var.V1, false, true, false);
                            l60Var3.f35618t = false;
                            l60Var3.Y = true;
                            l60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            l60Var3.R = true;
                            l60Var3.f35612p = new li.h(l60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(c3Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                                            Integer num4 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                                            Integer num6 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
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
                            int i12 = l3Var.f28621a;
                            v10 v10Var3 = new v10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z9 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    k3 k3Var3 = k3Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            m41 m41Var = (m41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            c3 c3Var22 = k3Var3.f60428c;
                                            boolean isEmpty = c3Var22.f60268j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60268j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60271m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60593b;
                                                    y31 K = y31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40568l = lowerCase;
                                                    K.f40581z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                    }
                                                    K.L(z10);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(s2.i(id.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            m41 m41Var2 = (m41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            c3 c3Var32 = k3Var3.f60428c;
                                            boolean isEmpty2 = c3Var32.f60269k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60269k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60272n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60512b;
                                                    y31 K2 = y31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40568l = lowerCase2;
                                                    K2.f40581z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K2.L(z11);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(s2.i(id.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            m41 m41Var3 = (m41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            c3 c3Var4 = k3Var3.f60428c;
                                            boolean isEmpty3 = c3Var4.f60270l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60270l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60273o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60650b;
                                                    y31 K3 = y31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40568l = lowerCase3;
                                                    K3.f40581z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                    }
                                                    K3.L(z13);
                                                    arrayList5.add(K3);
                                                }
                                                z9 = z12;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(s2.i(id.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            a20 a20Var3 = new a20() {
                                @Override
                                public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    y31 y31Var = (y31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) y31Var.G).document.f26962id;
                                            c3 c3Var22 = k3Var2.f60428c;
                                            HashSet hashSet = c3Var22.f60268j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60265f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26962id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            c3Var22.h();
                                            l60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) y31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60428c;
                                            HashSet hashSet2 = c3Var32.f60269k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60266g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            c3Var32.h();
                                            l60Var3.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) y31Var.G).document.f26962id;
                                            c3 c3Var4 = k3Var2.f60428c;
                                            HashSet hashSet3 = c3Var4.f60270l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26962id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            c3Var4.h();
                                            l60Var3.u();
                                            return;
                                    }
                                }
                            };
                            g6 g6Var3 = l3Var.I0;
                            Context context4 = context;
                            mx mxVar3 = new mx(context4, i12, 0, false, v10Var3, a20Var3, null, g6Var3, 8);
                            mxVar3.f37556f3.f35945r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232737);
                            s6.s(imageView3, l6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            zs zsVar3 = new zs(context4, l3Var.I0);
                            zsVar3.setTextSize(1, 16.0f);
                            zsVar3.setInputType(573441);
                            zsVar3.setRawInputType(573441);
                            s6.D(zsVar3, l6.A6, l3Var.I0);
                            s6.l(zsVar3, 30, l6.G6, l3Var.I0);
                            zsVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            zsVar3.setCursorWidth(1.5f);
                            zsVar3.setHint(id.M0(2131750009, null));
                            s6.U(zsVar3, l6.E8, l3Var.I0);
                            zsVar3.setBackground(null);
                            frameLayout3.addView(zsVar3, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            zsVar3.addTextChangedListener(new h7(strArr3, mxVar3, false, 17));
                            if (arrayList3.size() > 8) {
                                l60Var3.r(frameLayout3, ha.o(-1, 44));
                                l60Var3.k();
                            }
                            if (!c3Var3.f60270l.isEmpty()) {
                                l60Var3.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 2), false);
                            }
                            l60Var3.q(mxVar3);
                            l60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        u2 u2Var4 = new u2(context, this.I0, false);
        this.V1 = u2Var4;
        u2Var4.setValue(id.M0(2131750380, null));
        linearLayout.addView(u2Var4, ha.t(-2, -2, 16, 0, 0, 0, 0));
        u2Var4.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60402b;

            {
                this.f60402b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final k3 k3Var2 = k3Var;
                l3 l3Var = this.f60402b;
                switch (i7) {
                    case 0:
                        c3 c3Var = k3Var2.f60428c;
                        if (!c3Var.f60265f.isEmpty()) {
                            final l60 l60Var = new l60(l3Var.f28627c, l3Var.I0, l3Var.T1, false, true, false);
                            l60Var.f35618t = false;
                            l60Var.Y = true;
                            l60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            l60Var.R = true;
                            l60Var.f35612p = new li.h(l60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(c3Var.f60265f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                                            Integer num4 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                                            Integer num6 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
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
                            int i10 = l3Var.f28621a;
                            v10 v10Var = new v10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z9 = false;
                                    ArrayList arrayList22 = arrayList;
                                    k3 k3Var3 = k3Var2;
                                    String[] strArr22 = strArr;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            m41 m41Var = (m41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            c3 c3Var22 = k3Var3.f60428c;
                                            boolean isEmpty = c3Var22.f60268j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60268j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60271m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60593b;
                                                    y31 K = y31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40568l = lowerCase;
                                                    K.f40581z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                    }
                                                    K.L(z10);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(s2.i(id.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            m41 m41Var2 = (m41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            c3 c3Var32 = k3Var3.f60428c;
                                            boolean isEmpty2 = c3Var32.f60269k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60269k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60272n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60512b;
                                                    y31 K2 = y31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40568l = lowerCase2;
                                                    K2.f40581z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K2.L(z11);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(s2.i(id.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            m41 m41Var3 = (m41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            c3 c3Var4 = k3Var3.f60428c;
                                            boolean isEmpty3 = c3Var4.f60270l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60270l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60273o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60650b;
                                                    y31 K3 = y31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40568l = lowerCase3;
                                                    K3.f40581z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                    }
                                                    K3.L(z13);
                                                    arrayList5.add(K3);
                                                }
                                                z9 = z12;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(s2.i(id.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            a20 a20Var = new a20() {
                                @Override
                                public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    y31 y31Var = (y31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) y31Var.G).document.f26962id;
                                            c3 c3Var22 = k3Var2.f60428c;
                                            HashSet hashSet = c3Var22.f60268j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60265f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26962id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            c3Var22.h();
                                            l60Var.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) y31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60428c;
                                            HashSet hashSet2 = c3Var32.f60269k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60266g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            c3Var32.h();
                                            l60Var.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) y31Var.G).document.f26962id;
                                            c3 c3Var4 = k3Var2.f60428c;
                                            HashSet hashSet3 = c3Var4.f60270l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26962id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            c3Var4.h();
                                            l60Var.u();
                                            return;
                                    }
                                }
                            };
                            g6 g6Var = l3Var.I0;
                            Context context2 = context;
                            mx mxVar = new mx(context2, i10, 0, false, v10Var, a20Var, null, g6Var, 6);
                            mxVar.f37556f3.f35945r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232737);
                            s6.s(imageView, l6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            zs zsVar = new zs(context2, l3Var.I0);
                            zsVar.setTextSize(1, 16.0f);
                            zsVar.setInputType(573441);
                            zsVar.setRawInputType(573441);
                            s6.D(zsVar, l6.A6, l3Var.I0);
                            s6.l(zsVar, 30, l6.G6, l3Var.I0);
                            zsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            zsVar.setCursorWidth(1.5f);
                            zsVar.setHint(id.M0(2131750009, null));
                            s6.U(zsVar, l6.E8, l3Var.I0);
                            zsVar.setBackground(null);
                            frameLayout.addView(zsVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            zsVar.addTextChangedListener(new h7(strArr, mxVar, false, 15));
                            if (arrayList.size() > 8) {
                                l60Var.r(frameLayout, ha.o(-1, 44));
                                l60Var.k();
                            }
                            if (!c3Var.f60268j.isEmpty()) {
                                l60Var.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 0), false);
                            }
                            l60Var.q(mxVar);
                            l60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        c3 c3Var2 = k3Var2.f60428c;
                        if (!c3Var2.f60266g.isEmpty()) {
                            final l60 l60Var2 = new l60(l3Var.f28627c, l3Var.I0, l3Var.U1, false, true, false);
                            l60Var2.f35618t = false;
                            l60Var2.Y = true;
                            l60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            l60Var2.R = true;
                            l60Var2.f35612p = new li.h(l60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(c3Var2.f60266g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                                            Integer num4 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                                            Integer num6 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
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
                            int i11 = l3Var.f28621a;
                            v10 v10Var2 = new v10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z9 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    k3 k3Var3 = k3Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            m41 m41Var = (m41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            c3 c3Var22 = k3Var3.f60428c;
                                            boolean isEmpty = c3Var22.f60268j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60268j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60271m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60593b;
                                                    y31 K = y31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40568l = lowerCase;
                                                    K.f40581z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                    }
                                                    K.L(z10);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(s2.i(id.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            m41 m41Var2 = (m41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            c3 c3Var32 = k3Var3.f60428c;
                                            boolean isEmpty2 = c3Var32.f60269k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60269k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60272n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60512b;
                                                    y31 K2 = y31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40568l = lowerCase2;
                                                    K2.f40581z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K2.L(z11);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(s2.i(id.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            m41 m41Var3 = (m41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            c3 c3Var4 = k3Var3.f60428c;
                                            boolean isEmpty3 = c3Var4.f60270l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60270l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60273o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60650b;
                                                    y31 K3 = y31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40568l = lowerCase3;
                                                    K3.f40581z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                    }
                                                    K3.L(z13);
                                                    arrayList5.add(K3);
                                                }
                                                z9 = z12;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(s2.i(id.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            a20 a20Var2 = new a20() {
                                @Override
                                public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    y31 y31Var = (y31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) y31Var.G).document.f26962id;
                                            c3 c3Var22 = k3Var2.f60428c;
                                            HashSet hashSet = c3Var22.f60268j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60265f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26962id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            c3Var22.h();
                                            l60Var2.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) y31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60428c;
                                            HashSet hashSet2 = c3Var32.f60269k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60266g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            c3Var32.h();
                                            l60Var2.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) y31Var.G).document.f26962id;
                                            c3 c3Var4 = k3Var2.f60428c;
                                            HashSet hashSet3 = c3Var4.f60270l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26962id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            c3Var4.h();
                                            l60Var2.u();
                                            return;
                                    }
                                }
                            };
                            g6 g6Var2 = l3Var.I0;
                            Context context3 = context;
                            mx mxVar2 = new mx(context3, i11, 0, false, v10Var2, a20Var2, null, g6Var2, 7);
                            mxVar2.f37556f3.f35945r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232737);
                            s6.s(imageView2, l6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            zs zsVar2 = new zs(context3, l3Var.I0);
                            zsVar2.setTextSize(1, 16.0f);
                            zsVar2.setInputType(573441);
                            zsVar2.setRawInputType(573441);
                            s6.D(zsVar2, l6.A6, l3Var.I0);
                            s6.l(zsVar2, 30, l6.G6, l3Var.I0);
                            zsVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            zsVar2.setCursorWidth(1.5f);
                            zsVar2.setHint(id.M0(2131750009, null));
                            s6.U(zsVar2, l6.E8, l3Var.I0);
                            zsVar2.setBackground(null);
                            frameLayout2.addView(zsVar2, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            zsVar2.addTextChangedListener(new h7(strArr2, mxVar2, false, 16));
                            if (arrayList2.size() > 8) {
                                l60Var2.r(frameLayout2, ha.o(-1, 44));
                                l60Var2.k();
                            }
                            if (!c3Var2.f60269k.isEmpty()) {
                                l60Var2.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 1), false);
                            }
                            l60Var2.q(mxVar2);
                            l60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        c3 c3Var3 = k3Var2.f60428c;
                        if (!c3Var3.h.isEmpty()) {
                            final l60 l60Var3 = new l60(l3Var.f28627c, l3Var.I0, l3Var.V1, false, true, false);
                            l60Var3.f35618t = false;
                            l60Var3.Y = true;
                            l60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            l60Var3.R = true;
                            l60Var3.f35612p = new li.h(l60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(c3Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60428c.f60272n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                                            Integer num4 = (Integer) k3Var4.f60428c.f60273o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                                            Integer num6 = (Integer) k3Var5.f60428c.f60271m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
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
                            int i12 = l3Var.f28621a;
                            v10 v10Var3 = new v10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z9 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    k3 k3Var3 = k3Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            m41 m41Var = (m41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            c3 c3Var22 = k3Var3.f60428c;
                                            boolean isEmpty = c3Var22.f60268j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60268j.contains(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60271m.get(Long.valueOf(stargiftattributemodel.document.f26962id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60593b;
                                                    y31 K = y31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40568l = lowerCase;
                                                    K.f40581z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                    }
                                                    K.L(z10);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(s2.i(id.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            m41 m41Var2 = (m41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            c3 c3Var32 = k3Var3.f60428c;
                                            boolean isEmpty2 = c3Var32.f60269k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60269k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60272n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60512b;
                                                    y31 K2 = y31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40568l = lowerCase2;
                                                    K2.f40581z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K2.L(z11);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(s2.i(id.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            m41 m41Var3 = (m41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            c3 c3Var4 = k3Var3.f60428c;
                                            boolean isEmpty3 = c3Var4.f60270l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60270l.contains(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60273o.get(Long.valueOf(stargiftattributepattern.document.f26962id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60650b;
                                                    y31 K3 = y31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40568l = lowerCase3;
                                                    K3.f40581z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                    }
                                                    K3.L(z13);
                                                    arrayList5.add(K3);
                                                }
                                                z9 = z12;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(s2.i(id.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            a20 a20Var3 = new a20() {
                                @Override
                                public final void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    y31 y31Var = (y31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) y31Var.G).document.f26962id;
                                            c3 c3Var22 = k3Var2.f60428c;
                                            HashSet hashSet = c3Var22.f60268j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60265f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26962id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            c3Var22.h();
                                            l60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) y31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60428c;
                                            HashSet hashSet2 = c3Var32.f60269k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60266g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            c3Var32.h();
                                            l60Var3.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) y31Var.G).document.f26962id;
                                            c3 c3Var4 = k3Var2.f60428c;
                                            HashSet hashSet3 = c3Var4.f60270l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26962id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            c3Var4.h();
                                            l60Var3.u();
                                            return;
                                    }
                                }
                            };
                            g6 g6Var3 = l3Var.I0;
                            Context context4 = context;
                            mx mxVar3 = new mx(context4, i12, 0, false, v10Var3, a20Var3, null, g6Var3, 8);
                            mxVar3.f37556f3.f35945r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232737);
                            s6.s(imageView3, l6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            zs zsVar3 = new zs(context4, l3Var.I0);
                            zsVar3.setTextSize(1, 16.0f);
                            zsVar3.setInputType(573441);
                            zsVar3.setRawInputType(573441);
                            s6.D(zsVar3, l6.A6, l3Var.I0);
                            s6.l(zsVar3, 30, l6.G6, l3Var.I0);
                            zsVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            zsVar3.setCursorWidth(1.5f);
                            zsVar3.setHint(id.M0(2131750009, null));
                            s6.U(zsVar3, l6.E8, l3Var.I0);
                            zsVar3.setBackground(null);
                            frameLayout3.addView(zsVar3, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            zsVar3.addTextChangedListener(new h7(strArr3, mxVar3, false, 17));
                            if (arrayList3.size() > 8) {
                                l60Var3.r(frameLayout3, ha.o(-1, 44));
                                l60Var3.k();
                            }
                            if (!c3Var3.f60270l.isEmpty()) {
                                l60Var3.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 2), false);
                            }
                            l60Var3.q(mxVar3);
                            l60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        getContext();
        v4.s sVar = new v4.s(3);
        sVar.O = new ai.l(this, 17);
        this.f36303k1.setLayoutManager(sVar);
        this.f36303k1.setOnItemClickListener(new j3(this, k3Var));
        this.f36303k1.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f28654t0, 0, org.telegram.messenger.g0.L(8.0f) + this.f28654t0, 0);
        this.f36303k1.setOnScrollListener(new yh.f(this, 2));
        v4.k kVar = new v4.k();
        kVar.f57083m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36303k1.setItemAnimator(kVar);
        this.f36303k1.setItemSelectorColorProvider(new z3.j(4));
        j5 j5Var = new j5(context);
        this.W1 = j5Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        j5Var.h = L;
        j5Var.f4089n = L2;
        j5Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        j5Var.setFullRect(true);
        org.telegram.messenger.g0.m2(new ai.i(j5Var, 6), 12.0f, 12, new ArrayList());
        j5Var.setPivotY(0.0f);
        this.f28627c.addView(j5Var, ha.e(-1, -2, 55));
        this.f60457a2.O(false);
        k3Var.d = new g3(this, 1);
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        hc hcVar = new hc(this, qj0Var, getContext(), this.f28621a, new p0(this, 3), this.I0, 5);
        this.f60457a2 = hcVar;
        return hcVar;
    }

    @Override
    public final CharSequence O0() {
        String str = this.P1;
        if (str != null) {
            return str;
        }
        return id.M0(2131749771, null);
    }

    @Override
    public final void T0(float f10) {
        float y10 = this.f28624b.getY() + f10;
        j5 j5Var = this.W1;
        float measuredHeight = y10 - j5Var.getMeasuredHeight();
        float l10 = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + org.telegram.messenger.g0.L(8.0f)) / j5Var.getMeasuredHeight());
        float height = this.f28627c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l10 = Math.min(l10, Utilities.l(1.0f - ((measuredHeight - height) / org.telegram.messenger.g0.N(128.0f))));
        }
        j5Var.setScaleX(l10);
        j5Var.setScaleY(l10);
        j5Var.setAlpha(org.telegram.messenger.g0.z1(l10, 0.5f, 1.0f));
        j5Var.setTranslationY(measuredHeight);
    }

    public final void d1() {
        int R;
        y31 G;
        int i7 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (true) {
            qj0 qj0Var = this.f36303k1;
            if (i7 >= qj0Var.getChildCount()) {
                break;
            }
            View childAt = qj0Var.getChildAt(i7);
            if ((childAt instanceof mz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f60457a2.G(R)) != null) {
                if (G.d < 10) {
                    z9 = true;
                } else {
                    z10 = true;
                }
            }
            i7++;
        }
        k3 k3Var = this.Q1;
        if (z9) {
            k3Var.f60427b.a();
        }
        if (z10) {
            k3Var.f60428c.g(false);
        }
    }
}
