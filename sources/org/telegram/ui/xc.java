package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public class xc extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper A;
    public TLRPC.WallPaper B;
    public TLRPC.WallPaper C;
    public Drawable D;
    public SpannableStringBuilder E;
    public boolean F;
    public org.telegram.ui.Components.oi0 G;
    public org.telegram.ui.ActionBar.v0 H;
    public org.telegram.ui.Components.zk0 I;
    public jc J;
    public FrameLayout K;
    public lh.d L;
    public gc M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    public final long f44380a;

    public int f44381a0;

    public int f44382b;

    public int f44383b0;

    public TL_stories.TL_premium_boostsStatus f44384c;

    public int f44385c0;
    public boolean d;

    public int f44386d0;

    public int f44387e;

    public int f44388e0;

    public int f44389f;

    public int f44390f0;

    public int f44391g0;
    public long h;

    public org.telegram.ui.ActionBar.n2 f44392h0;

    public hc f44393i0;

    public float f44394j0;

    public ValueAnimator f44395k0;

    public boolean f44396l0;
    public org.telegram.ui.ActionBar.c6 m0;

    public long f44397n;

    public final SparseIntArray f44398n0;

    public final org.telegram.ui.ActionBar.d5 f44399o0;

    public final org.telegram.ui.ActionBar.d5 f44400p0;

    public final org.telegram.ui.ActionBar.d5 f44401q0;

    public int f44402r;

    public final org.telegram.ui.ActionBar.d5 f44403r0;

    public int f44404s;

    public final Drawable f44405s0;

    public final Drawable f44406t0;

    public final Paint f44407u0;
    public long v;

    public long f44408w;

    public TLRPC.EmojiStatus f44409x;

    public TLRPC.EmojiStatus f44410y;

    public xc(long j10) {
        super(null);
        boolean zQ = org.telegram.ui.ActionBar.g6.I.q();
        this.F = zQ;
        this.N = 0;
        this.f44396l0 = zQ;
        this.f44398n0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f44407u0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.resourceProvider));
        this.f44405s0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f44406t0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f44380a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f44382b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new jh.y1(1, this, chat));
        this.resourceProvider = new wc(this);
        this.f44399o0 = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f44400p0 = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
        this.f44401q0 = new org.telegram.ui.ActionBar.d5(0, true, false, this.resourceProvider);
        this.f44403r0 = new org.telegram.ui.ActionBar.d5(0, true, true, this.resourceProvider);
    }

    public static void U(xc xcVar) {
        org.telegram.ui.ActionBar.c6 c6Var = xcVar.resourceProvider;
        if (c6Var instanceof wc) {
            xc xcVar2 = ((wc) c6Var).f43700a;
            xcVar2.F = !xcVar2.F;
            xcVar2.d1();
            xcVar2.Z0(false);
        } else {
            xcVar.F = !xcVar.F;
            xcVar.d1();
        }
        xcVar.U0(xcVar.F, true);
        xcVar.Z0(false);
    }

    public static void V(xc xcVar, TLRPC.ChatFull chatFull, View view, int i10) {
        long j10;
        long emojiStatusDocumentId;
        kc kcVar;
        boolean z10;
        ac acVar;
        int iV0;
        int i11;
        org.telegram.ui.Components.i5 i5Var;
        boolean z11;
        int iMin;
        Drawable[] drawableArr;
        Drawable drawable;
        long j11;
        Rect rect;
        int iDp;
        int i12;
        boolean z12;
        int i13;
        Long lValueOf;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        long j12 = xcVar.f44380a;
        int i14 = 1;
        if (!(view instanceof kc)) {
            if (i10 == xcVar.f44381a0) {
                xcVar.f44404s = -1;
                xcVar.f44408w = 0L;
                if (xcVar.f44410y instanceof TLRPC.TL_emojiStatusCollectible) {
                    xcVar.f44410y = null;
                }
                xcVar.b1();
                xcVar.X0(true);
                xcVar.c1();
                xcVar.Z0(true);
                return;
            }
            if (i10 == xcVar.T) {
                Activity parentActivity = xcVar.getParentActivity();
                long j13 = xcVar.f44380a;
                org.telegram.ui.ActionBar.c6 c6Var = xcVar.resourceProvider;
                x3 x3Var = new x3(xcVar, i14);
                g gVar = new g(xcVar, 12);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = xcVar.f44384c;
                int i15 = org.telegram.ui.Components.ap.f26776e0;
                org.telegram.ui.Components.gi giVar = new org.telegram.ui.Components.gi(parentActivity, xcVar, false, false, false, c6Var);
                giVar.drawNavigationBar = true;
                giVar.L1(LocaleController.getString(R.string.ChooseBackground));
                giVar.V1 = new org.telegram.ui.Components.po(giVar, tL_premium_boostsStatus2, c6Var, gVar, j13, x3Var, xcVar);
                giVar.J1(1, false);
                giVar.r1();
                giVar.f28650f0.f0();
                giVar.show();
                return;
            }
            return;
        }
        if (i10 == xcVar.f44390f0) {
            if (chatFull == null) {
                return;
            }
            c70 c70Var = new c70(-j12);
            c70Var.e0(chatFull);
            xcVar.presentFragment(c70Var);
            return;
        }
        if (i10 == xcVar.Q) {
            emojiStatusDocumentId = xcVar.f44397n;
        } else {
            if (i10 != xcVar.Y) {
                if (i10 == xcVar.f44383b0) {
                    TLRPC.EmojiStatus emojiStatus = xcVar.f44410y;
                    emojiStatusDocumentId = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : DialogObject.getEmojiStatusDocumentId(emojiStatus);
                } else {
                    j10 = 0;
                }
                if (i10 == xcVar.f44386d0) {
                    int iH0 = xcVar.H0();
                    tL_premium_boostsStatus = xcVar.f44384c;
                    if (tL_premium_boostsStatus == null && tL_premium_boostsStatus.level < iH0) {
                        xcVar.T0(29);
                        return;
                    }
                    c70 c70Var2 = new c70(-j12, 0);
                    c70Var2.e0(chatFull);
                    xcVar.presentFragment(c70Var2);
                    return;
                }
                kcVar = (kc) view;
                if (i10 == xcVar.f44383b0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                acVar = new ac(xcVar, i10, view);
                if (xcVar.f44410y instanceof TLRPC.TL_emojiStatusCollectible) {
                    iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, xcVar.resourceProvider);
                } else {
                    iV0 = kcVar.f39694f;
                }
                i11 = iV0;
                if (xcVar.M == null) {
                    i5Var = kcVar.f39692c;
                    r51[] r51VarArr = new r51[1];
                    if (kcVar.getHeight() + kcVar.getTop() > xcVar.I.getMeasuredHeight() / 2.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    iMin = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int iMin2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    drawableArr = i5Var.f29229f;
                    drawable = drawableArr[1];
                    if (drawable != null) {
                        j11 = 0;
                        if (drawable instanceof org.telegram.ui.Components.k5) {
                            ((org.telegram.ui.Components.k5) drawable).p(i5Var);
                        }
                        drawableArr[1] = null;
                    } else {
                        j11 = 0;
                    }
                    i5Var.f();
                    kcVar.f();
                    rect = AndroidUtilities.rectTmp2;
                    rect.set(i5Var.getBounds());
                    if (z11) {
                        iDp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - iMin;
                    } else {
                        iDp = (-(kcVar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    }
                    int iCenterX = rect.centerX() - (AndroidUtilities.displaySize.x - iMin2);
                    if (z10) {
                        if (z11) {
                            i12 = 10;
                        } else {
                            i12 = 9;
                        }
                    } else if (z11) {
                        i12 = 5;
                    } else {
                        i12 = 7;
                    }
                    z12 = z11;
                    Activity parentActivity2 = xcVar.getParentActivity();
                    Integer numValueOf = Integer.valueOf(iCenterX);
                    org.telegram.ui.ActionBar.c6 resourceProvider = xcVar.getResourceProvider();
                    if (z12) {
                        i13 = 24;
                    } else {
                        i13 = 16;
                    }
                    fc fcVar = new fc(xcVar, xcVar, parentActivity2, numValueOf, i12, resourceProvider, i13, i11, acVar, r51VarArr);
                    fcVar.f36391c1 = true;
                    if (j10 == j11) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(j10);
                    }
                    fcVar.setSelected(lValueOf);
                    fcVar.setSaveState(3);
                    fcVar.y(i5Var, kcVar);
                    gc gcVar = new gc(xcVar, fcVar);
                    xcVar.M = gcVar;
                    r51VarArr[0] = gcVar;
                    gcVar.showAsDropDown(kcVar, 0, iDp, 53);
                    r51VarArr[0].b();
                }
            }
            emojiStatusDocumentId = xcVar.f44408w;
        }
        j10 = emojiStatusDocumentId;
        if (i10 == xcVar.f44386d0) {
            int iH1 = xcVar.H0();
            tL_premium_boostsStatus = xcVar.f44384c;
            if (tL_premium_boostsStatus == null) {
            }
            c70 c70Var3 = new c70(-j12, 0);
            c70Var3.e0(chatFull);
            xcVar.presentFragment(c70Var3);
            return;
        }
        kcVar = (kc) view;
        if (i10 == xcVar.f44383b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        acVar = new ac(xcVar, i10, view);
        if (xcVar.f44410y instanceof TLRPC.TL_emojiStatusCollectible) {
            iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, xcVar.resourceProvider);
        } else {
            iV0 = kcVar.f39694f;
        }
        i11 = iV0;
        if (xcVar.M == null) {
            i5Var = kcVar.f39692c;
            r51[] r51VarArr2 = new r51[1];
            if (kcVar.getHeight() + kcVar.getTop() > xcVar.I.getMeasuredHeight() / 2.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            iMin = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
            int iMin3 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
            drawableArr = i5Var.f29229f;
            drawable = drawableArr[1];
            if (drawable != null) {
                j11 = 0;
                if (drawable instanceof org.telegram.ui.Components.k5) {
                    ((org.telegram.ui.Components.k5) drawable).p(i5Var);
                }
                drawableArr[1] = null;
            } else {
                j11 = 0;
            }
            i5Var.f();
            kcVar.f();
            rect = AndroidUtilities.rectTmp2;
            rect.set(i5Var.getBounds());
            if (z11) {
                iDp = (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - iMin;
            } else {
                iDp = (-(kcVar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
            }
            int iCenterX2 = rect.centerX() - (AndroidUtilities.displaySize.x - iMin3);
            if (z10) {
                if (z11) {
                    i12 = 10;
                } else {
                    i12 = 9;
                }
            } else if (z11) {
                i12 = 5;
            } else {
                i12 = 7;
            }
            z12 = z11;
            Activity parentActivity3 = xcVar.getParentActivity();
            Integer numValueOf2 = Integer.valueOf(iCenterX2);
            org.telegram.ui.ActionBar.c6 resourceProvider2 = xcVar.getResourceProvider();
            if (z12) {
                i13 = 24;
            } else {
                i13 = 16;
            }
            fc fcVar2 = new fc(xcVar, xcVar, parentActivity3, numValueOf2, i12, resourceProvider2, i13, i11, acVar, r51VarArr2);
            fcVar2.f36391c1 = true;
            if (j10 == j11) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(j10);
            }
            fcVar2.setSelected(lValueOf);
            fcVar2.setSaveState(3);
            fcVar2.y(i5Var, kcVar);
            gc gcVar2 = new gc(xcVar, fcVar2);
            xcVar.M = gcVar2;
            r51VarArr2[0] = gcVar2;
            gcVar2.showAsDropDown(kcVar, 0, iDp, 53);
            r51VarArr2[0].b();
        }
    }

    public static void W(xc xcVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        int lvl;
        int i10;
        int i11;
        long j10 = xcVar.f44380a;
        if (xcVar.f44387e == xcVar.f44389f) {
            lvl = 0;
        } else {
            MessagesController.PeerColors peerColors = xcVar.getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(xcVar.f44389f);
            if (color == null || color.getLvl(xcVar.d) <= xcVar.f44382b) {
                lvl = 0;
            } else {
                lvl = color.getLvl(xcVar.d);
            }
        }
        if (xcVar.f44402r == xcVar.f44404s) {
            i10 = 20;
        } else {
            MessagesController.PeerColors peerColors2 = xcVar.getMessagesController().profilePeerColors;
            MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(xcVar.f44404s) : null;
            if (color2 == null || color2.getLvl(xcVar.d) <= xcVar.f44382b) {
                i10 = 20;
            } else {
                lvl = color2.getLvl(xcVar.d);
                i10 = 24;
            }
        }
        int i12 = lvl;
        if (xcVar.h != xcVar.f44397n && xcVar.getMessagesController().channelBgIconLevelMin > xcVar.f44382b) {
            i10 = 27;
        }
        if (xcVar.v != xcVar.f44408w && xcVar.J0() > xcVar.f44382b) {
            i10 = 28;
        }
        if (!DialogObject.emojiStatusesEqual(xcVar.f44409x, xcVar.f44410y) && xcVar.F0() > xcVar.f44382b) {
            i10 = xcVar.f44410y instanceof TLRPC.TL_emojiStatusCollectible ? 26 : 25;
        }
        if (ChatThemeController.wallpaperEquals(xcVar.A, xcVar.B)) {
            i11 = i10;
        } else {
            i11 = !TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(xcVar.B)) ? 22 : 23;
        }
        if (xcVar.getParentActivity() == null || xcVar.getParentActivity() == null) {
            return;
        }
        ec ecVar = new ec(xcVar, xcVar.getParentActivity(), i11, xcVar.currentAccount, xcVar.getResourceProvider(), i12);
        ecVar.G1(canApplyBoost);
        ecVar.F1(xcVar.f44384c, true);
        ecVar.H1(j10);
        TLRPC.Chat chat = xcVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            ecVar.M0 = new org.telegram.messenger.voip.l0(25, xcVar, chat);
        }
        xcVar.showDialog(ecVar);
        xcVar.L.setLoading(false);
    }

    public static void Y0(View view) {
        if (view instanceof kc) {
            kc kcVar = (kc) view;
            kcVar.f39690a.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, kcVar.d));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.l8) {
            ((org.telegram.ui.Cells.l8) view).v();
            return;
        }
        if (view instanceof oc) {
            oc ocVar = (oc) view;
            AndroidUtilities.forEachViews((RecyclerView) ocVar.f41058b, (d5.d) new jh.y1(2, ocVar, MessagesController.getInstance(ocVar.d).peerColors));
            return;
        }
        if (view instanceof vc) {
            vc vcVar = (vc) view;
            ArrayList arrayList = vcVar.f43417c;
            org.telegram.ui.ActionBar.c6 c6Var = vcVar.f43416b;
            int iA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.zo) arrayList.get(i10)).f35318c = iA;
            }
            AndroidUtilities.forEachViews((RecyclerView) vcVar.d, (d5.d) new rc(vcVar, 0));
            vcVar.h.l();
        }
    }

    public int A0() {
        return 0;
    }

    public int B0() {
        return 0;
    }

    public final TLRPC.Document C0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long D0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).f22386id;
            }
        }
        return j10;
    }

    public int E0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int F0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int G0() {
        return R.string.ChannelEmojiStatus;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 3;
    }

    public int J0() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    public int K0() {
        return R.string.ChannelProfileInfo;
    }

    public int L0() {
        return 0;
    }

    public int M0() {
        return 0;
    }

    public int N0() {
        return R.string.ChannelWallpaper2Info;
    }

    public int O0() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    public int P0() {
        return R.string.ChannelWallpaper;
    }

    public final boolean Q0() {
        return (this.f44387e == this.f44389f && this.h == this.f44397n && this.f44402r == this.f44404s && this.v == this.f44408w && DialogObject.emojiStatusesEqual(this.f44409x, this.f44410y) && ChatThemeController.wallpaperEquals(this.A, this.B)) ? false : true;
    }

    public boolean R0() {
        return false;
    }

    public final int S0() {
        int iMax = 0;
        if (this.f44387e != this.f44389f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            MessagesController.PeerColor color = peerColors == null ? null : peerColors.getColor(this.f44389f);
            if (color != null) {
                iMax = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f44397n) {
            iMax = Math.max(iMax, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f44402r != this.f44404s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(this.f44404s) : null;
            if (color2 != null) {
                iMax = Math.max(iMax, color2.getLvl(this.d));
            }
        }
        if (this.v != this.f44408w) {
            iMax = Math.max(iMax, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f44409x, this.f44410y)) {
            iMax = Math.max(iMax, F0());
        }
        return !ChatThemeController.wallpaperEquals(this.A, this.B) ? Math.max(iMax, O0()) : iMax;
    }

    public final void U0(boolean z10, boolean z11) {
        if (this.f44396l0 == z10) {
            return;
        }
        this.f44396l0 = z10;
        if (z11) {
            org.telegram.ui.Components.oi0 oi0Var = this.G;
            oi0Var.N(z10 ? oi0Var.f31312e[0] : 0);
            org.telegram.ui.Components.oi0 oi0Var2 = this.G;
            if (oi0Var2 != null) {
                oi0Var2.start();
                return;
            }
            return;
        }
        int i10 = z10 ? this.G.f31312e[0] - 1 : 0;
        this.G.L(i10, false, true);
        this.G.N(i10);
        org.telegram.ui.ActionBar.v0 v0Var = this.H;
        if (v0Var != null) {
            v0Var.invalidate();
        }
    }

    public final void V0() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.a2(this) {

            public final xc f37349b;

            {
                this.f37349b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.f37349b.finishFragment();
                        break;
                    default:
                        this.f37349b.w0();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.a2(this) {

            public final xc f37349b;

            {
                this.f37349b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        this.f37349b.finishFragment();
                        break;
                    default:
                        this.f37349b.w0();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        showDialog(b2Var);
        ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f44380a));
            this.f44384c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f44382b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            jc jcVar = this.J;
            if (jcVar != null) {
                jcVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z10) {
        if (this.L == null || this.f44384c == null) {
            return;
        }
        int iS0 = S0();
        if (this.f44382b >= iS0) {
            this.L.f(null, z10);
            return;
        }
        if (this.E == null) {
            this.E = new SpannableStringBuilder("l");
            org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.mini_switch_lock, 0);
            cqVar.setTopOffset(1);
            this.E.setSpan(cqVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.E).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", iS0, new Object[0]));
        this.L.f(spannableStringBuilder, z10);
    }

    public void Z0(boolean z10) {
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8));
        this.actionBar.setTitleColor((!this.d || this.f44404s == -1) ? getThemedColor(org.telegram.ui.ActionBar.g6.A8) : -1);
        this.actionBar.D((!this.d || this.f44404s == -1) ? getThemedColor(org.telegram.ui.ActionBar.g6.f23375v8) : -1, false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.f23341t8), false);
        if (z10) {
            return;
        }
        org.telegram.ui.Components.zk0 zk0Var = this.I;
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        zk0Var.setBackgroundColor(getThemedColor(i10));
        this.J.l();
        AndroidUtilities.forEachViews((RecyclerView) this.I, (d5.d) new j4.w0(this));
        this.K.setBackgroundColor(getThemedColor(i10));
        this.L.j();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void a1(boolean z10) {
        MessageObject messageObject;
        View viewY0 = y0(this.O);
        View viewY1 = y0(this.P);
        View viewY2 = y0(this.Q);
        View viewY3 = y0(this.S);
        if (viewY0 instanceof org.telegram.ui.Cells.ba) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) viewY0;
            org.telegram.ui.Cells.s1[] cells = baVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f44389f;
                    messageObject.overrideLinkEmoji = this.f44397n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable drawableF = lh.q6.f(this.D, this.currentAccount, this.B, this.F);
            this.D = drawableF;
            baVar.setOverrideBackground(drawableF);
        }
        if (viewY1 instanceof yo0) {
            ((yo0) viewY1).a(this.f44389f, z10);
        } else if (viewY1 instanceof oc) {
            ((oc) viewY1).a(this.f44389f, z10);
        }
        if (viewY2 instanceof kc) {
            kc kcVar = (kc) viewY2;
            kcVar.a(this.currentAccount, this.f44389f, true);
            kcVar.c(this.f44397n, false, z10);
        }
        if (viewY3 instanceof vc) {
            vc vcVar = (vc) viewY3;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.B);
            if (wallpaperEmoticon == null && this.B == null && this.C != null) {
                wallpaperEmoticon = "❌";
            }
            vcVar.a(wallpaperEmoticon, z10);
            vcVar.setGalleryWallpaper(this.C);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View viewY0 = y0(this.V);
        View viewY1 = y0(this.X);
        View viewY2 = y0(this.Y);
        View viewY3 = y0(this.f44383b0);
        View viewY4 = y0(this.f44386d0);
        View viewY5 = y0(this.f44390f0);
        if (viewY0 instanceof qc) {
            TLRPC.EmojiStatus emojiStatus = this.f44410y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                qc qcVar = (qc) viewY0;
                pc pcVar = qcVar.f41629b;
                MessagesController.PeerColor peerColorFromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                pcVar.c(peerColorFromCollectible, true);
                qcVar.f41628a.c(peerColorFromCollectible, true);
                pcVar.d(((TLRPC.TL_emojiStatusCollectible) this.f44410y).pattern_document_id, true, true);
            } else {
                qc qcVar2 = (qc) viewY0;
                pc pcVar2 = qcVar2.f41629b;
                int i10 = this.f44404s;
                pcVar2.b(i10, true);
                qcVar2.f41628a.b(qcVar2.h.currentAccount, i10, true);
                pcVar2.d(this.f44408w, false, true);
            }
            qc qcVar3 = (qc) viewY0;
            pc pcVar3 = qcVar3.f41629b;
            pcVar3.e(DialogObject.getEmojiStatusDocumentId(this.f44410y), false, true);
            pcVar3.a(this.f44389f);
            qcVar3.d();
        }
        if (viewY1 instanceof yo0) {
            ((yo0) viewY1).a(this.f44404s, true);
        } else if (viewY1 instanceof oc) {
            ((oc) viewY1).a(this.f44389f, true);
        }
        if (viewY2 instanceof kc) {
            kc kcVar = (kc) viewY2;
            kcVar.a(this.currentAccount, this.f44404s, false);
            kcVar.c(this.f44408w, false, true);
        }
        if (viewY3 instanceof kc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f44410y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((kc) viewY3).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((kc) viewY3).a(this.currentAccount, this.f44404s, false);
            }
            ((kc) viewY3).c(DialogObject.getEmojiStatusDocumentId(this.f44410y), DialogObject.isEmojiStatusCollectible(this.f44410y), true);
        }
        boolean z10 = viewY4 instanceof kc;
        long j10 = this.f44380a;
        if (z10) {
            kc kcVar2 = (kc) viewY4;
            kcVar2.a(this.currentAccount, this.f44404s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull == null || (stickerSet2 = chatFull.emojiset) == null) {
                kcVar2.c(0L, false, false);
            } else {
                kcVar2.c(D0(stickerSet2), false, false);
            }
        }
        if (viewY5 instanceof kc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 == null || (stickerSet = chatFull2.stickerset) == null) {
                ((kc) viewY5).c(0L, false, false);
            } else {
                ((kc) viewY5).d(C0(stickerSet));
            }
        }
        c1();
    }

    public void c1() {
        jc jcVar;
        jc jcVar2;
        this.O = 0;
        int i10 = 1 + 1;
        this.P = 1;
        this.Q = i10;
        this.R = i10 + 1;
        this.S = i10 + 2;
        this.T = i10 + 3;
        this.U = i10 + 4;
        this.V = i10 + 5;
        this.X = i10 + 6;
        int i11 = i10 + 8;
        this.N = i11;
        this.Y = i10 + 7;
        if (this.f44408w != 0 || this.f44404s >= 0 || (this.f44410y instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z10 = this.f44381a0 >= 0;
            this.N = i10 + 9;
            this.f44381a0 = i11;
            if (!z10 && (jcVar = this.J) != null) {
                jcVar.o(i11);
                this.J.m(this.Y);
            }
        } else {
            int i12 = this.f44381a0;
            this.f44381a0 = -1;
            if (i12 >= 0 && (jcVar2 = this.J) != null) {
                jcVar2.u(i12);
                this.J.m(this.Y);
            }
        }
        int i13 = this.N;
        this.Z = i13;
        this.f44383b0 = i13 + 1;
        this.N = i13 + 3;
        this.f44385c0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f44380a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f44389f = colorId;
            this.f44387e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f44397n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f44404s = profileColorId;
            this.f44402r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f44408w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f44410y = emojiStatus;
            this.f44409x = emojiStatus;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (chatFull != null) {
            TLRPC.WallPaper wallPaper = chatFull.wallpaper;
            this.B = wallPaper;
            this.A = wallPaper;
            if (ChatThemeController.isNotEmoticonWallpaper(wallPaper)) {
                this.C = this.A;
            }
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 25));
        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.sun, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.G = oi0Var;
        oi0Var.h = true;
        if (this.F) {
            oi0Var.K(35);
            this.G.N(36);
        } else {
            oi0Var.N(0);
            this.G.K(0);
        }
        this.G.W = true;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J9, this.resourceProvider);
        this.G.O(iV0, "Sunny");
        this.G.O(iV0, "Path 6");
        this.G.O(iV0, "Path");
        this.G.O(iV0, "Path 5");
        this.H = this.actionBar.n().d(1, this.G);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.I);
        }
        org.telegram.ui.Components.zk0 zk0Var = this.I;
        jc jcVar = new jc(this);
        this.J = jcVar;
        zk0Var.setAdapter(jcVar);
        new f2.x(3);
        this.I.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var2 = this.I;
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        zk0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.I, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.I.setOnItemClickListener(new cg.x0(6, this, chatFull));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.C = false;
        lVar.f5819m = false;
        this.I.setItemAnimator(lVar);
        lh.d dVar = new lh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.L = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.L.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.K = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.K.addView(this.L, h7.z5.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.K, h7.z5.e(-1, 68, 80));
        setBulletinDelegate(new y8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        org.telegram.ui.ActionBar.f6 f6VarN0;
        String[] strArr;
        String str;
        SparseIntArray sparseIntArrayQ0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.e6 e6VarK;
        View viewY0;
        int i11;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str2 = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
            string = "Blue";
        }
        String str3 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        if (string.equals(string2)) {
            if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
            }
            if (this.F) {
                f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str3);
            } else {
                f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
            }
            this.f44398n0.clear();
            strArr = new String[1];
            str = f6VarN0.d;
            if (str != null) {
                sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(null, str, strArr);
            } else {
                sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(new File(f6VarN0.f22943b), null, strArr);
            }
            iArr = org.telegram.ui.ActionBar.g6.nl;
            if (iArr != null) {
                for (i11 = 0; i11 < iArr.length; i11++) {
                    this.f44398n0.put(i11, iArr[i11]);
                }
            }
            for (i10 = 0; i10 < sparseIntArrayQ0.size(); i10++) {
                this.f44398n0.put(sparseIntArrayQ0.keyAt(i10), sparseIntArrayQ0.valueAt(i10));
            }
            e6VarK = f6VarN0.k(false);
            if (e6VarK != null) {
                e6VarK.c(sparseIntArrayQ0, this.f44398n0);
            }
            this.f44407u0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.resourceProvider));
            this.D = lh.q6.f(this.D, this.currentAccount, this.B, this.F);
            viewY0 = y0(this.O);
            if (viewY0 instanceof org.telegram.ui.Cells.ba) {
                ((org.telegram.ui.Cells.ba) viewY0).setOverrideBackground(this.D);
            }
        }
        str3 = string2;
        str2 = string;
        if (this.F) {
            f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str3);
        } else {
            f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
        }
        this.f44398n0.clear();
        strArr = new String[1];
        str = f6VarN0.d;
        if (str != null) {
            sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(null, str, strArr);
        } else {
            sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(new File(f6VarN0.f22943b), null, strArr);
        }
        iArr = org.telegram.ui.ActionBar.g6.nl;
        if (iArr != null) {
            while (i11 < iArr.length) {
                this.f44398n0.put(i11, iArr[i11]);
            }
        }
        while (i10 < sparseIntArrayQ0.size()) {
            this.f44398n0.put(sparseIntArrayQ0.keyAt(i10), sparseIntArrayQ0.valueAt(i10));
        }
        e6VarK = f6VarN0.k(false);
        if (e6VarK != null) {
            e6VarK.c(sparseIntArrayQ0, this.f44398n0);
        }
        this.f44407u0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.resourceProvider));
        this.D = lh.q6.f(this.D, this.currentAccount, this.B, this.F);
        viewY0 = y0(this.O);
        if (viewY0 instanceof org.telegram.ui.Cells.ba) {
            ((org.telegram.ui.Cells.ba) viewY0).setOverrideBackground(this.D);
        }
    }

    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.f44380a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().getBoostsController().getBoostsStats(j10, new cc(this, 1));
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !Q0() || this.f44382b < S0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f44382b < S0() || !Q0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        V0();
        return false;
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.m0 = c6Var;
    }

    public final void w0() {
        int[] iArr;
        char c10;
        boolean z10;
        TLRPC.TL_channels_updateColor tL_channels_updateColor;
        long j10;
        int i10;
        long j11;
        ?? r13;
        TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper;
        TLRPC.WallPaper wallPaper;
        TLRPC.ChatFull chatFull;
        TLRPC.WallPaper wallPaper2;
        TLRPC.WallPaper wallPaper3;
        if (this.f44384c == null || this.L.J) {
            return;
        }
        int i11 = this.f44382b;
        int iS0 = S0();
        long j12 = this.f44380a;
        int i12 = 0;
        if (i11 < iS0) {
            this.L.setLoading(true);
            getMessagesController().getBoostsController().userCanBoostChannel(j12, this.f44384c, new cc(this, i12));
            return;
        }
        int[] iArr2 = {0};
        final cg.e1 e1Var = new cg.e1(this, new boolean[]{false}, new int[]{0}, iArr2, 5);
        long j13 = -j12;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j13));
        if (chat == null) {
            FileLog.e("channel is null in ChannelColorAcitivity");
            org.telegram.messenger.y1.q(R.string.UnknownError, org.telegram.ui.Components.mc.a0(this), R.raw.error, 36);
            return;
        }
        this.L.setLoading(true);
        if (this.f44387e == this.f44389f) {
            iArr = iArr2;
            if (this.h == this.f44397n) {
                z10 = true;
                c10 = 0;
            }
            if (this.f44402r == this.f44404s || this.v != this.f44408w) {
                tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                j10 = j13;
                tL_channels_updateColor.channel = getMessagesController().getInputChannel(j10);
                tL_channels_updateColor.for_profile = z10;
                if (chat.profile_color == null) {
                    chat.profile_color = new TLRPC.TL_peerColor();
                    chat.flags2 |= 256;
                }
                i10 = this.f44404s;
                if (i10 >= 0) {
                    tL_channels_updateColor.flags |= 4;
                    tL_channels_updateColor.color = i10;
                    TLRPC.PeerColor peerColor = chat.profile_color;
                    peerColor.flags |= 1;
                    peerColor.color = i10;
                } else {
                    chat.profile_color.flags &= -2;
                }
                j11 = this.f44408w;
                if (j11 != 0) {
                    tL_channels_updateColor.flags |= 1;
                    tL_channels_updateColor.background_emoji_id = j11;
                    TLRPC.PeerColor peerColor2 = chat.profile_color;
                    peerColor2.flags |= 2;
                    peerColor2.background_emoji_id = j11;
                } else {
                    TLRPC.PeerColor peerColor3 = chat.profile_color;
                    peerColor3.flags &= -3;
                    peerColor3.background_emoji_id = 0L;
                }
                iArr[c10] = iArr[c10] + 1;
                final int i13 = 3;
                getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) {

                    public final xc f45125b;

                    {
                        this.f45125b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i13) {
                            case 0:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                            case 1:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                            case 2:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                            default:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                        }
                    }
                });
            } else {
                j10 = j13;
            }
            if (!ChatThemeController.wallpaperEquals(this.A, this.B)) {
                tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                tL_messages_setChatWallPaper.peer = getMessagesController().getInputPeer(j12);
                wallPaper = this.B;
                if (wallPaper != null) {
                    if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                        tL_messages_setChatWallPaper.flags |= 1;
                        wallPaper3 = this.B;
                        if (wallPaper3 instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                            TLRPC.WallPaper wallPaper4 = this.B;
                            tL_inputWallPaper.f22452id = wallPaper4.f22532id;
                            tL_inputWallPaper.access_hash = wallPaper4.access_hash;
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                        } else if (wallPaper3 instanceof TLRPC.TL_wallPaperNoFile) {
                            TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                            tL_inputWallPaperNoFile.f22453id = this.B.f22532id;
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile;
                        }
                    } else {
                        tL_messages_setChatWallPaper.flags |= 1;
                        TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile2 = new TLRPC.TL_inputWallPaperNoFile();
                        tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile2;
                        tL_inputWallPaperNoFile2.f22453id = 0L;
                        tL_messages_setChatWallPaper.flags |= 4;
                        TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                        tL_messages_setChatWallPaper.settings = tL_wallPaperSettings;
                        tL_wallPaperSettings.flags |= 128;
                        tL_wallPaperSettings.emoticon = ChatThemeController.getWallpaperEmoticon(this.B);
                    }
                }
                iArr[c10] = iArr[c10] + 1;
                final int i14 = 0;
                getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) {

                    public final xc f45125b;

                    {
                        this.f45125b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i14) {
                            case 0:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                            case 1:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                            case 2:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                            default:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                        }
                    }
                });
                chatFull = getMessagesController().getChatFull(j10);
                ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(j12, this.B);
                if (chatFull != null) {
                    wallPaper2 = this.B;
                    if (wallPaper2 == null) {
                        chatFull.flags2 &= -129;
                        chatFull.wallpaper = null;
                    } else {
                        chatFull.flags2 |= 128;
                        chatFull.wallpaper = wallPaper2;
                    }
                    getMessagesController().putChatFull(chatFull);
                    NotificationCenter notificationCenter = getNotificationCenter();
                    int i15 = NotificationCenter.chatInfoDidLoad;
                    Boolean bool = Boolean.FALSE;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, chatFull, 0, bool, bool);
                }
            }
            if (DialogObject.emojiStatusesEqual(this.f44409x, this.f44410y)) {
                r13 = 0;
            } else {
                tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                tL_channels_updateEmojiStatus.channel = getMessagesController().getInputChannel(j10);
                emojiStatus = this.f44410y;
                if (emojiStatus != null || (emojiStatus instanceof TLRPC.TL_emojiStatusEmpty)) {
                    tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                    chat.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                    chat.flags2 &= -513;
                } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                    tL_inputEmojiStatusCollectible.collectible_id = tL_emojiStatusCollectible.collectible_id;
                    tL_inputEmojiStatusCollectible.flags = tL_emojiStatusCollectible.flags;
                    tL_inputEmojiStatusCollectible.until = tL_emojiStatusCollectible.until;
                    tL_channels_updateEmojiStatus.emoji_status = tL_inputEmojiStatusCollectible;
                    chat.emoji_status = this.f44410y;
                    chat.flags |= 512;
                } else {
                    tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                    chat.emoji_status = emojiStatus;
                    chat.flags |= 512;
                }
                getMessagesController().updateEmojiStatusUntilUpdate(j12, this.f44410y);
                r13 = 0;
                final int i16 = 1;
                iArr[0] = iArr[0] + 1;
                getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) {

                    public final xc f45125b;

                    {
                        this.f45125b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i16) {
                            case 0:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                            case 1:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                            case 2:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                            default:
                                if (tLObject instanceof TLRPC.Updates) {
                                    this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                }
                                e1Var.run(tL_error);
                                break;
                        }
                    }
                });
            }
            if (iArr[r13] == 0) {
                finishFragment();
                this.L.setLoading(r13);
                return;
            }
            getMessagesController().putChat(chat, r13);
            NotificationCenter notificationCenter2 = getNotificationCenter();
            int i17 = NotificationCenter.updateInterfaces;
            Object[] objArr = new Object[1];
            objArr[r13] = Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS);
            notificationCenter2.lambda$postNotificationNameOnUIThread$1(i17, objArr);
        }
        iArr = iArr2;
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().getInputChannel(j13);
        tL_channels_updateColor2.for_profile = false;
        if (chat.color == null) {
            chat.color = new TLRPC.TL_peerColor();
            chat.flags2 |= 128;
        }
        int i18 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i18 | 4;
        int i19 = this.f44389f;
        tL_channels_updateColor2.color = i19;
        TLRPC.PeerColor peerColor4 = chat.color;
        int i20 = peerColor4.flags;
        c10 = 0;
        int i21 = i20 | 1;
        peerColor4.flags = i21;
        peerColor4.color = i19;
        z10 = true;
        long j14 = this.f44397n;
        if (j14 != 0) {
            tL_channels_updateColor2.flags = i18 | 5;
            tL_channels_updateColor2.background_emoji_id = j14;
            peerColor4.flags = i20 | 3;
            peerColor4.background_emoji_id = j14;
        } else {
            peerColor4.flags = i21 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        final int i22 = 2;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) {

            public final xc f45125b;

            {
                this.f45125b = this;
            }

            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i22) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        e1Var.run(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        e1Var.run(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        e1Var.run(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        }
                        e1Var.run(tL_error);
                        break;
                }
            }
        });
        if (this.f44402r == this.f44404s) {
            tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
            j10 = j13;
            tL_channels_updateColor.channel = getMessagesController().getInputChannel(j10);
            tL_channels_updateColor.for_profile = z10;
            if (chat.profile_color == null) {
                chat.profile_color = new TLRPC.TL_peerColor();
                chat.flags2 |= 256;
            }
            i10 = this.f44404s;
            if (i10 >= 0) {
                tL_channels_updateColor.flags |= 4;
                tL_channels_updateColor.color = i10;
                TLRPC.PeerColor peerColor5 = chat.profile_color;
                peerColor5.flags |= 1;
                peerColor5.color = i10;
            } else {
                chat.profile_color.flags &= -2;
            }
            j11 = this.f44408w;
            if (j11 != 0) {
                tL_channels_updateColor.flags |= 1;
                tL_channels_updateColor.background_emoji_id = j11;
                TLRPC.PeerColor peerColor6 = chat.profile_color;
                peerColor6.flags |= 2;
                peerColor6.background_emoji_id = j11;
            } else {
                TLRPC.PeerColor peerColor7 = chat.profile_color;
                peerColor7.flags &= -3;
                peerColor7.background_emoji_id = 0L;
            }
            iArr[c10] = iArr[c10] + 1;
            final int i110 = 3;
            getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) {

                public final xc f45125b;

                {
                    this.f45125b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i110) {
                        case 0:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        case 1:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        case 2:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        default:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                    }
                }
            });
        } else {
            tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
            j10 = j13;
            tL_channels_updateColor.channel = getMessagesController().getInputChannel(j10);
            tL_channels_updateColor.for_profile = z10;
            if (chat.profile_color == null) {
                chat.profile_color = new TLRPC.TL_peerColor();
                chat.flags2 |= 256;
            }
            i10 = this.f44404s;
            if (i10 >= 0) {
                tL_channels_updateColor.flags |= 4;
                tL_channels_updateColor.color = i10;
                TLRPC.PeerColor peerColor8 = chat.profile_color;
                peerColor8.flags |= 1;
                peerColor8.color = i10;
            } else {
                chat.profile_color.flags &= -2;
            }
            j11 = this.f44408w;
            if (j11 != 0) {
                tL_channels_updateColor.flags |= 1;
                tL_channels_updateColor.background_emoji_id = j11;
                TLRPC.PeerColor peerColor9 = chat.profile_color;
                peerColor9.flags |= 2;
                peerColor9.background_emoji_id = j11;
            } else {
                TLRPC.PeerColor peerColor10 = chat.profile_color;
                peerColor10.flags &= -3;
                peerColor10.background_emoji_id = 0L;
            }
            iArr[c10] = iArr[c10] + 1;
            final int i111 = 3;
            getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) {

                public final xc f45125b;

                {
                    this.f45125b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i111) {
                        case 0:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        case 1:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        case 2:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        default:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                    }
                }
            });
        }
        if (!ChatThemeController.wallpaperEquals(this.A, this.B)) {
            tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
            tL_messages_setChatWallPaper.peer = getMessagesController().getInputPeer(j12);
            wallPaper = this.B;
            if (wallPaper != null) {
                if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                    tL_messages_setChatWallPaper.flags |= 1;
                    TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile3 = new TLRPC.TL_inputWallPaperNoFile();
                    tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile3;
                    tL_inputWallPaperNoFile3.f22453id = 0L;
                    tL_messages_setChatWallPaper.flags |= 4;
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings2 = new TLRPC.TL_wallPaperSettings();
                    tL_messages_setChatWallPaper.settings = tL_wallPaperSettings2;
                    tL_wallPaperSettings2.flags |= 128;
                    tL_wallPaperSettings2.emoticon = ChatThemeController.getWallpaperEmoticon(this.B);
                } else {
                    tL_messages_setChatWallPaper.flags |= 1;
                    wallPaper3 = this.B;
                    if (wallPaper3 instanceof TLRPC.TL_wallPaper) {
                        TLRPC.TL_inputWallPaper tL_inputWallPaper2 = new TLRPC.TL_inputWallPaper();
                        TLRPC.WallPaper wallPaper5 = this.B;
                        tL_inputWallPaper2.f22452id = wallPaper5.f22532id;
                        tL_inputWallPaper2.access_hash = wallPaper5.access_hash;
                        tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper2;
                    } else if (wallPaper3 instanceof TLRPC.TL_wallPaperNoFile) {
                        TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile4 = new TLRPC.TL_inputWallPaperNoFile();
                        tL_inputWallPaperNoFile4.f22453id = this.B.f22532id;
                        tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile4;
                    }
                }
            }
            iArr[c10] = iArr[c10] + 1;
            final int i112 = 0;
            getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) {

                public final xc f45125b;

                {
                    this.f45125b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i112) {
                        case 0:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        case 1:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        case 2:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        default:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                    }
                }
            });
            chatFull = getMessagesController().getChatFull(j10);
            ChatThemeController.getInstance(this.currentAccount).saveChatWallpaper(j12, this.B);
            if (chatFull != null) {
                wallPaper2 = this.B;
                if (wallPaper2 == null) {
                    chatFull.flags2 &= -129;
                    chatFull.wallpaper = null;
                } else {
                    chatFull.flags2 |= 128;
                    chatFull.wallpaper = wallPaper2;
                }
                getMessagesController().putChatFull(chatFull);
                NotificationCenter notificationCenter3 = getNotificationCenter();
                int i113 = NotificationCenter.chatInfoDidLoad;
                Boolean bool2 = Boolean.FALSE;
                notificationCenter3.lambda$postNotificationNameOnUIThread$1(i113, chatFull, 0, bool2, bool2);
            }
        }
        if (DialogObject.emojiStatusesEqual(this.f44409x, this.f44410y)) {
            tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
            tL_channels_updateEmojiStatus.channel = getMessagesController().getInputChannel(j10);
            emojiStatus = this.f44410y;
            if (emojiStatus != null) {
                tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                chat.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                chat.flags2 &= -513;
            } else {
                tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                chat.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                chat.flags2 &= -513;
            }
            getMessagesController().updateEmojiStatusUntilUpdate(j12, this.f44410y);
            r13 = 0;
            final int i114 = 1;
            iArr[0] = iArr[0] + 1;
            getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) {

                public final xc f45125b;

                {
                    this.f45125b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i114) {
                        case 0:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        case 1:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        case 2:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                        default:
                            if (tLObject instanceof TLRPC.Updates) {
                                this.f45125b.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            }
                            e1Var.run(tL_error);
                            break;
                    }
                }
            });
        } else {
            r13 = 0;
        }
        if (iArr[r13] == 0) {
            finishFragment();
            this.L.setLoading(r13);
            return;
        }
        getMessagesController().putChat(chat, r13);
        NotificationCenter notificationCenter4 = getNotificationCenter();
        int i115 = NotificationCenter.updateInterfaces;
        Object[] objArr2 = new Object[1];
        objArr2[r13] = Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS);
        notificationCenter4.lambda$postNotificationNameOnUIThread$1(i115, objArr2);
    }

    public void x0() {
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(getParentActivity(), this.resourceProvider);
        this.I = zk0Var;
        zk0Var.setSections(false);
    }

    public final View y0(int i10) {
        for (int i11 = 0; i11 < this.I.getChildCount(); i11++) {
            View childAt = this.I.getChildAt(i11);
            this.I.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int z0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public void T0(int i10) {
    }
}
