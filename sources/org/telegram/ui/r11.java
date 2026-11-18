package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
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
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public abstract class r11 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public static String[] f51374c2;
    public final SparseIntArray A0;
    public boolean A1;
    public final ArrayList B0;
    public String B1;
    public final ArrayList C0;
    public ArrayList C1;
    public boolean D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ArrayList F1;
    public int G;
    public final ArrayList G0;
    public ValueAnimator G1;
    public w01 H;
    public final ArrayList H0;
    public boolean H1;
    public p11 I;
    public final ArrayList I0;
    public boolean I1;
    public boolean J;
    public final ArrayList J0;
    public ValueAnimator J1;
    public HashSet K;
    public ArrayList K0;
    public vz0 K1;
    public final HashSet L;
    public final ArrayList L0;
    public fi.p5 L1;
    public final Paint M;
    public ArrayList M0;
    public boolean M1;
    public final Paint N;
    public final ArrayList N0;
    public boolean N1;
    public Drawable O;
    public final boolean O0;
    public View O1;
    public b11 P;
    public boolean P0;
    public int P1;
    public boolean Q;
    public Integer Q0;
    public int Q1;
    public boolean R;
    public boolean R0;
    public long R1;
    public boolean S;
    public List S0;
    public di.ec S1;
    public final ArrayList T;
    public b11 T0;
    public final vz0 T1;
    public boolean U;
    public boolean U0;
    public final vz0 U1;
    public s01 V;
    public float V0;
    public Runnable V1;
    public final int W;
    public final ImageReceiver W0;
    public ValueAnimator W1;
    public org.telegram.ui.Components.o5 X0;
    public ValueAnimator X1;
    public h01 Y0;
    public final h2.f Y1;
    public final Integer Z0;
    public final Paint Z1;
    public int f51376a;
    public final int f51377a0;
    public final org.telegram.ui.ActionBar.i6 f51378a1;
    public Integer f51379a2;
    public int f51380b;
    public final m01 f51381b0;
    public float f51382b1;
    public int f51383c;
    public final hi.m5 f51384c0;
    public float f51385c1;
    public int d;
    public final org.telegram.ui.Components.lv[] f51386d0;
    public final org.telegram.ui.ActionBar.h2 f51387d1;
    public int f51388e;
    public org.telegram.ui.Components.lv f51389e0;
    public final int f51390e1;
    public int f51391f;
    public final k01 f51392f0;
    public final q01 f51393f1;
    public final j01 f51394g0;
    public int f51395g1;
    public int h;
    public final ih0 f51396h0;
    public boolean f51397h1;
    public final p01 f51398i0;
    public boolean f51399i1;
    public final f01 f51400j0;
    public ValueAnimator f51401j1;
    public final FrameLayout f51402k0;
    public Drawable f51403k1;
    public final ai.k0 f51404l0;
    public PorterDuffColorFilter l1;
    public final org.telegram.ui.Components.q9 m0;
    public final boolean f51405m1;
    public int f51406n;
    public final View f51407n0;
    public float n1;
    public final org.telegram.ui.Components.jn f51408o0;
    public int f51409o1;
    public final View f51410p0;
    public org.telegram.ui.Components.m5 f51411p1;
    public final r01 f51412q0;
    public Rect f51413q1;
    public int f51414r;
    public final c11 f51415r0;
    public View f51416r1;
    public int f51417s;
    public final g01 f51418s0;
    public float f51419s1;
    public final org.telegram.ui.ActionBar.l5 f51420t0;
    public b11 f51421t1;
    public final View f51422u0;
    public Rect f51423u1;
    public int f51424v0;
    public final OvershootInterpolator f51425v1;
    public int f51426w;
    public final ArrayList f51427w0;
    public ValueAnimator f51428w1;
    public int f51429x;
    public final SparseIntArray f51430x0;
    public boolean f51431x1;
    public int f51432y;
    public final SparseIntArray f51433y0;
    public boolean f51434y1;
    public final SparseIntArray f51435z0;
    public boolean f51436z1;
    public static final List f51373b2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] d2 = new boolean[4];
    public static final HashMap f51375e2 = new HashMap();

    public r11(org.telegram.ui.ActionBar.h2 h2Var, Context context, boolean z10, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this(h2Var, context, z10, num, i7, true, i6Var, 16);
    }

    public static void D(int i7, org.telegram.ui.Components.q9 q9Var) {
        List list;
        org.telegram.messenger.fc b10;
        String str;
        if (q9Var != null) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(i7).f26639t0[1]);
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                list = f51373b2;
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
                        if (document2 != null && list.contains(org.telegram.messenger.fj.V(document2, null, null))) {
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
                ArrayList arrayList3 = new ArrayList(org.telegram.messenger.ri.d0(i7).u0(5));
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
                            if (document3 != null && list.contains(org.telegram.messenger.fj.V(document3, null, null))) {
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
                org.telegram.messenger.lz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29559m6, 0.2f, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.fc.b(document);
                    if (d != null) {
                        d.f25486e = 512;
                        d.f25487f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && org.telegram.messenger.fj.K2(document, false)) {
                        d.f25486e = 512;
                        d.f25487f = 512;
                    }
                    b10 = org.telegram.messenger.fc.b(document);
                    str = "36_36";
                }
                q9Var.setLayerNum(7);
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                q9Var.m(b10, str, org.telegram.messenger.fc.c(w10, document), "36_36", d, document);
            }
        }
    }

    public static void a(r11 r11Var, int i7, int i10) {
        int i11;
        org.telegram.ui.ActionBar.l5 l5Var = r11Var.f51420t0;
        g01 g01Var = r11Var.f51418s0;
        View m10 = g01Var.m(i7);
        int L0 = g01Var.L0();
        if ((m10 == null && Math.abs(i7 - L0) > 72.0f) || !org.telegram.messenger.bz.c()) {
            if (g01Var.L0() < i7) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            l5Var.f29199b = i11;
            l5Var.k(i7, i10, false, false);
            return;
        }
        hi.l1 l1Var = new hi.l1(4, r11Var.f51398i0.getContext(), r11Var);
        l1Var.f59067a = i7;
        l1Var.f55699p = i10;
        g01Var.w0(l1Var);
    }

    public static boolean c(r11 r11Var) {
        if (!r11Var.U) {
            ValueAnimator valueAnimator = r11Var.W1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i7 = 13;
        int i10 = this.f51377a0;
        if (i10 != 5 && i10 != 7) {
            if (i10 == 6) {
                return org.telegram.ui.Components.o5.f();
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
        if (this.f51403k1 == null) {
            int i7 = this.f51377a0;
            if (i7 != 5 && i7 != 9 && i7 != 10 && i7 != 7) {
                this.f51403k1 = i5.c.g(org.telegram.messenger.t0.f26913b, 2131232364);
            } else {
                this.f51403k1 = i5.c.g(org.telegram.messenger.t0.f26913b, 2131232135);
            }
            this.f51403k1.setColorFilter(this.l1);
        }
        return this.f51403k1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
            if (document == null || hashSet.contains(Long.valueOf(document.f28409id))) {
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
        String c10 = org.telegram.messenger.j6.c(str);
        int i7 = 0;
        while (true) {
            if (i7 < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i7).documents.isEmpty() && TextUtils.equals(org.telegram.messenger.j6.c(tL_messages_stickerSet.packs.get(i7).emoticon), c10)) {
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
            if (document.f28409id == j3) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.o5 o5Var) {
        org.telegram.ui.Components.o5 o5Var2;
        if (this.J && (o5Var2 = this.X0) != o5Var) {
            if (o5Var2 != null) {
                o5Var2.n(this);
            }
            this.X0 = o5Var;
            if (o5Var != null) {
                o5Var.setColorFilter(this.l1);
                this.X0.a(this);
            }
        }
    }

    public static void t(int i7) {
        boolean[] zArr = d2;
        if (!zArr[i7]) {
            org.telegram.messenger.ri.d0(i7);
            zArr[i7] = true;
            org.telegram.messenger.ri.d0(i7).D(5);
            org.telegram.messenger.ri.d0(i7).N(0, true);
            org.telegram.messenger.ri.d0(i7).C();
            org.telegram.messenger.ri.d0(i7).o0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            org.telegram.messenger.ri.d0(i7).R();
            org.telegram.messenger.ri.d0(i7).x();
            org.telegram.ui.Components.iv0.F3.c(i7, 1, new fi.f(i7, 1));
        }
    }

    public final void A(Long l10) {
        this.L.remove(l10);
        p01 p01Var = this.f51398i0;
        if (p01Var != null) {
            int i7 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < p01Var.getChildCount(); i10++) {
                if (p01Var.getChildAt(i10) instanceof b11) {
                    b11 b11Var = (b11) p01Var.getChildAt(i10);
                    org.telegram.ui.Components.x5 x5Var = b11Var.f45714e;
                    if (x5Var != null && x5Var.getDocumentId() == l10.longValue()) {
                        b11Var.f();
                    } else {
                        TLRPC.Document document = b11Var.d;
                        if (document != null && document.f28409id == l10.longValue()) {
                            b11Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            p01Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f51427w0;
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
                r01 r01Var = this.f51412q0;
                if (r01Var != null) {
                    r01Var.g(i7);
                }
            }
        }
    }

    public final void B(boolean r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r11.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        j01 j01Var = this.f51394g0;
        if (j01Var == null) {
            return;
        }
        if (this.A1) {
            j01Var.clearAnimation();
            j01Var.setVisibility(0);
            j01Var.animate().translationY(0.0f).start();
            return;
        }
        p01 p01Var = this.f51398i0;
        if (p01Var.getChildCount() > 0) {
            View childAt = p01Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f51376a && "searchbox".equals(childAt.getTag())) {
                j01Var.setVisibility(0);
                j01Var.setTranslationY(childAt.getY());
                return;
            }
            j01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
            return;
        }
        j01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
    }

    public final void E(float f10) {
        int i7;
        int i10 = -1;
        View view = this.f51407n0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.lr.f37209g.getInterpolation(c8.l9.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i7 = -1;
            } else {
                i7 = 1;
            }
            view.setScaleY(interpolation * i7);
        }
        org.telegram.ui.Components.jn jnVar = this.f51408o0;
        if (jnVar != null) {
            float a10 = c8.l9.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            jnVar.setAlpha(a10);
            jnVar.setScaleX(a10);
            if (!n()) {
                i10 = 1;
            }
            jnVar.setScaleY(a10 * i10);
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a11 = c8.l9.a(f12 / 700.0f, 0.0f, 1.0f);
        float a12 = c8.l9.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = c8.l9.a(f12 / 750.0f, 0.0f, 1.0f);
        float a14 = c8.l9.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        float interpolation2 = lrVar.getInterpolation(a11);
        float interpolation3 = lrVar.getInterpolation(a12);
        this.f51384c0.setAlpha(a14);
        this.f51394g0.setAlpha(a14);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f51389e0.f36144b.getChildCount(); i12++) {
            this.f51389e0.f36144b.getChildAt(i12).setAlpha(a14);
        }
        if (this.f51411p1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a14;
        m01 m01Var = this.f51381b0;
        m01Var.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        if (jnVar != null) {
            jnVar.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        }
        this.f51382b1 = (interpolation2 * 0.85f) + 0.15f;
        this.f51385c1 = (interpolation3 * 0.925f) + 0.075f;
        m01Var.invalidateOutline();
        if (jnVar != null) {
            jnVar.setAlpha(a14);
        }
        k01 k01Var = this.f51392f0;
        k01Var.setAlpha(a14);
        k01Var.setScaleX(Math.min(this.f51382b1, 1.0f));
        float pivotX = k01Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(m01Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(m01Var.getHeight(), 2.0d) + Math.pow(m01Var.getWidth() - pivotX, 2.0d)));
        for (int i13 = 0; i13 < this.f51389e0.f36144b.getChildCount(); i13++) {
            View childAt = this.f51389e0.f36144b.getChildAt(i13);
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
            float s5 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s5)) {
                s5 = 0.0f;
            }
            childAt.setScaleX(s5);
            childAt.setScaleY(s5);
        }
        while (true) {
            p01 p01Var = this.f51398i0;
            if (i11 < p01Var.getChildCount()) {
                View childAt2 = p01Var.getChildAt(i11);
                if (childAt2 instanceof b11) {
                    b11 b11Var = (b11) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float s9 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(s9)) {
                        s9 = 0.0f;
                    }
                    b11Var.setAnimatedScale(s9);
                }
                i11++;
            } else {
                this.f51404l0.invalidate();
                p01Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25218x0;
        vz0 vz0Var = this.U1;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.R)) {
                org.telegram.messenger.g0.r(vz0Var);
                org.telegram.messenger.g0.g3(vz0Var);
            }
        } else if (i7 == org.telegram.messenger.ks.A0) {
            org.telegram.messenger.g0.r(vz0Var);
            org.telegram.messenger.g0.g3(vz0Var);
        } else if (i7 == org.telegram.messenger.ks.C1) {
            org.telegram.messenger.g0.r(vz0Var);
            org.telegram.messenger.g0.g3(vz0Var);
        } else if (i7 == org.telegram.messenger.ks.B0) {
            org.telegram.messenger.g0.r(vz0Var);
            org.telegram.messenger.g0.g3(vz0Var);
        } else if (i7 == org.telegram.messenger.ks.f25148l4) {
            pg.c cVar = new pg.c(0);
            p01 p01Var = this.f51398i0;
            org.telegram.messenger.g0.d0(p01Var, cVar);
            if (p01Var != null) {
                p01Var.invalidate();
            }
        } else if (i7 == org.telegram.messenger.ks.I3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.j10.i(this.W).e()) {
            org.telegram.messenger.g0.r(vz0Var);
            org.telegram.messenger.g0.g3(vz0Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i7;
        float f10;
        float measuredHeight;
        org.telegram.ui.Components.m5 m5Var = this.f51411p1;
        if (m5Var != null && (num = this.Z0) != null) {
            Rect bounds = m5Var.getBounds();
            View view = this.f51416r1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f51411p1.getAlpha();
            View view2 = this.f51416r1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f51411p1.f37365w = (int) (Math.pow(this.f51381b0.getAlpha(), 0.25d) * alpha * this.n1);
            if (this.f51413q1 == null) {
                this.f51413q1 = new Rect();
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
            float z10 = com.google.android.gms.internal.vision.e2.z(scaleY, 1.0f, bounds.centerY(), -f10);
            boolean n10 = n();
            int i10 = this.f51390e1;
            if (!n10) {
                measuredHeight = org.telegram.messenger.g0.L(i10);
            } else {
                measuredHeight = getMeasuredHeight() - (org.telegram.messenger.g0.L(i10) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f51413q1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.m5 m5Var2 = this.f51411p1;
            Rect rect = this.f51413q1;
            int i11 = rect.left;
            Rect rect2 = this.f51413q1;
            m5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f51413q1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f51411p1.draw(canvas);
            org.telegram.ui.Components.m5 m5Var3 = this.f51411p1;
            m5Var3.f37365w = alpha;
            m5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        b11 b11Var = this.f51421t1;
        if (b11Var != null && this.f51423u1 != null && b11Var.F != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f51421t1.F.setAlpha((int) (this.f51419s1 * 255.0f));
            this.f51421t1.F.setBounds(this.f51423u1);
            this.f51421t1.F.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.n1, this.f51395g1, this.f51409o1), PorterDuff.Mode.SRC_IN));
            this.f51421t1.F.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.Q1 - this.P1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.Q1 - this.P1) * 25) + f() + 16;
    }

    public di.ec getCollectionParticles() {
        if (this.S1 == null) {
            this.S1 = new di.ec(1, 8);
        }
        return this.S1;
    }

    public long getDialogId() {
        return org.telegram.messenger.j10.i(this.W).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        View view;
        float f10;
        if (this.H1) {
            view = this.f51400j0;
        } else {
            view = this.f51398i0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f51431x1) {
            this.f51431x1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f51410p0.animate();
            if (canScrollVertically) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.n10.n(animate, f10, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r11.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i7 = this.f51377a0;
        if (i7 != 2) {
            StringBuilder sb2 = new StringBuilder("emoji");
            if (i7 != 0 && i7 != 12 && i7 != 9 && i7 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String s5 = a8.p0.s(sb2, str, "usehint");
            int i10 = org.telegram.messenger.mp.g1().getInt(s5, 0);
            if (i10 <= 3) {
                org.telegram.messenger.mp.g1().edit().putInt(s5, i10 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i7 = this.f51377a0;
        if (i7 != 5 && i7 != 10 && i7 != 12 && i7 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.x5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r11.o(android.view.View, org.telegram.ui.Components.x5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        int i7 = this.W;
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.A0);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25218x0);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.C1);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.B0);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25148l4);
        int i10 = this.f51377a0;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.I3);
        }
        org.telegram.ui.Components.m5 m5Var = this.f51411p1;
        if (m5Var != null) {
            m5Var.f37362n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.J = false;
        int i7 = this.W;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.A0);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25218x0);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.C1);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.B0);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25148l4);
        int i10 = this.f51377a0;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.I3);
        }
        org.telegram.ui.Components.m5 m5Var = this.f51411p1;
        if (m5Var != null) {
            m5Var.f37362n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (z10 && this.f51377a0 == 6) {
            this.f51418s0.y1((getMeasuredWidth() / org.telegram.messenger.g0.L(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10 = this.R0;
        int i11 = this.f51377a0;
        if (z10 && i11 != 3 && i11 != 4) {
            Point point = org.telegram.messenger.g0.f24118q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f), Integer.MIN_VALUE));
        } else if (i11 == 6) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.f24118q.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(h11 h11Var) {
        Integer num = this.f51379a2;
        if (num != null) {
            Parcelable parcelable = (Parcelable) f51375e2.get(num);
        }
        this.V1 = h11Var;
        boolean z10 = this.R0;
        p01 p01Var = this.f51398i0;
        if (!z10) {
            h();
            for (int i7 = 0; i7 < p01Var.getChildCount(); i7++) {
                View childAt = p01Var.getChildAt(i7);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W1 = null;
        }
        ValueAnimator valueAnimator2 = this.X1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.X1 = null;
        }
        int i10 = this.f51377a0;
        if (i10 != 3 && i10 != 4 && i10 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W1 = ofFloat;
            ofFloat.addUpdateListener(new uz0(this, 0));
            this.W1.addListener(new ay(this, 28));
            vz0 vz0Var = new vz0(this, 0);
            ch.f0.f5354f = true;
            ch.f0.f5353e = true;
            ch.f0.f5355g = false;
            if (ch.f0.d) {
                ch.f0.d = false;
            }
            ch.f0.f5352c = vz0Var;
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25135j1, 512);
            this.Y1.d();
            this.W1.setDuration(800L);
            p01Var.setLayerType(2, null);
            this.f51394g0.setLayerType(2, null);
            this.f51392f0.setLayerType(2, null);
            this.f51384c0.setLayerType(2, null);
            org.telegram.ui.Components.jn jnVar = this.f51408o0;
            if (jnVar != null) {
                jnVar.setLayerType(2, null);
            }
            View view = this.f51407n0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f51389e0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.Q = z10;
    }

    public void setBackgroundDelegate(s01 s01Var) {
        this.V = s01Var;
    }

    public void setDrawBackground(boolean z10) {
        this.R0 = z10;
        this.f51381b0.setClipToOutline(z10);
        hi.m5 m5Var = this.f51384c0;
        if (!z10) {
            m5Var.setVisibility(8);
        } else {
            m5Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            if (!z10) {
                org.telegram.messenger.g0.d0(this.f51398i0, new fi.e(25));
                for (int i7 = 0; i7 < this.f51389e0.f36144b.getChildCount(); i7++) {
                    View childAt = this.f51389e0.f36144b.getChildAt(i7);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f51389e0.f36144b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i7) {
        if (i7 <= 0) {
            return;
        }
        this.P0 = true;
        this.Q0 = Integer.valueOf(i7);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.S = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.O = drawable;
        b11 b11Var = this.P;
        if (b11Var != null) {
            b11Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f51399i1 = z10;
    }

    public void setOnLongPressedListener(p11 p11Var) {
        this.I = p11Var;
    }

    public void setRecentReactions(List<ch.p0> list) {
        this.S0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i7) {
        this.f51379a2 = Integer.valueOf(i7);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.L;
        hashSet.clear();
        hashSet.add(l10);
        p01 p01Var = this.f51398i0;
        if (p01Var != null) {
            for (int i7 = 0; i7 < p01Var.getChildCount(); i7++) {
                if (p01Var.getChildAt(i7) instanceof b11) {
                    b11 b11Var = (b11) p01Var.getChildAt(i7);
                    org.telegram.ui.Components.x5 x5Var = b11Var.f45714e;
                    if (x5Var != null) {
                        b11Var.d(hashSet.contains(Long.valueOf(x5Var.getDocumentId())), true);
                    } else {
                        b11Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            p01Var.invalidate();
        }
    }

    public void setSelectedReaction(ch.p0 p0Var) {
        this.K.clear();
        this.K.add(p0Var);
        p01 p01Var = this.f51398i0;
        if (p01Var != null) {
            for (int i7 = 0; i7 < p01Var.getChildCount(); i7++) {
                if (p01Var.getChildAt(i7) instanceof b11) {
                    b11 b11Var = (b11) p01Var.getChildAt(i7);
                    b11Var.d(this.K.contains(b11Var.f45721y), true);
                }
            }
            p01Var.invalidate();
        }
        f01 f01Var = this.f51400j0;
        if (f01Var != null) {
            for (int i10 = 0; i10 < f01Var.getChildCount(); i10++) {
                if (f01Var.getChildAt(i10) instanceof b11) {
                    b11 b11Var2 = (b11) f01Var.getChildAt(i10);
                    b11Var2.d(this.K.contains(b11Var2.f45721y), true);
                }
            }
            f01Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ch.p0> hashSet) {
        this.K = hashSet;
        HashSet hashSet2 = this.L;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != null && ((ch.p0) arrayList.get(i7)).f5476g != 0) {
                hashSet2.add(Long.valueOf(((ch.p0) arrayList.get(i7)).f5476g));
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
            if (!this.f51405m1 || (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29729v6, this.f51378a1)) == this.f51395g1) {
                return;
            }
            this.f51395g1 = w02;
            this.N.setColor(i0.a.o(w02, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f51395g1, PorterDuff.Mode.SRC_IN);
            this.l1 = porterDuffColorFilter;
            org.telegram.ui.Components.o5 o5Var = this.X0;
            if (o5Var != null) {
                o5Var.setColorFilter(porterDuffColorFilter);
            }
            p01 p01Var = this.f51398i0;
            if (p01Var != null) {
                p01Var.invalidate();
            }
            f01 f01Var = this.f51400j0;
            if (f01Var != null) {
                f01Var.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j3;
        vz0 vz0Var = this.K1;
        if (vz0Var != null) {
            org.telegram.messenger.g0.r(vz0Var);
            this.K1 = null;
        }
        fi.p5 p5Var = this.L1;
        if (p5Var != null) {
            org.telegram.messenger.g0.r(p5Var);
            this.L1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        c11 c11Var = this.f51415r0;
        j01 j01Var = this.f51394g0;
        if (isEmpty) {
            this.f51436z1 = false;
            this.A1 = false;
            z(false, z10);
            if (j01Var != null) {
                j01Var.d(true);
                j01.a(j01Var, false);
            }
            c11Var.E(true);
            this.B1 = null;
        } else {
            boolean z12 = this.f51436z1;
            boolean z13 = !z12;
            this.f51436z1 = true;
            this.A1 = false;
            if (j01Var != null) {
                j01Var.f48836f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                c11Var.E(false);
            } else if (!str.equals(this.B1)) {
                vz0 vz0Var2 = new vz0(this, 1);
                this.K1 = vz0Var2;
                org.telegram.messenger.g0.h3(vz0Var2, 120L);
            }
            this.B1 = str;
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(G0, f51374c2)) {
                org.telegram.messenger.ri.d0(this.W).O(G0, false);
            }
            f51374c2 = G0;
            fi.p5 p5Var2 = new fi.p5(this, str, z10, z13, G0, 3);
            this.L1 = p5Var2;
            if (z11) {
                j3 = 425;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.h3(p5Var2, j3);
            if (j01Var != null) {
                j01Var.f48836f.b(2);
                j01.a(j01Var, z10);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f51401j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f51401j1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51422u0.getAlpha(), f10 * 0.25f);
        this.f51401j1 = ofFloat;
        ofFloat.addUpdateListener(new uz0(this, 2));
        this.f51401j1.setDuration(200L);
        this.f51401j1.setInterpolator(org.telegram.ui.Components.lr.f37208f);
        this.f51401j1.start();
    }

    public final void x(Long l10, boolean z10) {
        boolean z11;
        HashSet hashSet = this.L;
        if (!hashSet.contains(l10)) {
            hashSet.add(l10);
            z11 = true;
        } else {
            hashSet.remove(l10);
            z11 = false;
        }
        p01 p01Var = this.f51398i0;
        if (p01Var != null) {
            for (int i7 = 0; i7 < p01Var.getChildCount(); i7++) {
                if (p01Var.getChildAt(i7) instanceof b11) {
                    b11 b11Var = (b11) p01Var.getChildAt(i7);
                    org.telegram.ui.Components.x5 x5Var = b11Var.f45714e;
                    if (x5Var != null && x5Var.getDocumentId() == l10.longValue()) {
                        b11Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = b11Var.d;
                        if (document != null && document.f28409id == l10.longValue()) {
                            b11Var.e(z11, z10);
                        }
                    }
                }
            }
            p01Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.m5 m5Var, View view) {
        int i7;
        Integer num;
        if (m5Var != null && (num = m5Var.G) != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        this.f51409o1 = i7;
        this.f51411p1 = m5Var;
        this.f51416r1 = view;
        if (this.J && m5Var != null) {
            m5Var.f37362n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f10;
        if (this.H1 == z10) {
            return;
        }
        this.H1 = z10;
        p01 p01Var = this.f51398i0;
        p01Var.setVisibility(0);
        f01 f01Var = this.f51400j0;
        f01Var.setVisibility(0);
        ValueAnimator valueAnimator = this.G1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.J1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.J1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G1 = ofFloat;
        ofFloat.addUpdateListener(new yz0(this, z10, 0));
        this.G1.addListener(new l01(this, z10, 0));
        this.G1.setDuration(320L);
        this.G1.setInterpolator(org.telegram.ui.Components.lr.h);
        this.G1.start();
        ViewPropertyAnimator animate = ((View) p01Var.getParent()).animate();
        if (this.H1 && z11) {
            f10 = -org.telegram.messenger.g0.L(36.0f);
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.n10.o(animate.translationY(f10).setUpdateListener(new uz0(this, 1)), org.telegram.ui.Components.lr.f37208f, 160L);
        if (this.H1 && z11) {
            f01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        } else {
            f01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        }
        h();
    }

    public r11(org.telegram.ui.ActionBar.h2 h2Var, Context context, boolean z10, Integer num, int i7, boolean z11, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this(h2Var, context, z10, num, i7, z11, i6Var, i10, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29729v6, i6Var));
    }

    public r11(org.telegram.ui.ActionBar.h2 h2Var, Context context, boolean z10, Integer num, int i7, boolean z11, org.telegram.ui.ActionBar.i6 i6Var, int i10, int i11) {
        super(context);
        int i12;
        int i13;
        float f10;
        float f11;
        Integer num2;
        boolean z12;
        Integer num3;
        boolean z13;
        Integer num4;
        boolean z14;
        org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
        int i14 = i7;
        int i15 = i11;
        this.K = new HashSet();
        this.L = new HashSet();
        Paint paint = new Paint(1);
        this.M = paint;
        Paint paint2 = new Paint(1);
        this.N = paint2;
        this.T = new ArrayList();
        this.W = org.telegram.messenger.j10.f24770t0;
        this.f51386d0 = new org.telegram.ui.Components.lv[2];
        this.f51427w0 = new ArrayList();
        this.f51430x0 = new SparseIntArray();
        this.f51433y0 = new SparseIntArray();
        this.f51435z0 = new SparseIntArray();
        this.A0 = new SparseIntArray();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = false;
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = new ArrayList();
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = new ArrayList();
        this.O0 = false;
        this.P0 = false;
        this.R0 = true;
        this.W0 = new ImageReceiver(null);
        this.f51399i1 = true;
        this.n1 = 1.0f;
        this.f51419s1 = 1.0f;
        this.f51425v1 = new OvershootInterpolator(2.0f);
        this.f51431x1 = false;
        this.f51434y1 = false;
        this.f51436z1 = false;
        this.A1 = false;
        this.H1 = false;
        this.I1 = false;
        this.M1 = false;
        this.N1 = false;
        this.P1 = -1;
        this.Q1 = -1;
        this.R1 = -1L;
        this.T1 = new vz0(this, 3);
        this.U1 = new vz0(this, 4);
        this.Y1 = new h2.f((int[]) null);
        this.Z1 = new Paint();
        this.f51378a1 = i6Var;
        this.f51377a0 = i14;
        this.O0 = z10;
        this.f51387d1 = h2Var2;
        SharedPreferences g12 = org.telegram.messenger.mp.g1();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.P0 = g12.getInt(sb2.toString(), 0) < 3;
        this.f51395g1 = i15;
        this.f51405m1 = i15 == org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29729v6, i6Var);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29486i6, i6Var));
        paint2.setColor(i0.a.o(i15, 30));
        this.l1 = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
        this.Z0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(c8.l9.b(num.intValue(), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(292.0f)));
        boolean z15 = valueOf != null && valueOf.intValue() > org.telegram.messenger.g0.L(170.0f);
        setFocusableInTouchMode(true);
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 7) {
            this.f51390e1 = i10;
            setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            setOnTouchListener(new d0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.f51407n0 = view;
            Drawable mutate = getResources().getDrawable(2131232726).mutate();
            org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.G8, i6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, c8.ma.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / org.telegram.messenger.g0.f24117p) + (z15 ? -12 : 4), n() ? 0 : this.f51390e1, 0.0f, n() ? this.f51390e1 : 0));
        }
        hi.m5 m5Var = new hi.m5(this, context, i6Var, 15);
        this.f51384c0 = m5Var;
        boolean z16 = i14 == 3 || i14 == 4;
        Integer num5 = valueOf;
        m01 m01Var = new m01(this, context, z16, z16, i6Var, num5);
        Integer num6 = num5;
        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
        this.f51381b0 = m01Var;
        if (!z16) {
            m01Var.setOutlineProvider(new n01(this, num6));
            m01Var.setClipToOutline(true);
            if (z16) {
                m01Var.setElevation(2.0f);
            }
        }
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 15) {
            m01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        m01Var.addView(m5Var, c8.ma.c(-1.0f, -1));
        addView(m01Var, c8.ma.d(-1, -1.0f, 119, 0.0f, (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 2 || i14 == 7) ? this.f51390e1 + 6 : 0.0f, 0.0f, n() ? this.f51390e1 + 6 : 0.0f));
        if (num6 != null) {
            org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, 23);
            this.f51408o0 = jnVar;
            i13 = 14;
            Drawable drawable = getResources().getDrawable(2131232727);
            org.telegram.ui.ActionBar.u6.x(this, drawable, org.telegram.ui.ActionBar.n6.G8, i6Var2, PorterDuff.Mode.MULTIPLY);
            jnVar.setBackground(drawable);
            i12 = 3;
            addView(jnVar, c8.ma.d(17, 9.0f, (n() ? 80 : 48) | 3, (num6.intValue() / org.telegram.messenger.g0.f24117p) + (z15 ? -25 : 10), n() ? 0.0f : this.f51390e1 + 5, 0.0f, n() ? this.f51390e1 + 14 : 0.0f));
        } else {
            i12 = 3;
            i13 = 14;
        }
        boolean z17 = (h2Var2 == null || i14 == i12 || i14 == 6 || i14 == 5 || i14 == 7 || i14 == 4 || i14 == 9 || i14 == 10 || !z11) ? false : true;
        int i16 = 0;
        while (true) {
            if (i16 >= 2) {
                break;
            }
            Integer num7 = num6;
            if (i14 != 4) {
                num3 = num7;
                z13 = true;
            } else {
                num3 = num7;
                z13 = false;
            }
            if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) {
                num4 = num3;
                z14 = true;
            } else {
                num4 = num3;
                z14 = false;
            }
            Integer num8 = num4;
            tr0 tr0Var = z17 ? new tr0(29, this, h2Var2) : null;
            int i17 = i16;
            org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
            int i18 = i14;
            int i19 = i13;
            o01 o01Var = new o01(this, context, i6Var3, z13, z14, i18, tr0Var, i15, i7);
            org.telegram.ui.Components.hv hvVar = o01Var.E;
            if (hvVar != null) {
                hvVar.setOnLongClickListener(new t(this, 7));
            }
            o01Var.V = false;
            if (i18 == 4) {
                o01Var.setAnimatedEmojiCacheType(13);
            } else {
                o01Var.setAnimatedEmojiCacheType((i18 == 0 || i18 == 12 || i18 == 2) ? 6 : 5);
            }
            o01Var.P = num8 == null;
            o01Var.setPaddingLeft(i18 == 6 ? 10.0f : 5.0f);
            if (i18 != i19 && i18 != 8 && i18 != 13) {
                this.f51381b0.addView(o01Var, c8.ma.c(36.0f, -1));
            }
            this.f51386d0[i17] = o01Var;
            i15 = i11;
            i14 = i18;
            i13 = i19;
            h2Var2 = h2Var;
            i6Var2 = i6Var3;
            i16 = i17 + 1;
            num6 = num8;
        }
        Integer num9 = num6;
        org.telegram.ui.ActionBar.i6 i6Var4 = i6Var2;
        int i20 = i14;
        int i21 = i13;
        org.telegram.ui.Components.lv[] lvVarArr = this.f51386d0;
        this.f51389e0 = lvVarArr[0];
        lvVarArr[1].setVisibility(8);
        k01 k01Var = new k01(context, num9, 1);
        this.f51392f0 = k01Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29395d7, k01Var, i6Var4);
        if (i20 == i21 || i20 == 8 || i20 == 13) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            this.f51381b0.addView(k01Var, c8.ma.d(-1, 1.0f / org.telegram.messenger.g0.f24117p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        org.telegram.messenger.g0.X3(k01Var, true, f10, true, false);
        p01 p01Var = new p01(this, context, i20);
        this.f51398i0 = p01Var;
        ?? kVar = new v4.k();
        this.f51393f1 = kVar;
        kVar.f59196c = 220L;
        kVar.f59197e = 260L;
        kVar.f59198f = 160L;
        kVar.f59199g = 160L;
        kVar.f59152m = false;
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        kVar.f59200i = lrVar;
        kVar.C = false;
        p01Var.setItemAnimator(kVar);
        float f12 = f10;
        p01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        r01 r01Var = new r01(this);
        this.f51412q0 = r01Var;
        p01Var.setAdapter(r01Var);
        g01 g01Var = new g01(this, 1);
        this.f51418s0 = g01Var;
        p01Var.setLayoutManager(g01Var);
        g01Var.O = new e01(this, 0);
        ih0 ih0Var = new ih0(context, 7);
        this.f51396h0 = ih0Var;
        ai.k0 k0Var = new ai.k0(this, context);
        this.f51404l0 = k0Var;
        k0Var.addView(p01Var, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ih0Var.addView(k0Var, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        f01 f01Var = new f01(this, context);
        this.f51400j0 = f01Var;
        if (f01Var.getItemAnimator() != null) {
            f11 = 38.0f;
            num2 = num9;
            f01Var.getItemAnimator().n(180L);
            f01Var.getItemAnimator().f59200i = lrVar;
        } else {
            f11 = 38.0f;
            num2 = num9;
        }
        TextView textView = new TextView(context);
        if (i20 == 4) {
            textView.setText(org.telegram.messenger.gd.M0(2131748020, null));
        } else if (i20 == 0 || i20 == 13 || i20 == 12 || i20 == 11 || i20 == 9 || i20 == 10) {
            textView.setText(org.telegram.messenger.gd.M0(2131748021, null));
        } else if (i20 == 1 || i20 == 2) {
            textView.setText(org.telegram.messenger.gd.M0(2131747982, null));
        } else if (i20 == i21) {
            textView.setText(org.telegram.messenger.gd.M0(2131748022, null));
        } else {
            textView.setText(org.telegram.messenger.gd.M0(2131748011, null));
        }
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Df, i6Var4);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.m0 = q9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51402k0 = frameLayout;
        frameLayout.addView(q9Var, c8.ma.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        ih0Var.addView(frameLayout, c8.ma.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        f01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(f11));
        c11 c11Var = new c11(this);
        this.f51415r0 = c11Var;
        f01Var.setAdapter(c11Var);
        g01 g01Var2 = new g01(this, 0);
        f01Var.setLayoutManager(g01Var2);
        g01Var2.O = new e01(this, 1);
        f01Var.setVisibility(8);
        ih0Var.addView(f01Var, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f51381b0.addView(ih0Var, c8.ma.d(-1, -1.0f, 48, 0.0f, (i20 == 8 || i20 == 13 || i20 == i21) ? 0.0f : (f12 / org.telegram.messenger.g0.f24117p) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(p01Var, g01Var);
        this.f51420t0 = l5Var;
        l5Var.f29204r = new ci.h(this, 2);
        l5Var.f29203n = new wz0(this);
        i01 i01Var = new i01(this, i20, context, i6Var4, num);
        p01Var.p1(i01Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        f01Var.p1(i01Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(this, i20, 2);
        p01Var.setOnItemClickListener(ll0Var);
        f01Var.setOnItemClickListener(ll0Var);
        j01 j01Var = new j01(this, context, z11);
        this.f51394g0 = j01Var;
        j01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        j01Var.setVisibility(4);
        ih0Var.addView(j01Var, c8.ma.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        k01 k01Var2 = new k01(context, num2, 0);
        Drawable drawable2 = getResources().getDrawable(2131231228);
        int i22 = org.telegram.ui.ActionBar.n6.G8;
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.8f, i22);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.k(k01Var2, drawable2, K.f29909a, -1, 2, K.d, i6Var, mode);
        k01Var2.setBackground(drawable2);
        k01Var2.setAlpha(0.0f);
        this.f51381b0.addView(k01Var2, c8.ma.d(-1, 20.0f, 55, 0.0f, (f12 / org.telegram.messenger.g0.f24117p) + 36.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f51410p0 = view2;
        Drawable drawable3 = getResources().getDrawable(2131231225);
        org.telegram.ui.ActionBar.u6.x(this, drawable3, i22, i6Var, mode);
        if (i20 == i21) {
            view2.setBackground(drawable3);
        }
        view2.setAlpha(0.0f);
        this.f51381b0.addView(view2, c8.ma.e(-1, 20, 87));
        View view3 = new View(context);
        this.f51422u0 = view3;
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(-16777216);
        this.f51381b0.addView(view3, c8.ma.c(-1.0f, -1));
        int i23 = this.W;
        org.telegram.messenger.ri.d0(i23);
        org.telegram.messenger.ri.d0(i23).D(5);
        if (i20 == i21) {
            org.telegram.messenger.mp.u1(this.W).G0();
        } else if (i20 == 1 || i20 == 11 || i20 == 2 || i20 == 6 || i20 == 13) {
            org.telegram.messenger.ri.d0(i23).C();
        } else if (i20 == 9 || i20 == 10) {
            if (org.telegram.messenger.mp.u1(i23).h7.getBoolean("resetemojipacks", true)) {
                org.telegram.messenger.ri.d0(i23).d1(5, false, false);
                org.telegram.messenger.mp.u1(i23).h7.edit().putBoolean("resetemojipacks", false).commit();
            }
            org.telegram.messenger.ri.d0(i23).N(2, false);
            org.telegram.messenger.ri.d0(i23).b1();
            org.telegram.messenger.ri.d0(i23).o0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
        } else if (i20 == 0 || i20 == 12) {
            org.telegram.messenger.ri.d0(i23).N(0, true);
            org.telegram.messenger.ri.d0(i23).o0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i20 == 3) {
            org.telegram.messenger.ri.d0(i23).x();
        } else if (i20 == 4) {
            org.telegram.messenger.ri.d0(i23).Y0(0, false, true, false);
            org.telegram.messenger.ri.d0(i23).D(0);
        }
        this.W0.E0(7);
        int i24 = this.f51377a0;
        if (i24 == 3 || i24 == 4 || i24 == 6) {
            z12 = true;
        } else {
            com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.ec.D().f23689p;
            if (((CountDownLatch) b0Var.f6487c) == null) {
                z12 = true;
                b0Var.f6487c = new CountDownLatch(1);
            } else {
                z12 = true;
            }
            ch.f0.f5355g = z12;
        }
        B(z12, false, z12);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.K.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            this.K.add(ch.p0.b(str));
        }
        p01 p01Var = this.f51398i0;
        if (p01Var != null) {
            for (int i10 = 0; i10 < p01Var.getChildCount(); i10++) {
                if (p01Var.getChildAt(i10) instanceof b11) {
                    b11 b11Var = (b11) p01Var.getChildAt(i10);
                    b11Var.d(this.K.contains(b11Var.f45721y), true);
                }
            }
            p01Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(q11 q11Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(b11 b11Var, ch.p0 p0Var) {
    }
}
