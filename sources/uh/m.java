package uh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import mg.s;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.kj;
import org.telegram.messenger.uz;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.w71;
import org.telegram.ui.wy0;
import qh.e0;
import rh.d0;
import sg.y;
import th.d5;
import th.e5;
import th.q4;
import vh.n5;
import w7.b6;
public abstract class m extends FrameLayout implements k6, vs {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public int D;
    public final k2 f50273a;
    public final int f50274b;
    public final p6 f50275c;
    public final long d;
    public final q4 e;
    public final ArrayList f50276f;
    public final ArrayList h;
    public final wy0 f50277n;
    public final w71 f50278r;
    public Boolean f50279s;
    public int f50280w;
    public float f50281x;
    public ValueAnimator f50282y;

    public m(Context context, k2 k2Var, long j10) {
        super(context);
        this.f50276f = new ArrayList();
        this.h = new ArrayList();
        this.f50279s = null;
        this.f50280w = i0.f16172q.y;
        this.D = Utilities.j(uz.f18557u1, 6, 2);
        this.f50273a = k2Var;
        int currentAccount = k2Var.getCurrentAccount();
        this.f50274b = currentAccount;
        p6 resourceProvider = k2Var.getResourceProvider();
        this.f50275c = resourceProvider;
        this.d = j10;
        setBackgroundColor(t6.w(t6.w0(t6.f20930d6, resourceProvider), t6.r1(0.04f, t6.w0(t6.G6, resourceProvider))));
        if (F == null) {
            F = new LongSparseArray();
        }
        long j11 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) F.get(j11);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = F;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        q4 q4Var = (q4) longSparseArray.get(j10);
        if (q4Var == null) {
            q4 q4Var2 = new q4(currentAccount, j10, "", null);
            longSparseArray.put(j10, q4Var2);
            q4Var = q4Var2;
        }
        this.e = q4Var;
        vq0 vq0Var = (vq0) this;
        wy0 wy0Var = new wy0(vq0Var, context);
        this.f50277n = wy0Var;
        wy0Var.setAllowDisallowInterceptTouch(true);
        wy0Var.setAdapter(new s(vq0Var, context, 10));
        addView(wy0Var, b6.e(-1, -1, 119));
        w71 n10 = wy0Var.n(9, true);
        this.f50278r = n10;
        n10.f32159r = 12;
        n10.setPreTabClick(new d0(vq0Var, 21));
        addView(n10, b6.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        k2 k2Var = this.f50273a;
        if (k2Var != null && k2Var.getParentActivity() != null) {
            bi biVar = new bi(k2Var.getParentActivity(), this.f50273a, false, false, false, this.f50275c);
            biVar.x1(1, false);
            biVar.N2 = true;
            biVar.M2 = false;
            biVar.f24759d3.setText(dd.L0(2131752121, null));
            biVar.a2.g0();
            biVar.T3 = new q5.d((FrameLayout) this, (Object) biVar, (Serializable) str, 8);
            biVar.d1();
            biVar.show();
        }
    }

    public final void b(String str) {
        q4 q4Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50276f;
            if (i10 < arrayList.size()) {
                q4Var = (q4) arrayList.get(i10);
                if (q4Var != null && TextUtils.equals(q4Var.E, str)) {
                    break;
                }
                i10++;
            } else {
                q4Var = null;
                break;
            }
        }
        if (q4Var != null) {
            ArrayList arrayList2 = q4Var.f49650i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f50274b;
            deletepreviewmedia.bot = wp.r1(i11).n1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_stories.StoryItem storyItem = ((kj) arrayList2.get(i12)).f16694l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(wp.W4(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f50278r.d(-1, 0);
    }

    public abstract boolean c(kj kjVar);

    public final boolean d() {
        q4 q4Var;
        View currentView = this.f50277n.getCurrentView();
        if ((currentView instanceof i) && (q4Var = ((i) currentView).f50259a) != null) {
            ArrayList arrayList = q4Var.f49650i;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!c((kj) arrayList.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.f14819x5;
        wy0 wy0Var = this.f50277n;
        int i13 = 0;
        if (i10 == i12) {
            Object obj = objArr[0];
            q4 q4Var = this.e;
            if (obj == q4Var) {
                i(true);
                View[] viewPages = wy0Var.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof i) {
                        i iVar = (i) view;
                        if (iVar.f50259a == q4Var) {
                            iVar.f50266w.f();
                        }
                    }
                    i13++;
                }
            } else if (this.f50276f.indexOf(obj) >= 0) {
                View[] viewPages2 = wy0Var.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof i) {
                        i iVar2 = (i) view2;
                        if (iVar2.f50259a == objArr[0]) {
                            iVar2.f50266w.f();
                        }
                    }
                }
            }
        } else if (i10 == at.f14805v5) {
            i(true);
            View[] viewPages3 = wy0Var.getViewPages();
            int length2 = viewPages3.length;
            while (i13 < length2) {
                View view3 = viewPages3[i13];
                if (view3 instanceof i) {
                    ((i) view3).f50266w.f();
                }
                i13++;
            }
        }
    }

    public abstract boolean e(kj kjVar);

    public final void f() {
        q4 q4Var;
        View currentView = this.f50277n.getCurrentView();
        if ((currentView instanceof i) && (q4Var = ((i) currentView).f50259a) != null) {
            ArrayList arrayList = q4Var.f49650i;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!c((kj) arrayList.get(i10))) {
                    e((kj) arrayList.get(i10));
                }
            }
        }
    }

    public abstract boolean g(kj kjVar);

    public String getBotPreviewsSubtitle() {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.f50277n.getCurrentView();
        if (currentView instanceof i) {
            q4 q4Var = ((i) currentView).f50259a;
            if (q4Var != null) {
                ArrayList arrayList = q4Var.f49650i;
                i10 = 0;
                i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    kj kjVar = (kj) arrayList.get(i12);
                    TL_stories.StoryItem storyItem = kjVar.f16694l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (kj.K4(messageMedia.document)) {
                            i11++;
                        } else if (kjVar.f16694l.media.photo != null) {
                            i10++;
                        }
                    }
                }
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return dd.L0(2131753014, null);
            }
            if (i10 > 0) {
                sb2.append(dd.G(i10, "Images", new Object[0]));
            }
            if (i11 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(dd.G(i11, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        q4 q4Var;
        wy0 wy0Var = this.f50277n;
        View[] viewPages = wy0Var.getViewPages();
        if (Math.abs(wy0Var.getCurrentPosition() - wy0Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof i) && (q4Var = ((i) view).f50259a) != null) {
            return q4Var.E;
        }
        return null;
    }

    public q4 getCurrentList() {
        q4 q4Var;
        View currentView = this.f50277n.getCurrentView();
        if ((currentView instanceof i) && (q4Var = ((i) currentView).f50259a) != null) {
            return q4Var;
        }
        return null;
    }

    public uk0 getCurrentListView() {
        View currentView = this.f50277n.getCurrentView();
        if (currentView instanceof i) {
            return ((i) currentView).f50262f;
        }
        return null;
    }

    public int getItemsCount() {
        q4 q4Var;
        View currentView = this.f50277n.getCurrentView();
        if ((currentView instanceof i) && (q4Var = ((i) currentView).f50259a) != null) {
            return q4Var.f49650i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        q4 q4Var;
        View currentView = this.f50277n.getCurrentView();
        if ((currentView instanceof i) && (q4Var = ((i) currentView).f50259a) != null) {
            ArrayList arrayList = q4Var.f49650i;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (c((kj) arrayList.get(i10))) {
                    g((kj) arrayList.get(i10));
                }
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        float f7;
        q4 q4Var;
        n5 n5Var;
        ArrayList arrayList = new ArrayList(this.e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        e5 O1 = wp.r1(this.f50274b).O1();
        long j10 = this.d;
        ArrayList F2 = O1.F(j10);
        if (F2 != null) {
            int size2 = F2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = F2.get(i11);
                i11++;
                d5 d5Var = (d5) obj2;
                if (d5Var != null && (n5Var = d5Var.f48892c) != null && n5Var.J0 == j10 && !TextUtils.isEmpty(n5Var.K0) && !arrayList.contains(n5Var.K0)) {
                    arrayList.add(n5Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f50276f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            String str2 = (String) obj3;
            int i13 = 0;
            while (true) {
                if (i13 < arrayList4.size()) {
                    if (TextUtils.equals(((q4) arrayList4.get(i13)).E, str2)) {
                        q4Var = (q4) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    q4Var = null;
                    break;
                }
            }
            if (q4Var == null) {
                q4 q4Var2 = new q4(this.f50274b, this.d, str2, null);
                q4Var2.H(null);
                q4Var = q4Var2;
            }
            arrayList3.add(q4Var);
        }
        wy0 wy0Var = this.f50277n;
        wy0Var.o(true);
        SpannableString spannableString = new SpannableString(a1.g.m(null, 2131746726, new StringBuilder("+ ")));
        dq dqVar = new dq(2131232149, 0);
        dqVar.H = 0.9f;
        dqVar.I = 0.9f;
        dqVar.G = 0.85f;
        spannableString.setSpan(dqVar, 0, 1, 33);
        w71 w71Var = this.f50278r;
        w71Var.a(-1, spannableString);
        w71Var.f32164y.f();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f50279s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f50282y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f50279s = Boolean.valueOf(z11);
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z11) {
                f10 = 0.0f;
            }
            this.f50281x = f10;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = -42.0f;
            }
            w71Var.setTranslationY(i0.L(f7));
            if (z11) {
                f11 = 42.0f;
            }
            wy0Var.setTranslationY(i0.L(f11));
            return;
        }
        float f12 = this.f50281x;
        if (!z11) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.f50282y = ofFloat;
        ofFloat.addUpdateListener(new e0(this, 23));
        this.f50282y.addListener(new y(5, this, z11));
        this.f50282y.setDuration(320L);
        this.f50282y.setInterpolator(gr.h);
        this.f50282y.start();
    }

    public final void j() {
        View currentView = this.f50277n.getCurrentView();
        if (currentView instanceof i) {
            i iVar = (i) currentView;
            c cVar = iVar.f50262f;
            for (int i10 = 0; i10 < cVar.getChildCount(); i10++) {
                View childAt = cVar.getChildAt(i10);
                if (childAt instanceof s7) {
                    s7 s7Var = (s7) childAt;
                    s7Var.i(iVar.W.c(s7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i10 = this.f50274b;
        long j10 = i10;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j10);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = E;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j10, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        at.f(i10).c(this, at.f14819x5);
        at.f(i10).c(this, at.f14805v5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i10 = this.f50274b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        at.f(i10).n(this, at.f14819x5);
        at.f(i10).n(this, at.f14805v5);
    }

    public void setVisibleHeight(int i10) {
        this.f50280w = i10;
        View[] viewPages = this.f50277n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof i) {
                    ((i) view).setVisibleHeight(i10);
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        p6 p6Var = this.f50275c;
        try {
            setBackgroundColor(t6.w(t6.w0(t6.f20930d6, p6Var), t6.r1(0.04f, t6.w0(t6.G6, p6Var))));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
