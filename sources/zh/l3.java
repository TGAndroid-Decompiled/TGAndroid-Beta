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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.ys;
import org.telegram.ui.nx;
public final class l3 extends ma {
    public static final int f60461f2 = 0;
    public final String S1;
    public final k3 T1;
    public final HorizontalScrollView U1;
    public final u2 V1;
    public final u2 W1;
    public final u2 X1;
    public final u2 Y1;
    public final j5 Z1;
    public bi.n2 f60462a2;
    public final HashSet f60463b2;
    public boolean f60464c2;
    public hc d2;
    public boolean f60465e2;

    public l3(final Context context, String str, final k3 k3Var) {
        super(2, context, (h6) null, false);
        this.f60463b2 = new HashSet();
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        N();
        this.S1 = str;
        this.T1 = k3Var;
        this.f35902o1.setTitle(O0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.U1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        u2 u2Var = new u2(context, this.I0, false);
        this.V1 = u2Var;
        u2Var.setSorting(k3Var.f60430c.f60276p);
        linearLayout.addView(u2Var, ha.t(-2, -2, 16, 0, 0, 6, 0));
        u2Var.setOnClickListener(new wg.a1(7, this, k3Var));
        u2 u2Var2 = new u2(context, this.I0, false);
        this.W1 = u2Var2;
        u2Var2.setValue(id.M0(2131750387, null));
        linearLayout.addView(u2Var2, ha.t(-2, -2, 16, 0, 0, 6, 0));
        u2Var2.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60404b;

            {
                this.f60404b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final k3 k3Var2 = k3Var;
                l3 l3Var = this.f60404b;
                switch (i7) {
                    case 0:
                        c3 c3Var = k3Var2.f60430c;
                        if (!c3Var.f60267f.isEmpty()) {
                            final k60 k60Var = new k60(l3Var.f28675c, l3Var.I0, l3Var.W1, false, true, false);
                            k60Var.f35220t = false;
                            k60Var.Y = true;
                            k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k60Var.R = true;
                            k60Var.f35214p = new li.h(k60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(c3Var.f60267f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26966id));
                                            Integer num4 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26966id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26966id));
                                            Integer num6 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26966id));
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
                            int i10 = l3Var.f28669a;
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
                                            c3 c3Var2 = k3Var3.f60430c;
                                            boolean isEmpty = c3Var2.f60270j.isEmpty();
                                            int size = arrayList2.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList2.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var2.f60270j.contains(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var2.f60273m.get(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60605b;
                                                    x31 K = x31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40156l = lowerCase;
                                                    K.f40169z = intValue;
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
                                            c3 c3Var3 = k3Var3.f60430c;
                                            boolean isEmpty2 = c3Var3.f60271k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList2.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var3.f60271k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var3.f60274n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60521b;
                                                    x31 K2 = x31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40156l = lowerCase2;
                                                    K2.f40169z = intValue2;
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
                                            c3 c3Var4 = k3Var3.f60430c;
                                            boolean isEmpty3 = c3Var4.f60272l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList2.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60272l.contains(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60275o.get(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                    if (num3 == null) {
                                                        i11 = z12;
                                                    } else {
                                                        i11 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60662b;
                                                    x31 K3 = x31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40156l = lowerCase3;
                                                    K3.f40169z = i11;
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
                                    x31 x31Var = (x31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.f26966id;
                                            c3 c3Var2 = k3Var2.f60430c;
                                            HashSet hashSet = c3Var2.f60270j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = c3Var2.f60267f;
                                                    int size = arrayList2.size();
                                                    int i11 = 0;
                                                    while (i11 < size) {
                                                        Object obj3 = arrayList2.get(i11);
                                                        i11++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26966id;
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
                                            k60Var.u();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                                            c3 c3Var3 = k3Var2.f60430c;
                                            HashSet hashSet2 = c3Var3.f60271k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = c3Var3.f60268g;
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
                                            k60Var.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.f26966id;
                                            c3 c3Var4 = k3Var2.f60430c;
                                            HashSet hashSet3 = c3Var4.f60272l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26966id;
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
                                            k60Var.u();
                                            return;
                                    }
                                }
                            };
                            h6 h6Var = l3Var.I0;
                            Context context2 = context;
                            nx nxVar = new nx(context2, i10, 0, false, v10Var, a20Var, null, h6Var, 6);
                            nxVar.f37496f3.f35845r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232737);
                            t6.s(imageView, m6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ys ysVar = new ys(context2, l3Var.I0);
                            ysVar.setTextSize(1, 16.0f);
                            ysVar.setInputType(573441);
                            ysVar.setRawInputType(573441);
                            t6.D(ysVar, m6.A6, l3Var.I0);
                            t6.l(ysVar, 30, m6.G6, l3Var.I0);
                            ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ysVar.setCursorWidth(1.5f);
                            ysVar.setHint(id.M0(2131750009, null));
                            t6.U(ysVar, m6.E8, l3Var.I0);
                            ysVar.setBackground(null);
                            frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ysVar.addTextChangedListener(new h7(strArr, nxVar, false, 15));
                            if (arrayList.size() > 8) {
                                k60Var.r(frameLayout, ha.o(-1, 44));
                                k60Var.k();
                            }
                            if (!c3Var.f60270j.isEmpty()) {
                                k60Var.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 0), false);
                            }
                            k60Var.q(nxVar);
                            k60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        c3 c3Var2 = k3Var2.f60430c;
                        if (!c3Var2.f60268g.isEmpty()) {
                            final k60 k60Var2 = new k60(l3Var.f28675c, l3Var.I0, l3Var.X1, false, true, false);
                            k60Var2.f35220t = false;
                            k60Var2.Y = true;
                            k60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k60Var2.R = true;
                            k60Var2.f35214p = new li.h(k60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(c3Var2.f60268g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26966id));
                                            Integer num4 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26966id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26966id));
                                            Integer num6 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26966id));
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
                            int i11 = l3Var.f28669a;
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
                                            c3 c3Var22 = k3Var3.f60430c;
                                            boolean isEmpty = c3Var22.f60270j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60270j.contains(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60273m.get(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60605b;
                                                    x31 K = x31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40156l = lowerCase;
                                                    K.f40169z = intValue;
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
                                            c3 c3Var3 = k3Var3.f60430c;
                                            boolean isEmpty2 = c3Var3.f60271k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var3.f60271k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var3.f60274n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60521b;
                                                    x31 K2 = x31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40156l = lowerCase2;
                                                    K2.f40169z = intValue2;
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
                                            c3 c3Var4 = k3Var3.f60430c;
                                            boolean isEmpty3 = c3Var4.f60272l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60272l.contains(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60275o.get(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60662b;
                                                    x31 K3 = x31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40156l = lowerCase3;
                                                    K3.f40169z = i112;
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
                                    x31 x31Var = (x31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.f26966id;
                                            c3 c3Var22 = k3Var2.f60430c;
                                            HashSet hashSet = c3Var22.f60270j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60267f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26966id;
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
                                            k60Var2.u();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                                            c3 c3Var3 = k3Var2.f60430c;
                                            HashSet hashSet2 = c3Var3.f60271k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = c3Var3.f60268g;
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
                                            k60Var2.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.f26966id;
                                            c3 c3Var4 = k3Var2.f60430c;
                                            HashSet hashSet3 = c3Var4.f60272l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26966id;
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
                                            k60Var2.u();
                                            return;
                                    }
                                }
                            };
                            h6 h6Var2 = l3Var.I0;
                            Context context3 = context;
                            nx nxVar2 = new nx(context3, i11, 0, false, v10Var2, a20Var2, null, h6Var2, 7);
                            nxVar2.f37496f3.f35845r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232737);
                            t6.s(imageView2, m6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ys ysVar2 = new ys(context3, l3Var.I0);
                            ysVar2.setTextSize(1, 16.0f);
                            ysVar2.setInputType(573441);
                            ysVar2.setRawInputType(573441);
                            t6.D(ysVar2, m6.A6, l3Var.I0);
                            t6.l(ysVar2, 30, m6.G6, l3Var.I0);
                            ysVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ysVar2.setCursorWidth(1.5f);
                            ysVar2.setHint(id.M0(2131750009, null));
                            t6.U(ysVar2, m6.E8, l3Var.I0);
                            ysVar2.setBackground(null);
                            frameLayout2.addView(ysVar2, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ysVar2.addTextChangedListener(new h7(strArr2, nxVar2, false, 16));
                            if (arrayList2.size() > 8) {
                                k60Var2.r(frameLayout2, ha.o(-1, 44));
                                k60Var2.k();
                            }
                            if (!c3Var2.f60271k.isEmpty()) {
                                k60Var2.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 1), false);
                            }
                            k60Var2.q(nxVar2);
                            k60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        c3 c3Var3 = k3Var2.f60430c;
                        if (!c3Var3.h.isEmpty()) {
                            final k60 k60Var3 = new k60(l3Var.f28675c, l3Var.I0, l3Var.Y1, false, true, false);
                            k60Var3.f35220t = false;
                            k60Var3.Y = true;
                            k60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k60Var3.R = true;
                            k60Var3.f35214p = new li.h(k60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(c3Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26966id));
                                            Integer num4 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26966id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26966id));
                                            Integer num6 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26966id));
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
                            int i12 = l3Var.f28669a;
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
                                            c3 c3Var22 = k3Var3.f60430c;
                                            boolean isEmpty = c3Var22.f60270j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60270j.contains(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60273m.get(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60605b;
                                                    x31 K = x31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40156l = lowerCase;
                                                    K.f40169z = intValue;
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
                                            c3 c3Var32 = k3Var3.f60430c;
                                            boolean isEmpty2 = c3Var32.f60271k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60271k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60274n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60521b;
                                                    x31 K2 = x31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40156l = lowerCase2;
                                                    K2.f40169z = intValue2;
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
                                            c3 c3Var4 = k3Var3.f60430c;
                                            boolean isEmpty3 = c3Var4.f60272l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60272l.contains(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60275o.get(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60662b;
                                                    x31 K3 = x31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40156l = lowerCase3;
                                                    K3.f40169z = i112;
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
                                    x31 x31Var = (x31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.f26966id;
                                            c3 c3Var22 = k3Var2.f60430c;
                                            HashSet hashSet = c3Var22.f60270j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60267f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26966id;
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
                                            k60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60430c;
                                            HashSet hashSet2 = c3Var32.f60271k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60268g;
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
                                            k60Var3.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.f26966id;
                                            c3 c3Var4 = k3Var2.f60430c;
                                            HashSet hashSet3 = c3Var4.f60272l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26966id;
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
                                            k60Var3.u();
                                            return;
                                    }
                                }
                            };
                            h6 h6Var3 = l3Var.I0;
                            Context context4 = context;
                            nx nxVar3 = new nx(context4, i12, 0, false, v10Var3, a20Var3, null, h6Var3, 8);
                            nxVar3.f37496f3.f35845r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232737);
                            t6.s(imageView3, m6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ys ysVar3 = new ys(context4, l3Var.I0);
                            ysVar3.setTextSize(1, 16.0f);
                            ysVar3.setInputType(573441);
                            ysVar3.setRawInputType(573441);
                            t6.D(ysVar3, m6.A6, l3Var.I0);
                            t6.l(ysVar3, 30, m6.G6, l3Var.I0);
                            ysVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ysVar3.setCursorWidth(1.5f);
                            ysVar3.setHint(id.M0(2131750009, null));
                            t6.U(ysVar3, m6.E8, l3Var.I0);
                            ysVar3.setBackground(null);
                            frameLayout3.addView(ysVar3, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ysVar3.addTextChangedListener(new h7(strArr3, nxVar3, false, 17));
                            if (arrayList3.size() > 8) {
                                k60Var3.r(frameLayout3, ha.o(-1, 44));
                                k60Var3.k();
                            }
                            if (!c3Var3.f60272l.isEmpty()) {
                                k60Var3.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 2), false);
                            }
                            k60Var3.q(nxVar3);
                            k60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        u2 u2Var3 = new u2(context, this.I0, false);
        this.X1 = u2Var3;
        u2Var3.setValue(id.M0(2131750388, null));
        linearLayout.addView(u2Var3, ha.t(-2, -2, 16, 0, 0, 6, 0));
        u2Var3.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60404b;

            {
                this.f60404b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final k3 k3Var2 = k3Var;
                l3 l3Var = this.f60404b;
                switch (i7) {
                    case 0:
                        c3 c3Var = k3Var2.f60430c;
                        if (!c3Var.f60267f.isEmpty()) {
                            final k60 k60Var = new k60(l3Var.f28675c, l3Var.I0, l3Var.W1, false, true, false);
                            k60Var.f35220t = false;
                            k60Var.Y = true;
                            k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k60Var.R = true;
                            k60Var.f35214p = new li.h(k60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(c3Var.f60267f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26966id));
                                            Integer num4 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26966id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26966id));
                                            Integer num6 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26966id));
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
                            int i10 = l3Var.f28669a;
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
                                            c3 c3Var22 = k3Var3.f60430c;
                                            boolean isEmpty = c3Var22.f60270j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60270j.contains(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60273m.get(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60605b;
                                                    x31 K = x31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40156l = lowerCase;
                                                    K.f40169z = intValue;
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
                                            c3 c3Var32 = k3Var3.f60430c;
                                            boolean isEmpty2 = c3Var32.f60271k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60271k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60274n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60521b;
                                                    x31 K2 = x31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40156l = lowerCase2;
                                                    K2.f40169z = intValue2;
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
                                            c3 c3Var4 = k3Var3.f60430c;
                                            boolean isEmpty3 = c3Var4.f60272l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60272l.contains(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60275o.get(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60662b;
                                                    x31 K3 = x31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40156l = lowerCase3;
                                                    K3.f40169z = i112;
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
                                    x31 x31Var = (x31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.f26966id;
                                            c3 c3Var22 = k3Var2.f60430c;
                                            HashSet hashSet = c3Var22.f60270j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60267f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26966id;
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
                                            k60Var.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60430c;
                                            HashSet hashSet2 = c3Var32.f60271k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60268g;
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
                                            k60Var.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.f26966id;
                                            c3 c3Var4 = k3Var2.f60430c;
                                            HashSet hashSet3 = c3Var4.f60272l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26966id;
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
                                            k60Var.u();
                                            return;
                                    }
                                }
                            };
                            h6 h6Var = l3Var.I0;
                            Context context2 = context;
                            nx nxVar = new nx(context2, i10, 0, false, v10Var, a20Var, null, h6Var, 6);
                            nxVar.f37496f3.f35845r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232737);
                            t6.s(imageView, m6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ys ysVar = new ys(context2, l3Var.I0);
                            ysVar.setTextSize(1, 16.0f);
                            ysVar.setInputType(573441);
                            ysVar.setRawInputType(573441);
                            t6.D(ysVar, m6.A6, l3Var.I0);
                            t6.l(ysVar, 30, m6.G6, l3Var.I0);
                            ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ysVar.setCursorWidth(1.5f);
                            ysVar.setHint(id.M0(2131750009, null));
                            t6.U(ysVar, m6.E8, l3Var.I0);
                            ysVar.setBackground(null);
                            frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ysVar.addTextChangedListener(new h7(strArr, nxVar, false, 15));
                            if (arrayList.size() > 8) {
                                k60Var.r(frameLayout, ha.o(-1, 44));
                                k60Var.k();
                            }
                            if (!c3Var.f60270j.isEmpty()) {
                                k60Var.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 0), false);
                            }
                            k60Var.q(nxVar);
                            k60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        c3 c3Var2 = k3Var2.f60430c;
                        if (!c3Var2.f60268g.isEmpty()) {
                            final k60 k60Var2 = new k60(l3Var.f28675c, l3Var.I0, l3Var.X1, false, true, false);
                            k60Var2.f35220t = false;
                            k60Var2.Y = true;
                            k60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k60Var2.R = true;
                            k60Var2.f35214p = new li.h(k60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(c3Var2.f60268g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26966id));
                                            Integer num4 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26966id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26966id));
                                            Integer num6 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26966id));
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
                            int i11 = l3Var.f28669a;
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
                                            c3 c3Var22 = k3Var3.f60430c;
                                            boolean isEmpty = c3Var22.f60270j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60270j.contains(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60273m.get(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60605b;
                                                    x31 K = x31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40156l = lowerCase;
                                                    K.f40169z = intValue;
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
                                            c3 c3Var32 = k3Var3.f60430c;
                                            boolean isEmpty2 = c3Var32.f60271k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60271k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60274n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60521b;
                                                    x31 K2 = x31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40156l = lowerCase2;
                                                    K2.f40169z = intValue2;
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
                                            c3 c3Var4 = k3Var3.f60430c;
                                            boolean isEmpty3 = c3Var4.f60272l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60272l.contains(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60275o.get(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60662b;
                                                    x31 K3 = x31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40156l = lowerCase3;
                                                    K3.f40169z = i112;
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
                                    x31 x31Var = (x31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.f26966id;
                                            c3 c3Var22 = k3Var2.f60430c;
                                            HashSet hashSet = c3Var22.f60270j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60267f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26966id;
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
                                            k60Var2.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60430c;
                                            HashSet hashSet2 = c3Var32.f60271k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60268g;
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
                                            k60Var2.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.f26966id;
                                            c3 c3Var4 = k3Var2.f60430c;
                                            HashSet hashSet3 = c3Var4.f60272l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26966id;
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
                                            k60Var2.u();
                                            return;
                                    }
                                }
                            };
                            h6 h6Var2 = l3Var.I0;
                            Context context3 = context;
                            nx nxVar2 = new nx(context3, i11, 0, false, v10Var2, a20Var2, null, h6Var2, 7);
                            nxVar2.f37496f3.f35845r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232737);
                            t6.s(imageView2, m6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ys ysVar2 = new ys(context3, l3Var.I0);
                            ysVar2.setTextSize(1, 16.0f);
                            ysVar2.setInputType(573441);
                            ysVar2.setRawInputType(573441);
                            t6.D(ysVar2, m6.A6, l3Var.I0);
                            t6.l(ysVar2, 30, m6.G6, l3Var.I0);
                            ysVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ysVar2.setCursorWidth(1.5f);
                            ysVar2.setHint(id.M0(2131750009, null));
                            t6.U(ysVar2, m6.E8, l3Var.I0);
                            ysVar2.setBackground(null);
                            frameLayout2.addView(ysVar2, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ysVar2.addTextChangedListener(new h7(strArr2, nxVar2, false, 16));
                            if (arrayList2.size() > 8) {
                                k60Var2.r(frameLayout2, ha.o(-1, 44));
                                k60Var2.k();
                            }
                            if (!c3Var2.f60271k.isEmpty()) {
                                k60Var2.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 1), false);
                            }
                            k60Var2.q(nxVar2);
                            k60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        c3 c3Var3 = k3Var2.f60430c;
                        if (!c3Var3.h.isEmpty()) {
                            final k60 k60Var3 = new k60(l3Var.f28675c, l3Var.I0, l3Var.Y1, false, true, false);
                            k60Var3.f35220t = false;
                            k60Var3.Y = true;
                            k60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k60Var3.R = true;
                            k60Var3.f35214p = new li.h(k60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(c3Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26966id));
                                            Integer num4 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26966id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26966id));
                                            Integer num6 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26966id));
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
                            int i12 = l3Var.f28669a;
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
                                            c3 c3Var22 = k3Var3.f60430c;
                                            boolean isEmpty = c3Var22.f60270j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60270j.contains(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60273m.get(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60605b;
                                                    x31 K = x31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40156l = lowerCase;
                                                    K.f40169z = intValue;
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
                                            c3 c3Var32 = k3Var3.f60430c;
                                            boolean isEmpty2 = c3Var32.f60271k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60271k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60274n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60521b;
                                                    x31 K2 = x31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40156l = lowerCase2;
                                                    K2.f40169z = intValue2;
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
                                            c3 c3Var4 = k3Var3.f60430c;
                                            boolean isEmpty3 = c3Var4.f60272l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60272l.contains(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60275o.get(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60662b;
                                                    x31 K3 = x31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40156l = lowerCase3;
                                                    K3.f40169z = i112;
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
                                    x31 x31Var = (x31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.f26966id;
                                            c3 c3Var22 = k3Var2.f60430c;
                                            HashSet hashSet = c3Var22.f60270j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60267f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26966id;
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
                                            k60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60430c;
                                            HashSet hashSet2 = c3Var32.f60271k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60268g;
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
                                            k60Var3.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.f26966id;
                                            c3 c3Var4 = k3Var2.f60430c;
                                            HashSet hashSet3 = c3Var4.f60272l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26966id;
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
                                            k60Var3.u();
                                            return;
                                    }
                                }
                            };
                            h6 h6Var3 = l3Var.I0;
                            Context context4 = context;
                            nx nxVar3 = new nx(context4, i12, 0, false, v10Var3, a20Var3, null, h6Var3, 8);
                            nxVar3.f37496f3.f35845r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232737);
                            t6.s(imageView3, m6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ys ysVar3 = new ys(context4, l3Var.I0);
                            ysVar3.setTextSize(1, 16.0f);
                            ysVar3.setInputType(573441);
                            ysVar3.setRawInputType(573441);
                            t6.D(ysVar3, m6.A6, l3Var.I0);
                            t6.l(ysVar3, 30, m6.G6, l3Var.I0);
                            ysVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ysVar3.setCursorWidth(1.5f);
                            ysVar3.setHint(id.M0(2131750009, null));
                            t6.U(ysVar3, m6.E8, l3Var.I0);
                            ysVar3.setBackground(null);
                            frameLayout3.addView(ysVar3, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ysVar3.addTextChangedListener(new h7(strArr3, nxVar3, false, 17));
                            if (arrayList3.size() > 8) {
                                k60Var3.r(frameLayout3, ha.o(-1, 44));
                                k60Var3.k();
                            }
                            if (!c3Var3.f60272l.isEmpty()) {
                                k60Var3.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 2), false);
                            }
                            k60Var3.q(nxVar3);
                            k60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        u2 u2Var4 = new u2(context, this.I0, false);
        this.Y1 = u2Var4;
        u2Var4.setValue(id.M0(2131750380, null));
        linearLayout.addView(u2Var4, ha.t(-2, -2, 16, 0, 0, 0, 0));
        u2Var4.setOnClickListener(new View.OnClickListener(this) {
            public final l3 f60404b;

            {
                this.f60404b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final k3 k3Var2 = k3Var;
                l3 l3Var = this.f60404b;
                switch (i7) {
                    case 0:
                        c3 c3Var = k3Var2.f60430c;
                        if (!c3Var.f60267f.isEmpty()) {
                            final k60 k60Var = new k60(l3Var.f28675c, l3Var.I0, l3Var.W1, false, true, false);
                            k60Var.f35220t = false;
                            k60Var.Y = true;
                            k60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k60Var.R = true;
                            k60Var.f35214p = new li.h(k60Var, 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(c3Var.f60267f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26966id));
                                            Integer num4 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26966id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26966id));
                                            Integer num6 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26966id));
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
                            int i10 = l3Var.f28669a;
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
                                            c3 c3Var22 = k3Var3.f60430c;
                                            boolean isEmpty = c3Var22.f60270j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60270j.contains(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60273m.get(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60605b;
                                                    x31 K = x31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40156l = lowerCase;
                                                    K.f40169z = intValue;
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
                                            c3 c3Var32 = k3Var3.f60430c;
                                            boolean isEmpty2 = c3Var32.f60271k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60271k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60274n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60521b;
                                                    x31 K2 = x31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40156l = lowerCase2;
                                                    K2.f40169z = intValue2;
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
                                            c3 c3Var4 = k3Var3.f60430c;
                                            boolean isEmpty3 = c3Var4.f60272l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60272l.contains(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60275o.get(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60662b;
                                                    x31 K3 = x31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40156l = lowerCase3;
                                                    K3.f40169z = i112;
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
                                    x31 x31Var = (x31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.f26966id;
                                            c3 c3Var22 = k3Var2.f60430c;
                                            HashSet hashSet = c3Var22.f60270j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60267f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26966id;
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
                                            k60Var.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60430c;
                                            HashSet hashSet2 = c3Var32.f60271k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60268g;
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
                                            k60Var.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.f26966id;
                                            c3 c3Var4 = k3Var2.f60430c;
                                            HashSet hashSet3 = c3Var4.f60272l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26966id;
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
                                            k60Var.u();
                                            return;
                                    }
                                }
                            };
                            h6 h6Var = l3Var.I0;
                            Context context2 = context;
                            nx nxVar = new nx(context2, i10, 0, false, v10Var, a20Var, null, h6Var, 6);
                            nxVar.f37496f3.f35845r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232737);
                            t6.s(imageView, m6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ys ysVar = new ys(context2, l3Var.I0);
                            ysVar.setTextSize(1, 16.0f);
                            ysVar.setInputType(573441);
                            ysVar.setRawInputType(573441);
                            t6.D(ysVar, m6.A6, l3Var.I0);
                            t6.l(ysVar, 30, m6.G6, l3Var.I0);
                            ysVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ysVar.setCursorWidth(1.5f);
                            ysVar.setHint(id.M0(2131750009, null));
                            t6.U(ysVar, m6.E8, l3Var.I0);
                            ysVar.setBackground(null);
                            frameLayout.addView(ysVar, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ysVar.addTextChangedListener(new h7(strArr, nxVar, false, 15));
                            if (arrayList.size() > 8) {
                                k60Var.r(frameLayout, ha.o(-1, 44));
                                k60Var.k();
                            }
                            if (!c3Var.f60270j.isEmpty()) {
                                k60Var.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 0), false);
                            }
                            k60Var.q(nxVar);
                            k60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        c3 c3Var2 = k3Var2.f60430c;
                        if (!c3Var2.f60268g.isEmpty()) {
                            final k60 k60Var2 = new k60(l3Var.f28675c, l3Var.I0, l3Var.X1, false, true, false);
                            k60Var2.f35220t = false;
                            k60Var2.Y = true;
                            k60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k60Var2.R = true;
                            k60Var2.f35214p = new li.h(k60Var2, 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(c3Var2.f60268g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26966id));
                                            Integer num4 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26966id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26966id));
                                            Integer num6 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26966id));
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
                            int i11 = l3Var.f28669a;
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
                                            c3 c3Var22 = k3Var3.f60430c;
                                            boolean isEmpty = c3Var22.f60270j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60270j.contains(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60273m.get(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60605b;
                                                    x31 K = x31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40156l = lowerCase;
                                                    K.f40169z = intValue;
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
                                            c3 c3Var32 = k3Var3.f60430c;
                                            boolean isEmpty2 = c3Var32.f60271k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60271k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60274n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60521b;
                                                    x31 K2 = x31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40156l = lowerCase2;
                                                    K2.f40169z = intValue2;
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
                                            c3 c3Var4 = k3Var3.f60430c;
                                            boolean isEmpty3 = c3Var4.f60272l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60272l.contains(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60275o.get(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60662b;
                                                    x31 K3 = x31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40156l = lowerCase3;
                                                    K3.f40169z = i112;
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
                                    x31 x31Var = (x31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.f26966id;
                                            c3 c3Var22 = k3Var2.f60430c;
                                            HashSet hashSet = c3Var22.f60270j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60267f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26966id;
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
                                            k60Var2.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60430c;
                                            HashSet hashSet2 = c3Var32.f60271k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60268g;
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
                                            k60Var2.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.f26966id;
                                            c3 c3Var4 = k3Var2.f60430c;
                                            HashSet hashSet3 = c3Var4.f60272l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26966id;
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
                                            k60Var2.u();
                                            return;
                                    }
                                }
                            };
                            h6 h6Var2 = l3Var.I0;
                            Context context3 = context;
                            nx nxVar2 = new nx(context3, i11, 0, false, v10Var2, a20Var2, null, h6Var2, 7);
                            nxVar2.f37496f3.f35845r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232737);
                            t6.s(imageView2, m6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ys ysVar2 = new ys(context3, l3Var.I0);
                            ysVar2.setTextSize(1, 16.0f);
                            ysVar2.setInputType(573441);
                            ysVar2.setRawInputType(573441);
                            t6.D(ysVar2, m6.A6, l3Var.I0);
                            t6.l(ysVar2, 30, m6.G6, l3Var.I0);
                            ysVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ysVar2.setCursorWidth(1.5f);
                            ysVar2.setHint(id.M0(2131750009, null));
                            t6.U(ysVar2, m6.E8, l3Var.I0);
                            ysVar2.setBackground(null);
                            frameLayout2.addView(ysVar2, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ysVar2.addTextChangedListener(new h7(strArr2, nxVar2, false, 16));
                            if (arrayList2.size() > 8) {
                                k60Var2.r(frameLayout2, ha.o(-1, 44));
                                k60Var2.k();
                            }
                            if (!c3Var2.f60271k.isEmpty()) {
                                k60Var2.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 1), false);
                            }
                            k60Var2.q(nxVar2);
                            k60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        c3 c3Var3 = k3Var2.f60430c;
                        if (!c3Var3.h.isEmpty()) {
                            final k60 k60Var3 = new k60(l3Var.f28675c, l3Var.I0, l3Var.Y1, false, true, false);
                            k60Var3.f35220t = false;
                            k60Var3.Y = true;
                            k60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k60Var3.R = true;
                            k60Var3.f35214p = new li.h(k60Var3, 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(c3Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            k3 k3Var3 = k3Var2;
                                            Integer num = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) k3Var3.f60430c.f60274n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            k3 k3Var4 = k3Var2;
                                            Integer num3 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26966id));
                                            Integer num4 = (Integer) k3Var4.f60430c.f60275o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26966id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            k3 k3Var5 = k3Var2;
                                            Integer num5 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26966id));
                                            Integer num6 = (Integer) k3Var5.f60430c.f60273m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26966id));
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
                            int i12 = l3Var.f28669a;
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
                                            c3 c3Var22 = k3Var3.f60430c;
                                            boolean isEmpty = c3Var22.f60270j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = c3Var22.f60270j.contains(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                boolean z10 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || jg.g.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) c3Var22.f60273m.get(Long.valueOf(stargiftattributemodel.document.f26966id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = w2.f60605b;
                                                    x31 K = x31.K(w2.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f40156l = lowerCase;
                                                    K.f40169z = intValue;
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
                                            c3 c3Var32 = k3Var3.f60430c;
                                            boolean isEmpty2 = c3Var32.f60271k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = c3Var32.f60271k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z11 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || jg.g.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) c3Var32.f60274n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = p2.f60521b;
                                                    x31 K2 = x31.K(p2.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f40156l = lowerCase2;
                                                    K2.f40169z = intValue2;
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
                                            c3 c3Var4 = k3Var3.f60430c;
                                            boolean isEmpty3 = c3Var4.f60272l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z12 = z9;
                                                boolean contains3 = c3Var4.f60272l.contains(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                boolean z13 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || jg.g.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) c3Var4.f60275o.get(Long.valueOf(stargiftattributepattern.document.f26966id));
                                                    if (num3 == null) {
                                                        i112 = z12;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = z2.f60662b;
                                                    x31 K3 = x31.K(z2.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f40156l = lowerCase3;
                                                    K3.f40169z = i112;
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
                                    x31 x31Var = (x31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) x31Var.G).document.f26966id;
                                            c3 c3Var22 = k3Var2.f60430c;
                                            HashSet hashSet = c3Var22.f60270j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = c3Var22.f60267f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f26966id;
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
                                            k60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) x31Var.G).backdrop_id;
                                            c3 c3Var32 = k3Var2.f60430c;
                                            HashSet hashSet2 = c3Var32.f60271k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = c3Var32.f60268g;
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
                                            k60Var3.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) x31Var.G).document.f26966id;
                                            c3 c3Var4 = k3Var2.f60430c;
                                            HashSet hashSet3 = c3Var4.f60272l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = c3Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f26966id;
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
                                            k60Var3.u();
                                            return;
                                    }
                                }
                            };
                            h6 h6Var3 = l3Var.I0;
                            Context context4 = context;
                            nx nxVar3 = new nx(context4, i12, 0, false, v10Var3, a20Var3, null, h6Var3, 8);
                            nxVar3.f37496f3.f35845r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232737);
                            t6.s(imageView3, m6.F8, l3Var.I0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ha.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ys ysVar3 = new ys(context4, l3Var.I0);
                            ysVar3.setTextSize(1, 16.0f);
                            ysVar3.setInputType(573441);
                            ysVar3.setRawInputType(573441);
                            t6.D(ysVar3, m6.A6, l3Var.I0);
                            t6.l(ysVar3, 30, m6.G6, l3Var.I0);
                            ysVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ysVar3.setCursorWidth(1.5f);
                            ysVar3.setHint(id.M0(2131750009, null));
                            t6.U(ysVar3, m6.E8, l3Var.I0);
                            ysVar3.setBackground(null);
                            frameLayout3.addView(ysVar3, ha.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ysVar3.addTextChangedListener(new h7(strArr3, nxVar3, false, 17));
                            if (arrayList3.size() > 8) {
                                k60Var3.r(frameLayout3, ha.o(-1, 44));
                                k60Var3.k();
                            }
                            if (!c3Var3.f60272l.isEmpty()) {
                                k60Var3.c(2131232357, id.M0(2131745670, null), new f3(k3Var2, 2), false);
                            }
                            k60Var3.q(nxVar3);
                            k60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        getContext();
        v4.s sVar = new v4.s(3);
        sVar.O = new ai.l(this, 17);
        this.n1.setLayoutManager(sVar);
        this.n1.setOnItemClickListener(new j3(this, k3Var));
        this.n1.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f28705t0, 0, org.telegram.messenger.g0.L(8.0f) + this.f28705t0, 0);
        this.n1.setOnScrollListener(new yh.f(this, 2));
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        this.n1.setItemSelectorColorProvider(new z3.j(4));
        j5 j5Var = new j5(context);
        this.Z1 = j5Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        j5Var.h = L;
        j5Var.f4086n = L2;
        j5Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        j5Var.setFullRect(true);
        org.telegram.messenger.g0.m2(new ai.i(j5Var, 6), 12.0f, 12, new ArrayList());
        j5Var.setPivotY(0.0f);
        this.f28675c.addView(j5Var, ha.e(-1, -2, 55));
        this.d2.O(false);
        k3Var.d = new g3(this, 1);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        hc hcVar = new hc(this, pj0Var, getContext(), this.f28669a, new p0(this, 3), this.I0, 5);
        this.d2 = hcVar;
        return hcVar;
    }

    @Override
    public final CharSequence O0() {
        String str = this.S1;
        if (str != null) {
            return str;
        }
        return id.M0(2131749771, null);
    }

    @Override
    public final void T0(float f10) {
        float y10 = this.f28672b.getY() + f10;
        j5 j5Var = this.Z1;
        float measuredHeight = y10 - j5Var.getMeasuredHeight();
        float l10 = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + org.telegram.messenger.g0.L(8.0f)) / j5Var.getMeasuredHeight());
        float height = this.f28675c.getHeight() / 2.0f;
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
        x31 G;
        int i7 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (true) {
            pj0 pj0Var = this.n1;
            if (i7 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i7);
            if ((childAt instanceof lz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.d2.G(R)) != null) {
                if (G.d < 10) {
                    z9 = true;
                } else {
                    z10 = true;
                }
            }
            i7++;
        }
        k3 k3Var = this.T1;
        if (z9) {
            k3Var.f60429b.a();
        }
        if (z10) {
            k3Var.f60430c.g(false);
        }
    }
}
