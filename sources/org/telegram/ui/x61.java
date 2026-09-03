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
public abstract class x61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] X1;
    public final ArrayList A0;
    public ArrayList A1;
    public int B;
    public final ArrayList B0;
    public ValueAnimator B1;
    public int C;
    public final ArrayList C0;
    public boolean C1;
    public a61 D;
    public final ArrayList D0;
    public boolean D1;
    public v61 E;
    public final ArrayList E0;
    public ValueAnimator E1;
    public boolean F;
    public final ArrayList F0;
    public y41 F1;
    public HashSet G;
    public ArrayList G0;
    public cg.x0 G1;
    public final HashSet H;
    public final ArrayList H0;
    public boolean H1;
    public final Paint I;
    public ArrayList I0;
    public boolean I1;
    public final Paint J;
    public final ArrayList J0;
    public View J1;
    public Drawable K;
    public final boolean K0;
    public int K1;
    public f61 L;
    public boolean L0;
    public int L1;
    public boolean M;
    public Integer M0;
    public long M1;
    public boolean N;
    public boolean N0;
    public lh.wa N1;
    public boolean O;
    public List O0;
    public final y41 O1;
    public final ArrayList P;
    public f61 P0;
    public final y41 P1;
    public boolean Q;
    public boolean Q0;
    public Runnable Q1;
    public w51 R;
    public float R0;
    public ValueAnimator R1;
    public final int S;
    public final ImageReceiver S0;
    public ValueAnimator S1;
    public final int T;
    public org.telegram.ui.Components.l5 T0;
    public final AnimationNotificationsLocker T1;
    public final q51 U;
    public l51 U0;
    public final Paint U1;
    public final eg.i0 V;
    public final Integer V0;
    public Integer V1;
    public final org.telegram.ui.Components.wv[] W;
    public final org.telegram.ui.ActionBar.f6 W0;
    public float X0;
    public float Y0;
    public final org.telegram.ui.ActionBar.p2 Z0;
    public int f39851a;
    public org.telegram.ui.Components.wv f39852a0;
    public final int f39853a1;
    public int f39854b;
    public final o51 f39855b0;
    public final u51 f39856b1;
    public int f39857c;
    public final n51 f39858c0;
    public final int f39859c1;
    public int d;
    public final h51 f39860d0;
    public boolean f39861d1;
    public int e;
    public final t51 f39862e0;
    public boolean f39863e1;
    public int f39864f;
    public final i51 f39865f0;
    public ValueAnimator f39866f1;
    public final FrameLayout f39867g0;
    public Drawable f39868g1;
    public int h;
    public final ah.e f39869h0;
    public final PorterDuffColorFilter f39870h1;
    public final org.telegram.ui.Components.p9 f39871i0;
    public float f39872i1;
    public final View f39873j0;
    public int f39874j1;
    public final org.telegram.ui.Components.gn f39875k0;
    public org.telegram.ui.Components.j5 f39876k1;
    public final View f39877l0;
    public Rect l1;
    public final v51 m0;
    public View f39878m1;
    public int f39879n;
    public final g61 f39880n0;
    public float f39881n1;
    public final j51 f39882o0;
    public f61 f39883o1;
    public final c2.z f39884p0;
    public Rect f39885p1;
    public final View f39886q0;
    public final OvershootInterpolator f39887q1;
    public int f39888r;
    public int f39889r0;
    public ValueAnimator f39890r1;
    public int f39891s;
    public final ArrayList f39892s0;
    public boolean f39893s1;
    public final SparseIntArray f39894t0;
    public boolean f39895t1;
    public final SparseIntArray f39896u0;
    public boolean f39897u1;
    public int v;
    public final SparseIntArray f39898v0;
    public boolean f39899v1;
    public int f39900w;
    public final SparseIntArray f39901w0;
    public String f39902w1;
    public int f39903x;
    public final ArrayList f39904x0;
    public ArrayList f39905x1;
    public int f39906y;
    public final ArrayList f39907y0;
    public ArrayList f39908y1;
    public boolean f39909z0;
    public ArrayList f39910z1;
    public static final List W1 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] Y1 = new boolean[4];
    public static final HashMap Z1 = new HashMap();

    public x61(org.telegram.ui.ActionBar.p2 p2Var, Context context, boolean z4, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(p2Var, context, z4, num, i10, true, f6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.p9 p9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (p9Var != null) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                list = W1;
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
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20042m6, 0.2f);
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
                p9Var.setLayerNum(7);
                p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                p9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
            }
        }
    }

    public static void a(x61 x61Var, int i10, int i11) {
        int i12;
        c2.z zVar = x61Var.f39884p0;
        j51 j51Var = x61Var.f39882o0;
        View m9 = j51Var.m(i10);
        int L0 = j51Var.L0();
        if ((m9 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            if (j51Var.L0() < i10) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            zVar.f2062b = i12;
            zVar.c(i10, i11, false, false);
            return;
        }
        org.telegram.ui.Components.dx dxVar = new org.telegram.ui.Components.dx(x61Var, x61Var.f39862e0.getContext(), 3);
        dxVar.f5712a = i10;
        dxVar.f46707p = i11;
        j51Var.w0(dxVar);
    }

    public static boolean c(x61 x61Var) {
        if (!x61Var.Q) {
            ValueAnimator valueAnimator = x61Var.R1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int getCacheType() {
        int i10 = 13;
        int i11 = this.T;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.l5.g();
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
        if (this.f39868g1 == null) {
            int i10 = this.T;
            if (i10 != 5 && i10 != 9 && i10 != 10 && i10 != 7) {
                this.f39868g1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            } else {
                this.f39868g1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            }
            this.f39868g1.setColorFilter(this.f39870h1);
        }
        return this.f39868g1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.f19165id))) {
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
            if (document.f19165id == j10) {
                return document;
            }
        }
        return null;
    }

    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.l5 l5Var) {
        org.telegram.ui.Components.l5 l5Var2;
        if (this.F && (l5Var2 = this.T0) != l5Var) {
            if (l5Var2 != null) {
                l5Var2.o(this);
            }
            this.T0 = l5Var;
            if (l5Var != null) {
                l5Var.setColorFilter(this.f39870h1);
                this.T0.a(this);
            }
        }
    }

    public static void t(final int i10) {
        boolean[] zArr = Y1;
        if (!zArr[i10] && MediaDataController.getInstance(i10) != null) {
            zArr[i10] = true;
            MediaDataController.getInstance(i10).checkStickers(5);
            MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
            MediaDataController.getInstance(i10).checkReactions();
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
            MediaDataController.getInstance(i10).checkDefaultTopicIcons();
            org.telegram.ui.Components.xw0.f30726u3.fetch(i10, 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ArrayList<TLRPC.EmojiGroup> arrayList;
                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                    if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            TLRPC.EmojiGroup emojiGroup = arrayList.get(i11);
                            i11++;
                            l5.h(i10).b(emojiGroup.icon_emoji_id, null);
                        }
                    }
                }
            });
        }
    }

    public final void A(Long l10) {
        this.H.remove(l10);
        t51 t51Var = this.f39862e0;
        if (t51Var != null) {
            int i10 = 0;
            boolean z4 = false;
            for (int i11 = 0; i11 < t51Var.getChildCount(); i11++) {
                if (t51Var.getChildAt(i11) instanceof f61) {
                    f61 f61Var = (f61) t51Var.getChildAt(i11);
                    org.telegram.ui.Components.u5 u5Var = f61Var.e;
                    if (u5Var != null && u5Var.getDocumentId() == l10.longValue()) {
                        f61Var.f();
                    } else {
                        TLRPC.Document document = f61Var.d;
                        if (document != null && document.f19165id == l10.longValue()) {
                            f61Var.f();
                        }
                    }
                    z4 = true;
                }
            }
            t51Var.invalidate();
            if (!z4) {
                while (true) {
                    ArrayList arrayList = this.f39892s0;
                    if (i10 < arrayList.size()) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                            break;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
                v51 v51Var = this.m0;
                if (v51Var != null) {
                    v51Var.m(i10);
                }
            }
        }
    }

    public final void B(boolean r40, boolean r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x61.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        n51 n51Var = this.f39858c0;
        if (n51Var == null) {
            return;
        }
        if (this.f39899v1) {
            n51Var.clearAnimation();
            n51Var.setVisibility(0);
            n51Var.animate().translationY(0.0f).start();
            return;
        }
        t51 t51Var = this.f39862e0;
        if (t51Var.getChildCount() > 0) {
            View childAt = t51Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.f39851a && "searchbox".equals(childAt.getTag())) {
                n51Var.setVisibility(0);
                n51Var.setTranslationY(childAt.getY());
                return;
            }
            n51Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        n51Var.setTranslationY(-AndroidUtilities.dp(52.0f));
    }

    public final void E(float f10) {
        int i10;
        int i11 = -1;
        View view = this.f39873j0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.mr.f27123g.getInterpolation(k7.n.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (n()) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            view.setScaleY(interpolation * i10);
        }
        org.telegram.ui.Components.gn gnVar = this.f39875k0;
        if (gnVar != null) {
            float a2 = k7.n.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            gnVar.setAlpha(a2);
            gnVar.setScaleX(a2);
            if (!n()) {
                i11 = 1;
            }
            gnVar.setScaleY(a2 * i11);
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a10 = k7.n.a(f12 / 700.0f, 0.0f, 1.0f);
        float a11 = k7.n.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a12 = k7.n.a(f12 / 750.0f, 0.0f, 1.0f);
        float a13 = k7.n.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        float interpolation2 = mrVar.getInterpolation(a10);
        float interpolation3 = mrVar.getInterpolation(a11);
        this.V.setAlpha(a13);
        this.f39858c0.setAlpha(a13);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f39852a0.f28998b.getChildCount(); i13++) {
            this.f39852a0.f28998b.getChildAt(i13).setAlpha(a13);
        }
        if (this.f39876k1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a13;
        q51 q51Var = this.U;
        q51Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        if (gnVar != null) {
            gnVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        }
        this.X0 = (interpolation2 * 0.85f) + 0.15f;
        this.Y0 = (interpolation3 * 0.925f) + 0.075f;
        q51Var.invalidateOutline();
        if (gnVar != null) {
            gnVar.setAlpha(a13);
        }
        o51 o51Var = this.f39855b0;
        o51Var.setAlpha(a13);
        o51Var.setScaleX(Math.min(this.X0, 1.0f));
        float pivotX = o51Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(q51Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(q51Var.getHeight(), 2.0d) + Math.pow(q51Var.getWidth() - pivotX, 2.0d)));
        for (int i14 = 0; i14 < this.f39852a0.f28998b.getChildCount(); i14++) {
            View childAt = this.f39852a0.f28998b.getChildAt(i14);
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
            float cascade = AndroidUtilities.cascade(a12, (float) Math.sqrt(e2.c.u(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            t51 t51Var = this.f39862e0;
            if (i12 < t51Var.getChildCount()) {
                View childAt2 = t51Var.getChildAt(i12);
                if (childAt2 instanceof f61) {
                    f61 f61Var = (f61) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (n()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float cascade2 = AndroidUtilities.cascade(a12, (float) Math.sqrt(e2.c.u(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(cascade2)) {
                        cascade2 = 0.0f;
                    }
                    f61Var.setAnimatedScale(cascade2);
                }
                i12++;
            } else {
                this.f39869h0.invalidate();
                t51Var.invalidate();
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
        y41 y41Var = this.P1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.N)) {
                AndroidUtilities.cancelRunOnUIThread(y41Var);
                AndroidUtilities.runOnUIThread(y41Var);
            }
        } else if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(y41Var);
            AndroidUtilities.runOnUIThread(y41Var);
        } else if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(y41Var);
            AndroidUtilities.runOnUIThread(y41Var);
        } else if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(y41Var);
            AndroidUtilities.runOnUIThread(y41Var);
        } else if (i10 == NotificationCenter.emojiLoaded) {
            nh.e eVar = new nh.e(19);
            t51 t51Var = this.f39862e0;
            AndroidUtilities.forEachViews((RecyclerView) t51Var, (h5.d) eVar);
            if (t51Var != null) {
                t51Var.invalidate();
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.S).getClientUserId()) {
            AndroidUtilities.cancelRunOnUIThread(y41Var);
            AndroidUtilities.runOnUIThread(y41Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i10;
        float f10;
        float measuredHeight;
        org.telegram.ui.Components.j5 j5Var = this.f39876k1;
        if (j5Var != null && (num = this.V0) != null) {
            Rect bounds = j5Var.getBounds();
            View view = this.f39878m1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.f39876k1.getAlpha();
            View view2 = this.f39878m1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f39876k1.v = (int) (Math.pow(this.U.getAlpha(), 0.25d) * alpha * this.f39872i1);
            if (this.l1 == null) {
                this.l1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            float f11 = i10;
            if (scaleY > 1.5f) {
                f10 = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f10 = 0.0f;
            }
            float intValue = num.intValue() + f11;
            float w10 = e2.c.w(scaleY, 1.0f, bounds.centerY(), -f10);
            boolean n10 = n();
            int i11 = this.f39853a1;
            if (!n10) {
                measuredHeight = AndroidUtilities.dp(i11);
            } else {
                measuredHeight = getMeasuredHeight() - (AndroidUtilities.dp(i11) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + w10 + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.l1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.j5 j5Var2 = this.f39876k1;
            Rect rect = this.l1;
            int i12 = rect.left;
            Rect rect2 = this.l1;
            j5Var2.setBounds(i12, rect.top, (int) ((rect.width() / scaleY) + i12), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.l1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.f39876k1.draw(canvas);
            org.telegram.ui.Components.j5 j5Var3 = this.f39876k1;
            j5Var3.v = alpha;
            j5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        f61 f61Var = this.f39883o1;
        if (f61Var != null && this.f39885p1 != null && f61Var.B != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.f39883o1.B.setAlpha((int) (this.f39881n1 * 255.0f));
            this.f39883o1.B.setBounds(this.f39885p1);
            this.f39883o1.B.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.f39872i1, this.f39859c1, this.f39874j1), PorterDuff.Mode.SRC_IN));
            this.f39883o1.B.draw(canvas);
            canvas.restore();
        }
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.L1 - this.K1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.L1 - this.K1) * 25) + f() + 16;
    }

    public lh.wa getCollectionParticles() {
        if (this.N1 == null) {
            this.N1 = new lh.wa(1, 8);
        }
        return this.N1;
    }

    public long getDialogId() {
        return UserConfig.getInstance(this.S).getClientUserId();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        View view;
        float f10;
        if (this.C1) {
            view = this.f39865f0;
        } else {
            view = this.f39862e0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.f39893s1) {
            this.f39893s1 = canScrollVertically;
            ViewPropertyAnimator animate = this.f39877l0.animate();
            if (canScrollVertically) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setDuration(200L).start();
        }
    }

    public final void i(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x61.i(int, android.view.View):void");
    }

    public final void l() {
        String str;
        int i10 = this.T;
        if (i10 != 2) {
            StringBuilder sb = new StringBuilder("emoji");
            if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String r10 = android.support.v4.media.a.r(sb, str, "usehint");
            int i11 = MessagesController.getGlobalMainSettings().getInt(r10, 0);
            if (i11 <= 3) {
                MessagesController.getGlobalMainSettings().edit().putInt(r10, i11 + 1).apply();
            }
        }
    }

    public final boolean n() {
        int i10 = this.T;
        if (i10 != 5 && i10 != 10 && i10 != 12 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void o(android.view.View r14, org.telegram.ui.Components.u5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x61.o(android.view.View, org.telegram.ui.Components.u5):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        int i10 = this.S;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.T;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.j5 j5Var = this.f39876k1;
        if (j5Var != null) {
            j5Var.f25837n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.F = false;
        int i10 = this.S;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.T;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.j5 j5Var = this.f39876k1;
        if (j5Var != null) {
            j5Var.f25837n = null;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (z4 && this.T == 6) {
            this.f39882o0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4 = this.N0;
        int i12 = this.T;
        if (z4 && i12 != 3 && i12 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), Integer.MIN_VALUE));
        } else if (i12 == 6) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(m61 m61Var) {
        Integer num = this.V1;
        if (num != null) {
            Parcelable parcelable = (Parcelable) Z1.get(num);
        }
        this.Q1 = m61Var;
        boolean z4 = this.N0;
        t51 t51Var = this.f39862e0;
        if (!z4) {
            h();
            for (int i10 = 0; i10 < t51Var.getChildCount(); i10++) {
                View childAt = t51Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.R1 = null;
        }
        ValueAnimator valueAnimator2 = this.S1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.S1 = null;
        }
        int i11 = this.T;
        if (i11 != 3 && i11 != 4 && i11 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.R1 = ofFloat;
            ofFloat.addUpdateListener(new x41(this, 0));
            this.R1.addListener(new ss0(this, 19));
            y41 y41Var = new y41(this, 0);
            mg.g0.f13994f = true;
            mg.g0.e = true;
            mg.g0.f13995g = false;
            if (mg.g0.d) {
                mg.g0.d = false;
            }
            mg.g0.f13993c = y41Var;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.T1.lock();
            this.R1.setDuration(800L);
            t51Var.setLayerType(2, null);
            this.f39858c0.setLayerType(2, null);
            this.f39855b0.setLayerType(2, null);
            this.V.setLayerType(2, null);
            org.telegram.ui.Components.gn gnVar = this.f39875k0;
            if (gnVar != null) {
                gnVar.setLayerType(2, null);
            }
            View view = this.f39873j0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.f39852a0.m(true);
            E(0.0f);
            return;
        }
        h();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z4) {
        this.M = z4;
    }

    public void setBackgroundDelegate(w51 w51Var) {
        this.R = w51Var;
    }

    public void setDrawBackground(boolean z4) {
        this.N0 = z4;
        this.U.setClipToOutline(z4);
        eg.i0 i0Var = this.V;
        if (!z4) {
            i0Var.setVisibility(8);
        } else {
            i0Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z4) {
        if (this.Q != z4) {
            this.Q = z4;
            if (!z4) {
                AndroidUtilities.forEachViews((RecyclerView) this.f39862e0, (h5.d) new nh.e(14));
                for (int i10 = 0; i10 < this.f39852a0.f28998b.getChildCount(); i10++) {
                    View childAt = this.f39852a0.f28998b.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                this.f39852a0.f28998b.invalidate();
            }
        }
    }

    public void setExpireDateHint(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.L0 = true;
        this.M0 = Integer.valueOf(i10);
        B(true, false, true);
    }

    public void setForUser(boolean z4) {
        this.O = z4;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.K = drawable;
        f61 f61Var = this.L;
        if (f61Var != null) {
            f61Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z4) {
        this.f39863e1 = z4;
    }

    public void setOnLongPressedListener(v61 v61Var) {
        this.E = v61Var;
    }

    public void setRecentReactions(List<mg.q0> list) {
        this.O0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.V1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.H;
        hashSet.clear();
        hashSet.add(l10);
        t51 t51Var = this.f39862e0;
        if (t51Var != null) {
            for (int i10 = 0; i10 < t51Var.getChildCount(); i10++) {
                if (t51Var.getChildAt(i10) instanceof f61) {
                    f61 f61Var = (f61) t51Var.getChildAt(i10);
                    org.telegram.ui.Components.u5 u5Var = f61Var.e;
                    if (u5Var != null) {
                        f61Var.d(hashSet.contains(Long.valueOf(u5Var.getDocumentId())), true);
                    } else {
                        f61Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            t51Var.invalidate();
        }
    }

    public void setSelectedReaction(mg.q0 q0Var) {
        this.G.clear();
        this.G.add(q0Var);
        t51 t51Var = this.f39862e0;
        if (t51Var != null) {
            for (int i10 = 0; i10 < t51Var.getChildCount(); i10++) {
                if (t51Var.getChildAt(i10) instanceof f61) {
                    f61 f61Var = (f61) t51Var.getChildAt(i10);
                    f61Var.d(this.G.contains(f61Var.f33971x), true);
                }
            }
            t51Var.invalidate();
        }
        i51 i51Var = this.f39865f0;
        if (i51Var != null) {
            for (int i11 = 0; i11 < i51Var.getChildCount(); i11++) {
                if (i51Var.getChildAt(i11) instanceof f61) {
                    f61 f61Var2 = (f61) i51Var.getChildAt(i11);
                    f61Var2.d(this.G.contains(f61Var2.f33971x), true);
                }
            }
            i51Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<mg.q0> hashSet) {
        this.G = hashSet;
        HashSet hashSet2 = this.H;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((mg.q0) arrayList.get(i10)).f14096g != 0) {
                hashSet2.add(Long.valueOf(((mg.q0) arrayList.get(i10)).f14096g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z4, boolean z10) {
        long j10;
        y41 y41Var = this.F1;
        if (y41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y41Var);
            this.F1 = null;
        }
        cg.x0 x0Var = this.G1;
        if (x0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x0Var);
            this.G1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        g61 g61Var = this.f39880n0;
        n51 n51Var = this.f39858c0;
        if (isEmpty) {
            this.f39897u1 = false;
            this.f39899v1 = false;
            z(false, z4);
            if (n51Var != null) {
                n51Var.d(true);
                l61.a(n51Var, false);
            }
            g61Var.E(true);
            this.f39902w1 = null;
        } else {
            boolean z11 = this.f39897u1;
            boolean z12 = !z11;
            this.f39897u1 = true;
            this.f39899v1 = false;
            if (n51Var != null) {
                n51Var.f35658f.b(2);
            }
            if (!z11) {
                ArrayList arrayList = this.f39905x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.f39908y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                g61Var.E(false);
            } else if (!str.equals(this.f39902w1)) {
                y41 y41Var2 = new y41(this, 1);
                this.F1 = y41Var2;
                AndroidUtilities.runOnUIThread(y41Var2, 120L);
            }
            this.f39902w1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, X1)) {
                MediaDataController.getInstance(this.S).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            X1 = currentKeyboardLanguage;
            cg.x0 x0Var2 = new cg.x0(this, str, z4, z12, currentKeyboardLanguage, 5);
            this.G1 = x0Var2;
            if (z10) {
                j10 = 425;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(x0Var2, j10);
            if (n51Var != null) {
                n51Var.f35658f.b(2);
                l61.a(n51Var, z4);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f39866f1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39866f1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39886q0.getAlpha(), f10 * 0.25f);
        this.f39866f1 = ofFloat;
        ofFloat.addUpdateListener(new x41(this, 2));
        this.f39866f1.setDuration(200L);
        this.f39866f1.setInterpolator(org.telegram.ui.Components.mr.f27122f);
        this.f39866f1.start();
    }

    public final void x(Long l10, boolean z4) {
        boolean z10;
        HashSet hashSet = this.H;
        if (!hashSet.contains(l10)) {
            hashSet.add(l10);
            z10 = true;
        } else {
            hashSet.remove(l10);
            z10 = false;
        }
        t51 t51Var = this.f39862e0;
        if (t51Var != null) {
            for (int i10 = 0; i10 < t51Var.getChildCount(); i10++) {
                if (t51Var.getChildAt(i10) instanceof f61) {
                    f61 f61Var = (f61) t51Var.getChildAt(i10);
                    org.telegram.ui.Components.u5 u5Var = f61Var.e;
                    if (u5Var != null && u5Var.getDocumentId() == l10.longValue()) {
                        f61Var.e(z10, z4);
                    } else {
                        TLRPC.Document document = f61Var.d;
                        if (document != null && document.f19165id == l10.longValue()) {
                            f61Var.e(z10, z4);
                        }
                    }
                }
            }
            t51Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.j5 j5Var, View view) {
        int i10;
        Integer num;
        if (j5Var != null && (num = j5Var.C) != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        this.f39874j1 = i10;
        this.f39876k1 = j5Var;
        this.f39878m1 = view;
        if (this.F && j5Var != null) {
            j5Var.f25837n = this;
        }
        invalidate();
    }

    public final void z(boolean z4, boolean z10) {
        float f10;
        if (this.C1 == z4) {
            return;
        }
        this.C1 = z4;
        t51 t51Var = this.f39862e0;
        t51Var.setVisibility(0);
        i51 i51Var = this.f39865f0;
        i51Var.setVisibility(0);
        ValueAnimator valueAnimator = this.B1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.E1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.E1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B1 = ofFloat;
        ofFloat.addUpdateListener(new b51(this, z4, 0));
        this.B1.addListener(new p51(this, z4, 0));
        this.B1.setDuration(320L);
        this.B1.setInterpolator(org.telegram.ui.Components.mr.h);
        this.B1.start();
        ViewPropertyAnimator animate = ((View) t51Var.getParent()).animate();
        if (this.C1 && z10) {
            f10 = -AndroidUtilities.dp(36.0f);
        } else {
            f10 = 0.0f;
        }
        b.p(animate.translationY(f10).setUpdateListener(new x41(this, 1)), org.telegram.ui.Components.mr.f27122f, 160L);
        if (this.C1 && z10) {
            i51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            i51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public x61(org.telegram.ui.ActionBar.p2 p2Var, Context context, boolean z4, Integer num, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this(p2Var, context, z4, num, i10, z10, f6Var, i11, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20200v6, f6Var));
    }

    public x61(org.telegram.ui.ActionBar.p2 r41, android.content.Context r42, boolean r43, java.lang.Integer r44, int r45, boolean r46, org.telegram.ui.ActionBar.f6 r47, int r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x61.<init>(org.telegram.ui.ActionBar.p2, android.content.Context, boolean, java.lang.Integer, int, boolean, org.telegram.ui.ActionBar.f6, int, int):void");
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.G.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.G.add(mg.q0.b(str));
        }
        t51 t51Var = this.f39862e0;
        if (t51Var != null) {
            for (int i11 = 0; i11 < t51Var.getChildCount(); i11++) {
                if (t51Var.getChildAt(i11) instanceof f61) {
                    f61 f61Var = (f61) t51Var.getChildAt(i11);
                    f61Var.d(this.G.contains(f61Var.f33971x), true);
                }
            }
            t51Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(w61 w61Var) {
    }

    @Override
    public void setPressed(boolean z4) {
    }

    public void r(f61 f61Var, mg.q0 q0Var) {
    }
}
