package sh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import dg.v3;
import eg.s0;
import java.util.WeakHashMap;
import k7.b6;
import k7.d6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ai;
import org.telegram.ui.qu0;
import org.telegram.ui.rr;
import org.telegram.ui.s61;
import org.telegram.ui.zn;
import ph.q9;
public final class n extends p2 implements w40, NotificationCenter.NotificationCenterDelegate, xd.b {
    public x40 B;
    public TLRPC.FileLocation C;
    public s0 D;
    public TLRPC.Chat E;
    public TLRPC.ChatFull F;
    public final d2[] G;
    public final l H;
    public final xd.a f44435a;
    public long f44436b;
    public v3 f44437c;
    public g61 d;
    public String e;
    public boolean f44438f;
    public boolean h;
    public q9 f44439n;
    public m f44440r;
    public eg.i0 f44441s;
    public p9 v;
    public AnimatorSet f44442w;
    public RadialProgressView f44443x;
    public z8 f44444y;

    public n(Bundle bundle) {
        super(bundle);
        this.f44435a = new xd.a(0, this, mr.h, 320L, false);
        this.G = new d2[1];
        this.H = new l(this);
    }

    public static boolean U(n nVar, i51 i51Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f19159id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, nVar.E);
            z10 = isChannelAndNotMegaGroup;
            z4 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f19306id;
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
            p70 F = p70.F(nVar.f44437c, null, view);
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

    public static void V(n nVar, i51 i51Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = i51Var.d;
        if (i10 == 140) {
            if (!nVar.B.h() && (chatPhoto = (chat = nVar.getMessagesController().getChat(Long.valueOf(nVar.f44436b))).photo) != null && chatPhoto.photo_big != null) {
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
            x40 x40Var = nVar.B;
            if (nVar.C == null) {
                z4 = false;
            }
            x40Var.o(z4, new i(nVar, 0), new dg.e0(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", nVar.f44436b);
            bundle.putInt("type", 1);
            rr rrVar = new rr(bundle);
            rrVar.x0(nVar.F);
            nVar.presentFragment(rrVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", nVar.f44436b);
            bundle2.putInt("type", 0);
            rr rrVar2 = new rr(bundle2);
            rrVar2.x0(nVar.F);
            nVar.presentFragment(rrVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", nVar.f44436b);
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
            Object obj = i51Var.G;
            if (obj instanceof TLRPC.Chat) {
                nVar.presentFragment(zn.R9(-((TLRPC.Chat) obj).f19159id));
            } else if (obj instanceof TLRPC.User) {
                nVar.presentFragment(zn.R9(((TLRPC.User) obj).f19306id));
            }
        }
    }

    public static void W(n nVar) {
        nVar.C = null;
        MessagesController.getInstance(nVar.currentAccount).changeChatAvatar(nVar.f44436b, null, null, null, null, 0.0d, null, null, null, null);
        nVar.a0(false, true);
        nVar.v.h(null, null, nVar.f44444y, nVar.E);
    }

    @Override
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.f44443x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.f44443x;
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
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ed(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        boolean z4;
        if (this.f44438f == this.h && TextUtils.equals(((lh.n) this.f44439n.f42254b).getText().toString(), this.e)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f44435a.a(z4, true);
    }

    public final void Z(boolean z4) {
        if (this.h == z4) {
            return;
        }
        h6 h6Var = (h6) this.d.x1(151);
        if (h6Var != null) {
            h6Var.a(!z4);
        }
        h6 h6Var2 = (h6) this.d.x1(150);
        if (h6Var2 != null) {
            h6Var2.a(z4);
        }
        this.h = z4;
        Y();
    }

    public final void a0(boolean z4, boolean z10) {
        if (this.f44443x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f44442w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f44442w = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f44442w = animatorSet2;
            if (z4) {
                this.f44443x.setVisibility(0);
                this.f44441s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f44442w;
                RadialProgressView radialProgressView = this.f44443x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f44441s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f44443x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f44441s, property2, 0.0f));
            }
            this.f44442w.setDuration(180L);
            this.f44442w.addListener(new s61(15, this, z4));
            this.f44442w.start();
        } else if (z4) {
            this.f44443x.setAlpha(1.0f);
            this.f44443x.setVisibility(0);
            this.f44441s.setAlpha(1.0f);
            this.f44441s.setVisibility(0);
        } else {
            this.f44443x.setAlpha(0.0f);
            this.f44443x.setVisibility(4);
            this.f44441s.setAlpha(0.0f);
            this.f44441s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        ai.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 1));
        sg.c cVar = new sg.c();
        cVar.a(getThemedColor(j6.f19881d6));
        this.actionBar.M(new ng.a(cVar), rg.b.o(this.resourceProvider), false);
        this.actionBar.M0 = true;
        v3 v3Var = new v3(this, context);
        this.f44437c = v3Var;
        v3Var.setBackgroundColor(j6.w0(null, j6.f19827a7, false));
        this.f44444y = new z8(this.E);
        m mVar = new m(context);
        this.f44440r = mVar;
        mVar.f44434a.e(this.E, this.f44444y);
        this.v = this.f44440r.f44434a;
        String name = DialogObject.getName(this.E);
        this.e = name;
        f6 f6Var = this.resourceProvider;
        q9 q9Var = new q9(context);
        int i10 = 5;
        lh.n nVar = new lh.n(context, 5);
        q9Var.f42254b = nVar;
        nVar.setTextColor(j6.v0(j6.G6, f6Var));
        nVar.setLinkTextColor(j6.v0(j6.f19941gc, f6Var));
        nVar.setHintTextColor(j6.v0(j6.H6, f6Var));
        nVar.setTextSize(1, 16.0f);
        nVar.setMaxLines(Integer.MAX_VALUE);
        nVar.setBackground(null);
        nVar.setImeOptions(nVar.getImeOptions() | 268435456);
        nVar.setInputType(nVar.getInputType() | 16384);
        nVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        nVar.setMinHeight(AndroidUtilities.dp(50.0f));
        if (!LocaleController.isRTL) {
            i10 = 3;
        }
        q9Var.addView(nVar, b6.d(-1, -2.0f, i10 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f44439n = q9Var;
        nVar.setText(name);
        ((lh.n) this.f44439n.f42254b).setSelection(name.length());
        ((lh.n) this.f44439n.f42254b).addTextChangedListener(new dh.c(this, 17));
        s0 s0Var = new s0(this, context);
        this.D = s0Var;
        s0Var.setTextColor(getThemedColor(j6.Sh));
        this.D.setText(LocaleController.getString(R.string.Save));
        this.D.setTypeface(AndroidUtilities.bold());
        this.D.setTextSize(1, 14.0f);
        this.D.setGravity(17);
        this.D.setVisibility(8);
        this.D.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.D.setOnClickListener(new oh.n(this, 16));
        d6.a(this.D);
        this.actionBar.addView(this.D, b6.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        eg.i0 i0Var = new eg.i0(this, context);
        this.f44441s = i0Var;
        this.f44440r.addView(i0Var, b6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f44443x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f44443x.setProgressColor(-1);
        this.f44443x.setNoProgress(false);
        this.f44440r.addView(this.f44443x, b6.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        g61 g61Var = new g61(this, new j(this, 1), new k(this), new k(this));
        this.d = g61Var;
        g61Var.setClipToPadding(false);
        g61 g61Var2 = this.d;
        g61Var2.V2.f30148r = false;
        g61Var2.o1();
        this.actionBar.setBackground(null);
        this.f44437c.addView(this.d, b6.c(-1.0f, -1));
        this.f44437c.addView(this.actionBar, b6.e(-1, -2, 48));
        v3 v3Var2 = this.f44437c;
        k kVar = new k(this);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(v3Var2, kVar);
        v3 v3Var3 = this.f44437c;
        this.fragmentView = v3Var3;
        return v3Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19160id == this.f44436b) {
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
        if (dialog != this.B.f30468c && super.dismissDialogOnPause(dialog)) {
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
        return ((lh.n) this.f44439n.f42254b).getText().toString();
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
        this.f44436b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f44436b));
        this.E = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f44438f = z4;
        this.h = z4;
        this.F = getMessagesController().getChatFull(this.f44436b);
        x40 x40Var = new x40(3, true, true);
        this.B = x40Var;
        x40Var.f30466a = this;
        x40Var.f30467b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        x40 x40Var = this.B;
        if (x40Var != null) {
            x40Var.e();
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
        x40 x40Var = this.B;
        if (x40Var != null) {
            x40Var.f30469f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        x40 x40Var = this.B;
        if (x40Var != null && (str = x40Var.f30469f) != null) {
            bundle.putString("path", str);
        }
        q9 q9Var = this.f44439n;
        if (q9Var != null) {
            String obj = ((lh.n) q9Var.f42254b).getText().toString();
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
