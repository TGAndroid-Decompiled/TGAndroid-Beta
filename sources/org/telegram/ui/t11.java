package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public abstract class t11 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.c6 {
    public static String[] f50015b2;
    public final ArrayList A0;
    public String A1;
    public final ArrayList B0;
    public ArrayList B1;
    public boolean C0;
    public ArrayList C1;
    public int D;
    public final ArrayList D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ValueAnimator F1;
    public y01 G;
    public final ArrayList G0;
    public boolean G1;
    public r11 H;
    public final ArrayList H0;
    public boolean H1;
    public boolean I;
    public final ArrayList I0;
    public ValueAnimator I1;
    public HashSet J;
    public ArrayList J0;
    public xz0 J1;
    public final HashSet K;
    public final ArrayList K0;
    public di.a6 K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public boolean M1;
    public Drawable N;
    public final boolean N0;
    public View N1;
    public d11 O;
    public boolean O0;
    public int O1;
    public boolean P;
    public Integer P0;
    public int P1;
    public boolean Q;
    public boolean Q0;
    public long Q1;
    public boolean R;
    public List R0;
    public bi.ud R1;
    public final ArrayList S;
    public d11 S0;
    public final xz0 S1;
    public boolean T;
    public boolean T0;
    public final xz0 T1;
    public u01 U;
    public float U0;
    public Runnable U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.h5 W0;
    public ValueAnimator W1;
    public j01 X0;
    public final h2.f X1;
    public final Integer Y0;
    public final Paint Y1;
    public final org.telegram.ui.ActionBar.h6 Z0;
    public Integer Z1;
    public int f50017a;
    public final o01 f50018a0;
    public float f50019a1;
    public int f50020b;
    public final fi.p5 f50021b0;
    public float f50022b1;
    public int f50023c;
    public final org.telegram.ui.Components.av[] f50024c0;
    public final org.telegram.ui.ActionBar.f2 f50025c1;
    public int d;
    public org.telegram.ui.Components.av f50026d0;
    public final int f50027d1;
    public int f50028e;
    public final m01 f50029e0;
    public final s01 f50030e1;
    public int f50031f;
    public final l01 f50032f0;
    public int f50033f1;
    public final vq0 f50034g0;
    public boolean f50035g1;
    public int h;
    public final r01 f50036h0;
    public boolean f50037h1;
    public final h01 f50038i0;
    public ValueAnimator f50039i1;
    public final FrameLayout f50040j0;
    public Drawable f50041j1;
    public final bi.x5 f50042k0;
    public PorterDuffColorFilter f50043k1;
    public final org.telegram.ui.Components.k9 f50044l0;
    public final boolean l1;
    public final View m0;
    public float f50045m1;
    public int f50046n;
    public final org.telegram.ui.Components.sm f50047n0;
    public int n1;
    public final View f50048o0;
    public org.telegram.ui.Components.f5 f50049o1;
    public final t01 f50050p0;
    public Rect f50051p1;
    public final e11 f50052q0;
    public View f50053q1;
    public int f50054r;
    public final i01 f50055r0;
    public float f50056r1;
    public int f50057s;
    public final org.telegram.ui.Components.ri0 f50058s0;
    public d11 f50059s1;
    public final View f50060t0;
    public Rect f50061t1;
    public int f50062u0;
    public final OvershootInterpolator f50063u1;
    public final ArrayList f50064v0;
    public ValueAnimator f50065v1;
    public int f50066w;
    public final SparseIntArray f50067w0;
    public boolean f50068w1;
    public int f50069x;
    public final SparseIntArray f50070x0;
    public boolean f50071x1;
    public int f50072y;
    public final SparseIntArray f50073y0;
    public boolean f50074y1;
    public final SparseIntArray f50075z0;
    public boolean f50076z1;
    public static final List f50014a2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f50016c2 = new boolean[4];
    public static final HashMap d2 = new HashMap();

    public t11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this(f2Var, context, z9, num, i7, true, h6Var, 16);
    }

    public static void D(int i7, org.telegram.ui.Components.k9 k9Var) {
        List list;
        org.telegram.messenger.hc b10;
        String str;
        if (k9Var != null) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(i7).f25844s0[1]);
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                list = f50014a2;
                if (i10 >= size) {
                    break;
                }
                if ((arrayList.get(i10) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i10)).documents != null) {
                    ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i10)).documents);
                    Collections.shuffle(arrayList2);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList2.size()) {
                            break;
                        }
                        TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i11);
                        if (document2 != null && list.contains(org.telegram.messenger.ij.V(document2, null, null))) {
                            int i12 = round - 1;
                            if (round <= 0) {
                                round = i12;
                                document = document2;
                                break;
                            }
                            round = i12;
                            document = document2;
                        }
                        i11++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                }
                i10++;
            }
            if (document == null || round > 0) {
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.ui.b0(i7).s0(5));
                Collections.shuffle(arrayList3);
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    if (arrayList3.get(i13) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).documents != null) {
                        ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).documents);
                        Collections.shuffle(arrayList4);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList4.size()) {
                                break;
                            }
                            TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i14);
                            if (document3 != null && list.contains(org.telegram.messenger.ij.V(document3, null, null))) {
                                int i15 = round - 1;
                                if (round <= 0) {
                                    round = i15;
                                    document = document3;
                                    break;
                                }
                                round = i15;
                                document = document3;
                            }
                            i14++;
                        }
                    }
                    if (document != null && round <= 0) {
                        break;
                    }
                }
            }
            if (document != null) {
                org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f28055m6, 0.2f, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.hc.b(document);
                    if (d != null) {
                        d.f25386e = 512;
                        d.f25387f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && org.telegram.messenger.ij.K2(document, false)) {
                        d.f25386e = 512;
                        d.f25387f = 512;
                    }
                    b10 = org.telegram.messenger.hc.b(document);
                    str = "36_36";
                }
                k9Var.setLayerNum(7);
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                k9Var.m(b10, str, org.telegram.messenger.hc.c(w10, document), "36_36", d, document);
            }
        }
    }

    public static void a(t11 t11Var, int i7, int i10) {
        int i11;
        org.telegram.ui.Components.ri0 ri0Var = t11Var.f50058s0;
        i01 i01Var = t11Var.f50055r0;
        View m10 = i01Var.m(i7);
        int L0 = i01Var.L0();
        if ((m10 == null && Math.abs(i7 - L0) > 72.0f) || !org.telegram.messenger.iz.c()) {
            if (i01Var.L0() < i7) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            ri0Var.f37666b = i11;
            ri0Var.d(i7, i10, false, false);
            return;
        }
        fi.j1 j1Var = new fi.j1(4, t11Var.f50036h0.getContext(), t11Var);
        j1Var.f57221a = i7;
        j1Var.f20116p = i10;
        i01Var.w0(j1Var);
    }

    public static boolean c(t11 t11Var) {
        if (!t11Var.T) {
            ValueAnimator valueAnimator = t11Var.V1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i7 = 13;
        int i10 = this.W;
        if (i10 != 5 && i10 != 7) {
            if (i10 == 6) {
                return org.telegram.ui.Components.h5.f();
            }
            if (i10 != 3 && i10 != 4) {
                i7 = 2;
                if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                    return 3;
                }
            }
        }
        return i7;
    }

    public Drawable getPremiumStar() {
        if (this.f50041j1 == null) {
            int i7 = this.W;
            if (i7 != 5 && i7 != 9 && i7 != 10 && i7 != 7) {
                this.f50041j1 = jg.g.h(org.telegram.messenger.t0.f25570b, 2131232362);
            } else {
                this.f50041j1 = jg.g.h(org.telegram.messenger.t0.f25570b, 2131232133);
            }
            this.f50041j1.setColorFilter(this.f50043k1);
        }
        return this.f50041j1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
            if (document == null || hashSet.contains(Long.valueOf(document.f26966id))) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        long j3;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String c10 = org.telegram.messenger.i6.c(str);
        int i7 = 0;
        while (true) {
            if (i7 < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i7).documents.isEmpty() && TextUtils.equals(org.telegram.messenger.i6.c(tL_messages_stickerSet.packs.get(i7).emoticon), c10)) {
                    j3 = tL_messages_stickerSet.packs.get(i7).documents.get(0).longValue();
                    break;
                }
                i7++;
            } else {
                j3 = 0;
                break;
            }
        }
        if (j3 == 0) {
            return null;
        }
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            if (document.f26966id == j3) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.h5 h5Var) {
        org.telegram.ui.Components.h5 h5Var2;
        if (this.I && (h5Var2 = this.W0) != h5Var) {
            if (h5Var2 != null) {
                h5Var2.n(this);
            }
            this.W0 = h5Var;
            if (h5Var != null) {
                h5Var.setColorFilter(this.f50043k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i7) {
        boolean[] zArr = f50016c2;
        if (!zArr[i7]) {
            org.telegram.messenger.ui.b0(i7);
            zArr[i7] = true;
            org.telegram.messenger.ui.b0(i7).B(5);
            org.telegram.messenger.ui.b0(i7).L(0, true);
            org.telegram.messenger.ui.b0(i7).A();
            org.telegram.messenger.ui.b0(i7).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            org.telegram.messenger.ui.b0(i7).P();
            org.telegram.messenger.ui.b0(i7).v();
            org.telegram.ui.Components.zu0.E3.c(i7, 1, new di.f(i7, 1));
        }
    }

    public final void A(Long l10) {
        this.K.remove(l10);
        r01 r01Var = this.f50036h0;
        if (r01Var != null) {
            int i7 = 0;
            boolean z9 = false;
            for (int i10 = 0; i10 < r01Var.getChildCount(); i10++) {
                if (r01Var.getChildAt(i10) instanceof d11) {
                    d11 d11Var = (d11) r01Var.getChildAt(i10);
                    org.telegram.ui.Components.q5 q5Var = d11Var.f44874e;
                    if (q5Var != null && q5Var.getDocumentId() == l10.longValue()) {
                        d11Var.f();
                    } else {
                        TLRPC.Document document = d11Var.d;
                        if (document != null && document.f26966id == l10.longValue()) {
                            d11Var.f();
                        }
                    }
                    z9 = true;
                }
            }
            r01Var.invalidate();
            if (!z9) {
                while (true) {
                    ArrayList arrayList = this.f50064v0;
                    if (i7 < arrayList.size()) {
                        long longValue = ((Long) arrayList.get(i7)).longValue();
                        if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                            break;
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
                t01 t01Var = this.f50050p0;
                if (t01Var != null) {
                    t01Var.g(i7);
                }
            }
        }
    }

    public final void B(boolean r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t11.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        l01 l01Var = this.f50032f0;
        if (l01Var == null) {
            return;
        }
        if (this.f50076z1) {
            l01Var.clearAnimation();
            l01Var.setVisibility(0);
            l01Var.animate().translationY(0.0f).start();
            return;
        }
        r01 r01Var = this.f50036h0;
        if (r01Var.getChildCount() > 0) {
            View childAt = r01Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f50017a && "searchbox".equals(childAt.getTag())) {
                l01Var.setVisibility(0);
                l01Var.setTranslationY(childAt.getY());
                return;
            }
            l01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
            return;
        }
        l01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
    }

    public final void E(float f10) {
        int i7;
        int i10 = -1;
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.wq.f40047g.getInterpolation(c8.j9.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i7 = -1;
            } else {
                i7 = 1;
            }
            view.setScaleY(interpolation * i7);
        }
        org.telegram.ui.Components.sm smVar = this.f50047n0;
        if (smVar != null) {
            float a10 = c8.j9.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            smVar.setAlpha(a10);
            smVar.setScaleX(a10);
            if (!n()) {
                i10 = 1;
            }
            smVar.setScaleY(a10 * i10);
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a11 = c8.j9.a(f12 / 700.0f, 0.0f, 1.0f);
        float a12 = c8.j9.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = c8.j9.a(f12 / 750.0f, 0.0f, 1.0f);
        float a14 = c8.j9.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        float interpolation2 = wqVar.getInterpolation(a11);
        float interpolation3 = wqVar.getInterpolation(a12);
        this.f50021b0.setAlpha(a14);
        this.f50032f0.setAlpha(a14);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f50026d0.f39048b.getChildCount(); i12++) {
            this.f50026d0.f39048b.getChildAt(i12).setAlpha(a14);
        }
        if (this.f50049o1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a14;
        o01 o01Var = this.f50018a0;
        o01Var.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        if (smVar != null) {
            smVar.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        }
        this.f50019a1 = (interpolation2 * 0.85f) + 0.15f;
        this.f50022b1 = (interpolation3 * 0.925f) + 0.075f;
        o01Var.invalidateOutline();
        if (smVar != null) {
            smVar.setAlpha(a14);
        }
        m01 m01Var = this.f50029e0;
        m01Var.setAlpha(a14);
        m01Var.setScaleX(Math.min(this.f50019a1, 1.0f));
        float pivotX = m01Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(o01Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(o01Var.getHeight(), 2.0d) + Math.pow(o01Var.getWidth() - pivotX, 2.0d)));
        for (int i13 = 0; i13 < this.f50026d0.f39048b.getChildCount(); i13++) {
            View childAt = this.f50026d0.f39048b.getChildAt(i13);
            if (f10 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f10 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float s5 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s5)) {
                s5 = 0.0f;
            }
            childAt.setScaleX(s5);
            childAt.setScaleY(s5);
        }
        while (true) {
            r01 r01Var = this.f50036h0;
            if (i11 < r01Var.getChildCount()) {
                View childAt2 = r01Var.getChildAt(i11);
                if (childAt2 instanceof d11) {
                    d11 d11Var = (d11) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float s9 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(s9)) {
                        s9 = 0.0f;
                    }
                    d11Var.setAnimatedScale(s9);
                }
                i11++;
            } else {
                this.f50042k0.invalidate();
                r01Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25108x0;
        xz0 xz0Var = this.T1;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                org.telegram.messenger.g0.r(xz0Var);
                org.telegram.messenger.g0.h3(xz0Var);
            }
        } else if (i7 == org.telegram.messenger.qs.A0) {
            org.telegram.messenger.g0.r(xz0Var);
            org.telegram.messenger.g0.h3(xz0Var);
        } else if (i7 == org.telegram.messenger.qs.C1) {
            org.telegram.messenger.g0.r(xz0Var);
            org.telegram.messenger.g0.h3(xz0Var);
        } else if (i7 == org.telegram.messenger.qs.B0) {
            org.telegram.messenger.g0.r(xz0Var);
            org.telegram.messenger.g0.h3(xz0Var);
        } else if (i7 == org.telegram.messenger.qs.f25022i4) {
            pg.c cVar = new pg.c(0);
            r01 r01Var = this.f50036h0;
            org.telegram.messenger.g0.d0(r01Var, cVar);
            if (r01Var != null) {
                r01Var.invalidate();
            }
        } else if (i7 == org.telegram.messenger.qs.G3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.p10.i(this.V).e()) {
            org.telegram.messenger.g0.r(xz0Var);
            org.telegram.messenger.g0.h3(xz0Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i7;
        float f10;
        float measuredHeight;
        org.telegram.ui.Components.f5 f5Var = this.f50049o1;
        if (f5Var != null && (num = this.Y0) != null) {
            Rect bounds = f5Var.getBounds();
            View view = this.f50053q1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f50049o1.getAlpha();
            View view2 = this.f50053q1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f50049o1.f33468w = (int) (Math.pow(this.f50018a0.getAlpha(), 0.25d) * alpha * this.f50045m1);
            if (this.f50051p1 == null) {
                this.f50051p1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            float f11 = i7;
            if (scaleY > 1.5f) {
                f10 = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f10 = 0.0f;
            }
            float intValue = num.intValue() + f11;
            float z9 = com.google.android.recaptcha.internal.a.z(scaleY, 1.0f, bounds.centerY(), -f10);
            boolean n10 = n();
            int i10 = this.f50027d1;
            if (!n10) {
                measuredHeight = org.telegram.messenger.g0.L(i10);
            } else {
                measuredHeight = getMeasuredHeight() - (org.telegram.messenger.g0.L(i10) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z9 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f50051p1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.f5 f5Var2 = this.f50049o1;
            Rect rect = this.f50051p1;
            int i11 = rect.left;
            Rect rect2 = this.f50051p1;
            f5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f50051p1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f50049o1.draw(canvas);
            org.telegram.ui.Components.f5 f5Var3 = this.f50049o1;
            f5Var3.f33468w = alpha;
            f5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        d11 d11Var = this.f50059s1;
        if (d11Var != null && this.f50061t1 != null && d11Var.E != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f50059s1.E.setAlpha((int) (this.f50056r1 * 255.0f));
            this.f50059s1.E.setBounds(this.f50061t1);
            this.f50059s1.E.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.f50045m1, this.f50033f1, this.n1), PorterDuff.Mode.SRC_IN));
            this.f50059s1.E.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.P1 - this.O1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.P1 - this.O1) * 25) + f() + 16;
    }

    public bi.ud getCollectionParticles() {
        if (this.R1 == null) {
            this.R1 = new bi.ud(1, 8);
        }
        return this.R1;
    }

    public long getDialogId() {
        return org.telegram.messenger.p10.i(this.V).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        View view;
        float f10;
        if (this.G1) {
            view = this.f50038i0;
        } else {
            view = this.f50036h0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f50068w1) {
            this.f50068w1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f50048o0.animate();
            if (canScrollVertically) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.camera.q.k(animate, f10, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t11.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i7 = this.W;
        if (i7 != 2) {
            StringBuilder sb2 = new StringBuilder("emoji");
            if (i7 != 0 && i7 != 12 && i7 != 9 && i7 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String s5 = a8.p0.s(sb2, str, "usehint");
            int i10 = org.telegram.messenger.qp.e1().getInt(s5, 0);
            if (i10 <= 3) {
                org.telegram.messenger.qp.e1().edit().putInt(s5, i10 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i7 = this.W;
        if (i7 != 5 && i7 != 10 && i7 != 12 && i7 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.q5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t11.o(android.view.View, org.telegram.ui.Components.q5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        int i7 = this.V;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.A0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25108x0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.C1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.B0);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25022i4);
        int i10 = this.W;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.G3);
        }
        org.telegram.ui.Components.f5 f5Var = this.f50049o1;
        if (f5Var != null) {
            f5Var.f33465n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.I = false;
        int i7 = this.V;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.A0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25108x0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.C1);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.B0);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25022i4);
        int i10 = this.W;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.G3);
        }
        org.telegram.ui.Components.f5 f5Var = this.f50049o1;
        if (f5Var != null) {
            f5Var.f33465n = null;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (z9 && this.W == 6) {
            this.f50055r0.y1((getMeasuredWidth() / org.telegram.messenger.g0.L(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9 = this.Q0;
        int i11 = this.W;
        if (z9 && i11 != 3 && i11 != 4) {
            Point point = org.telegram.messenger.g0.f22567q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f), Integer.MIN_VALUE));
        } else if (i11 == 6) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.f22567q.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(j11 j11Var) {
        Integer num = this.Z1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) d2.get(num);
        }
        this.U1 = j11Var;
        boolean z9 = this.Q0;
        r01 r01Var = this.f50036h0;
        if (!z9) {
            h();
            for (int i7 = 0; i7 < r01Var.getChildCount(); i7++) {
                View childAt = r01Var.getChildAt(i7);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.V1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V1 = null;
        }
        ValueAnimator valueAnimator2 = this.W1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.W1 = null;
        }
        int i10 = this.W;
        if (i10 != 3 && i10 != 4 && i10 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V1 = ofFloat;
            ofFloat.addUpdateListener(new wz0(this, 0));
            this.V1.addListener(new g30(this, 27));
            xz0 xz0Var = new xz0(this, 0);
            ch.e0.f6238f = true;
            ch.e0.f6237e = true;
            ch.e0.f6239g = false;
            if (ch.e0.d) {
                ch.e0.d = false;
            }
            ch.e0.f6236c = xz0Var;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25025j1, 512);
            this.X1.d();
            this.V1.setDuration(800L);
            r01Var.setLayerType(2, null);
            this.f50032f0.setLayerType(2, null);
            this.f50029e0.setLayerType(2, null);
            this.f50021b0.setLayerType(2, null);
            org.telegram.ui.Components.sm smVar = this.f50047n0;
            if (smVar != null) {
                smVar.setLayerType(2, null);
            }
            View view = this.m0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f50026d0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z9) {
        this.P = z9;
    }

    public void setBackgroundDelegate(u01 u01Var) {
        this.U = u01Var;
    }

    public void setDrawBackground(boolean z9) {
        this.Q0 = z9;
        this.f50018a0.setClipToOutline(z9);
        fi.p5 p5Var = this.f50021b0;
        if (!z9) {
            p5Var.setVisibility(8);
        } else {
            p5Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z9) {
        if (this.T != z9) {
            this.T = z9;
            if (!z9) {
                org.telegram.messenger.g0.d0(this.f50036h0, new di.e(24));
                for (int i7 = 0; i7 < this.f50026d0.f39048b.getChildCount(); i7++) {
                    View childAt = this.f50026d0.f39048b.getChildAt(i7);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f50026d0.f39048b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i7) {
        if (i7 <= 0) {
            return;
        }
        this.O0 = true;
        this.P0 = Integer.valueOf(i7);
        B(true, false, true);
    }

    public void setForUser(boolean z9) {
        this.R = z9;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.N = drawable;
        d11 d11Var = this.O;
        if (d11Var != null) {
            d11Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z9) {
        this.f50037h1 = z9;
    }

    public void setOnLongPressedListener(r11 r11Var) {
        this.H = r11Var;
    }

    public void setRecentReactions(List<ch.o0> list) {
        this.R0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i7) {
        this.Z1 = Integer.valueOf(i7);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.K;
        hashSet.clear();
        hashSet.add(l10);
        r01 r01Var = this.f50036h0;
        if (r01Var != null) {
            for (int i7 = 0; i7 < r01Var.getChildCount(); i7++) {
                if (r01Var.getChildAt(i7) instanceof d11) {
                    d11 d11Var = (d11) r01Var.getChildAt(i7);
                    org.telegram.ui.Components.q5 q5Var = d11Var.f44874e;
                    if (q5Var != null) {
                        d11Var.d(hashSet.contains(Long.valueOf(q5Var.getDocumentId())), true);
                    } else {
                        d11Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            r01Var.invalidate();
        }
    }

    public void setSelectedReaction(ch.o0 o0Var) {
        this.J.clear();
        this.J.add(o0Var);
        r01 r01Var = this.f50036h0;
        if (r01Var != null) {
            for (int i7 = 0; i7 < r01Var.getChildCount(); i7++) {
                if (r01Var.getChildAt(i7) instanceof d11) {
                    d11 d11Var = (d11) r01Var.getChildAt(i7);
                    d11Var.d(this.J.contains(d11Var.f44881y), true);
                }
            }
            r01Var.invalidate();
        }
        h01 h01Var = this.f50038i0;
        if (h01Var != null) {
            for (int i10 = 0; i10 < h01Var.getChildCount(); i10++) {
                if (h01Var.getChildAt(i10) instanceof d11) {
                    d11 d11Var2 = (d11) h01Var.getChildAt(i10);
                    d11Var2.d(this.J.contains(d11Var2.f44881y), true);
                }
            }
            h01Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ch.o0> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != null && ((ch.o0) arrayList.get(i7)).f6360g != 0) {
                hashSet2.add(Long.valueOf(((ch.o0) arrayList.get(i7)).f6360g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            if (!this.l1 || (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28225v6, this.Z0)) == this.f50033f1) {
                return;
            }
            this.f50033f1 = w02;
            this.M.setColor(i0.a.o(w02, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f50033f1, PorterDuff.Mode.SRC_IN);
            this.f50043k1 = porterDuffColorFilter;
            org.telegram.ui.Components.h5 h5Var = this.W0;
            if (h5Var != null) {
                h5Var.setColorFilter(porterDuffColorFilter);
            }
            r01 r01Var = this.f50036h0;
            if (r01Var != null) {
                r01Var.invalidate();
            }
            h01 h01Var = this.f50038i0;
            if (h01Var != null) {
                h01Var.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v(String str, boolean z9, boolean z10) {
        long j3;
        xz0 xz0Var = this.J1;
        if (xz0Var != null) {
            org.telegram.messenger.g0.r(xz0Var);
            this.J1 = null;
        }
        di.a6 a6Var = this.K1;
        if (a6Var != null) {
            org.telegram.messenger.g0.r(a6Var);
            this.K1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        e11 e11Var = this.f50052q0;
        l01 l01Var = this.f50032f0;
        if (isEmpty) {
            this.f50074y1 = false;
            this.f50076z1 = false;
            z(false, z9);
            if (l01Var != null) {
                l01Var.d(true);
                l01.a(l01Var, false);
            }
            e11Var.E(true);
            this.A1 = null;
        } else {
            boolean z11 = this.f50074y1;
            boolean z12 = !z11;
            this.f50074y1 = true;
            this.f50076z1 = false;
            if (l01Var != null) {
                l01Var.f47477f.b(2);
            }
            if (!z11) {
                ArrayList arrayList = this.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                e11Var.E(false);
            } else if (!str.equals(this.A1)) {
                xz0 xz0Var2 = new xz0(this, 1);
                this.J1 = xz0Var2;
                org.telegram.messenger.g0.i3(xz0Var2, 120L);
            }
            this.A1 = str;
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(G0, f50015b2)) {
                org.telegram.messenger.ui.b0(this.V).M(G0, false);
            }
            f50015b2 = G0;
            di.a6 a6Var2 = new di.a6(this, str, z9, z12, G0, 3);
            this.K1 = a6Var2;
            if (z10) {
                j3 = 425;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.i3(a6Var2, j3);
            if (l01Var != null) {
                l01Var.f47477f.b(2);
                l01.a(l01Var, z9);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f50039i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50039i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50060t0.getAlpha(), f10 * 0.25f);
        this.f50039i1 = ofFloat;
        ofFloat.addUpdateListener(new wz0(this, 2));
        this.f50039i1.setDuration(200L);
        this.f50039i1.setInterpolator(org.telegram.ui.Components.wq.f40046f);
        this.f50039i1.start();
    }

    public final void x(Long l10, boolean z9) {
        boolean z10;
        HashSet hashSet = this.K;
        if (!hashSet.contains(l10)) {
            hashSet.add(l10);
            z10 = true;
        } else {
            hashSet.remove(l10);
            z10 = false;
        }
        r01 r01Var = this.f50036h0;
        if (r01Var != null) {
            for (int i7 = 0; i7 < r01Var.getChildCount(); i7++) {
                if (r01Var.getChildAt(i7) instanceof d11) {
                    d11 d11Var = (d11) r01Var.getChildAt(i7);
                    org.telegram.ui.Components.q5 q5Var = d11Var.f44874e;
                    if (q5Var != null && q5Var.getDocumentId() == l10.longValue()) {
                        d11Var.e(z10, z9);
                    } else {
                        TLRPC.Document document = d11Var.d;
                        if (document != null && document.f26966id == l10.longValue()) {
                            d11Var.e(z10, z9);
                        }
                    }
                }
            }
            r01Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.f5 f5Var, View view) {
        int i7;
        Integer num;
        if (f5Var != null && (num = f5Var.F) != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        this.n1 = i7;
        this.f50049o1 = f5Var;
        this.f50053q1 = view;
        if (this.I && f5Var != null) {
            f5Var.f33465n = this;
        }
        invalidate();
    }

    public final void z(boolean z9, boolean z10) {
        float f10;
        if (this.G1 == z9) {
            return;
        }
        this.G1 = z9;
        r01 r01Var = this.f50036h0;
        r01Var.setVisibility(0);
        h01 h01Var = this.f50038i0;
        h01Var.setVisibility(0);
        ValueAnimator valueAnimator = this.F1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.I1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.I1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F1 = ofFloat;
        ofFloat.addUpdateListener(new a01(this, z9, 0));
        this.F1.addListener(new n01(this, z9, 0));
        this.F1.setDuration(320L);
        this.F1.setInterpolator(org.telegram.ui.Components.wq.h);
        this.F1.start();
        ViewPropertyAnimator animate = ((View) r01Var.getParent()).animate();
        if (this.G1 && z10) {
            f10 = -org.telegram.messenger.g0.L(36.0f);
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.camera.q.l(animate.translationY(f10).setUpdateListener(new wz0(this, 1)), org.telegram.ui.Components.wq.f40046f, 160L);
        if (this.G1 && z10) {
            h01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        } else {
            h01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        }
        h();
    }

    public t11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this(f2Var, context, z9, num, i7, z10, h6Var, i10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28225v6, h6Var));
    }

    public t11(org.telegram.ui.ActionBar.f2 r47, android.content.Context r48, boolean r49, java.lang.Integer r50, int r51, boolean r52, org.telegram.ui.ActionBar.h6 r53, int r54, int r55) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t11.<init>(org.telegram.ui.ActionBar.f2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.h6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            this.J.add(ch.o0.b(str));
        }
        r01 r01Var = this.f50036h0;
        if (r01Var != null) {
            for (int i10 = 0; i10 < r01Var.getChildCount(); i10++) {
                if (r01Var.getChildAt(i10) instanceof d11) {
                    d11 d11Var = (d11) r01Var.getChildAt(i10);
                    d11Var.d(this.J.contains(d11Var.f44881y), true);
                }
            }
            r01Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(s11 s11Var) {
    }

    @Override
    public void setPressed(boolean z9) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(d11 d11Var, ch.o0 o0Var) {
    }
}
