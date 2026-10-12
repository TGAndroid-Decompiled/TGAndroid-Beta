package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class x71 extends org.telegram.ui.Components.db {
    public TLRPC.Chat X;
    public final TLRPC.User Y;
    public final ai.p8 Z;
    public TLObject f43793a0;
    public final FrameLayout f43794b0;
    public final p71 f43795c0;
    public final r71 f43796d0;
    public final w71 f43797e0;
    public final w71 f43798f0;
    public final w71 f43799g0;
    public final ci.d f43800h0;
    public org.telegram.ui.Components.h71 f43801i0;
    public Context f43802j0;

    public x71(Context context, TLRPC.Chat chat, TLRPC.User user, ai.p8 p8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(2, context, c6Var, true);
        this.K = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.X = chat;
        this.Y = user;
        this.f43793a0 = user;
        this.Z = p8Var;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43794b0 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.h6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.h6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, w7.w5.a(24.0f, 11.0f, 0.0f, 0.0f, 0.0f, 24, 19));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.f43795c0 = editTextBoldCursor;
        editTextBoldCursor.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.R5));
        editTextBoldCursor.setHintTextColor(getThemedColor(i10));
        editTextBoldCursor.setTextSize(1, 15.0f);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setGravity(112);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        editTextBoldCursor.setTranslationY(-AndroidUtilities.dp(0.66f));
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 524288);
        editTextBoldCursor.setImeOptions(33554435);
        editTextBoldCursor.setTextIsSelectable(false);
        editTextBoldCursor.setOnEditorActionListener(new ma(this, 11));
        editTextBoldCursor.addTextChangedListener(new q71(this));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView((View) editTextBoldCursor, w7.w5.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, w7.w5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 23));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.f25287e));
        float f7 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, w7.w5.a(64.0f, f7, 0.0f, f7, 0.0f, -1, 55));
        ?? frameLayout3 = new FrameLayout(context);
        this.f43796d0 = frameLayout3;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.setImageDrawable(new org.telegram.ui.Components.fk0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        frameLayout3.addView(y9Var, w7.w5.e(130, 130, 17));
        w71 w71Var = new w71(this.currentAccount, chat.f19803id, new TLRPC.TL_channelParticipantsAdmins());
        w71Var.f43082e.add(new pz0(this, 16));
        this.f43797e0 = w71Var;
        w71 w71Var2 = new w71(this.currentAccount, chat.f19803id, new TLRPC.TL_channelParticipantsRecent());
        w71Var2.f43082e.add(new pz0(this, 16));
        this.f43798f0 = w71Var2;
        w71 w71Var3 = new w71(this.currentAccount, chat.f19803id, new TLRPC.TL_channelParticipantsSearch());
        w71Var3.f43082e.add(new pz0(this, 16));
        this.f43799g0 = w71Var3;
        org.telegram.ui.Components.wm0 wm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new d21(this, 5));
        s71 s71Var = new s71(this);
        s71Var.f47937m = false;
        s71Var.C = false;
        s71Var.o(org.telegram.ui.Components.js.h);
        s71Var.n(350L);
        this.d.setItemAnimator(s71Var);
        this.d.addOnLayoutChangeListener(new t71(this));
        this.d.j(new u71(this));
        this.containerView.addView(new v71(this, getContext()), w7.w5.e(-1, 68, 87));
        ci.d dVar = new ci.d(getContext(), c6Var, true);
        dVar.setRoundRadius(24);
        this.f43800h0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20820r7));
        V(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, w7.w5.a(48.0f, f10, 10.0f, f10, 10.0f, -1, 87));
        dVar.setOnClickListener(new r41(this, 3));
        org.telegram.ui.Components.h71 h71Var = this.f43801i0;
        if (h71Var != null) {
            h71Var.N(false);
        }
        w71Var.b();
        w71Var2.b();
    }

    public static void Q(x71 x71Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            x71Var.X = MessagesController.getInstance(x71Var.currentAccount).getChat(Long.valueOf(j3));
            x71Var.U(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void R(x71 x71Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        boolean z15;
        boolean z16;
        w71 w71Var = x71Var.f43799g0;
        w71 w71Var2 = x71Var.f43798f0;
        TLRPC.User user = x71Var.Y;
        w71 w71Var3 = x71Var.f43797e0;
        if (w71Var3 != null) {
            ArrayList arrayList2 = w71Var3.d;
            if (w71Var2 != null) {
                ArrayList arrayList3 = w71Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(UserConfig.getInstance(x71Var.currentAccount).getClientUserId()));
                arrayList.add(org.telegram.ui.Components.u61.D(3, AndroidUtilities.dp(64.0f)));
                if (w71Var != null && !TextUtils.isEmpty(w71Var.f43081c.f19802q)) {
                    ArrayList arrayList4 = w71Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj;
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                            org.telegram.ui.Components.u61 v = org.telegram.ui.Components.u61.v(tLObject);
                            if (DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(x71Var.f43793a0)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            v.K(z16);
                            arrayList.add(v);
                        }
                    }
                    if (w71Var.f43083f) {
                        arrayList.add(org.telegram.ui.Components.u61.n(29));
                        arrayList.add(org.telegram.ui.Components.u61.n(29));
                        arrayList.add(org.telegram.ui.Components.u61.n(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.u61.k(x71Var.f43796d0));
                        return;
                    }
                    return;
                }
                if (user != null) {
                    int size2 = arrayList2.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size2) {
                            break;
                        }
                        Object obj2 = arrayList2.get(i15);
                        i15++;
                        if (DialogObject.getDialogId((TLObject) obj2) == DialogObject.getDialogId(user)) {
                            if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                                if (ChatObject.isChannelAndNotMegaGroup(x71Var.X)) {
                                    i13 = R.string.ChannelAdmins;
                                } else {
                                    i13 = R.string.GroupAdmins;
                                }
                                arrayList.add(org.telegram.ui.Components.u61.q(LocaleController.getString(i13)));
                                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                                org.telegram.ui.Components.u61 v9 = org.telegram.ui.Components.u61.v(user);
                                if (DialogObject.getDialogId(user) == DialogObject.getDialogId(x71Var.f43793a0)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                v9.K(z15);
                                arrayList.add(v9);
                                z10 = false;
                            }
                        }
                    }
                }
                z10 = true;
                int size3 = arrayList2.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj3 = arrayList2.get(i16);
                    i16++;
                    TLObject tLObject2 = (TLObject) obj3;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                        if (z10) {
                            if (ChatObject.isChannelAndNotMegaGroup(x71Var.X)) {
                                i12 = R.string.ChannelAdmins;
                            } else {
                                i12 = R.string.GroupAdmins;
                            }
                            arrayList.add(org.telegram.ui.Components.u61.q(LocaleController.getString(i12)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                        org.telegram.ui.Components.u61 v10 = org.telegram.ui.Components.u61.v(tLObject2);
                        if (DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(x71Var.f43793a0)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v10.K(z14);
                        arrayList.add(v10);
                    }
                }
                if (w71Var3.f43083f) {
                    arrayList.add(org.telegram.ui.Components.u61.n(29));
                    arrayList.add(org.telegram.ui.Components.u61.n(29));
                    arrayList.add(org.telegram.ui.Components.u61.n(29));
                }
                if (user != null && !hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                    if (ChatObject.isChannelAndNotMegaGroup(x71Var.X)) {
                        i11 = R.string.ChannelSubscribers2;
                    } else {
                        i11 = R.string.GroupMembers2;
                    }
                    arrayList.add(org.telegram.ui.Components.u61.q(LocaleController.getString(i11)));
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                    org.telegram.ui.Components.u61 v11 = org.telegram.ui.Components.u61.v(user);
                    if (DialogObject.getDialogId(user) == DialogObject.getDialogId(x71Var.f43793a0)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    v11.K(z13);
                    arrayList.add(v11);
                    z11 = false;
                } else {
                    z11 = true;
                }
                int size4 = arrayList3.size();
                int i17 = 0;
                while (i17 < size4) {
                    Object obj4 = arrayList3.get(i17);
                    i17++;
                    TLObject tLObject3 = (TLObject) obj4;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                        if (z11) {
                            if (ChatObject.isChannelAndNotMegaGroup(x71Var.X)) {
                                i10 = R.string.ChannelSubscribers2;
                            } else {
                                i10 = R.string.GroupMembers2;
                            }
                            arrayList.add(org.telegram.ui.Components.u61.q(LocaleController.getString(i10)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                        org.telegram.ui.Components.u61 v12 = org.telegram.ui.Components.u61.v(tLObject3);
                        if (DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(x71Var.f43793a0)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        v12.K(z12);
                        arrayList.add(v12);
                    }
                }
                if (!arrayList3.isEmpty() && w71Var2.f43083f) {
                    arrayList.add(org.telegram.ui.Components.u61.n(29));
                    arrayList.add(org.telegram.ui.Components.u61.n(29));
                    arrayList.add(org.telegram.ui.Components.u61.n(29));
                }
            }
        }
    }

    public static void S(final x71 x71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        int i16;
        int i17;
        if (tL_error != null) {
            if (x71Var.f43802j0 != null) {
                if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
                    if (inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.f43802j0);
                        if (ChatObject.isChannelAndNotMegaGroup(x71Var.X)) {
                            i17 = R.string.EditAdminChannelTransfer;
                        } else {
                            i17 = R.string.EditAdminGroupTransfer;
                        }
                        String string = LocaleController.getString(i17);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                        a2Var.R = string;
                        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, x71Var.X.title, UserObject.getFirstName(user)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new ns0(10, x71Var, user));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1(x71Var) {
                            public final x71 f40573b;

                            {
                                this.f40573b = x71Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i18) {
                                switch (r2) {
                                    case 0:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                    case 1:
                                        x71 x71Var2 = this.f40573b;
                                        x71Var2.getClass();
                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                        if (U != null) {
                                            x71Var2.dismiss();
                                            U.presentFragment(new kh1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                    default:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder.o();
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(x71Var.currentAccount).sendRequest(new TL_account.getPassword(), new ps0(x71Var, twoStepVerificationActivity, user, 7), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (x71Var.f43802j0 != null && !AccountInstance.getInstance(x71Var.currentAccount).getUserConfig().isPremium()) {
                            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                            if (U != null) {
                                x71Var.showDialog(new rg.j0(5, x71Var.currentAccount, x71Var.f43802j0, U, null));
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                        if (U2 != null) {
                            x71Var.dismiss();
                            U2.presentFragment(new we1(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.o0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            org.telegram.ui.Components.g5.g0(tL_error, U3, ChatObject.isChannelAndNotMegaGroup(x71Var.X), ChatObject.isCommunity(x71Var.X), tL_channels_editCreator);
                        }
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(x71Var.f43802j0);
                    alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
                    LinearLayout linearLayout = new LinearLayout(x71Var.f43802j0);
                    linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(x71Var.f43802j0);
                    int i18 = org.telegram.ui.ActionBar.h6.f20668j5;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                    textView.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    if (ChatObject.isChannelAndNotMegaGroup(x71Var.X)) {
                        org.telegram.messenger.am.r(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    } else {
                        org.telegram.messenger.am.r(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
                    }
                    linearLayout.addView(textView, w7.w5.n(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(x71Var.f43802j0);
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, w7.w5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(x71Var.f43802j0);
                    imageView.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i11 = AndroidUtilities.dp(11.0f);
                    } else {
                        i11 = 0;
                    }
                    int dp3 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(11.0f);
                    }
                    imageView.setPadding(i11, dp3, dp, 0);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, i18, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    TextView textView2 = new TextView(x71Var.f43802j0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                    textView2.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 48);
                    org.telegram.messenger.v0.n(R.string.EditAdminTransferAlertText1, textView2);
                    if (LocaleController.isRTL) {
                        linearLayout2.addView(textView2, w7.w5.n(-1, -2));
                        linearLayout2.addView(imageView, w7.w5.q(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, w7.w5.n(-2, -2));
                        linearLayout2.addView(textView2, w7.w5.n(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(x71Var.f43802j0);
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, w7.w5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(x71Var.f43802j0);
                    imageView2.setImageResource(R.drawable.list_circle);
                    if (LocaleController.isRTL) {
                        i13 = AndroidUtilities.dp(11.0f);
                    } else {
                        i13 = 0;
                    }
                    int dp4 = AndroidUtilities.dp(9.0f);
                    if (LocaleController.isRTL) {
                        dp2 = 0;
                    } else {
                        dp2 = AndroidUtilities.dp(11.0f);
                    }
                    imageView2.setPadding(i13, dp4, dp2, 0);
                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i18, false), mode));
                    TextView textView3 = new TextView(x71Var.f43802j0);
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                    textView3.setTextSize(1, 16.0f);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    textView3.setGravity(i14 | 48);
                    org.telegram.messenger.v0.n(R.string.EditAdminTransferAlertText2, textView3);
                    if (LocaleController.isRTL) {
                        linearLayout3.addView(textView3, w7.w5.n(-1, -2));
                        i15 = 5;
                        linearLayout3.addView(imageView2, w7.w5.q(-2, -2, 5));
                    } else {
                        i15 = 5;
                        linearLayout3.addView(imageView2, w7.w5.n(-2, -2));
                        linearLayout3.addView(textView3, w7.w5.n(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.z1(x71Var) {
                            public final x71 f40573b;

                            {
                                this.f40573b = x71Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i182) {
                                switch (r2) {
                                    case 0:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                    case 1:
                                        x71 x71Var2 = this.f40573b;
                                        x71Var2.getClass();
                                        org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            x71Var2.dismiss();
                                            U4.presentFragment(new kh1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                    default:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1(x71Var) {
                            public final x71 f40573b;

                            {
                                this.f40573b = x71Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i182) {
                                switch (r2) {
                                    case 0:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                    case 1:
                                        x71 x71Var2 = this.f40573b;
                                        x71Var2.getClass();
                                        org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            x71Var2.dismiss();
                                            U4.presentFragment(new kh1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                    default:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    } else {
                        TextView textView4 = new TextView(x71Var.f43802j0);
                        textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                        textView4.setTextSize(1, 16.0f);
                        if (LocaleController.isRTL) {
                            i16 = i15;
                        } else {
                            i16 = 3;
                        }
                        textView4.setGravity(i16 | 48);
                        textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                        linearLayout.addView(textView4, w7.w5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.z1(x71Var) {
                            public final x71 f40573b;

                            {
                                this.f40573b = x71Var;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i182) {
                                switch (r2) {
                                    case 0:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                    case 1:
                                        x71 x71Var2 = this.f40573b;
                                        x71Var2.getClass();
                                        org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                                        if (U4 != null) {
                                            x71Var2.dismiss();
                                            U4.presentFragment(new kh1(6, null));
                                            return;
                                        }
                                        return;
                                    case 2:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                    default:
                                        this.f40573b.f43800h0.setLoading(false);
                                        return;
                                }
                            }
                        });
                    }
                    alertDialog$Builder2.o();
                }
            }
        } else if (inputCheckPasswordSRP != null) {
            ai.p8 p8Var = x71Var.Z;
            if (p8Var != null) {
                p8Var.run();
            }
            x71Var.dismiss();
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public static void T(x71 x71Var) {
        org.telegram.ui.Components.wm0 wm0Var = x71Var.d;
        float f7 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= wm0Var.getChildCount()) {
                break;
            }
            View childAt = wm0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        x71Var.f43794b0.setTranslationY(f7);
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }

    public final void U(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f43802j0 = getContext();
        }
        if (this.f43802j0 != null) {
            if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.X)) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f43802j0, this.X.f19803id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 17));
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (ChatObject.isChannel(this.X)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.X;
                tL_inputChannel.channel_id = chat.f19803id;
                tL_inputChannel.access_hash = chat.access_hash;
            } else {
                tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
            }
            if (inputCheckPasswordSRP != null) {
                tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
            } else {
                tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_channels_editCreator.password = tL_inputCheckPasswordEmpty;
            tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new ci.hd(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 11));
        }
    }

    public final void V(boolean z10) {
        int i10;
        int dp;
        if (ChatObject.isChannelAndNotMegaGroup(this.X)) {
            i10 = R.string.LeaveChannelAndAppoint;
        } else {
            i10 = R.string.LeaveGroupAndAppoint;
        }
        float dp2 = AndroidUtilities.dp(32.0f);
        ci.d dVar = this.f43800h0;
        if (dVar.getWidth() > 0) {
            dp = dVar.getWidth();
        } else {
            dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
        }
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.f43793a0), dVar.getTextPaint(), Math.max(dp2, (dp - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f43797e0.a();
        this.f43798f0.a();
        this.f43799g0.a();
    }

    @Override
    public final org.telegram.ui.Components.vm0 x(org.telegram.ui.Components.wm0 wm0Var) {
        org.telegram.ui.Components.h71 h71Var = new org.telegram.ui.Components.h71(wm0Var, getContext(), this.currentAccount, 0, false, new e5(this, 23), this.resourcesProvider);
        this.f43801i0 = h71Var;
        return h71Var;
    }
}
