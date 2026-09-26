package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public class ro extends org.telegram.ui.ActionBar.m2 implements org.telegram.ui.Components.v40, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public EditTextBoldCursor E;
    public TLRPC.UserFull E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.b7 G;
    public boolean G0;
    public org.telegram.ui.Cells.r8 H;
    public boolean H0;
    public org.telegram.ui.Cells.r8 I;
    public boolean I0;
    public org.telegram.ui.Cells.r8 J;
    public boolean J0;
    public org.telegram.ui.Cells.r8 K;
    public TLRPC.ChatReactions K0;
    public yo0 L;
    public TL_stories.TL_premium_boostsStatus L0;
    public org.telegram.ui.Cells.r8 M;
    public boolean M0;
    public org.telegram.ui.Cells.r8 N;
    public boolean N0;
    public org.telegram.ui.Cells.r8 O;
    public boolean O0;
    public org.telegram.ui.Cells.e9 P;
    public final ArrayList P0;
    public org.telegram.ui.Cells.r8 Q;
    public final no Q0;
    public LinearLayout R;
    public org.telegram.ui.Components.jj0 R0;
    public LinearLayout S;
    public ValueAnimator S0;
    public org.telegram.ui.Cells.r8 T;
    public org.telegram.ui.Cells.r8 U;
    public org.telegram.ui.Cells.r8 V;
    public org.telegram.ui.Cells.r8 W;
    public org.telegram.ui.Cells.r8 X;
    public org.telegram.ui.Cells.r8 Y;
    public org.telegram.ui.Cells.r8 Z;
    public org.telegram.ui.ActionBar.u0 f37388a;
    public org.telegram.ui.Cells.r8 f37389a0;
    public org.telegram.ui.ActionBar.a2 f37390b;
    public po f37391b0;
    public UndoView f37392c;
    public FrameLayout f37393c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.ea f37394d0;
    public ai.y5 e;
    public org.telegram.ui.Cells.b7 f37395e0;
    public ci.r6 f37396f;
    public org.telegram.ui.Cells.r8 f37397f0;
    public org.telegram.ui.Cells.r8 f37398g0;
    public AnimatorSet h;
    public gi.b f37399h0;
    public org.telegram.ui.Cells.e9 f37400i0;
    public org.telegram.ui.Cells.r8 f37401j0;
    public org.telegram.ui.Cells.e9 f37402k0;
    public org.telegram.ui.Cells.r8 f37403l0;
    public org.telegram.ui.Cells.r8 m0;
    public RadialProgressView f37404n;
    public org.telegram.ui.Cells.r8 f37405n0;
    public org.telegram.ui.Cells.r8 f37406o0;
    public org.telegram.ui.Cells.r8 f37407p0;
    public org.telegram.ui.Cells.r8 f37408q0;
    public final org.telegram.ui.Components.h9 f37409r;
    public org.telegram.ui.Cells.r8 f37410r0;
    public final org.telegram.ui.Components.w40 f37411s;
    public org.telegram.ui.Cells.e9 f37412s0;
    public org.telegram.ui.Cells.e9 f37413t0;
    public org.telegram.ui.Cells.r8 f37414u0;
    public org.telegram.ui.Components.lu v;
    public TLRPC.FileLocation f37415v0;
    public xd f37416w;
    public long f37417w0;
    public org.telegram.ui.Components.no0 f37418x;
    public TLRPC.Chat f37419x0;
    public LinearLayout f37420y;
    public TLRPC.ChatFull f37421y0;
    public TLRPC.TL_chatAdminRights f37422z0;

    public ro(Bundle bundle) {
        super(bundle);
        int i10;
        this.P0 = new ArrayList();
        this.Q0 = new no(this);
        this.f37409r = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f37417w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.f37417w0 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f37417w0));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f37411s = new org.telegram.ui.Components.w40(i10, true, true);
            return;
        }
        this.f37411s = new org.telegram.ui.Components.w40(0, false, false);
    }

    public static void U(ro roVar, FrameLayout frameLayout, View view) {
        SpannableStringBuilder replaceTags;
        if (!roVar.G0) {
            TLRPC.ChatFull chatFull = roVar.f37421y0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", roVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0]));
            }
            org.telegram.ui.Components.xc.a0(roVar).Q(R.raw.topics, 36, replaceTags).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
        m2Var.f34601a = -roVar.f37417w0;
        m2Var.setResourceProvider(roVar.resourceProvider);
        boolean z10 = roVar.F0;
        boolean z11 = roVar.H0;
        ai.m0 m0Var = new ai.m0(8, roVar, view);
        m2Var.f34603c = z10;
        m2Var.d = z11;
        m2Var.f34604f = m0Var;
        roVar.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
    }

    public static void V(ro roVar) {
        roVar.f37415v0 = null;
        long j3 = roVar.C0;
        if (j3 == 0) {
            MessagesController.getInstance(roVar.currentAccount).changeChatAvatar(roVar.f37417w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = roVar.getMessagesController().getInputUser(j3);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.f18467id = new TLRPC.TL_inputPhotoEmpty();
            roVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ho(roVar, 2));
        }
        roVar.n0(false, true);
        ai.y5 y5Var = roVar.e;
        org.telegram.ui.Components.h9 h9Var = roVar.f37409r;
        Object obj = roVar.D0;
        if (obj == null) {
            obj = roVar.f37419x0;
        }
        y5Var.h(null, null, h9Var, obj);
        roVar.R0.M(0);
        roVar.f37391b0.e.d();
    }

    public static void X(ro roVar) {
        int i10 = roVar.currentAccount;
        long j3 = roVar.C0;
        TL_bots.botVerifierSettings botverifiersettings = roVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e = org.telegram.messenger.ok.e(16, "onlySelect", "dialogsType", true);
        e.putBoolean("resetDelegate", false);
        qy qyVar = new qy(e);
        qyVar.setCurrentAccount(i10);
        qyVar.C2 = new ei.u1(qyVar, i10, j3, botverifiersettings);
        U.presentFragment(qyVar);
    }

    public static void Y(ro roVar, org.telegram.ui.ActionBar.a2 a2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        a2Var.dismiss();
        if (roVar.getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(35, roVar.currentAccount, roVar.getParentActivity(), roVar, roVar.getResourceProvider());
        j0Var.G1(canApplyBoost);
        j0Var.F1(tL_premium_boostsStatus, true);
        j0Var.H1(j3);
        TLRPC.Chat chat = roVar.getMessagesController().getChat(Long.valueOf(-j3));
        if (chat != null) {
            j0Var.Q0 = new fh(13, roVar, chat);
        }
        roVar.showDialog(j0Var);
    }

    public static void Z(ro roVar) {
        ad adVar = new ad(-roVar.f37419x0.f18335id);
        adVar.f32113l0 = roVar;
        roVar.presentFragment(adVar);
        MessagesController.getInstance(roVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(roVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static void a0(ro roVar) {
        roVar.O0 = true;
        NotificationCenter.getInstance(roVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        z00 z00Var = new z00(10);
        z00Var.f40300a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        z00Var.f40303f = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Lj, false);
        spannableStringBuilder.setSpan(z00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String g0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i10);
            i10++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override
    public final void B(float f7) {
        RadialProgressView radialProgressView = this.f37404n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f37404n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final android.view.View createView(android.content.Context r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ro.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int r12, int r13, java.lang.Object... r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ro.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.f37411s.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.f37411s.f29843c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final boolean e0(boolean z10) {
        org.telegram.ui.Components.lu luVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.C0 != 0) {
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.lu luVar2 = this.v;
            if ((luVar2 != null && !this.D0.first_name.equals(luVar2.getText().toString())) || ((editTextBoldCursor2 = this.E) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.BotSettingsChangedAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new io(this, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new io(this, 1));
                    showDialog(alertDialog$Builder.f18661a);
                    return false;
                }
            } else {
                return true;
            }
        } else {
            TLRPC.ChatFull chatFull = this.f37421y0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull != null && ChatObject.isChannel(this.f37419x0) && this.f37421y0.hidden_prehistory != this.J0) || (((luVar = this.v) != null && !this.f37419x0.title.equals(luVar.getText().toString())) || (((editTextBoldCursor = this.E) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.f37419x0.forum))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f18661a.R = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                    if (this.I0) {
                        alertDialog$Builder2.f18661a.T = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                    } else {
                        alertDialog$Builder2.f18661a.T = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                    }
                    alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new io(this, 2));
                    alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new io(this, 3));
                    showDialog(alertDialog$Builder2.f18661a);
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void f0() {
        if (this.f37397f0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.f37417w0);
        TLRPC.ChatFull chatFull = this.f37421y0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.f37397f0.s(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    @Override
    public final vu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19003a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19356t8));
        po poVar = this.f37391b0;
        int i10 = org.telegram.ui.ActionBar.h6.f19148i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(poVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37391b0, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19372u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37391b0, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19390v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f19223m6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.r8 r8Var = this.U;
        if (r8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(r8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.f19461z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.lu luVar = this.v;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(luVar, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f19186k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f19204l6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 8388608, null, null, null, null, i14));
        LinearLayout linearLayout = this.d;
        int i15 = org.telegram.ui.ActionBar.h6.f19059d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37420y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37393c0, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.h6.f19023b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37395e0, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37394d0, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37394d0, 4, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19279p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f19310r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37392c, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
        int i17 = org.telegram.ui.ActionBar.h6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37392c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37392c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.h6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37392c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37392c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37392c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37392c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.r8 r8Var2 = this.K;
        if (r8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(r8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.K, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.K, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.r8 r8Var3 = this.f37389a0;
        if (r8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(r8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37389a0, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37389a0, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.f37417w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ho(this, 0));
    }

    public final void i0() {
        boolean z10;
        if (this.f37415v0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37411s.o(z10, new jo(this, 0), new r5(this, 5), 0);
        this.R0.M(0);
        this.R0.P(43);
        this.f37391b0.e.d();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.lu luVar;
        String str;
        String str2;
        if (!this.N0 && (luVar = this.v) != null) {
            if (luVar.f26172a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(this.v);
                return;
            }
            boolean z10 = true;
            this.N0 = true;
            String str3 = "";
            if (this.D0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().getInputUser(this.D0);
                setbotinfo.flags |= 4;
                setbotinfo.lang_code = "";
                if (!this.D0.first_name.equals(this.v.getText().toString())) {
                    setbotinfo.name = this.v.getText().toString();
                    setbotinfo.flags |= 8;
                }
                TLRPC.UserFull userFull = this.E0;
                if (userFull != null && (str2 = userFull.about) != null) {
                    str3 = str2;
                }
                EditTextBoldCursor editTextBoldCursor = this.E;
                if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                    setbotinfo.about = this.E.getText().toString();
                    setbotinfo.flags = 1 | setbotinfo.flags;
                }
                this.f37390b = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
                this.f37390b.setOnCancelListener(new ba(this, getConnectionsManager().sendRequest(setbotinfo, new lo(0, this, setbotinfo)), 2));
                this.f37390b.show();
            } else if (!ChatObject.isChannel(this.f37419x0) && (!this.J0 || this.F0)) {
                getMessagesController().convertToMegaGroup(getParentActivity(), this.f37417w0, this, new io(this, 5));
            } else {
                if (this.f37421y0 != null && ChatObject.isChannel(this.f37419x0)) {
                    TLRPC.ChatFull chatFull = this.f37421y0;
                    boolean z11 = chatFull.hidden_prehistory;
                    boolean z12 = this.J0;
                    if (z11 != z12) {
                        chatFull.hidden_prehistory = z12;
                        getMessagesController().toggleChannelInvitesHistory(this.f37417w0, this.J0);
                    }
                }
                if (this.f37411s.h()) {
                    this.M0 = true;
                    org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
                    this.f37390b = a2Var;
                    a2Var.setOnCancelListener(new lg(this, 1));
                    this.f37390b.show();
                    return;
                }
                if (!this.f37419x0.title.equals(this.v.getText().toString())) {
                    getMessagesController().changeChatTitle(this.f37417w0, this.v.getText().toString());
                }
                TLRPC.ChatFull chatFull2 = this.f37421y0;
                if (chatFull2 != null && (str = chatFull2.about) != null) {
                    str3 = str;
                }
                EditTextBoldCursor editTextBoldCursor2 = this.E;
                if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                    getMessagesController().updateChatAbout(this.f37417w0, this.E.getText().toString(), this.f37421y0);
                }
                boolean z13 = this.F0;
                TLRPC.Chat chat = this.f37419x0;
                if (z13 != chat.forum || this.H0 != chat.forum_tabs) {
                    if (this.H0 == chat.forum_tabs) {
                        z10 = false;
                    }
                    getMessagesController().toggleChannelForum(this.f37417w0, this.F0, this.H0);
                    if (this.F0 && !this.H0) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i10 = 0; i10 < fragmentStack.size(); i10++) {
                            if ((fragmentStack.get(i10) instanceof wn) && ((wn) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.f37417w0) {
                                ((ActionBarLayout) getParentLayout()).Y(i10);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.f37417w0);
                                org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
                                HashSet hashSet = wf1.f39306n1;
                                ((ActionBarLayout) parentLayout).c(i10, wf1.E0(getMessagesController(), getMessagesStorage(), bundle));
                            }
                        }
                    }
                    if (z10) {
                        q0();
                    }
                }
                finishFragment();
            }
        }
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ro.k0():void");
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        boolean z10;
        org.telegram.ui.Components.q5 q5Var;
        this.f37421y0 = chatFull;
        if (chatFull != null) {
            if (this.f37419x0 == null) {
                this.f37419x0 = getMessagesController().getChat(Long.valueOf(this.f37417w0));
            }
            if (ChatObject.isChannel(this.f37419x0) && !this.f37421y0.hidden_prehistory) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.J0 = z10;
            this.K0 = this.f37421y0.available_reactions;
            ArrayList arrayList = this.P0;
            arrayList.clear();
            TLRPC.Chat chat = this.f37419x0;
            TLRPC.ChatFull chatFull2 = this.f37421y0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i10);
                        i10++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                q5Var = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, org.telegram.ui.Components.q5.g(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            q5Var = org.telegram.ui.Components.q5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.q5.g());
                        } else {
                            q5Var = null;
                        }
                        if (q5Var != null) {
                            arrayList2.add(q5Var);
                            q5Var.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, org.telegram.ui.Components.q5.g(), tL_availableReaction2.activate_animation);
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.Z != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.f37419x0)) {
                this.Z.setVisibility(0);
            }
        }
        f0();
    }

    public final void m0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        int i10;
        TL_bots.BotInfo botInfo2;
        boolean z10;
        String format;
        TLRPC.User user;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j3 = this.C0;
                if (j3 == 0) {
                    user = null;
                } else {
                    user = getMessagesController().getUser(Long.valueOf(j3));
                }
                this.D0 = user;
            }
            org.telegram.ui.Cells.r8 r8Var = this.f37406o0;
            int i11 = 0;
            if (r8Var != null) {
                if (this.E0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r8Var.f(45, z10, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    org.telegram.ui.Cells.r8 r8Var2 = this.f37406o0;
                    TL_payments.starRefProgram starrefprogram = userFull2.starref_program;
                    if (starrefprogram == null) {
                        format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    r8Var2.u(format, false);
                }
            }
            org.telegram.ui.Cells.r8 r8Var3 = this.f37414u0;
            if (r8Var3 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                r8Var3.setVisibility(i10);
            }
            org.telegram.ui.Cells.e9 e9Var = this.f37413t0;
            if (e9Var != null) {
                TLRPC.UserFull userFull4 = this.E0;
                e9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 8);
            }
        }
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.f37404n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.h = animatorSet2;
            if (z10) {
                this.f37404n.setVisibility(0);
                this.f37396f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                RadialProgressView radialProgressView = this.f37404n;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f37396f, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f37404n;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f37396f, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new ai.n(29, this, z10));
            this.h.start();
        } else if (z10) {
            this.f37404n.setAlpha(1.0f);
            this.f37404n.setVisibility(0);
            this.f37396f.setAlpha(1.0f);
            this.f37396f.setVisibility(0);
        } else {
            this.f37404n.setAlpha(0.0f);
            this.f37404n.setVisibility(4);
            this.f37396f.setAlpha(0.0f);
            this.f37396f.setVisibility(4);
        }
    }

    public final void o0() {
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        boolean z10;
        op0 op0Var;
        int v02;
        boolean q6;
        int i10;
        ArrayList<Integer> arrayList;
        int i11;
        int i12;
        yo0 yo0Var = this.L;
        if (yo0Var != null) {
            TLRPC.Chat chat = this.f37419x0;
            org.telegram.ui.Cells.r8 r8Var3 = this.N;
            if ((r8Var3 != null && r8Var3.getVisibility() == 0) || (((r8Var = this.Q) != null && r8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.f37419x0) && ChatObject.hasAdminRights(this.f37419x0)) || ((r8Var2 = this.M) != null && r8Var2.getVisibility() == 0)))) {
                z10 = true;
            } else {
                z10 = false;
            }
            Paint paint = yo0Var.f40203n;
            int i13 = yo0Var.f40199a;
            org.telegram.ui.ActionBar.d6 d6Var = yo0Var.d;
            if (chat != null) {
                yo0Var.v = z10;
                yo0Var.f40204r = new org.telegram.ui.Components.u01(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.h6.f19256o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
                op0 op0Var2 = yo0Var.f40206w;
                MessagesController.PeerColor peerColor = null;
                if (op0Var2 != null) {
                    op0Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i14 = op0.f36318j;
                    int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
                    yo0Var.f40206w = new op0(tL_emojiStatusCollectible.document_id, i15, i15, i15);
                } else {
                    if (ChatObject.getProfileColorId(chat) >= 0) {
                        op0Var = op0.c(i13, ChatObject.getProfileColorId(chat));
                        op0Var.f36319a = AndroidUtilities.dp(11.0f);
                        op0Var.d();
                    } else {
                        op0Var = null;
                    }
                    yo0Var.f40206w = op0Var;
                }
                op0 op0Var3 = yo0Var.f40206w;
                if (op0Var3 != null) {
                    op0Var3.e(yo0Var);
                }
                TLRPC.PeerColor peerColor2 = chat.color;
                if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
                    if (d6Var != null) {
                        q6 = d6Var.a();
                    } else {
                        q6 = org.telegram.ui.ActionBar.h6.I.q();
                    }
                    if (q6 && (tL_peerColorCollectible.flags & 1) != 0) {
                        i10 = tL_peerColorCollectible.dark_accent_color;
                    } else {
                        i10 = tL_peerColorCollectible.accent_color;
                    }
                    if (!q6 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    int intValue = arrayList.get(0).intValue() | (-16777216);
                    if (arrayList.size() >= 2) {
                        i11 = arrayList.get(1).intValue() | (-16777216);
                    } else {
                        i11 = intValue;
                    }
                    if (arrayList.size() >= 3) {
                        i12 = arrayList.get(2).intValue() | (-16777216);
                    } else {
                        i12 = intValue;
                    }
                    yo0Var.f40204r.o(i10);
                    paint.setColor(org.telegram.ui.ActionBar.h6.l1(0.1f, i10));
                    op0 op0Var4 = new op0(tL_peerColorCollectible.gift_emoji_id, intValue, i11, i12);
                    op0Var4.f36319a = AndroidUtilities.dp(11.0f);
                    op0Var4.d();
                    yo0Var.f40207x = op0Var4;
                    op0Var4.e(yo0Var);
                    return;
                }
                int colorId = ChatObject.getColorId(chat);
                if (colorId < 7) {
                    int i16 = org.telegram.ui.ActionBar.h6.f19318r8[colorId];
                    yo0Var.f40205s = i16;
                    v02 = org.telegram.ui.ActionBar.h6.v0(i16, d6Var);
                } else {
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                    if (peerColors != null) {
                        peerColor = peerColors.getColor(colorId);
                    }
                    if (peerColor != null) {
                        yo0Var.f40205s = -1;
                        v02 = peerColor.getColor1();
                    } else {
                        int i17 = org.telegram.ui.ActionBar.h6.f19318r8[0];
                        yo0Var.f40205s = i17;
                        v02 = org.telegram.ui.ActionBar.h6.v0(i17, d6Var);
                    }
                }
                yo0Var.f40204r.o(v02);
                paint.setColor(org.telegram.ui.ActionBar.h6.l1(0.1f, v02));
                op0 a2 = op0.a(i13, colorId);
                a2.f36319a = AndroidUtilities.dp(11.0f);
                a2.d();
                yo0Var.f40207x = a2;
                a2.e(yo0Var);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.f37411s.i(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.lu luVar = this.v;
        if (luVar != null && luVar.e) {
            if (z10) {
                luVar.k(true);
                return false;
            }
            return false;
        }
        return e0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f37392c;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ro.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.w40 w40Var = this.f37411s;
        if (w40Var != null) {
            w40Var.e();
        }
        if (this.f37419x0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.D0.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        org.telegram.ui.Components.lu luVar = this.v;
        if (luVar != null) {
            luVar.o();
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        xd xdVar = this.f37416w;
        if (xdVar != null) {
            xdVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.f37392c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.P0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.q5) obj).p(null);
        }
        org.telegram.ui.Components.lu luVar = this.v;
        if (luVar != null) {
            luVar.r();
        }
        UndoView undoView = this.f37392c;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f37411s.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.f37411s.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.lu luVar = this.v;
        if (luVar != null) {
            luVar.s();
            this.v.getEditText().requestFocus();
        }
        o0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        p0(true, true);
        this.f37411s.l();
    }

    public final void p0(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        int i11;
        int i12;
        boolean z17;
        boolean z18;
        int i13;
        boolean z19;
        int i14;
        int i15;
        String str;
        boolean z20;
        boolean z21;
        float f7;
        float f10;
        int i16;
        TLRPC.ChatFull chatFull;
        int i17;
        String str2;
        String string;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        boolean z22;
        org.telegram.ui.Cells.r8 r8Var3;
        org.telegram.ui.Cells.r8 r8Var4;
        boolean z23;
        int i18;
        String str3;
        String format;
        org.telegram.ui.Cells.r8 r8Var5;
        org.telegram.ui.Cells.r8 r8Var6;
        boolean z24;
        boolean z25;
        boolean z26;
        int i19;
        int i20;
        org.telegram.ui.Cells.r8 r8Var7;
        org.telegram.ui.Cells.r8 r8Var8;
        org.telegram.ui.Cells.r8 r8Var9;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.f37417w0))) != null) {
            this.f37419x0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.f37419x0);
        org.telegram.ui.Cells.e9 e9Var = this.P;
        int i21 = 0;
        if (e9Var != null) {
            if (this.I == null && (((r8Var7 = this.J) == null || r8Var7.getVisibility() != 0) && (((r8Var8 = this.N) == null || r8Var8.getVisibility() != 0) && ((r8Var9 = this.H) == null || r8Var9.getVisibility() != 0)))) {
                i20 = 8;
            } else {
                i20 = 0;
            }
            e9Var.setVisibility(i20);
        }
        org.telegram.ui.Cells.r8 r8Var10 = this.Y;
        if (r8Var10 != null) {
            if (ChatObject.isChannel(this.f37419x0)) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            r8Var10.setVisibility(i19);
        }
        org.telegram.ui.Cells.r8 r8Var11 = this.J;
        if (r8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.f37421y0;
            if (chatFull2 != null && (this.I0 || chatFull2.linked_chat_id != 0)) {
                r8Var11.setVisibility(0);
                if (this.f37421y0.linked_chat_id == 0) {
                    this.J.s(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f37421y0.linked_chat_id));
                    if (chat2 == null) {
                        this.J.setVisibility(8);
                    } else if (this.I0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.J.s(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.J.s(LocaleController.getString("Discussion", R.string.Discussion), v7.j.g("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.r8 r8Var12 = this.J;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i22 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.r8 r8Var13 = this.Q;
                            if (r8Var13 != null && r8Var13.getVisibility() == 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            r8Var12.s(string2, str4, false, i22, z26);
                        } else {
                            org.telegram.ui.Cells.r8 r8Var14 = this.J;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String g10 = v7.j.g("@", publicUsername2);
                            int i23 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.r8 r8Var15 = this.Q;
                            if (r8Var15 != null && r8Var15.getVisibility() == 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            r8Var14.s(string3, g10, false, i23, z25);
                        }
                    }
                }
            } else {
                r8Var11.setVisibility(8);
            }
        }
        org.telegram.ui.Cells.r8 r8Var16 = this.H;
        if (r8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.f37421y0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                r8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.f37421y0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.H.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.H.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z11, true);
                }
            } else {
                r8Var16.setVisibility(8);
            }
        }
        if (this.I != null) {
            TLRPC.ChatFull chatFull4 = this.f37421y0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!isPublic) {
                    format = LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit);
                } else {
                    format = String.format(a4.a.t(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.f37419x0));
                }
                String str5 = format;
                org.telegram.ui.Cells.r8 r8Var17 = this.I;
                String string4 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i24 = R.drawable.msg_channel;
                org.telegram.ui.Cells.r8 r8Var18 = this.N;
                if ((r8Var18 != null && r8Var18.getVisibility() == 0) || (((r8Var5 = this.J) != null && r8Var5.getVisibility() == 0) || ((r8Var6 = this.Q) != null && r8Var6.getVisibility() == 0))) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                r8Var17.s(string4, str5, false, i24, z24);
            } else {
                boolean z27 = this.f37419x0.noforwards;
                if (this.I0) {
                    if (!isPublic) {
                        if (z27) {
                            i18 = R.string.TypePrivateRestrictedForwards;
                            str3 = "TypePrivateRestrictedForwards";
                        } else {
                            i18 = R.string.TypePrivate;
                            str3 = "TypePrivate";
                        }
                    } else {
                        i18 = R.string.TypePublic;
                        str3 = "TypePublic";
                    }
                    string = LocaleController.getString(str3, i18);
                } else {
                    if (!isPublic) {
                        if (z27) {
                            i17 = R.string.TypePrivateGroupRestrictedForwards;
                            str2 = "TypePrivateGroupRestrictedForwards";
                        } else {
                            i17 = R.string.TypePrivateGroup;
                            str2 = "TypePrivateGroup";
                        }
                    } else {
                        i17 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    }
                    string = LocaleController.getString(str2, i17);
                }
                String str6 = string;
                if (this.I0) {
                    org.telegram.ui.Cells.r8 r8Var19 = this.I;
                    String string5 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i25 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.r8 r8Var20 = this.N;
                    if ((r8Var20 != null && r8Var20.getVisibility() == 0) || (((r8Var3 = this.J) != null && r8Var3.getVisibility() == 0) || ((r8Var4 = this.Q) != null && r8Var4.getVisibility() == 0))) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    r8Var19.s(string5, str6, false, i25, z23);
                } else {
                    org.telegram.ui.Cells.r8 r8Var21 = this.I;
                    String string6 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i26 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.r8 r8Var22 = this.N;
                    if ((r8Var22 != null && r8Var22.getVisibility() == 0) || (((r8Var = this.J) != null && r8Var.getVisibility() == 0) || ((r8Var2 = this.Q) != null && r8Var2.getVisibility() == 0))) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    r8Var21.s(string6, str6, false, i26, z22);
                }
            }
        }
        if (this.N != null) {
            if (this.J0 && !this.F0) {
                i15 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            } else {
                i15 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            }
            String string7 = LocaleController.getString(str, i15);
            org.telegram.ui.Cells.r8 r8Var23 = this.N;
            String string8 = LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort);
            int i27 = R.drawable.msg_discuss;
            if (this.Q != null) {
                z20 = true;
            } else {
                z20 = false;
            }
            r8Var23.s(string8, string7, z11, i27, z20);
            this.N.setEnabled(!this.F0);
            if (!this.F0 && !isPublic && (((chatFull = this.f37421y0) == null || chatFull.linked_chat_id == 0) && (chatFull == null || !(chatFull.location instanceof TLRPC.TL_channelLocation)))) {
                z21 = true;
            } else {
                z21 = false;
            }
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = 0.0f;
            if (this.N.getAlpha() <= 0.0f && !z21) {
                this.N.setVisibility(8);
                o0();
            } else {
                float f12 = 1.0f;
                if (this.N.getVisibility() != 0 || this.N.getAlpha() < 1.0f || !z21) {
                    ArrayList arrayList = new ArrayList();
                    boolean z28 = false;
                    for (int i28 = 0; i28 < this.F.getChildCount(); i28++) {
                        if (!z28 && this.F.getChildAt(i28) == this.N) {
                            z28 = true;
                        } else if (z28) {
                            arrayList.add(this.F.getChildAt(i28));
                        }
                    }
                    boolean z29 = false;
                    for (int i29 = 0; i29 < this.f37416w.getChildCount(); i29++) {
                        if (!z29 && this.f37416w.getChildAt(i29) == this.F) {
                            z29 = true;
                        } else if (z29) {
                            arrayList.add(this.f37416w.getChildAt(i29));
                        }
                    }
                    if (this.N.getVisibility() != 0) {
                        this.N.setAlpha(0.0f);
                        org.telegram.ui.Cells.r8 r8Var24 = this.N;
                        r8Var24.setTranslationY((-r8Var24.getHeight()) / 2.0f);
                    }
                    this.N.setVisibility(0);
                    for (int i30 = 0; i30 < arrayList.size(); i30++) {
                        ((View) arrayList.get(i30)).setTranslationY((1.0f - this.N.getAlpha()) * (-this.N.getHeight()));
                    }
                    if (z11) {
                        float alpha = this.N.getAlpha();
                        if (z21) {
                            f11 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f11);
                        this.S0 = ofFloat;
                        ofFloat.addUpdateListener(new ai.x(10, this, arrayList));
                        this.S0.addListener(new androidx.fragment.app.g(this, z21, arrayList, 4));
                        this.S0.setDuration(320L);
                        this.S0.setInterpolator(org.telegram.ui.Components.sr.h);
                        this.S0.start();
                    } else {
                        org.telegram.ui.Cells.r8 r8Var25 = this.N;
                        if (z21) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        r8Var25.setAlpha(f7);
                        org.telegram.ui.Cells.r8 r8Var26 = this.N;
                        float f13 = (-r8Var26.getHeight()) / 2.0f;
                        if (z21) {
                            f10 = 0.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        r8Var26.setTranslationY(f13 * f10);
                        org.telegram.ui.Cells.r8 r8Var27 = this.N;
                        if (!z21) {
                            f12 = 0.0f;
                        }
                        r8Var27.setScaleY((f12 * 0.8f) + 0.2f);
                        org.telegram.ui.Cells.r8 r8Var28 = this.N;
                        if (z21) {
                            i16 = 0;
                        } else {
                            i16 = 8;
                        }
                        r8Var28.setVisibility(i16);
                        for (int i31 = 0; i31 < arrayList.size(); i31++) {
                            ((View) arrayList.get(i31)).setTranslationY(0.0f);
                        }
                        this.S0 = null;
                    }
                }
            }
        }
        if (this.T != null) {
            if (this.f37421y0 != null) {
                org.telegram.ui.Cells.r8 r8Var29 = this.U;
                if (r8Var29 != null) {
                    if (r8Var29.getParent() == null) {
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, w7.y5.n(-1, -2));
                    }
                    org.telegram.ui.Cells.r8 r8Var30 = this.U;
                    if (this.f37421y0.requests_pending > 0) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    r8Var30.setVisibility(i14);
                }
                if (this.I0 && !ChatObject.isCommunity(this.f37419x0)) {
                    this.T.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.f37421y0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.r8 r8Var31 = this.X;
                    String string9 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull5 = this.f37421y0;
                    String format2 = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                    int i32 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.r8 r8Var32 = this.Y;
                    if (r8Var32 != null && r8Var32.getVisibility() == 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    r8Var31.s(string9, format2, false, i32, z19);
                    z12 = z11;
                } else {
                    if (ChatObject.isChannel(this.f37419x0)) {
                        this.T.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.f37421y0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        org.telegram.ui.Cells.r8 r8Var33 = this.T;
                        String string10 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                        String format3 = String.format("%d", Integer.valueOf(this.f37421y0.participants.participants.size()));
                        int i33 = R.drawable.msg_groups;
                        if (this.U.getVisibility() == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        r8Var33.s(string10, format3, false, i33, z16);
                    }
                    TLRPC.Chat chat3 = this.f37419x0;
                    if (chat3.gigagroup && !ChatObject.isCommunity(chat3)) {
                        org.telegram.ui.Cells.r8 r8Var34 = this.X;
                        String string11 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull6 = this.f37421y0;
                        String format4 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                        int i34 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.r8 r8Var35 = this.Y;
                        if (r8Var35 != null && r8Var35.getVisibility() == 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        r8Var34.s(string11, format4, false, i34, z18);
                        z12 = z11;
                    } else {
                        if (this.F0) {
                            i10 = 16;
                        } else {
                            i10 = 15;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f37419x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i35 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i35++;
                            }
                            i11 = pr.n0(tL_chatBannedRights) + i35;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f37419x0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i11++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i11++;
                            }
                            if (this.F0 && !tL_chatBannedRights2.manage_topics) {
                                i11++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i11++;
                            }
                            i12 = i10;
                        } else {
                            i11 = i10;
                            i12 = i11;
                        }
                        z12 = z11;
                        this.X.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i11), Integer.valueOf(i12)), z12, R.drawable.msg_permissions, true);
                    }
                    org.telegram.ui.Cells.r8 r8Var36 = this.U;
                    if (r8Var36 != null) {
                        String string12 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format5 = String.format("%d", Integer.valueOf(this.f37421y0.requests_pending));
                        int i36 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.r8 r8Var37 = this.Y;
                        if (r8Var37 != null && r8Var37.getVisibility() == 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        r8Var36.s(string12, format5, false, i36, z17);
                    }
                }
                org.telegram.ui.Cells.r8 r8Var38 = this.W;
                String string13 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.f37419x0)) {
                    i13 = this.f37421y0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.f37421y0;
                    if (chatFull7 == null) {
                        i13 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i37 = 0;
                        for (int i38 = 0; i38 < size; i38++) {
                            TLRPC.ChatParticipant chatParticipant = this.f37421y0.participants.participants.get(i38);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i37++;
                            }
                        }
                        i13 = i37;
                    }
                }
                r8Var38.s(string13, String.format("%d", Integer.valueOf(i13)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (this.I0 && !ChatObject.isCommunity(this.f37419x0)) {
                    this.T.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.r8 r8Var39 = this.X;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i39 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.r8 r8Var40 = this.Y;
                    if (r8Var40 != null && r8Var40.getVisibility() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    r8Var39.m(i39, string14, z15);
                } else {
                    org.telegram.ui.Cells.r8 r8Var41 = this.T;
                    String string15 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i40 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.r8 r8Var42 = this.Y;
                    if (r8Var42 != null && r8Var42.getVisibility() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    r8Var41.m(i40, string15, z13);
                    if (this.f37419x0.gigagroup) {
                        org.telegram.ui.Cells.r8 r8Var43 = this.X;
                        String string16 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i41 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.r8 r8Var44 = this.Y;
                        if (r8Var44 != null && r8Var44.getVisibility() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        r8Var43.m(i41, string16, z14);
                    } else {
                        this.X.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                }
                this.W.m(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            org.telegram.ui.Cells.r8 r8Var45 = this.O;
            if (!ChatObject.canChangeChatInfo(this.f37419x0)) {
                i21 = 8;
            }
            r8Var45.setVisibility(i21);
            s0(z12);
            if (this.f37421y0 != null && ChatObject.canUserDoAdminAction(this.f37419x0, 3) && (!isPublic || !this.f37419x0.creator)) {
                if (this.f37421y0.invitesCount > 0) {
                    this.V.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.f37421y0.invitesCount), false, R.drawable.msg_link2, true);
                } else {
                    this.V.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
                }
            } else {
                this.V.setVisibility(8);
            }
        }
        if (this.K != null) {
            t0(null);
        }
    }

    public final void q0() {
        qy qyVar;
        kx kxVar;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i10 = 0;
            while (i10 < fragmentStack.size()) {
                if (fragmentStack.get(i10) instanceof wn) {
                    wn wnVar = (wn) fragmentStack.get(i10);
                    if (wnVar.getArguments().getLong("chat_id") == this.f37417w0) {
                        ((ActionBarLayout) getParentLayout()).a0(wnVar, false);
                        wnVar.clearViews();
                        ((ActionBarLayout) getParentLayout()).c(i10, wnVar);
                        if (!this.H0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.f37417w0);
                            ((ActionBarLayout) getParentLayout()).c(i10, new wf1(bundle));
                            i10++;
                        }
                    }
                } else if (this.H0 && (fragmentStack.get(i10) instanceof wf1)) {
                    wf1 wf1Var = (wf1) fragmentStack.get(i10);
                    if (wf1Var.g() != null && wf1Var.g().f18335id == this.f37417w0) {
                        ((ActionBarLayout) getParentLayout()).a0(wf1Var, false);
                        i10--;
                    }
                } else if (this.H0 && (fragmentStack.get(i10) instanceof qy) && (qyVar = (qy) fragmentStack.get(i10)) != null && (kxVar = qyVar.F3) != null && kxVar.c()) {
                    qyVar.F3.a();
                }
                i10++;
            }
        }
    }

    public final void r0() {
        if (this.f37403l0 == null) {
            return;
        }
        if (this.D0.usernames.size() > 1) {
            ArrayList<TLRPC.TL_username> arrayList = this.D0.usernames;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.TL_username tL_username = arrayList.get(i11);
                i11++;
                if (tL_username.active) {
                    i10++;
                }
            }
            this.f37403l0.s(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i10), Integer.valueOf(this.D0.usernames.size())), false, R.drawable.msg_link2, true);
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = this.f37403l0;
        String string = LocaleController.getString(R.string.BotPublicLink);
        r8Var.s(string, "t.me/" + this.D0.username, false, R.drawable.msg_link2, true);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.w40 w40Var = this.f37411s;
        if (w40Var != null) {
            w40Var.f29844f = bundle.getString("path");
        }
    }

    public final void s0(boolean z10) {
        String str;
        String str2;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.f37417w0);
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.f37419x0);
        TLRPC.ChatReactions chatReactions = this.K0;
        if (chatReactions != null && !(chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                int i10 = 0;
                for (int i11 = 0; i11 < tL_chatReactionsSome.reactions.size(); i11++) {
                    TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i11);
                    if (reaction instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                        if (tL_availableReaction != null) {
                            if (tL_availableReaction.inactive) {
                            }
                            i10++;
                        }
                    } else {
                        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                        }
                        i10++;
                    }
                }
                if (isChannelAndNotMegaGroup) {
                    if (chatFull != null && chatFull.paid_reactions_available) {
                        i10++;
                    }
                    if (i10 == 0) {
                        str2 = LocaleController.getString(R.string.ReactionsOff);
                    } else {
                        str2 = String.valueOf(i10);
                    }
                } else {
                    int min = Math.min(getMediaDataController().getEnabledReactionsList().size(), i10);
                    if (min == 0) {
                        str2 = LocaleController.getString(R.string.ReactionsOff);
                    } else {
                        str2 = LocaleController.formatString(R.string.ReactionsCount, Integer.valueOf(min), Integer.valueOf(getMediaDataController().getEnabledReactionsList().size()));
                    }
                }
            } else {
                str2 = LocaleController.getString(R.string.ReactionsAll);
            }
        } else {
            String string = LocaleController.getString(R.string.ReactionsOff);
            if (chatFull != null && chatFull.paid_reactions_available) {
                str2 = "1";
            } else {
                str = string;
                this.O.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
            }
        }
        str = str2;
        this.O.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.w40 w40Var = this.f37411s;
        if (w40Var != null && (str = w40Var.f29844f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.lu luVar = this.v;
        if (luVar != null) {
            String obj = luVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    public final void t0(Long l4) {
        boolean z10;
        TLRPC.Chat chat = this.f37419x0;
        if (chat != null && this.K != null) {
            long j3 = 0;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = chat.broadcast_messages_allowed;
            }
            if (z10) {
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f37419x0.linked_monoforum_id));
                if (l4 != null) {
                    j3 = l4.longValue();
                } else if (chat2 != null) {
                    j3 = chat2.send_paid_messages_stars;
                }
                this.K.s(LocaleController.getString(R.string.PostSuggestions), yh.w7.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j3)), 0.66f, null), false, R.drawable.msg_markunread, true);
                return;
            }
            this.K.s(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
        }
    }

    @Override
    public final void P() {
    }
}
