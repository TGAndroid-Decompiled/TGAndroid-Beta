package th;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import eg.t3;
import fg.s0;
import java.util.WeakHashMap;
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ed;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cd;
import org.telegram.ui.qr;
import org.telegram.ui.qu0;
import org.telegram.ui.vd1;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.n9;
public final class n extends p2 implements x40, NotificationCenter.NotificationCenterDelegate, xd.b {
    public y40 B;
    public TLRPC.FileLocation C;
    public s0 D;
    public TLRPC.Chat E;
    public TLRPC.ChatFull F;
    public final d2[] G;
    public final l H;
    public final xd.a f48188a;
    public long f48189b;
    public t3 f48190c;
    public h61 d;
    public String f48191e;
    public boolean f48192f;
    public boolean h;
    public n9 f48193n;
    public m f48194r;
    public fg.i0 f48195s;
    public p9 v;
    public AnimatorSet f48196w;
    public RadialProgressView f48197x;
    public z8 f48198y;

    public n(Bundle bundle) {
        super(bundle);
        this.f48188a = new xd.a(0, this, pr.h, 320L, false);
        this.G = new d2[1];
        this.H = new l(this);
    }

    public static boolean U(n nVar, h51 h51Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f20845id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, nVar.E);
            z10 = isChannelAndNotMegaGroup;
            z4 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f20992id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, nVar.E);
                z4 = isBot;
                z10 = false;
            }
            return false;
        }
        boolean z12 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = o0.b(nVar.currentAccount, j11);
        if (b10 != 1 && b10 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z12 || z11) {
            q70 F = q70.F(nVar.f48190c, null, view);
            int i11 = R.drawable.msg_viewintopic;
            if (z4) {
                i10 = R.string.CommunityMenuViewBot;
            } else if (z10) {
                i10 = R.string.CommunityMenuViewChannel;
            } else {
                i10 = R.string.CommunityMenuViewGroup;
            }
            F.l(i11, LocaleController.getString(i10), new h(nVar, j11, 1), z11);
            F.m(z12, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new ed(nVar, z4, z10, j11, 2));
            F.W(nVar.d.U0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(n nVar, h51 h51Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = h51Var.d;
        if (i10 == 140) {
            if (!nVar.B.h() && (chatPhoto = (chat = nVar.getMessagesController().getChat(Long.valueOf(nVar.f48189b))).photo) != null && chatPhoto.photo_big != null) {
                ImageLocation imageLocation = null;
                PhotoViewer.t1().K2(null, nVar, null);
                TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                int i11 = chatPhoto2.dc_id;
                if (i11 != 0) {
                    chatPhoto2.photo_big.dc_id = i11;
                }
                TLRPC.ChatFull chatFull = nVar.F;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        imageLocation = ImageLocation.getForPhoto(nVar.F.chat_photo.video_sizes.get(0), nVar.F.chat_photo);
                    }
                }
                PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, nVar.H, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z4 = true;
        if (i10 == 141) {
            y40 y40Var = nVar.B;
            if (nVar.C == null) {
                z4 = false;
            }
            y40Var.o(z4, new i(nVar, 0), new eg.c0(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", nVar.f48189b);
            bundle.putInt("type", 1);
            qr qrVar = new qr(bundle);
            qrVar.x0(nVar.F);
            nVar.presentFragment(qrVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", nVar.f48189b);
            bundle2.putInt("type", 0);
            qr qrVar2 = new qr(bundle2);
            qrVar2.x0(nVar.F);
            nVar.presentFragment(qrVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", nVar.f48189b);
            nVar.presentFragment(new q(bundle3));
        } else if (i10 == 150) {
            nVar.Z(true);
        } else if (i10 == 151) {
            nVar.Z(false);
        } else if (i10 == 145) {
            z4.s(nVar, false, nVar.E, null, false, true, true, false, new k(nVar));
        } else if (i10 == 146) {
            o0.e(nVar.G, nVar, nVar.currentAccount, nVar.E);
        } else {
            Object obj = h51Var.G;
            if (obj instanceof TLRPC.Chat) {
                nVar.presentFragment(xn.R9(-((TLRPC.Chat) obj).f20845id));
            } else if (obj instanceof TLRPC.User) {
                nVar.presentFragment(xn.R9(((TLRPC.User) obj).f20992id));
            }
        }
    }

    public static void W(n nVar) {
        nVar.C = null;
        MessagesController.getInstance(nVar.currentAccount).changeChatAvatar(nVar.f48189b, null, null, null, null, 0.0d, null, null, null, null);
        nVar.a0(false, true);
        nVar.v.h(null, null, nVar.f48198y, nVar.E);
    }

    @Override
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.f48197x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.f48197x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        this.D.setAlpha(f10);
        this.D.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        this.D.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        s0 s0Var = this.D;
        if (f10 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        s0Var.setVisibility(i11);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        boolean z4;
        if (this.f48192f == this.h && TextUtils.equals(((mh.m) this.f48193n.f45811b).getText().toString(), this.f48191e)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f48188a.a(z4, true);
    }

    public final void Z(boolean z4) {
        if (this.h == z4) {
            return;
        }
        i6 i6Var = (i6) this.d.x1(151);
        if (i6Var != null) {
            i6Var.a(!z4);
        }
        i6 i6Var2 = (i6) this.d.x1(150);
        if (i6Var2 != null) {
            i6Var2.a(z4);
        }
        this.h = z4;
        Y();
    }

    public final void a0(boolean z4, boolean z10) {
        if (this.f48197x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f48196w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f48196w = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f48196w = animatorSet2;
            if (z4) {
                this.f48197x.setVisibility(0);
                this.f48195s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f48196w;
                RadialProgressView radialProgressView = this.f48197x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f48195s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f48197x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f48195s, property2, 0.0f));
            }
            this.f48196w.setDuration(180L);
            this.f48196w.addListener(new vd1(15, this, z4));
            this.f48196w.start();
        } else if (z4) {
            this.f48197x.setAlpha(1.0f);
            this.f48197x.setVisibility(0);
            this.f48195s.setAlpha(1.0f);
            this.f48195s.setVisibility(0);
        } else {
            this.f48197x.setAlpha(0.0f);
            this.f48197x.setVisibility(4);
            this.f48195s.setAlpha(0.0f);
            this.f48195s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 1));
        tg.c cVar = new tg.c();
        cVar.a(getThemedColor(k6.f21661d6));
        this.actionBar.M(new og.a(cVar), sg.b.o(this.resourceProvider), false);
        this.actionBar.M0 = true;
        t3 t3Var = new t3(this, context);
        this.f48190c = t3Var;
        t3Var.setBackgroundColor(k6.w0(null, k6.f21607a7, false));
        this.f48198y = new z8(this.E);
        m mVar = new m(context);
        this.f48194r = mVar;
        mVar.f48187a.e(this.E, this.f48198y);
        this.v = this.f48194r.f48187a;
        String name = DialogObject.getName(this.E);
        this.f48191e = name;
        g6 g6Var = this.resourceProvider;
        n9 n9Var = new n9(context);
        int i10 = 5;
        mh.m mVar2 = new mh.m(context, 5);
        n9Var.f45811b = mVar2;
        mVar2.setTextColor(k6.v0(k6.G6, g6Var));
        mVar2.setLinkTextColor(k6.v0(k6.f21722gc, g6Var));
        mVar2.setHintTextColor(k6.v0(k6.H6, g6Var));
        mVar2.setTextSize(1, 16.0f);
        mVar2.setMaxLines(Integer.MAX_VALUE);
        mVar2.setBackground(null);
        mVar2.setImeOptions(mVar2.getImeOptions() | 268435456);
        mVar2.setInputType(mVar2.getInputType() | 16384);
        mVar2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        mVar2.setMinHeight(AndroidUtilities.dp(50.0f));
        if (!LocaleController.isRTL) {
            i10 = 3;
        }
        n9Var.addView(mVar2, c6.d(-1, -2.0f, i10 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f48193n = n9Var;
        mVar2.setText(name);
        ((mh.m) this.f48193n.f45811b).setSelection(name.length());
        ((mh.m) this.f48193n.f45811b).addTextChangedListener(new eh.c(this, 17));
        s0 s0Var = new s0(this, context);
        this.D = s0Var;
        s0Var.setTextColor(getThemedColor(k6.Sh));
        this.D.setText(LocaleController.getString(R.string.Save));
        this.D.setTypeface(AndroidUtilities.bold());
        this.D.setTextSize(1, 14.0f);
        this.D.setGravity(17);
        this.D.setVisibility(8);
        this.D.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.D.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 16));
        e6.a(this.D);
        this.actionBar.addView(this.D, c6.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        fg.i0 i0Var = new fg.i0(this, context);
        this.f48195s = i0Var;
        this.f48194r.addView(i0Var, c6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f48197x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f48197x.setProgressColor(-1);
        this.f48197x.setNoProgress(false);
        this.f48194r.addView(this.f48197x, c6.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        h61 h61Var = new h61(this, new j(this, 1), new k(this), new k(this));
        this.d = h61Var;
        h61Var.setClipToPadding(false);
        h61 h61Var2 = this.d;
        h61Var2.V2.f32651r = false;
        h61Var2.o1();
        this.actionBar.setBackground(null);
        this.f48190c.addView(this.d, c6.c(-1.0f, -1));
        this.f48190c.addView(this.actionBar, c6.e(-1, -2, 48));
        t3 t3Var2 = this.f48190c;
        k kVar = new k(this);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(t3Var2, kVar);
        t3 t3Var3 = this.f48190c;
        this.fragmentView = t3Var3;
        return t3Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20846id == this.f48189b) {
                this.F = chatFull;
                this.d.V2.N(true);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.B.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.B.f33311c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final qu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((mh.m) this.f48193n.f45811b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.B.i(i10, i11, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z4;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f48189b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f48189b));
        this.E = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f48192f = z4;
        this.h = z4;
        this.F = getMessagesController().getChatFull(this.f48189b);
        y40 y40Var = new y40(3, true, true);
        this.B = y40Var;
        y40Var.f33309a = this;
        y40Var.f33310b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        y40 y40Var = this.B;
        if (y40Var != null) {
            y40Var.e();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.B.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.B.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.B.l();
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        y40 y40Var = this.B;
        if (y40Var != null) {
            y40Var.f33313f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        y40 y40Var = this.B;
        if (y40Var != null && (str = y40Var.f33313f) != null) {
            bundle.putString("path", str);
        }
        n9 n9Var = this.f48193n;
        if (n9Var != null) {
            String obj = ((mh.m) n9Var.f45811b).getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
