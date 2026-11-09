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
public abstract class s11 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.b6 {
    public static String[] f49659b2;
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
    public x01 G;
    public final ArrayList G0;
    public boolean G1;
    public q11 H;
    public final ArrayList H0;
    public boolean H1;
    public boolean I;
    public final ArrayList I0;
    public ValueAnimator I1;
    public HashSet J;
    public ArrayList J0;
    public wz0 J1;
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
    public c11 O;
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
    public c11 S0;
    public final wz0 S1;
    public boolean T;
    public boolean T0;
    public final wz0 T1;
    public t01 U;
    public float U0;
    public Runnable U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.i5 W0;
    public ValueAnimator W1;
    public i01 X0;
    public final h2.f X1;
    public final Integer Y0;
    public final Paint Y1;
    public final org.telegram.ui.ActionBar.g6 Z0;
    public Integer Z1;
    public int f49661a;
    public final n01 f49662a0;
    public float f49663a1;
    public int f49664b;
    public final fi.p5 f49665b0;
    public float f49666b1;
    public int f49667c;
    public final org.telegram.ui.Components.bv[] f49668c0;
    public final org.telegram.ui.ActionBar.f2 f49669c1;
    public int d;
    public org.telegram.ui.Components.bv f49670d0;
    public final int f49671d1;
    public int f49672e;
    public final l01 f49673e0;
    public final r01 f49674e1;
    public int f49675f;
    public final k01 f49676f0;
    public int f49677f1;
    public final uq0 f49678g0;
    public boolean f49679g1;
    public int h;
    public final q01 f49680h0;
    public boolean f49681h1;
    public final g01 f49682i0;
    public ValueAnimator f49683i1;
    public final FrameLayout f49684j0;
    public Drawable f49685j1;
    public final bi.x5 f49686k0;
    public PorterDuffColorFilter f49687k1;
    public final org.telegram.ui.Components.l9 f49688l0;
    public final boolean l1;
    public final View m0;
    public float f49689m1;
    public int f49690n;
    public final org.telegram.ui.Components.tm f49691n0;
    public int n1;
    public final View f49692o0;
    public org.telegram.ui.Components.g5 f49693o1;
    public final s01 f49694p0;
    public Rect f49695p1;
    public final d11 f49696q0;
    public View f49697q1;
    public int f49698r;
    public final h01 f49699r0;
    public float f49700r1;
    public int f49701s;
    public final org.telegram.ui.Components.si0 f49702s0;
    public c11 f49703s1;
    public final View f49704t0;
    public Rect f49705t1;
    public int f49706u0;
    public final OvershootInterpolator f49707u1;
    public final ArrayList f49708v0;
    public ValueAnimator f49709v1;
    public int f49710w;
    public final SparseIntArray f49711w0;
    public boolean f49712w1;
    public int f49713x;
    public final SparseIntArray f49714x0;
    public boolean f49715x1;
    public int f49716y;
    public final SparseIntArray f49717y0;
    public boolean f49718y1;
    public final SparseIntArray f49719z0;
    public boolean f49720z1;
    public static final List f49658a2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f49660c2 = new boolean[4];
    public static final HashMap d2 = new HashMap();

    public s11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        this(f2Var, context, z9, num, i7, true, g6Var, 16);
    }

    public static void D(int i7, org.telegram.ui.Components.l9 l9Var) {
        List list;
        org.telegram.messenger.hc b10;
        String str;
        if (l9Var != null) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(i7).f25840s0[1]);
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i10 = 0;
            while (true) {
                int size = arrayList.size();
                list = f49658a2;
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
                org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.l6.f28030m6, 0.2f, false);
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b10 = org.telegram.messenger.hc.b(document);
                    if (d != null) {
                        d.f25382e = 512;
                        d.f25383f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && org.telegram.messenger.ij.K2(document, false)) {
                        d.f25382e = 512;
                        d.f25383f = 512;
                    }
                    b10 = org.telegram.messenger.hc.b(document);
                    str = "36_36";
                }
                l9Var.setLayerNum(7);
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                l9Var.m(b10, str, org.telegram.messenger.hc.c(w10, document), "36_36", d, document);
            }
        }
    }

    public static void a(s11 s11Var, int i7, int i10) {
        int i11;
        org.telegram.ui.Components.si0 si0Var = s11Var.f49702s0;
        h01 h01Var = s11Var.f49699r0;
        View m10 = h01Var.m(i7);
        int L0 = h01Var.L0();
        if ((m10 == null && Math.abs(i7 - L0) > 72.0f) || !org.telegram.messenger.iz.c()) {
            if (h01Var.L0() < i7) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            si0Var.f38080b = i11;
            si0Var.d(i7, i10, false, false);
            return;
        }
        fi.j1 j1Var = new fi.j1(4, s11Var.f49680h0.getContext(), s11Var);
        j1Var.f57225a = i7;
        j1Var.f20111p = i10;
        h01Var.w0(j1Var);
    }

    public static boolean c(s11 s11Var) {
        if (!s11Var.T) {
            ValueAnimator valueAnimator = s11Var.V1;
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
                return org.telegram.ui.Components.i5.f();
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
        if (this.f49685j1 == null) {
            int i7 = this.W;
            if (i7 != 5 && i7 != 9 && i7 != 10 && i7 != 7) {
                this.f49685j1 = jg.g.h(org.telegram.messenger.t0.f25566b, 2131232362);
            } else {
                this.f49685j1 = jg.g.h(org.telegram.messenger.t0.f25566b, 2131232133);
            }
            this.f49685j1.setColorFilter(this.f49687k1);
        }
        return this.f49685j1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
            if (document == null || hashSet.contains(Long.valueOf(document.f26962id))) {
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
            if (document.f26962id == j3) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.i5 i5Var) {
        org.telegram.ui.Components.i5 i5Var2;
        if (this.I && (i5Var2 = this.W0) != i5Var) {
            if (i5Var2 != null) {
                i5Var2.n(this);
            }
            this.W0 = i5Var;
            if (i5Var != null) {
                i5Var.setColorFilter(this.f49687k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i7) {
        boolean[] zArr = f49660c2;
        if (!zArr[i7]) {
            org.telegram.messenger.ui.b0(i7);
            zArr[i7] = true;
            org.telegram.messenger.ui.b0(i7).B(5);
            org.telegram.messenger.ui.b0(i7).L(0, true);
            org.telegram.messenger.ui.b0(i7).A();
            org.telegram.messenger.ui.b0(i7).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            org.telegram.messenger.ui.b0(i7).P();
            org.telegram.messenger.ui.b0(i7).v();
            org.telegram.ui.Components.av0.E3.c(i7, 1, new di.f(i7, 1));
        }
    }

    public final void A(Long l10) {
        this.K.remove(l10);
        q01 q01Var = this.f49680h0;
        if (q01Var != null) {
            int i7 = 0;
            boolean z9 = false;
            for (int i10 = 0; i10 < q01Var.getChildCount(); i10++) {
                if (q01Var.getChildAt(i10) instanceof c11) {
                    c11 c11Var = (c11) q01Var.getChildAt(i10);
                    org.telegram.ui.Components.r5 r5Var = c11Var.f44191e;
                    if (r5Var != null && r5Var.getDocumentId() == l10.longValue()) {
                        c11Var.f();
                    } else {
                        TLRPC.Document document = c11Var.d;
                        if (document != null && document.f26962id == l10.longValue()) {
                            c11Var.f();
                        }
                    }
                    z9 = true;
                }
            }
            q01Var.invalidate();
            if (!z9) {
                while (true) {
                    ArrayList arrayList = this.f49708v0;
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
                s01 s01Var = this.f49694p0;
                if (s01Var != null) {
                    s01Var.g(i7);
                }
            }
        }
    }

    public final void B(boolean r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s11.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        k01 k01Var = this.f49676f0;
        if (k01Var == null) {
            return;
        }
        if (this.f49720z1) {
            k01Var.clearAnimation();
            k01Var.setVisibility(0);
            k01Var.animate().translationY(0.0f).start();
            return;
        }
        q01 q01Var = this.f49680h0;
        if (q01Var.getChildCount() > 0) {
            View childAt = q01Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f49661a && "searchbox".equals(childAt.getTag())) {
                k01Var.setVisibility(0);
                k01Var.setTranslationY(childAt.getY());
                return;
            }
            k01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
            return;
        }
        k01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
    }

    public final void E(float f10) {
        int i7;
        int i10 = -1;
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.xq.f40459g.getInterpolation(c8.j9.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i7 = -1;
            } else {
                i7 = 1;
            }
            view.setScaleY(interpolation * i7);
        }
        org.telegram.ui.Components.tm tmVar = this.f49691n0;
        if (tmVar != null) {
            float a10 = c8.j9.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            tmVar.setAlpha(a10);
            tmVar.setScaleX(a10);
            if (!n()) {
                i10 = 1;
            }
            tmVar.setScaleY(a10 * i10);
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a11 = c8.j9.a(f12 / 700.0f, 0.0f, 1.0f);
        float a12 = c8.j9.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = c8.j9.a(f12 / 750.0f, 0.0f, 1.0f);
        float a14 = c8.j9.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        float interpolation2 = xqVar.getInterpolation(a11);
        float interpolation3 = xqVar.getInterpolation(a12);
        this.f49665b0.setAlpha(a14);
        this.f49676f0.setAlpha(a14);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f49670d0.f40097b.getChildCount(); i12++) {
            this.f49670d0.f40097b.getChildAt(i12).setAlpha(a14);
        }
        if (this.f49693o1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a14;
        n01 n01Var = this.f49662a0;
        n01Var.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        if (tmVar != null) {
            tmVar.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        }
        this.f49663a1 = (interpolation2 * 0.85f) + 0.15f;
        this.f49666b1 = (interpolation3 * 0.925f) + 0.075f;
        n01Var.invalidateOutline();
        if (tmVar != null) {
            tmVar.setAlpha(a14);
        }
        l01 l01Var = this.f49673e0;
        l01Var.setAlpha(a14);
        l01Var.setScaleX(Math.min(this.f49663a1, 1.0f));
        float pivotX = l01Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(n01Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(n01Var.getHeight(), 2.0d) + Math.pow(n01Var.getWidth() - pivotX, 2.0d)));
        for (int i13 = 0; i13 < this.f49670d0.f40097b.getChildCount(); i13++) {
            View childAt = this.f49670d0.f40097b.getChildAt(i13);
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
            q01 q01Var = this.f49680h0;
            if (i11 < q01Var.getChildCount()) {
                View childAt2 = q01Var.getChildAt(i11);
                if (childAt2 instanceof c11) {
                    c11 c11Var = (c11) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float s9 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(s9)) {
                        s9 = 0.0f;
                    }
                    c11Var.setAnimatedScale(s9);
                }
                i11++;
            } else {
                this.f49686k0.invalidate();
                q01Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25104x0;
        wz0 wz0Var = this.T1;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                org.telegram.messenger.g0.r(wz0Var);
                org.telegram.messenger.g0.h3(wz0Var);
            }
        } else if (i7 == org.telegram.messenger.qs.A0) {
            org.telegram.messenger.g0.r(wz0Var);
            org.telegram.messenger.g0.h3(wz0Var);
        } else if (i7 == org.telegram.messenger.qs.C1) {
            org.telegram.messenger.g0.r(wz0Var);
            org.telegram.messenger.g0.h3(wz0Var);
        } else if (i7 == org.telegram.messenger.qs.B0) {
            org.telegram.messenger.g0.r(wz0Var);
            org.telegram.messenger.g0.h3(wz0Var);
        } else if (i7 == org.telegram.messenger.qs.f25018i4) {
            pg.c cVar = new pg.c(0);
            q01 q01Var = this.f49680h0;
            org.telegram.messenger.g0.d0(q01Var, cVar);
            if (q01Var != null) {
                q01Var.invalidate();
            }
        } else if (i7 == org.telegram.messenger.qs.G3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.p10.i(this.V).e()) {
            org.telegram.messenger.g0.r(wz0Var);
            org.telegram.messenger.g0.h3(wz0Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i7;
        float f10;
        float measuredHeight;
        org.telegram.ui.Components.g5 g5Var = this.f49693o1;
        if (g5Var != null && (num = this.Y0) != null) {
            Rect bounds = g5Var.getBounds();
            View view = this.f49697q1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f49693o1.getAlpha();
            View view2 = this.f49697q1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f49693o1.f33870w = (int) (Math.pow(this.f49662a0.getAlpha(), 0.25d) * alpha * this.f49689m1);
            if (this.f49695p1 == null) {
                this.f49695p1 = new Rect();
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
            int i10 = this.f49671d1;
            if (!n10) {
                measuredHeight = org.telegram.messenger.g0.L(i10);
            } else {
                measuredHeight = getMeasuredHeight() - (org.telegram.messenger.g0.L(i10) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z9 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f49695p1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.g5 g5Var2 = this.f49693o1;
            Rect rect = this.f49695p1;
            int i11 = rect.left;
            Rect rect2 = this.f49695p1;
            g5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f49695p1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f49693o1.draw(canvas);
            org.telegram.ui.Components.g5 g5Var3 = this.f49693o1;
            g5Var3.f33870w = alpha;
            g5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        c11 c11Var = this.f49703s1;
        if (c11Var != null && this.f49705t1 != null && c11Var.E != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f49703s1.E.setAlpha((int) (this.f49700r1 * 255.0f));
            this.f49703s1.E.setBounds(this.f49705t1);
            this.f49703s1.E.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.f49689m1, this.f49677f1, this.n1), PorterDuff.Mode.SRC_IN));
            this.f49703s1.E.draw(canvas);
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
            view = this.f49682i0;
        } else {
            view = this.f49680h0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f49712w1) {
            this.f49712w1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f49692o0.animate();
            if (canScrollVertically) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.camera.q.k(animate, f10, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s11.i(int, android.view.View):void");
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

    public final void o(android.view.View r14, org.telegram.ui.Components.r5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s11.o(android.view.View, org.telegram.ui.Components.r5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        int i7 = this.V;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.A0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25104x0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.C1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.B0);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
        int i10 = this.W;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.G3);
        }
        org.telegram.ui.Components.g5 g5Var = this.f49693o1;
        if (g5Var != null) {
            g5Var.f33867n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.I = false;
        int i7 = this.V;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.A0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25104x0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.C1);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.B0);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
        int i10 = this.W;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.G3);
        }
        org.telegram.ui.Components.g5 g5Var = this.f49693o1;
        if (g5Var != null) {
            g5Var.f33867n = null;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (z9 && this.W == 6) {
            this.f49699r0.y1((getMeasuredWidth() / org.telegram.messenger.g0.L(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9 = this.Q0;
        int i11 = this.W;
        if (z9 && i11 != 3 && i11 != 4) {
            Point point = org.telegram.messenger.g0.f22563q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f), Integer.MIN_VALUE));
        } else if (i11 == 6) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.f22563q.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(i11 i11Var) {
        Integer num = this.Z1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) d2.get(num);
        }
        this.U1 = i11Var;
        boolean z9 = this.Q0;
        q01 q01Var = this.f49680h0;
        if (!z9) {
            h();
            for (int i7 = 0; i7 < q01Var.getChildCount(); i7++) {
                View childAt = q01Var.getChildAt(i7);
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
            ofFloat.addUpdateListener(new vz0(this, 0));
            this.V1.addListener(new f30(this, 27));
            wz0 wz0Var = new wz0(this, 0);
            ch.e0.f6233f = true;
            ch.e0.f6232e = true;
            ch.e0.f6234g = false;
            if (ch.e0.d) {
                ch.e0.d = false;
            }
            ch.e0.f6231c = wz0Var;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25021j1, 512);
            this.X1.d();
            this.V1.setDuration(800L);
            q01Var.setLayerType(2, null);
            this.f49676f0.setLayerType(2, null);
            this.f49673e0.setLayerType(2, null);
            this.f49665b0.setLayerType(2, null);
            org.telegram.ui.Components.tm tmVar = this.f49691n0;
            if (tmVar != null) {
                tmVar.setLayerType(2, null);
            }
            View view = this.m0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f49670d0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z9) {
        this.P = z9;
    }

    public void setBackgroundDelegate(t01 t01Var) {
        this.U = t01Var;
    }

    public void setDrawBackground(boolean z9) {
        this.Q0 = z9;
        this.f49662a0.setClipToOutline(z9);
        fi.p5 p5Var = this.f49665b0;
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
                org.telegram.messenger.g0.d0(this.f49680h0, new di.e(24));
                for (int i7 = 0; i7 < this.f49670d0.f40097b.getChildCount(); i7++) {
                    View childAt = this.f49670d0.f40097b.getChildAt(i7);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f49670d0.f40097b.invalidate();
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
        c11 c11Var = this.O;
        if (c11Var != null) {
            c11Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z9) {
        this.f49681h1 = z9;
    }

    public void setOnLongPressedListener(q11 q11Var) {
        this.H = q11Var;
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
        q01 q01Var = this.f49680h0;
        if (q01Var != null) {
            for (int i7 = 0; i7 < q01Var.getChildCount(); i7++) {
                if (q01Var.getChildAt(i7) instanceof c11) {
                    c11 c11Var = (c11) q01Var.getChildAt(i7);
                    org.telegram.ui.Components.r5 r5Var = c11Var.f44191e;
                    if (r5Var != null) {
                        c11Var.d(hashSet.contains(Long.valueOf(r5Var.getDocumentId())), true);
                    } else {
                        c11Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            q01Var.invalidate();
        }
    }

    public void setSelectedReaction(ch.o0 o0Var) {
        this.J.clear();
        this.J.add(o0Var);
        q01 q01Var = this.f49680h0;
        if (q01Var != null) {
            for (int i7 = 0; i7 < q01Var.getChildCount(); i7++) {
                if (q01Var.getChildAt(i7) instanceof c11) {
                    c11 c11Var = (c11) q01Var.getChildAt(i7);
                    c11Var.d(this.J.contains(c11Var.f44198y), true);
                }
            }
            q01Var.invalidate();
        }
        g01 g01Var = this.f49682i0;
        if (g01Var != null) {
            for (int i10 = 0; i10 < g01Var.getChildCount(); i10++) {
                if (g01Var.getChildAt(i10) instanceof c11) {
                    c11 c11Var2 = (c11) g01Var.getChildAt(i10);
                    c11Var2.d(this.J.contains(c11Var2.f44198y), true);
                }
            }
            g01Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ch.o0> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != null && ((ch.o0) arrayList.get(i7)).f6355g != 0) {
                hashSet2.add(Long.valueOf(((ch.o0) arrayList.get(i7)).f6355g));
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
            if (!this.l1 || (w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28200v6, this.Z0)) == this.f49677f1) {
                return;
            }
            this.f49677f1 = w02;
            this.M.setColor(i0.a.o(w02, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f49677f1, PorterDuff.Mode.SRC_IN);
            this.f49687k1 = porterDuffColorFilter;
            org.telegram.ui.Components.i5 i5Var = this.W0;
            if (i5Var != null) {
                i5Var.setColorFilter(porterDuffColorFilter);
            }
            q01 q01Var = this.f49680h0;
            if (q01Var != null) {
                q01Var.invalidate();
            }
            g01 g01Var = this.f49682i0;
            if (g01Var != null) {
                g01Var.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v(String str, boolean z9, boolean z10) {
        long j3;
        wz0 wz0Var = this.J1;
        if (wz0Var != null) {
            org.telegram.messenger.g0.r(wz0Var);
            this.J1 = null;
        }
        di.a6 a6Var = this.K1;
        if (a6Var != null) {
            org.telegram.messenger.g0.r(a6Var);
            this.K1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        d11 d11Var = this.f49696q0;
        k01 k01Var = this.f49676f0;
        if (isEmpty) {
            this.f49718y1 = false;
            this.f49720z1 = false;
            z(false, z9);
            if (k01Var != null) {
                k01Var.d(true);
                k01.a(k01Var, false);
            }
            d11Var.E(true);
            this.A1 = null;
        } else {
            boolean z11 = this.f49718y1;
            boolean z12 = !z11;
            this.f49718y1 = true;
            this.f49720z1 = false;
            if (k01Var != null) {
                k01Var.f47148f.b(2);
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
                d11Var.E(false);
            } else if (!str.equals(this.A1)) {
                wz0 wz0Var2 = new wz0(this, 1);
                this.J1 = wz0Var2;
                org.telegram.messenger.g0.i3(wz0Var2, 120L);
            }
            this.A1 = str;
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(G0, f49659b2)) {
                org.telegram.messenger.ui.b0(this.V).M(G0, false);
            }
            f49659b2 = G0;
            di.a6 a6Var2 = new di.a6(this, str, z9, z12, G0, 3);
            this.K1 = a6Var2;
            if (z10) {
                j3 = 425;
            } else {
                j3 = 0;
            }
            org.telegram.messenger.g0.i3(a6Var2, j3);
            if (k01Var != null) {
                k01Var.f47148f.b(2);
                k01.a(k01Var, z9);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f49683i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49683i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f49704t0.getAlpha(), f10 * 0.25f);
        this.f49683i1 = ofFloat;
        ofFloat.addUpdateListener(new vz0(this, 2));
        this.f49683i1.setDuration(200L);
        this.f49683i1.setInterpolator(org.telegram.ui.Components.xq.f40458f);
        this.f49683i1.start();
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
        q01 q01Var = this.f49680h0;
        if (q01Var != null) {
            for (int i7 = 0; i7 < q01Var.getChildCount(); i7++) {
                if (q01Var.getChildAt(i7) instanceof c11) {
                    c11 c11Var = (c11) q01Var.getChildAt(i7);
                    org.telegram.ui.Components.r5 r5Var = c11Var.f44191e;
                    if (r5Var != null && r5Var.getDocumentId() == l10.longValue()) {
                        c11Var.e(z10, z9);
                    } else {
                        TLRPC.Document document = c11Var.d;
                        if (document != null && document.f26962id == l10.longValue()) {
                            c11Var.e(z10, z9);
                        }
                    }
                }
            }
            q01Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.g5 g5Var, View view) {
        int i7;
        Integer num;
        if (g5Var != null && (num = g5Var.F) != null) {
            i7 = num.intValue();
        } else {
            i7 = 0;
        }
        this.n1 = i7;
        this.f49693o1 = g5Var;
        this.f49697q1 = view;
        if (this.I && g5Var != null) {
            g5Var.f33867n = this;
        }
        invalidate();
    }

    public final void z(boolean z9, boolean z10) {
        float f10;
        if (this.G1 == z9) {
            return;
        }
        this.G1 = z9;
        q01 q01Var = this.f49680h0;
        q01Var.setVisibility(0);
        g01 g01Var = this.f49682i0;
        g01Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new zz0(this, z9, 0));
        this.F1.addListener(new m01(this, z9, 0));
        this.F1.setDuration(320L);
        this.F1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.F1.start();
        ViewPropertyAnimator animate = ((View) q01Var.getParent()).animate();
        if (this.G1 && z10) {
            f10 = -org.telegram.messenger.g0.L(36.0f);
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.camera.q.l(animate.translationY(f10).setUpdateListener(new vz0(this, 1)), org.telegram.ui.Components.xq.f40458f, 160L);
        if (this.G1 && z10) {
            g01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        } else {
            g01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        }
        h();
    }

    public s11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this(f2Var, context, z9, num, i7, z10, g6Var, i10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28200v6, g6Var));
    }

    public s11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11) {
        super(context);
        int i12;
        int i13;
        float f10;
        boolean z11;
        Integer num2;
        boolean z12;
        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
        int i14 = i7;
        int i15 = i11;
        this.J = new HashSet();
        this.K = new HashSet();
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.S = new ArrayList();
        this.V = org.telegram.messenger.p10.f24470s0;
        this.f49668c0 = new org.telegram.ui.Components.bv[2];
        this.f49708v0 = new ArrayList();
        this.f49711w0 = new SparseIntArray();
        this.f49714x0 = new SparseIntArray();
        this.f49717y0 = new SparseIntArray();
        this.f49719z0 = new SparseIntArray();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = false;
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = new ArrayList();
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = false;
        this.O0 = false;
        this.Q0 = true;
        this.V0 = new ImageReceiver(null);
        this.f49681h1 = true;
        this.f49689m1 = 1.0f;
        this.f49700r1 = 1.0f;
        this.f49707u1 = new OvershootInterpolator(2.0f);
        this.f49712w1 = false;
        this.f49715x1 = false;
        this.f49718y1 = false;
        this.f49720z1 = false;
        this.G1 = false;
        this.H1 = false;
        this.L1 = false;
        this.M1 = false;
        this.O1 = -1;
        this.P1 = -1;
        this.Q1 = -1L;
        this.S1 = new wz0(this, 3);
        this.T1 = new wz0(this, 4);
        this.X1 = new h2.f((int[]) null);
        this.Y1 = new Paint();
        this.Z0 = g6Var;
        this.W = i14;
        this.N0 = z9;
        this.f49669c1 = f2Var2;
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.O0 = e12.getInt(sb2.toString(), 0) < 3;
        this.f49677f1 = i15;
        this.l1 = i15 == org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28200v6, g6Var);
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27957i6, g6Var));
        paint2.setColor(i0.a.o(i15, 30));
        this.f49687k1 = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
        this.Y0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(c8.j9.b(num.intValue(), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(292.0f)));
        boolean z13 = valueOf != null && valueOf.intValue() > org.telegram.messenger.g0.L(170.0f);
        setFocusableInTouchMode(true);
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 7) {
            this.f49671d1 = i10;
            setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            setOnTouchListener(new d0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.m0 = view;
            Drawable mutate = getResources().getDrawable(2131232724).mutate();
            org.telegram.ui.ActionBar.s6.x(this, mutate, org.telegram.ui.ActionBar.l6.G8, g6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, c8.ha.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / org.telegram.messenger.g0.f22562p) + (z13 ? -12 : 4), n() ? 0 : this.f49671d1, 0.0f, n() ? this.f49671d1 : 0));
        }
        fi.p5 p5Var = new fi.p5(this, context, g6Var, 15);
        this.f49665b0 = p5Var;
        boolean z14 = i14 == 3 || i14 == 4;
        Integer num3 = valueOf;
        n01 n01Var = new n01(this, context, z14, z14, g6Var, num3);
        Integer num4 = num3;
        org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
        this.f49662a0 = n01Var;
        if (!z14) {
            n01Var.setOutlineProvider(new o01(this, num4));
            n01Var.setClipToOutline(true);
            if (z14) {
                n01Var.setElevation(2.0f);
            }
        }
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 15) {
            n01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        n01Var.addView(p5Var, c8.ha.c(-1.0f, -1));
        addView(n01Var, c8.ha.d(-1, -1.0f, 119, 0.0f, (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 2 || i14 == 7) ? this.f49671d1 + 6 : 0.0f, 0.0f, n() ? this.f49671d1 + 6 : 0.0f));
        if (num4 != null) {
            org.telegram.ui.Components.tm tmVar = new org.telegram.ui.Components.tm(context, 23);
            this.f49691n0 = tmVar;
            i13 = 14;
            Drawable drawable = getResources().getDrawable(2131232725);
            org.telegram.ui.ActionBar.s6.x(this, drawable, org.telegram.ui.ActionBar.l6.G8, g6Var2, PorterDuff.Mode.MULTIPLY);
            tmVar.setBackground(drawable);
            i12 = 3;
            addView(tmVar, c8.ha.d(17, 9.0f, (n() ? 80 : 48) | 3, (num4.intValue() / org.telegram.messenger.g0.f22562p) + (z13 ? -25 : 10), n() ? 0.0f : this.f49671d1 + 5, 0.0f, n() ? this.f49671d1 + 14 : 0.0f));
        } else {
            i12 = 3;
            i13 = 14;
        }
        boolean z15 = (f2Var2 == null || i14 == i12 || i14 == 6 || i14 == 5 || i14 == 7 || i14 == 4 || i14 == 9 || i14 == 10 || !z10) ? false : true;
        int i16 = 0;
        while (true) {
            if (i16 >= 2) {
                break;
            }
            Integer num5 = num4;
            if (i14 != 4) {
                num2 = num5;
                z12 = true;
            } else {
                num2 = num5;
                z12 = false;
            }
            boolean z16 = i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10;
            Integer num6 = num2;
            ax0 ax0Var = z15 ? new ax0(8, this, f2Var2) : null;
            int i17 = i16;
            org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
            int i18 = i14;
            int i19 = i13;
            p01 p01Var = new p01(this, context, g6Var3, z12, z16, i18, ax0Var, i15, i7);
            org.telegram.ui.Components.xu xuVar = p01Var.D;
            if (xuVar != null) {
                xuVar.setOnLongClickListener(new t(this, 7));
            }
            p01Var.U = false;
            if (i18 == 4) {
                p01Var.setAnimatedEmojiCacheType(13);
            } else {
                p01Var.setAnimatedEmojiCacheType((i18 == 0 || i18 == 12 || i18 == 2) ? 6 : 5);
            }
            p01Var.O = num6 == null;
            p01Var.setPaddingLeft(i18 == 6 ? 10.0f : 5.0f);
            if (i18 != i19 && i18 != 8 && i18 != 13) {
                this.f49662a0.addView(p01Var, c8.ha.c(36.0f, -1));
            }
            this.f49668c0[i17] = p01Var;
            i15 = i11;
            i14 = i18;
            i13 = i19;
            f2Var2 = f2Var;
            g6Var2 = g6Var3;
            i16 = i17 + 1;
            num4 = num6;
        }
        Integer num7 = num4;
        org.telegram.ui.ActionBar.g6 g6Var4 = g6Var2;
        int i20 = i14;
        int i21 = i13;
        org.telegram.ui.Components.bv[] bvVarArr = this.f49668c0;
        this.f49670d0 = bvVarArr[0];
        bvVarArr[1].setVisibility(8);
        l01 l01Var = new l01(context, num7, 1);
        this.f49673e0 = l01Var;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27866d7, l01Var, g6Var4);
        if (i20 == i21 || i20 == 8 || i20 == 13) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            this.f49662a0.addView(l01Var, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.f22562p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        org.telegram.messenger.g0.Z3(l01Var, true, f10, true, false);
        q01 q01Var = new q01(this, context, i20);
        this.f49680h0 = q01Var;
        ?? kVar = new v4.k();
        this.f49674e1 = kVar;
        kVar.f57128c = 220L;
        kVar.f57129e = 260L;
        kVar.f57130f = 160L;
        kVar.f57131g = 160L;
        kVar.f57083m = false;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        kVar.f57132i = xqVar;
        kVar.C = false;
        q01Var.setItemAnimator(kVar);
        float f11 = f10;
        q01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        s01 s01Var = new s01(this);
        this.f49694p0 = s01Var;
        q01Var.setAdapter(s01Var);
        h01 h01Var = new h01(this, 1);
        this.f49699r0 = h01Var;
        q01Var.setLayoutManager(h01Var);
        h01Var.O = new f01(this, 0);
        uq0 uq0Var = new uq0(context, 5);
        this.f49678g0 = uq0Var;
        bi.x5 x5Var = new bi.x5(this, context);
        this.f49686k0 = x5Var;
        x5Var.addView(q01Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        uq0Var.addView(x5Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        g01 g01Var = new g01(this, context);
        this.f49682i0 = g01Var;
        if (g01Var.getItemAnimator() != null) {
            g01Var.getItemAnimator().n(180L);
            g01Var.getItemAnimator().f57132i = xqVar;
        }
        TextView textView = new TextView(context);
        if (i20 == 4) {
            textView.setText(org.telegram.messenger.id.M0(2131748212, null));
        } else if (i20 == 0 || i20 == 13 || i20 == 12 || i20 == 11 || i20 == 9 || i20 == 10) {
            textView.setText(org.telegram.messenger.id.M0(2131748213, null));
        } else if (i20 == 1 || i20 == 2) {
            textView.setText(org.telegram.messenger.id.M0(2131748174, null));
        } else if (i20 == 14) {
            textView.setText(org.telegram.messenger.id.M0(2131748214, null));
        } else {
            textView.setText(org.telegram.messenger.id.M0(2131748203, null));
        }
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Af, g6Var4);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f49688l0 = l9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49684j0 = frameLayout;
        frameLayout.addView(l9Var, c8.ha.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        uq0Var.addView(frameLayout, c8.ha.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        g01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        d11 d11Var = new d11(this);
        this.f49696q0 = d11Var;
        g01Var.setAdapter(d11Var);
        h01 h01Var2 = new h01(this, 0);
        g01Var.setLayoutManager(h01Var2);
        h01Var2.O = new f01(this, 1);
        g01Var.setVisibility(8);
        uq0Var.addView(g01Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f49662a0.addView(uq0Var, c8.ha.d(-1, -1.0f, 48, 0.0f, (i20 == 8 || i20 == 13 || i20 == 14) ? 0.0f : (f11 / org.telegram.messenger.g0.f22562p) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(q01Var, h01Var);
        this.f49702s0 = si0Var;
        si0Var.f38085i = new ai.m(this, 2);
        si0Var.h = new xz0(this);
        j01 j01Var = new j01(this, i20, context, g6Var4, num);
        q01Var.p1(j01Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        g01Var.p1(j01Var, ViewConfiguration.getLongPressTimeout() * 0.25f);
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(this, i20, 2);
        q01Var.setOnItemClickListener(zk0Var);
        g01Var.setOnItemClickListener(zk0Var);
        k01 k01Var = new k01(this, context, z10);
        this.f49676f0 = k01Var;
        k01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        k01Var.setVisibility(4);
        uq0Var.addView(k01Var, c8.ha.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        l01 l01Var2 = new l01(context, num7, 0);
        Drawable drawable2 = getResources().getDrawable(2131231228);
        int i22 = org.telegram.ui.ActionBar.l6.G8;
        org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.8f, i22);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.s6.k(l01Var2, drawable2, K.f28350a, -1, 2, K.d, g6Var, mode);
        l01Var2.setBackground(drawable2);
        l01Var2.setAlpha(0.0f);
        this.f49662a0.addView(l01Var2, c8.ha.d(-1, 20.0f, 55, 0.0f, (f11 / org.telegram.messenger.g0.f22562p) + 36.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f49692o0 = view2;
        Drawable drawable3 = getResources().getDrawable(2131231225);
        org.telegram.ui.ActionBar.s6.x(this, drawable3, i22, g6Var, mode);
        if (i7 == 14) {
            view2.setBackground(drawable3);
        }
        view2.setAlpha(0.0f);
        this.f49662a0.addView(view2, c8.ha.e(-1, 20, 87));
        View view3 = new View(context);
        this.f49704t0 = view3;
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(-16777216);
        this.f49662a0.addView(view3, c8.ha.c(-1.0f, -1));
        int i23 = this.V;
        org.telegram.messenger.ui.b0(i23);
        org.telegram.messenger.ui.b0(i23).B(5);
        if (i7 == 14) {
            org.telegram.messenger.qp.s1(this.V).E0();
        } else if (i7 == 1 || i7 == 11 || i7 == 2 || i7 == 6 || i7 == 13) {
            org.telegram.messenger.ui.b0(i23).A();
        } else if (i7 == 9 || i7 == 10) {
            if (org.telegram.messenger.qp.s1(i23).f24774e7.getBoolean("resetemojipacks", true)) {
                org.telegram.messenger.ui.b0(i23).a1(5, false, false);
                org.telegram.messenger.qp.s1(i23).f24774e7.edit().putBoolean("resetemojipacks", false).commit();
            }
            org.telegram.messenger.ui.b0(i23).L(2, false);
            org.telegram.messenger.ui.b0(i23).Y0();
            org.telegram.messenger.ui.b0(i23).m0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
        } else if (i7 == 0 || i7 == 12) {
            org.telegram.messenger.ui.b0(i23).L(0, true);
            org.telegram.messenger.ui.b0(i23).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i7 == 3) {
            org.telegram.messenger.ui.b0(i23).v();
        } else if (i7 == 4) {
            org.telegram.messenger.ui.b0(i23).V0(0, false, true, false);
            org.telegram.messenger.ui.b0(i23).B(0);
        }
        this.V0.E0(7);
        int i24 = this.W;
        if (i24 == 3 || i24 == 4 || i24 == 6) {
            z11 = true;
        } else {
            com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.gc.D().f22648p;
            if (((CountDownLatch) b0Var.f6813c) == null) {
                z11 = true;
                b0Var.f6813c = new CountDownLatch(1);
            } else {
                z11 = true;
            }
            ch.e0.f6234g = z11;
        }
        B(z11, false, z11);
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
        q01 q01Var = this.f49680h0;
        if (q01Var != null) {
            for (int i10 = 0; i10 < q01Var.getChildCount(); i10++) {
                if (q01Var.getChildAt(i10) instanceof c11) {
                    c11 c11Var = (c11) q01Var.getChildAt(i10);
                    c11Var.d(this.J.contains(c11Var.f44198y), true);
                }
            }
            q01Var.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(r11 r11Var) {
    }

    @Override
    public void setPressed(boolean z9) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(c11 c11Var, ch.o0 o0Var) {
    }
}
