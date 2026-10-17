package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public abstract class z51 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] a2;
    public final ArrayList A0;
    public ArrayList A1;
    public final ArrayList B0;
    public ArrayList B1;
    public boolean C0;
    public ArrayList C1;
    public final ArrayList D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ValueAnimator E1;
    public int F;
    public final ArrayList F0;
    public boolean F1;
    public d51 G;
    public final ArrayList G0;
    public boolean G1;
    public x51 H;
    public final ArrayList H0;
    public ValueAnimator H1;
    public boolean I;
    public final ArrayList I0;
    public b41 I1;
    public HashSet J;
    public ArrayList J0;
    public ci.j6 J1;
    public final HashSet K;
    public final ArrayList K0;
    public boolean K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public View M1;
    public Drawable N;
    public final boolean N0;
    public int N1;
    public i51 O;
    public boolean O0;
    public int O1;
    public boolean P;
    public Integer P0;
    public long P1;
    public boolean Q;
    public boolean Q0;
    public ai.ce Q1;
    public boolean R;
    public List R0;
    public final b41 R1;
    public final ArrayList S;
    public i51 S0;
    public final b41 S1;
    public boolean T;
    public boolean T0;
    public Runnable T1;
    public z41 U;
    public float U0;
    public ValueAnimator U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.r5 W0;
    public final AnimationNotificationsLocker W1;
    public o41 X0;
    public final Paint X1;
    public final Integer Y0;
    public Integer Y1;
    public final org.telegram.ui.ActionBar.d6 Z0;
    public int f43578a;
    public final t41 f43579a0;
    public float f43580a1;
    public int f43581b;
    public final ei.g6 f43582b0;
    public float f43583b1;
    public int f43584c;
    public final org.telegram.ui.Components.kw[] f43585c0;
    public final org.telegram.ui.ActionBar.n2 f43586c1;
    public int d;
    public org.telegram.ui.Components.kw f43587d0;
    public final int f43588d1;
    public int e;
    public final r41 f43589e0;
    public final x41 f43590e1;
    public int f43591f;
    public final q41 f43592f0;
    public final int f43593f1;
    public final l41 f43594g0;
    public boolean f43595g1;
    public int h;
    public final w41 f43596h0;
    public boolean f43597h1;
    public final m41 f43598i0;
    public ValueAnimator f43599i1;
    public final FrameLayout f43600j0;
    public Drawable f43601j1;
    public final ah.v f43602k0;
    public final PorterDuffColorFilter f43603k1;
    public final org.telegram.ui.Components.w9 f43604l0;
    public float l1;
    public final View m0;
    public int f43605m1;
    public int f43606n;
    public final org.telegram.ui.Components.un f43607n0;
    public org.telegram.ui.Components.p5 f43608n1;
    public final View f43609o0;
    public Rect f43610o1;
    public final y41 f43611p0;
    public View f43612p1;
    public final j51 f43613q0;
    public float f43614q1;
    public int f43615r;
    public final n41 f43616r0;
    public i51 f43617r1;
    public int f43618s;
    public final org.telegram.ui.Components.ll0 f43619s0;
    public Rect f43620s1;
    public final View f43621t0;
    public final OvershootInterpolator f43622t1;
    public int f43623u0;
    public ValueAnimator f43624u1;
    public int v;
    public final ArrayList f43625v0;
    public boolean f43626v1;
    public int f43627w;
    public final SparseIntArray f43628w0;
    public boolean f43629w1;
    public int f43630x;
    public final SparseIntArray f43631x0;
    public boolean f43632x1;
    public int f43633y;
    public final SparseIntArray f43634y0;
    public boolean f43635y1;
    public final SparseIntArray f43636z0;
    public String f43637z1;
    public static final List Z1 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] f43576b2 = new boolean[4];
    public static final HashMap f43577c2 = new HashMap();

    public z51(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this(n2Var, context, z10, num, i10, true, d6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.w9 w9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (w9Var != null) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                list = Z1;
                if (i11 >= size) {
                    break;
                }
                if ((arrayList.get(i11) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i11)).documents != null) {
                    ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i11)).documents);
                    Collections.shuffle(arrayList2);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i12);
                        if (document2 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document2, null))) {
                            int i13 = round - 1;
                            if (round <= 0) {
                                round = i13;
                                document = document2;
                                break;
                            }
                            round = i13;
                            document = document2;
                        }
                        i12++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                }
                i11++;
            }
            if (document == null || round > 0) {
                ArrayList arrayList3 = new ArrayList(MediaDataController.getInstance(i10).getStickerSets(5));
                Collections.shuffle(arrayList3);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    if (arrayList3.get(i14) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i14)).documents != null) {
                        ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i14)).documents);
                        Collections.shuffle(arrayList4);
                        int i15 = 0;
                        while (true) {
                            if (i15 >= arrayList4.size()) {
                                break;
                            }
                            TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i15);
                            if (document3 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document3, null))) {
                                int i16 = round - 1;
                                if (round <= 0) {
                                    round = i16;
                                    document = document3;
                                    break;
                                }
                                round = i16;
                                document = document3;
                            }
                            i15++;
                        }
                    }
                    if (document != null && round <= 0) {
                        break;
                    }
                }
            }
            if (document != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f21149m6, 0.2f);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if ("video/webm".equals(document.mime_type)) {
                    forDocument = ImageLocation.getForDocument(document);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    str = "36_36_g";
                } else {
                    if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    forDocument = ImageLocation.getForDocument(document);
                    str = "36_36";
                }
                w9Var.setLayerNum(7);
                w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                w9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
            }
        }
    }

    public static void a(z51 z51Var, int i10, int i11) {
        int i12;
        org.telegram.ui.Components.ll0 ll0Var = z51Var.f43619s0;
        n41 n41Var = z51Var.f43616r0;
        View m10 = n41Var.m(i10);
        int L0 = n41Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            if (n41Var.L0() < i10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            ll0Var.f28257b = i12;
            ll0Var.c(i10, i11, false, false);
            return;
        }
        ei.l1 l1Var = new ei.l1(z51Var, z51Var.f43596h0.getContext(), 4);
        l1Var.f46079a = i10;
        l1Var.f16138p = i11;
        n41Var.w0(l1Var);
    }

    public static boolean c(z51 z51Var) {
        if (!z51Var.T) {
            ValueAnimator valueAnimator = z51Var.U1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i10 = 13;
        int i11 = this.W;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.r5.g();
            }
            if (i11 != 3 && i11 != 4) {
                i10 = 2;
                if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10 && i11 != 2) {
                    return 3;
                }
            }
        }
        return i10;
    }

    public Drawable getPremiumStar() {
        if (this.f43601j1 == null) {
            int i10 = this.W;
            if (i10 != 5 && i10 != 9 && i10 != 10 && i10 != 7) {
                this.f43601j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            } else {
                this.f43601j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            }
            this.f43601j1.setColorFilter(this.f43603k1);
        }
        return this.f43601j1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f20278id))) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        long j10;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String fixEmoji = Emoji.fixEmoji(str);
        int i10 = 0;
        while (true) {
            if (i10 < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i10).documents.isEmpty() && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i10).emoticon), fixEmoji)) {
                    j10 = tL_messages_stickerSet.packs.get(i10).documents.get(0).longValue();
                    break;
                }
                i10++;
            } else {
                j10 = 0;
                break;
            }
        }
        if (j10 == 0) {
            return null;
        }
        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
            if (document.f20278id == j10) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.r5 r5Var) {
        org.telegram.ui.Components.r5 r5Var2;
        if (this.I && (r5Var2 = this.W0) != r5Var) {
            if (r5Var2 != null) {
                r5Var2.o(this);
            }
            this.W0 = r5Var;
            if (r5Var != null) {
                r5Var.setColorFilter(this.f43603k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i10) {
        boolean[] zArr = f43576b2;
        if (!zArr[i10] && MediaDataController.getInstance(i10) != null) {
            zArr[i10] = true;
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i10).checkReactions();
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
            MediaDataController.getInstance(i10).checkDefaultTopicIcons();
            org.telegram.ui.Components.px0.f29443v3.fetch(i10, 1, new ci.g(i10, 1));
        }
    }

    public final void A(Long l4) {
        this.K.remove(l4);
        w41 w41Var = this.f43596h0;
        if (w41Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < w41Var.getChildCount(); i11++) {
                if (w41Var.getChildAt(i11) instanceof i51) {
                    i51 i51Var = (i51) w41Var.getChildAt(i11);
                    org.telegram.ui.Components.a6 a6Var = i51Var.e;
                    if (a6Var != null && a6Var.getDocumentId() == l4.longValue()) {
                        i51Var.f();
                    } else {
                        TLRPC.Document document = i51Var.d;
                        if (document != null && document.f20278id == l4.longValue()) {
                            i51Var.f();
                        }
                    }
                    z10 = true;
                }
            }
            w41Var.invalidate();
            if (!z10) {
                while (true) {
                    ArrayList arrayList = this.f43625v0;
                    if (i10 < arrayList.size()) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (longValue == (l4.longValue() * 13) + 62425 || longValue == (l4.longValue() * 13) + 3212) {
                            break;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
                y41 y41Var = this.f43611p0;
                if (y41Var != null) {
                    y41Var.m(i10);
                }
            }
        }
    }

    public final void B(boolean r40, boolean r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z51.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        q41 q41Var = this.f43592f0;
        if (q41Var == null) {
            return;
        }
        if (this.f43635y1) {
            q41Var.clearAnimation();
            q41Var.setVisibility(0);
            q41Var.animate().translationY(0.0f).start();
            return;
        }
        w41 w41Var = this.f43596h0;
        if (w41Var.getChildCount() > 0) {
            View childAt = w41Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f43578a && "searchbox".equals(childAt.getTag())) {
                q41Var.setVisibility(0);
                q41Var.setTranslationY(childAt.getY());
                return;
            }
            q41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        q41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
    }

    public final void E(float f7) {
        int i10;
        int i11 = -1;
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.bs.f25031g.getInterpolation(w7.r.a((((f7 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            view.setScaleY(interpolation * i10);
        }
        org.telegram.ui.Components.un unVar = this.f43607n0;
        if (unVar != null) {
            float a10 = w7.r.a((((f7 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            unVar.setAlpha(a10);
            unVar.setScaleX(a10);
            if (!n()) {
                i11 = 1;
            }
            unVar.setScaleY(a10 * i11);
        }
        float f10 = 800.0f * f7;
        float f11 = f10 - 40.0f;
        float a11 = w7.r.a(f11 / 700.0f, 0.0f, 1.0f);
        float a12 = w7.r.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = w7.r.a(f11 / 750.0f, 0.0f, 1.0f);
        float a14 = w7.r.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        float interpolation2 = bsVar.getInterpolation(a11);
        float interpolation3 = bsVar.getInterpolation(a12);
        this.f43582b0.setAlpha(a14);
        this.f43592f0.setAlpha(a14);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f43587d0.f27944b.getChildCount(); i13++) {
            this.f43587d0.f27944b.getChildAt(i13).setAlpha(a14);
        }
        if (this.f43608n1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a14;
        t41 t41Var = this.f43579a0;
        t41Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        if (unVar != null) {
            unVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        }
        this.f43580a1 = (interpolation2 * 0.85f) + 0.15f;
        this.f43583b1 = (interpolation3 * 0.925f) + 0.075f;
        t41Var.invalidateOutline();
        if (unVar != null) {
            unVar.setAlpha(a14);
        }
        r41 r41Var = this.f43589e0;
        r41Var.setAlpha(a14);
        r41Var.setScaleX(Math.min(this.f43580a1, 1.0f));
        float pivotX = r41Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(t41Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(t41Var.getHeight(), 2.0d) + Math.pow(t41Var.getWidth() - pivotX, 2.0d)));
        for (int i14 = 0; i14 < this.f43587d0.f27944b.getChildCount(); i14++) {
            View childAt = this.f43587d0.f27944b.getChildAt(i14);
            if (f7 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f7 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float cascade = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.cast.a6.t(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            w41 w41Var = this.f43596h0;
            if (i12 < w41Var.getChildCount()) {
                View childAt2 = w41Var.getChildAt(i12);
                if (childAt2 instanceof i51) {
                    i51 i51Var = (i51) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float cascade2 = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.cast.a6.t(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(cascade2)) {
                        cascade2 = 0.0f;
                    }
                    i51Var.setAnimatedScale(cascade2);
                }
                i12++;
            } else {
                this.f43602k0.invalidate();
                w41Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        b41 b41Var = this.S1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                AndroidUtilities.cancelRunOnUIThread(b41Var);
                AndroidUtilities.runOnUIThread(b41Var);
            }
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(b41Var);
            AndroidUtilities.runOnUIThread(b41Var);
        } else if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(b41Var);
            AndroidUtilities.runOnUIThread(b41Var);
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(b41Var);
            AndroidUtilities.runOnUIThread(b41Var);
        } else if (i10 == NotificationCenter.emojiLoaded) {
            ci.e eVar = new ci.e(5);
            w41 w41Var = this.f43596h0;
            AndroidUtilities.forEachViews((RecyclerView) w41Var, (Utilities.Callback<View>) eVar);
            if (w41Var != null) {
                w41Var.invalidate();
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.V).getClientUserId()) {
            AndroidUtilities.cancelRunOnUIThread(b41Var);
            AndroidUtilities.runOnUIThread(b41Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i10;
        float f7;
        float measuredHeight;
        org.telegram.ui.Components.p5 p5Var = this.f43608n1;
        if (p5Var != null && (num = this.Y0) != null) {
            Rect bounds = p5Var.getBounds();
            View view = this.f43612p1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f43608n1.getAlpha();
            View view2 = this.f43612p1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f43608n1.v = (int) (Math.pow(this.f43579a0.getAlpha(), 0.25d) * alpha * this.l1);
            if (this.f43610o1 == null) {
                this.f43610o1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            float f10 = i10;
            if (scaleY > 1.5f) {
                f7 = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f7 = 0.0f;
            }
            float intValue = num.intValue() + f10;
            float x10 = com.google.android.gms.internal.cast.a6.x(scaleY, 1.0f, bounds.centerY(), -f7);
            boolean n10 = n();
            int i11 = this.f43588d1;
            if (!n10) {
                measuredHeight = AndroidUtilities.dp(i11);
            } else {
                measuredHeight = getMeasuredHeight() - (AndroidUtilities.dp(i11) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + x10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.f43610o1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.p5 p5Var2 = this.f43608n1;
            Rect rect = this.f43610o1;
            int i12 = rect.left;
            Rect rect2 = this.f43610o1;
            p5Var2.setBounds(i12, rect.top, (int) ((rect.width() / scaleY) + i12), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.f43610o1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f43608n1.draw(canvas);
            org.telegram.ui.Components.p5 p5Var3 = this.f43608n1;
            p5Var3.v = alpha;
            p5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        i51 i51Var = this.f43617r1;
        if (i51Var != null && this.f43620s1 != null && i51Var.E != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f43617r1.E.setAlpha((int) (this.f43614q1 * 255.0f));
            this.f43617r1.E.setBounds(this.f43620s1);
            this.f43617r1.E.setColorFilter(new PorterDuffColorFilter(i0.b.f(1.0f - this.l1, this.f43593f1, this.f43605m1), PorterDuff.Mode.SRC_IN));
            this.f43617r1.E.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.O1 - this.N1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.O1 - this.N1) * 25) + f() + 16;
    }

    public ai.ce getCollectionParticles() {
        if (this.Q1 == null) {
            this.Q1 = new ai.ce(1, 8);
        }
        return this.Q1;
    }

    public long getDialogId() {
        return UserConfig.getInstance(this.V).getClientUserId();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        View view;
        float f7;
        if (this.F1) {
            view = this.f43598i0;
        } else {
            view = this.f43596h0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f43626v1) {
            this.f43626v1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f43609o0.animate();
            if (canScrollVertically) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            org.telegram.messenger.wh.s(animate, f7, 200L);
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z51.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i10 = this.W;
        if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder("emoji");
            if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String s10 = a1.g.s(sb2, str, "usehint");
            int i11 = MessagesController.getGlobalMainSettings().getInt(s10, 0);
            if (i11 <= 3) {
                MessagesController.getGlobalMainSettings().edit().putInt(s10, i11 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i10 = this.W;
        if (i10 != 5 && i10 != 10 && i10 != 12 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.a6 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z51.o(android.view.View, org.telegram.ui.Components.a6):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        int i10 = this.V;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.p5 p5Var = this.f43608n1;
        if (p5Var != null) {
            p5Var.f29179n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.I = false;
        int i10 = this.V;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.p5 p5Var = this.f43608n1;
        if (p5Var != null) {
            p5Var.f29179n = null;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.W == 6) {
            this.f43616r0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.Q0;
        int i12 = this.W;
        if (z10 && i12 != 3 && i12 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), Integer.MIN_VALUE));
        } else if (i12 == 6) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public abstract void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(p51 p51Var) {
        Integer num = this.Y1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) f43577c2.get(num);
        }
        this.T1 = p51Var;
        boolean z10 = this.Q0;
        w41 w41Var = this.f43596h0;
        if (!z10) {
            h();
            for (int i10 = 0; i10 < w41Var.getChildCount(); i10++) {
                View childAt = w41Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.U1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U1 = null;
        }
        ValueAnimator valueAnimator2 = this.V1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.V1 = null;
        }
        int i11 = this.W;
        if (i11 != 3 && i11 != 4 && i11 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.U1 = ofFloat;
            ofFloat.addUpdateListener(new a41(this, 0));
            this.U1.addListener(new bc0(this, 25));
            b41 b41Var = new b41(this, 0);
            ah.x0.f905f = true;
            ah.x0.e = true;
            ah.x0.f906g = false;
            if (ah.x0.d) {
                ah.x0.d = false;
            }
            ah.x0.f904c = b41Var;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.W1.lock();
            this.U1.setDuration(800L);
            w41Var.setLayerType(2, null);
            this.f43592f0.setLayerType(2, null);
            this.f43589e0.setLayerType(2, null);
            this.f43582b0.setLayerType(2, null);
            org.telegram.ui.Components.un unVar = this.f43607n0;
            if (unVar != null) {
                unVar.setLayerType(2, null);
            }
            View view = this.m0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f43587d0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.P = z10;
    }

    public void setBackgroundDelegate(z41 z41Var) {
        this.U = z41Var;
    }

    public void setDrawBackground(boolean z10) {
        this.Q0 = z10;
        this.f43579a0.setClipToOutline(z10);
        ei.g6 g6Var = this.f43582b0;
        if (!z10) {
            g6Var.setVisibility(8);
        } else {
            g6Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (!z10) {
                AndroidUtilities.forEachViews((RecyclerView) this.f43596h0, (Utilities.Callback<View>) new ci.e(21));
                for (int i10 = 0; i10 < this.f43587d0.f27944b.getChildCount(); i10++) {
                    View childAt = this.f43587d0.f27944b.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f43587d0.f27944b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.O0 = true;
        this.P0 = Integer.valueOf(i10);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.R = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.N = drawable;
        i51 i51Var = this.O;
        if (i51Var != null) {
            i51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.f43597h1 = z10;
    }

    public void setOnLongPressedListener(x51 x51Var) {
        this.H = x51Var;
    }

    public void setRecentReactions(List<ah.i1> list) {
        this.R0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.Y1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l4) {
        HashSet hashSet = this.K;
        hashSet.clear();
        hashSet.add(l4);
        w41 w41Var = this.f43596h0;
        if (w41Var != null) {
            for (int i10 = 0; i10 < w41Var.getChildCount(); i10++) {
                if (w41Var.getChildAt(i10) instanceof i51) {
                    i51 i51Var = (i51) w41Var.getChildAt(i10);
                    org.telegram.ui.Components.a6 a6Var = i51Var.e;
                    if (a6Var != null) {
                        i51Var.d(hashSet.contains(Long.valueOf(a6Var.getDocumentId())), true);
                    } else {
                        i51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            w41Var.invalidate();
        }
    }

    public void setSelectedReaction(ah.i1 i1Var) {
        this.J.clear();
        this.J.add(i1Var);
        w41 w41Var = this.f43596h0;
        if (w41Var != null) {
            for (int i10 = 0; i10 < w41Var.getChildCount(); i10++) {
                if (w41Var.getChildAt(i10) instanceof i51) {
                    i51 i51Var = (i51) w41Var.getChildAt(i10);
                    i51Var.d(this.J.contains(i51Var.f37756x), true);
                }
            }
            w41Var.invalidate();
        }
        m41 m41Var = this.f43598i0;
        if (m41Var != null) {
            for (int i11 = 0; i11 < m41Var.getChildCount(); i11++) {
                if (m41Var.getChildAt(i11) instanceof i51) {
                    i51 i51Var2 = (i51) m41Var.getChildAt(i11);
                    i51Var2.d(this.J.contains(i51Var2.f37756x), true);
                }
            }
            m41Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ah.i1> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((ah.i1) arrayList.get(i10)).f786g != 0) {
                hashSet2.add(Long.valueOf(((ah.i1) arrayList.get(i10)).f786g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        long j10;
        b41 b41Var = this.I1;
        if (b41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b41Var);
            this.I1 = null;
        }
        ci.j6 j6Var = this.J1;
        if (j6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(j6Var);
            this.J1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        j51 j51Var = this.f43613q0;
        q41 q41Var = this.f43592f0;
        if (isEmpty) {
            this.f43632x1 = false;
            this.f43635y1 = false;
            z(false, z10);
            if (q41Var != null) {
                q41Var.e(true);
                o51.a(q41Var, false);
            }
            j51Var.E(true);
            this.f43637z1 = null;
        } else {
            boolean z12 = this.f43632x1;
            boolean z13 = !z12;
            this.f43632x1 = true;
            this.f43635y1 = false;
            if (q41Var != null) {
                q41Var.f39661f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                j51Var.E(false);
            } else if (!str.equals(this.f43637z1)) {
                b41 b41Var2 = new b41(this, 1);
                this.I1 = b41Var2;
                AndroidUtilities.runOnUIThread(b41Var2, 120L);
            }
            this.f43637z1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, a2)) {
                MediaDataController.getInstance(this.V).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            a2 = currentKeyboardLanguage;
            ci.j6 j6Var2 = new ci.j6(this, str, z10, z13, currentKeyboardLanguage, 4);
            this.J1 = j6Var2;
            if (z11) {
                j10 = 425;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(j6Var2, j10);
            if (q41Var != null) {
                q41Var.f39661f.b(2);
                o51.a(q41Var, z10);
            }
        }
        C();
    }

    public final void w(float f7) {
        ValueAnimator valueAnimator = this.f43599i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f43599i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43621t0.getAlpha(), f7 * 0.25f);
        this.f43599i1 = ofFloat;
        ofFloat.addUpdateListener(new a41(this, 2));
        this.f43599i1.setDuration(200L);
        this.f43599i1.setInterpolator(org.telegram.ui.Components.bs.f25030f);
        this.f43599i1.start();
    }

    public final void x(Long l4, boolean z10) {
        boolean z11;
        HashSet hashSet = this.K;
        if (!hashSet.contains(l4)) {
            hashSet.add(l4);
            z11 = true;
        } else {
            hashSet.remove(l4);
            z11 = false;
        }
        w41 w41Var = this.f43596h0;
        if (w41Var != null) {
            for (int i10 = 0; i10 < w41Var.getChildCount(); i10++) {
                if (w41Var.getChildAt(i10) instanceof i51) {
                    i51 i51Var = (i51) w41Var.getChildAt(i10);
                    org.telegram.ui.Components.a6 a6Var = i51Var.e;
                    if (a6Var != null && a6Var.getDocumentId() == l4.longValue()) {
                        i51Var.e(z11, z10);
                    } else {
                        TLRPC.Document document = i51Var.d;
                        if (document != null && document.f20278id == l4.longValue()) {
                            i51Var.e(z11, z10);
                        }
                    }
                }
            }
            w41Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.p5 p5Var, View view) {
        int i10;
        Integer num;
        if (p5Var != null && (num = p5Var.F) != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        this.f43605m1 = i10;
        this.f43608n1 = p5Var;
        this.f43612p1 = view;
        if (this.I && p5Var != null) {
            p5Var.f29179n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        float f7;
        if (this.F1 == z10) {
            return;
        }
        this.F1 = z10;
        w41 w41Var = this.f43596h0;
        w41Var.setVisibility(0);
        m41 m41Var = this.f43598i0;
        m41Var.setVisibility(0);
        ValueAnimator valueAnimator = this.E1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.H1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.H1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E1 = ofFloat;
        ofFloat.addUpdateListener(new e41(this, z10, 0));
        this.E1.addListener(new s41(this, z10, 0));
        this.E1.setDuration(320L);
        this.E1.setInterpolator(org.telegram.ui.Components.bs.h);
        this.E1.start();
        ViewPropertyAnimator animate = ((View) w41Var.getParent()).animate();
        if (this.F1 && z11) {
            f7 = -AndroidUtilities.dp(36.0f);
        } else {
            f7 = 0.0f;
        }
        org.telegram.messenger.wh.t(animate.translationY(f7).setUpdateListener(new a41(this, 1)), org.telegram.ui.Components.bs.f25030f, 160L);
        if (this.F1 && z11) {
            m41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            m41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public z51(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this(n2Var, context, z10, num, i10, z11, d6Var, i11, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21319v6, d6Var));
    }

    public z51(org.telegram.ui.ActionBar.n2 r41, android.content.Context r42, boolean r43, java.lang.Integer r44, int r45, boolean r46, org.telegram.ui.ActionBar.d6 r47, int r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z51.<init>(org.telegram.ui.ActionBar.n2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.d6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.J.add(ah.i1.b(str));
        }
        w41 w41Var = this.f43596h0;
        if (w41Var != null) {
            for (int i11 = 0; i11 < w41Var.getChildCount(); i11++) {
                if (w41Var.getChildAt(i11) instanceof i51) {
                    i51 i51Var = (i51) w41Var.getChildAt(i11);
                    i51Var.d(this.J.contains(i51Var.f37756x), true);
                }
            }
            w41Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(y51 y51Var) {
    }

    @Override
    public void setPressed(boolean z10) {
    }

    public void r(i51 i51Var, ah.i1 i1Var) {
    }
}
