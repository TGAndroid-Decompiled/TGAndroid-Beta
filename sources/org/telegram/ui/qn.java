package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.UndoView;
public final class qn implements org.telegram.ui.Cells.l1 {
    public final fo f39497a;

    public qn(fo foVar) {
        this.f39497a = foVar;
    }

    @Override
    public final void A(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            u1Var.t2();
            u1Var.requestLayout();
            this.f39497a.A0.R(messageObject, false, false);
        }
    }

    @Override
    public final void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        MessageObject messageObject = u1Var.getMessageObject();
        int i10 = messageObject.type;
        fo foVar = this.f39497a;
        if (i10 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i11 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(foVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.Peer peer = arrayList.get(i11);
                    i11++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(foVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = foVar.getMessagesController().conferenceCallSizeLimit;
                a2Var.setOnCancelListener(new ga(this, foVar.getConnectionsManager().sendRequest(getgroupcall, new di.fd(this, a2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 4)), 1));
                a2Var.q(600L);
                return;
            }
            TLRPC.User user = foVar.f35935f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = foVar.f35878a8;
                if (userFull != null && userFull.video_calls_available) {
                    i11 = 1;
                }
                org.telegram.ui.Components.voip.d2.m(user, isVideoCall, i11, foVar.getParentActivity(), foVar.getMessagesController().getUserFull(foVar.f35935f.f19363id), foVar.getAccountInstance());
                return;
            }
            return;
        }
        foVar.L7(u1Var, true, false, f7, f10, messageObject.isMusic(), false, false);
    }

    @Override
    public final void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        fo foVar = this.f39497a;
        if (!foVar.E9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (foVar.getParentActivity() != null) {
                if (foVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) foVar.getParentActivity(), (org.telegram.ui.ActionBar.c6) foVar.f35932ea, false);
                        e3Var.fixNavigationBar();
                        e3Var.title = str;
                        e3Var.bigTitle = false;
                        e3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        mg.j jVar = new mg.j(3, foVar, str);
                        e3Var.items = charSequenceArr;
                        e3Var.onClickListener = jVar;
                        foVar.showDialog(e3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        foVar.ea(null, tL_inlineButtonTypeUrl.url, true, u1Var, u1Var.getMessageObject());
                        try {
                            u1Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void B(org.telegram.ui.Cells.u1 u1Var) {
        fo foVar = this.f39497a;
        if (!foVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(foVar.getParentActivity(), 3, null);
            a2Var.q(200L);
            foVar.getMessagesController().getContentSettings(new z(this, a2Var, u1Var, 6));
            return;
        }
        if (u1Var.getMessageObject() != null) {
            u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        u1Var.h4();
    }

    @Override
    public final boolean B1() {
        fo foVar = this.f39497a;
        if (foVar.X0.getKeyboardHeight() + foVar.f36056oa >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void C0(org.telegram.ui.Cells.u1 u1Var) {
        h(u1Var, true, false, true);
    }

    @Override
    public final void D1(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        fo foVar = this.f39497a;
        foVar.f35916d5 = messageObject;
        foVar.i9();
    }

    @Override
    public final void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i10;
        int i11;
        int i12;
        int dp;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            int i13 = buttonCustom.f16695id;
            TL_stars.StarsAmount starsAmount = null;
            fo foVar = this.f39497a;
            if (i13 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                vc vcVar = new vc(13, this, message);
                Pattern pattern = org.telegram.ui.Components.g5.f25184a;
                Activity parentActivity = foVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                editText.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
                editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
                editText.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.H6, false));
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.g6.T(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.v4(parentActivity)});
                if (LocaleController.isRTL) {
                    i12 = AndroidUtilities.dp(24.0f);
                } else {
                    i12 = 0;
                }
                int dp2 = AndroidUtilities.dp(8.0f);
                if (LocaleController.isRTL) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(24.0f);
                }
                editText.setPadding(i12, dp2, dp, AndroidUtilities.dp(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new m4.z0(27, vcVar, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                a2Var.N = new org.telegram.ui.Components.q1(editText, 0);
                frameLayout.addView(editText, w7.a6.a(-2.0f, 23.0f, 0.0f, 23.0f, 21.0f, -1, 0));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qg(editText, 3), 100L);
                foVar.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                }
            } else if (i13 == 2) {
                if (message.suggested_post != null) {
                    i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i10, foVar.e);
                    if (canManageMonoForum) {
                        i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i11, foVar.e, 5);
                    }
                    bi.h4 h4Var = new bi.h4(this, message, canManageMonoForum, messageObject, 11);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    foVar.j7(h4Var, ag.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i13 == 3) {
                foVar.L7(u1Var, true, false, u1Var.getLastTouchX(), u1Var.getLastTouchY(), true, false, true);
            } else if (i13 == 4) {
                foVar.R1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void E0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            fo foVar = this.f39497a;
            if ((foVar.f36157wb != id2 || foVar.f36171xb != 7) && (inputPeer = foVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f19434id = id2;
                pf.c cVar = foVar.Ab;
                if (cVar != null) {
                    cVar.a(true);
                    foVar.Ab = null;
                }
                ej ejVar = new ej(foVar, id2, u1Var, 2);
                ejVar.f43197b = new fc(13, foVar, r3);
                foVar.Ab = ejVar;
                ejVar.d();
                int[] iArr = {foVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new kf(foVar, ejVar, iArr, u1Var, messageObject, 2))};
            }
        }
    }

    @Override
    public final void F(org.telegram.ui.Cells.u1 u1Var) {
        fo foVar = this.f39497a;
        foVar.f36170xa.k(u1Var, foVar, true);
        foVar.f36160x0.I0(false);
    }

    @Override
    public final void F1(MessageObject messageObject) {
        this.f39497a.f36094s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void G0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        fo foVar = this.f39497a;
        foVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        foVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        h(u1Var, true, false, true);
    }

    @Override
    public final void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        mn mnVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && pf.d.h(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        fo foVar = this.f39497a;
        pf.c cVar = foVar.Ab;
        if (cVar != null) {
            cVar.a(true);
        }
        if (u1Var.getMessageObject() == null) {
            mnVar = null;
        } else {
            mnVar = new mn(this, u1Var);
        }
        foVar.Ab = mnVar;
        if (!z11 && !pf.d.f(parse, false, null)) {
            org.telegram.ui.Components.g5.q0(foVar, str, true, true, true, !z11, foVar.Ab, webPage, foVar.f35932ea);
        } else {
            pf.d.r(foVar.getParentActivity(), parse, true, true, false, foVar.Ab, null, false, true, false);
        }
    }

    @Override
    public final CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        fo foVar;
        int i10;
        if (u1Var.getMessageObject() != null && (i10 = (foVar = this.f39497a).f36157wb) != 0 && i10 == u1Var.getMessageObject().getId() && foVar.f36171xb == 1) {
            return foVar.f36184yb;
        }
        return null;
    }

    @Override
    public final void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new mi.h(false, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.yh.o(R.string.CodeCopied, org.telegram.ui.Components.zc.a0(this.f39497a));
        }
    }

    @Override
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        try {
            fo foVar = this.f39497a;
            org.telegram.ui.Components.hv.J(foVar, messageObject, foVar.Ga, str2, str3, str4, str, i10, i11, -1, foVar.C9());
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean J0(long j10) {
        fo foVar = this.f39497a;
        TLRPC.Chat chat = foVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return foVar.getMessagesController().isOwner(foVar.e.f19216id, j10);
        }
        return false;
    }

    @Override
    public final boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        bf bfVar;
        a3.i0 i0Var;
        boolean z10;
        org.telegram.ui.ActionBar.c6 c6Var;
        ah.v vVar;
        int i10;
        boolean z11;
        int i11;
        p51 p51Var;
        int i12;
        float f7;
        int i13;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f39497a.A0.L();
                    fo foVar = this.f39497a;
                    return mediaController.setPlaylist(L, messageObject, foVar.L6, true ^ foVar.A0.N, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f39497a.U7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            r51 r51Var = this.f39497a.Z9;
            if (r51Var == null || r51Var.f39599b0) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.zc.a0(this.f39497a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f39497a.Z9 = new r51(this.f39497a.getParentActivity());
                r51 r51Var2 = this.f39497a.Z9;
                if (!messageObject.isOutOwner()) {
                    bfVar = this.f39497a.jb(messageObject, true);
                } else {
                    bfVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    i0Var = fo.P4(this.f39497a, messageObject);
                } else {
                    i0Var = null;
                }
                Context context = r51Var2.f39596a;
                ah.v vVar2 = r51Var2.f39600c;
                r51Var2.X = bfVar;
                r51Var2.Y = i0Var;
                p51 p51Var2 = r51Var2.N;
                if (p51Var2 != null) {
                    vVar2.removeView(p51Var2);
                    r51Var2.N = null;
                }
                r51Var2.O = u1Var;
                MessageObject messageObject2 = u1Var.getMessageObject();
                r51Var2.M = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r51Var2.S = z10;
                org.telegram.ui.Cells.u1 u1Var2 = r51Var2.O;
                if (u1Var2 != null) {
                    c6Var = u1Var2.getResourcesProvider();
                } else {
                    c6Var = null;
                }
                r51Var2.L = c6Var;
                if (r51Var2.O != null) {
                    r51Var2.T = 0.0f;
                    r51Var2.U = u1Var.f22320n;
                    if (u1Var.getParent() instanceof View) {
                        View view = (View) u1Var.getParent();
                        r51Var2.T = view.getY() + r51Var2.T;
                        r51Var2.U = view.getY() + r51Var2.U;
                    }
                    int width = r51Var2.O.getWidth();
                    int height = r51Var2.O.getHeight();
                    if (r51Var2.S) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i14 = height;
                    r51Var2.K = i14 - r51Var2.O.getHeight();
                    i10 = (int) Math.ceil((Math.min(width, i14) * 0.92f) / AndroidUtilities.density);
                    vVar = vVar2;
                    p51 p51Var3 = new p51(r51Var2, r51Var2.getContext(), UserConfig.selectedAccount, r51Var2.O.getResourcesProvider(), width, i14);
                    r51Var2.N = p51Var3;
                    r51Var2.O.j1(p51Var3);
                    r51Var2.N.i1(r51Var2.O);
                    r51Var2.N.setDelegate(new pb.a(18));
                    p51 p51Var4 = r51Var2.N;
                    MessageObject messageObject3 = r51Var2.M;
                    MessageObject.GroupedMessages currentMessagesGroup = r51Var2.O.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.u1 u1Var3 = r51Var2.O;
                    p51Var4.X3(messageObject3, currentMessagesGroup, u1Var3.F, u1Var3.E, false, false);
                    if (!r51Var2.S) {
                        org.telegram.ui.Components.n8 n8Var = new org.telegram.ui.Components.n8();
                        r51Var2.V = n8Var;
                        p51 p51Var5 = r51Var2.N;
                        n8Var.f27608i = p51Var5;
                        p51Var5.f22207ee = n8Var;
                        if (p51Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.jp0 seekBarWaveform = r51Var2.N.getSeekBarWaveform();
                            seekBarWaveform.L = r51Var2.f39607s;
                            org.telegram.ui.Cells.u1 u1Var4 = seekBarWaveform.f26439n;
                            if (u1Var4 != null) {
                                u1Var4.invalidate();
                            }
                        }
                    }
                    r51Var2.H = false;
                    vVar.addView(r51Var2.N, new FrameLayout.LayoutParams(r51Var2.O.getWidth(), i14, 17));
                } else {
                    vVar = vVar2;
                    i10 = 360;
                }
                TextureView textureView = r51Var2.P;
                if (textureView != null) {
                    vVar.removeView(textureView);
                    r51Var2.P = null;
                }
                if (r51Var2.S) {
                    r51Var2.Q = false;
                    TextureView textureView2 = new TextureView(context);
                    r51Var2.P = textureView2;
                    vVar.addView(textureView2, 0, w7.a6.d(i10, i10));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.h81 h81Var = r51Var2.f39608w;
                if (h81Var != null) {
                    h81Var.B();
                    r51Var2.f39608w.H();
                    r51Var2.f39608w = null;
                }
                org.telegram.ui.Cells.u1 u1Var5 = r51Var2.O;
                if (u1Var5 != null && u1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(r51Var2.O.getMessageObject().currentAccount).getPathToAttach(r51Var2.O.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(r51Var2.O.getMessageObject().currentAccount).getPathToMessage(r51Var2.O.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && r51Var2.O.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(r51Var2.O.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.h81 h81Var2 = new org.telegram.ui.Components.h81();
                        r51Var2.f39608w = h81Var2;
                        h81Var2.J = new q51(r51Var2);
                        if (r51Var2.V != null) {
                            h81Var2.K = new q51(r51Var2);
                        }
                        if (r51Var2.S) {
                            h81Var2.V(r51Var2.P);
                        }
                        r51Var2.f39608w.D(Uri.fromFile(pathToAttach), "other");
                        r51Var2.f39608w.C();
                        org.telegram.ui.Components.wt wtVar = r51Var2.E;
                        if (wtVar != null) {
                            wtVar.f30969s = r51Var2.f39608w;
                            wtVar.a();
                        }
                    }
                    fo foVar2 = this.f39497a;
                    foVar2.showDialog(foVar2.Z9);
                    return false;
                }
                di.d4 d4Var = r51Var2.f39609x;
                if (d4Var != null) {
                    vVar.removeView(d4Var);
                    r51Var2.f39609x = null;
                }
                MessageObject messageObject4 = r51Var2.M;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = r51Var2.M;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(r51Var2.M.currentAccount).getClientUserId()) {
                    di.d4 d4Var2 = new di.d4(context, 3);
                    r51Var2.f39609x = d4Var2;
                    d4Var2.p(true);
                    if (z11) {
                        long dialogId = r51Var2.M.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(r51Var2.M.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(r51Var2.M.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        di.d4 d4Var3 = r51Var2.f39609x;
                        if (r51Var2.S) {
                            i13 = R.string.VideoOnceOutHint;
                        } else {
                            i13 = R.string.VoiceOnceOutHint;
                        }
                        d4Var3.s(AndroidUtilities.replaceTags(LocaleController.formatString(i13, str)));
                    } else {
                        di.d4 d4Var4 = r51Var2.f39609x;
                        if (r51Var2.S) {
                            i12 = R.string.VideoOnceHint;
                        } else {
                            i12 = R.string.VoiceOnceHint;
                        }
                        d4Var4.s(AndroidUtilities.replaceTags(LocaleController.getString(i12)));
                    }
                    r51Var2.f39609x.q(12.0f);
                    di.d4 d4Var5 = r51Var2.f39609x;
                    if (!z11 && !r51Var2.O.F) {
                        f7 = 6.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    d4Var5.setPadding(AndroidUtilities.dp(f7), 0, 0, 0);
                    if (r51Var2.S) {
                        r51Var2.f39609x.m(0.5f, 0.0f);
                        r51Var2.f39609x.K = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        r51Var2.f39609x.m(0.0f, AndroidUtilities.dp(34.0f));
                        r51Var2.f39609x.K = Layout.Alignment.ALIGN_NORMAL;
                    }
                    r51Var2.f39609x.t(14.0f);
                    di.d4 d4Var6 = r51Var2.f39609x;
                    d4Var6.h = di.d4.a(d4Var6.getText(), r51Var2.f39609x.getTextPaint());
                    if (r51Var2.S) {
                        vVar.addView(r51Var2.f39609x, w7.a6.a(150.0f, 0.0f, (-75.0f) - (((r51Var2.O.getHeight() + r51Var2.K) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f, (int) ((r51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 17));
                    } else {
                        vVar.addView(r51Var2.f39609x, w7.a6.a(150.0f, ((((r51Var2.O.getWidth() * (-0.39999998f)) / 2.0f) + r51Var2.O.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((r51Var2.O.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f, (int) ((r51Var2.O.getWidth() / AndroidUtilities.density) * 0.6f), 17));
                    }
                    r51Var2.f39609x.u();
                }
                TextView textView = r51Var2.f39610y;
                if (textView != null) {
                    vVar.removeView(textView);
                    r51Var2.f39610y = null;
                }
                TextView textView2 = new TextView(context);
                r51Var2.f39610y = textView2;
                textView2.setTextColor(-1);
                r51Var2.f39610y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    r51Var2.f39610y.setBackground(org.telegram.ui.ActionBar.g6.j0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    r51Var2.f39610y.setBackground(org.telegram.ui.ActionBar.g6.j0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                r51Var2.f39610y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                w7.c6.a(r51Var2.f39610y);
                TextView textView3 = r51Var2.f39610y;
                if (z11) {
                    i11 = R.string.VoiceOnceClose;
                } else {
                    i11 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i11));
                r51Var2.f39610y.setOnClickListener(new n51(r51Var2, 1));
                vVar.addView(r51Var2.f39610y, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 18.0f, -2, 81));
                if (!z11 && (p51Var = r51Var2.N) != null && p51Var.getMessageObject() != null && r51Var2.N.getMessageObject().messageOwner != null) {
                    r51Var2.N.getMessageObject().messageOwner.media_unread = false;
                    r51Var2.N.invalidate();
                }
                fo foVar22 = this.f39497a;
                foVar22.showDialog(foVar22.Z9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void K0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        long j10;
        int i10;
        ArrayList<MessageObject> arrayList;
        a3.i0 i0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        fo foVar = this.f39497a;
        vh.i iVar = foVar.X9;
        if (iVar != null) {
            HashMap hashMap = iVar.f47055a;
            vh.h hVar = (vh.h) hashMap.get(vh.i.b(u1Var));
            org.telegram.ui.Components.sc scVar = null;
            if (hVar != null) {
                messageObject = hVar.E;
            } else {
                messageObject = null;
            }
            vh.h hVar2 = (vh.h) foVar.X9.f47055a.get(vh.i.b(u1Var));
            if (hVar2 != null && (i11 = hVar2.R) != -1) {
                j10 = hVar2.f47052w[i11].d;
            } else {
                j10 = 0;
            }
            if (messageObject != null && j10 != 0) {
                Activity parentActivity = foVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.g5.g(parentActivity, i10, j10, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) foVar.f36166x6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.q.l(messageObject);
                    }
                    if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        z10 = true;
                    }
                    long j11 = j10;
                    a3.i0 i0Var2 = new a3.i0(this, arrayList, j11, 14);
                    if (z10) {
                        i0Var2.run();
                        i0Var = null;
                    } else {
                        i0Var = i0Var2;
                    }
                    scVar = org.telegram.ui.Components.zc.v(foVar.getParentActivity(), foVar, null, 1, j11, 1, foVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), foVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), 5000, false, i0Var);
                    scVar.f29103k = true;
                    scVar.k(scVar.e instanceof org.telegram.ui.Components.dc);
                }
            }
            vh.h hVar3 = (vh.h) hashMap.get(vh.i.b(u1Var));
            if (hVar3 != null) {
                if (scVar == null) {
                    hVar3.R = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.wb wbVar = scVar.e;
                if (!(wbVar instanceof org.telegram.ui.Components.ac)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) wbVar;
                hVar3.W = acVar;
                acVar.f23512a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.W.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new lm(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
        TLRPC.Message message;
        if (u1Var == null) {
            tVar.run();
            return;
        }
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f39497a;
            m2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, m2Var, true);
            return;
        }
        tVar.run();
    }

    @Override
    public final void L(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f39497a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void L1() {
        org.telegram.ui.ActionBar.c6 c6Var;
        fo foVar = this.f39497a;
        if (foVar.X0 != null && foVar.getParentActivity() != null) {
            Context context = foVar.X0.getContext();
            c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
            n41.U(context, foVar, false, c6Var, null);
        }
    }

    @Override
    public final void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
        boolean z10 = u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        fo foVar = this.f39497a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) u1Var.getMessageObject().messageOwner.media).channels.get(i10).longValue();
            if (foVar.T5 != j10) {
                foVar.presentFragment(fo.W9(j10));
            } else {
                foVar.f35872a1.e(false, false);
            }
        }
        if (u1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            foVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) u1Var.getMessageObject().messageOwner.media).winners.get(i10).longValue()));
        }
    }

    @Override
    public final void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        String string;
        int i13;
        TLRPC.User user;
        int i14;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z10;
        MessageObject messageObject = u1Var.getMessageObject();
        boolean z11 = false;
        jn jnVar = null;
        jn jnVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        jn jnVar3 = null;
        jn jnVar4 = null;
        fo foVar = this.f39497a;
        if (i10 == 19) {
            pf.c cVar = foVar.Ab;
            if (cVar != null) {
                cVar.a(true);
            }
            if (u1Var.getMessageObject() != null) {
                jnVar2 = new jn(this, u1Var, 2);
            }
            final jn jnVar5 = jnVar2;
            foVar.Ab = jnVar5;
            final Activity parentActivity = foVar.getParentActivity();
            final org.telegram.ui.ActionBar.c6 resourceProvider = foVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            jnVar5.d();
            jnVar5.f43197b = new ug.e(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b10 = ug.j.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j10 = messageObject.messageOwner.date * 1000;
            ug.s.d(messageObject, new Utilities.Callback(atomicBoolean, jnVar5, z10, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f46308a;
                public final pf.c f46309b;
                public final boolean f46310c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Context f46311f;
                public final c6 f46312g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f46311f = parentActivity;
                    this.f46312g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f46308a.get()) {
                        this.f46309b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f46310c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Context context = this.f46311f;
                        c6 c6Var = this.f46312g;
                        if (z12) {
                            j.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, c6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            j.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, c6Var);
                        }
                    }
                }
            }, new ug.g(atomicBoolean, jnVar5, 0));
        } else if (i10 == 21) {
            e();
        } else if (i10 == 84) {
            foVar.ya(u1Var);
        } else if (i10 == 80) {
            org.telegram.ui.Cells.t8 t8Var = org.telegram.ui.Components.qh0.O;
            if (foVar.getParentActivity() != null) {
                foVar.showDialog(new org.telegram.ui.Components.qh0(foVar.getContext(), foVar.getCurrentAccount(), messageObject, foVar.getResourceProvider()));
            }
        } else if (i10 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                    foVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i10 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i14 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                user = MessagesController.getInstance(i14).getUser(Long.valueOf(j11));
            } else {
                user = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.messageOwner.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f19363id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                foVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File sharingDirectory = AndroidUtilities.getSharingDirectory();
                    sharingDirectory.mkdirs();
                    file = new File(sharingDirectory, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                foVar.showDialog(new org.telegram.ui.Components.of0(foVar, null, user, null, file, jf.b.d(str, false), str3, str4, foVar.f35932ea));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i10 == 30) {
            foVar.presentFragment(new fo(t8.b.e(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i10 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i13 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.yh.g(new StringBuilder("+"), user2.phone, jf.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = jf.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f19363id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                foVar.presentFragment(new ws(bundle2));
            }
        } else if (i10 != 23 && i10 != 24) {
            if (messageObject.isSponsored()) {
                foVar.O9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    pf.c cVar2 = foVar.Ab;
                    if (cVar2 != null) {
                        cVar2.a(true);
                    }
                    if (u1Var.getMessageObject() != null) {
                        jnVar3 = new jn(this, u1Var, 4);
                    }
                    foVar.Ab = jnVar3;
                    pf.d.r(foVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, foVar.Ab, null, false, foVar.getMessagesController().sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage storyMentionWebpage = messageObject.getStoryMentionWebpage();
            if (storyMentionWebpage == null && (message = messageObject.messageOwner) != null && (messageMedia2 = message.media) != null) {
                storyMentionWebpage = messageMedia2.webpage;
            }
            if (storyMentionWebpage != null) {
                if (storyMentionWebpage.attributes != null) {
                    for (int i15 = 0; i15 < storyMentionWebpage.attributes.size(); i15++) {
                        if ((storyMentionWebpage.attributes.get(i15) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) storyMentionWebpage.attributes.get(i15)).storyItem) != null) {
                            storyItem.dialogId = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.getId();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            foVar.getOrCreateStoryViewer().F(foVar.getParentActivity(), tL_webPageAttributeStory.storyItem, bi.g9.a(foVar.f36160x0));
                            return;
                        }
                    }
                }
                if (!foVar.ja(storyMentionWebpage.url, u1Var, null, messageObject.getId(), 2)) {
                    pf.c cVar3 = foVar.Ab;
                    if (cVar3 != null) {
                        cVar3.a(true);
                    }
                    if (u1Var.getMessageObject() != null) {
                        jnVar4 = new jn(this, u1Var, 5);
                    }
                    foVar.Ab = jnVar4;
                    pf.d.r(foVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, foVar.Ab, null, false, true, false);
                }
            }
        } else {
            if (i10 == 24) {
                z11 = true;
            }
            TLRPC.Message message2 = messageObject.messageOwner;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                pf.c cVar4 = foVar.Ab;
                if (cVar4 != null) {
                    cVar4.a(true);
                }
                if (u1Var.getMessageObject() != null) {
                    jnVar = new jn(this, u1Var, 3);
                }
                foVar.Ab = jnVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    if (MediaDataController.getInstance(i11).getStickerSetByName(group) == null) {
                        foVar.Ab.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        foVar.Ab.f43197b = new ah.g(this, ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickerSet, new di.s3(4, this, z11)), 27);
                        return;
                    }
                }
                pf.d.r(foVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, foVar.Ab, null, false, true, false);
            }
        }
    }

    @Override
    public final void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        ej ejVar;
        int i10;
        MessageObject messageObject = u1Var.getMessageObject();
        li1 li1Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            fo foVar = this.f39497a;
            pf.c cVar = foVar.Ab;
            if (cVar != null) {
                cVar.a(true);
                foVar.Ab = null;
            }
            if (u1Var.getMessageObject() == null) {
                foVar.Ab = null;
                ejVar = null;
            } else {
                ejVar = new ej(foVar, u1Var.getMessageObject().getId(), u1Var, 1);
                foVar.Ab = ejVar;
            }
            i10 = ((org.telegram.ui.ActionBar.m2) this.f39497a).currentAccount;
            zh.n5 y3 = zh.n5.y(i10, false);
            Objects.requireNonNull(ejVar);
            gj gjVar = new gj(ejVar, 8);
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.c6 I = zh.n5.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y3.f50864a).getInputPeer(dialogId);
                tL_inputInvoiceMessage.msg_id = id2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject q6 = fi.k3.q(I, false);
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q6.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                li1Var = new li1(y3, ConnectionsManager.getInstance(y3.f50864a).sendRequest(tL_payments_getPaymentForm, new bi.f3(y3, messageObject, tL_inputInvoiceMessage, gjVar, 19)), 13);
            }
            if (li1Var != null) {
                ejVar.f43197b = li1Var;
                ejVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            ArrayList arrayList = new ArrayList();
            int i11 = -1;
            for (int i12 = 0; i12 < tL_messageMediaPaidMedia.extended_media.size(); i12++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i12);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                    if (tL_messageExtendedMedia == messageExtendedMedia) {
                        i11 = arrayList.size();
                    }
                    TLRPC.TL_message F7 = fo.F7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        F7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        F7.attachPath = message.attachPath;
                    }
                    F7.media = tL_messageExtendedMedia.media;
                    F7.noforwards = true;
                    arrayList.add(new MessageObject(messageObject.currentAccount, F7, false, true));
                }
            }
            if (i11 > -1 && !arrayList.isEmpty()) {
                PhotoViewer t12 = PhotoViewer.t1();
                fo foVar2 = this.f39497a;
                t12.K2(null, foVar2, foVar2.f35932ea);
                PhotoViewer.t1().b2(arrayList, i11, this.f39497a.a(), 0L, 0L, this.f39497a.Ha);
            }
        }
    }

    @Override
    public final void N(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f39497a.jb(messageObject, true);
        }
    }

    @Override
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10;
        int i11;
        MessagesController.PeerColor peerColor;
        ImageLocation forDocument;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        fo foVar = this.f39497a;
        if (isEmpty) {
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            sg.m1 m1Var = new sg.m1(foVar, i10, user, null, null, foVar.f35932ea);
            u1Var.getLocationOnScreen(new int[2]);
            m1Var.f45272v0 = u1Var.getNameStatusX();
            m1Var.f45273w0 = u1Var.getNameStatusY();
            m1Var.f45276z0 = u1Var.getScaleX();
            m1Var.f45274x0 = u1Var.getLeft();
            m1Var.f45275y0 = u1Var.getTop();
            m1Var.A0 = u1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i11).peerColors;
                Integer num = null;
                if (peerColors != null) {
                    peerColor = peerColors.getColor(colorId);
                } else {
                    peerColor = null;
                }
                if (peerColor != null) {
                    num = Integer.valueOf(peerColor.getColor1());
                }
                m1Var.f45271u0 = num;
            } else {
                m1Var.f45271u0 = Integer.valueOf(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.f20160r8[colorId]));
            }
            org.telegram.ui.Components.q5 q5Var = u1Var.fc;
            if (q5Var != null && (q5Var.f28516f[0] instanceof org.telegram.ui.Components.s5)) {
                m1Var.f45276z0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(foVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f20064m6, 0.2f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                    if ("video/webm".equals(document.mime_type)) {
                        forDocument = ImageLocation.getForDocument(document);
                        if (svgThumb != null) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        str2 = "160_160_g";
                    } else {
                        if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        forDocument = ImageLocation.getForDocument(document);
                        str2 = "160_160";
                    }
                    ImageLocation imageLocation = forDocument;
                    String str3 = str2;
                    z9Var.setLayerNum(7);
                    z9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    z9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (MessageObject.isTextColorEmoji(document)) {
                        Integer num2 = m1Var.f45271u0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = foVar.getThemedColor(org.telegram.ui.ActionBar.g6.f20233v6);
                        }
                        z9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    } else {
                        m1Var.C0 = MessageObject.getInputStickerSet(document);
                    }
                    m1Var.B0 = z9Var;
                    m1Var.E0 = true;
                }
            }
            foVar.showDialog(m1Var);
            return;
        }
        pf.d.s(foVar.getParentActivity(), "https://" + foVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i10;
        int i11;
        boolean isForwarded = u1Var.getMessageObject().isForwarded();
        fo foVar = this.f39497a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar);
            int i12 = R.raw.passcode_lock_close;
            int i13 = R.string.TodoCompleteForbiddenForward;
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getName(i11, peerDialogId)))).k(true);
            return false;
        } else if (!u1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(u1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.zc a03 = org.telegram.ui.Components.zc.a0(foVar);
            int i14 = R.raw.passcode_lock_close;
            int i15 = R.string.TodoCompleteForbidden;
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            a03.Q(i14, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i15, DialogObject.getName(i10, peerDialogId2)))).k(true);
            return false;
        } else if (!foVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new bn(this, 9))).k(true);
            return false;
        } else {
            foVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(foVar.e, foVar.Z7, true), u1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
    }

    @Override
    public final void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        fo foVar = this.f39497a;
        foVar.getSendMessagesHelper().sendCallback(true, u1Var.getMessageObject(), keyboardInlineButton, foVar);
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.u1 r43, org.telegram.tgnet.TLRPC.PollAnswer r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.O1(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final boolean P() {
        fo foVar = this.f39497a;
        if (foVar.W5[1].size() + foVar.W5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final wv0 P1() {
        return this.f39497a.f36156wa;
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        if (u1Var != null) {
            fo foVar = this.f39497a;
            if (foVar.getParentActivity() != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                if (MessagesController.getInstance(i10).richEditorAllowed() && (messageObject = u1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(foVar.e);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean Q1(long j10) {
        fo foVar = this.f39497a;
        TLRPC.Chat chat = foVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return foVar.getMessagesController().isAdmin(foVar.e.f19216id, j10);
        }
        return false;
    }

    @Override
    public final boolean R() {
        fo foVar = this.f39497a;
        if (!UserObject.isReplyUser(foVar.f35935f) && !UserObject.isUserSelf(foVar.f35935f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        this.f39497a.X7(characterStyle, z10, u1Var.getMessageObject(), u1Var);
    }

    @Override
    public final void R1(org.telegram.ui.Cells.u1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.R1(org.telegram.ui.Cells.u1, int, float, float, boolean):void");
    }

    @Override
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        fo foVar = this.f39497a;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (!kVar.t() && !foVar.F9()) {
            if (!z10 && chat.signature_profiles && (messageObject = u1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                foVar.sa(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                l(u1Var, chat, i10, z10);
                return;
            }
        }
        fo.c2(foVar, u1Var, true, f7, f10);
    }

    @Override
    public final boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        MessageObject messageObject;
        boolean z11;
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = u1Var.getMessageObject();
        }
        if (messageObject != null) {
            fo foVar = this.f39497a;
            if (!foVar.f35995jc && messageObject.getId() == foVar.f35982ic) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - foVar.f36008kc > 1000) {
                    return true;
                }
            } else {
                return z11;
            }
        }
        return false;
    }

    @Override
    public final boolean S1(org.telegram.ui.Cells.u1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.S1(org.telegram.ui.Cells.u1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final void T(org.telegram.ui.Cells.u1 u1Var) {
        h(u1Var, true, true, false);
    }

    @Override
    public final void T0(org.telegram.ui.Cells.u1 u1Var) {
        fo foVar = this.f39497a;
        foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(foVar.T5), u1Var);
    }

    @Override
    public final void U1(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        fo foVar = this.f39497a;
        if (AndroidUtilities.isContextSafe(foVar.getParentActivity()) && (chat = foVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            d(u1Var, foVar.getMessagesController().getParticipant(foVar.e.f19216id, currentUser.f19363id));
        }
    }

    @Override
    public final int V() {
        return this.f39497a.R3;
    }

    @Override
    public final void V0(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String string = LocaleController.getString("PsaMessageInfo_" + messageObject.messageOwner.fwd_from.psa_type);
            if (TextUtils.isEmpty(string)) {
                string = LocaleController.getString(R.string.PsaMessageInfoDefault);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            MessageObject.addLinks(false, spannableStringBuilder);
            MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
            fo foVar = this.f39497a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i10).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i10);
                        if (messageObject2 != messageObject) {
                            int childCount = foVar.f36160x0.getChildCount();
                            for (int i11 = 0; i11 < childCount; i11++) {
                                View childAt = foVar.f36160x0.getChildAt(i11);
                                if (childAt instanceof org.telegram.ui.Cells.u1) {
                                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                                    if (messageObject2.equals(u1Var2.getMessageObject())) {
                                        u1Var = u1Var2;
                                    }
                                }
                            }
                            messageObject = messageObject2;
                        }
                    } else {
                        i10++;
                    }
                }
            }
            foVar.Nb(messageObject, spannableStringBuilder, 1);
            u1Var.g4(1, false, true);
        }
    }

    @Override
    public final void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
        Bundle e = t8.b.e(j10, "user_id");
        org.telegram.ui.ActionBar.m2 m2Var = this.f39497a;
        if (m2Var.getMessagesController().checkCanOpenChat(e, m2Var, u1Var.getMessageObject())) {
            m2Var.presentFragment(new fo(e));
        }
    }

    @Override
    public final ih.a Y() {
        return this.f39497a.Qb;
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        if (u1Var == null) {
            messageObject = null;
        } else {
            messageObject = u1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.messageOwner != null) {
            fo foVar = this.f39497a;
            if (foVar.R3 != 1 && !foVar.D9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        fo foVar = this.f39497a;
        if (foVar.f36157wb != 0 && u1Var.getMessageObject() != null && foVar.f36157wb == u1Var.getMessageObject().getId() && foVar.f36171xb == i10) {
            return true;
        }
        return false;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        fo foVar = this.f39497a;
        sk skVar = foVar.Y;
        if (skVar != null) {
            CharSequence fieldText = skVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String publicUsername = ChatObject.getPublicUsername(chat);
            if (publicUsername != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) publicUsername).append((CharSequence) " ");
                foVar.Y.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new bn(this, 6), 200L);
            }
        }
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        fo foVar = this.f39497a;
        sk skVar = foVar.Y;
        if (skVar != null) {
            CharSequence fieldText = skVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) publicUsername).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(t8.b.u(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.s61("" + user.f19363id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            foVar.Y.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new bn(this, 7), 200L);
        }
    }

    @Override
    public final boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (u1Var != null && pageBlock != null) {
            fo foVar = this.f39497a;
            if (foVar.getParentActivity() != null && (messageObject = u1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.K2(null, foVar, null);
                    return t12.f2(null, null, null, null, null, null, null, indexOf, new an(foVar, arrayList), null, 0L, 0L, 0L, true, new zm(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        fo foVar = this.f39497a;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
            if (!kVar2.t() && !foVar.F9()) {
                z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
                if (!z10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.u1 u1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i10;
        b5 b10;
        int i11;
        wk wkVar;
        vk vkVar;
        if (!k()) {
            return false;
        }
        fo foVar = this.f39497a;
        if (foVar.e != null && (((wkVar = foVar.O0) == null || wkVar.getVisibility() != 0) && ((vkVar = foVar.R) == null || vkVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = foVar.e;
        if (chat != null && ((foVar.f35915d4 == 0 || foVar.f35964h4) && (!ChatObject.isChannel(chat) || foVar.e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        h5[] h5VarArr = new h5[r22 + 2 + r42];
        h5VarArr[0] = h5.d;
        h5VarArr[1] = h5.h;
        char c10 = 2;
        if (r22 != 0) {
            h5VarArr[2] = h5.f36607n;
            c10 = 3;
        }
        if (r42 != 0) {
            h5VarArr[c10] = h5.f36608r;
        }
        TLRPC.UserFull userFull = foVar.getMessagesController().getUserFull(user.f19363id);
        if (userFull == null) {
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            b10 = b5.b(user, i10, h5VarArr);
        } else {
            b10 = b5.c(user, userFull, h5VarArr);
            if (!c2.b.g(b10)) {
                i11 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
                b10 = b5.b(user, i11, h5VarArr);
            }
        }
        if (c2.b.g(b10)) {
            c2.b.m().y((ViewGroup) foVar.fragmentView, foVar.f35932ea, b10, new f7(this, u1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(foVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final qn f35334b;

            {
                this.f35334b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f35334b.v(user, false);
                        return;
                    case 1:
                        this.f35334b.b(user);
                        return;
                    default:
                        this.f35334b.f39497a.ra(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new t1(this, u1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final qn f35334b;

            {
                this.f35334b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f35334b.v(user, false);
                        return;
                    case 1:
                        this.f35334b.b(user);
                        return;
                    default:
                        this.f35334b.f39497a.ra(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final qn f35334b;

            {
                this.f35334b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f35334b.v(user, false);
                        return;
                    case 1:
                        this.f35334b.b(user);
                        return;
                    default:
                        this.f35334b.f39497a.ra(user);
                        return;
                }
            }
        }, r42);
        H.f27299t = false;
        H.f27280i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void c2(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f39497a.vc(primaryMessageObject, false);
    }

    public final void d(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        TLRPC.User currentUser = u1Var.getCurrentUser();
        fo foVar = this.f39497a;
        foVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(foVar.getParentActivity()) && (chat = foVar.e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == foVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = channelParticipant.rank;
            } else if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant2.promoted_by == foVar.getUserConfig().getClientUserId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = foVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                org.telegram.ui.Components.z01.b(parentActivity, i10, -foVar.e.f19216id, currentUser, str2, z15, z16, z12, c6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == foVar.getUserConfig().getClientUserId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (ChatObject.isChannel(foVar.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                foVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(foVar.e);
                tL_channels_getParticipant.participant = foVar.getMessagesController().getInputPeer(currentUser.f19363id);
                foVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new bi.f0(7, this, u1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = foVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
            org.telegram.ui.Components.z01.b(parentActivity2, i10, -foVar.e.f19216id, currentUser, str2, z152, z162, z12, c6Var);
        }
    }

    @Override
    public final void d0(int i10) {
        CharSequence replaceSingleTag;
        int i11;
        SpannableStringBuilder replaceTags;
        int i12;
        fo foVar = this.f39497a;
        try {
            if (i10 == 0) {
                foVar.k7();
                ol olVar = foVar.f36188z3;
                if (olVar != null) {
                    olVar.l(0L, 84, null, new bn(this, 1));
                    foVar.f36188z3.performHapticFeedback(3, 2);
                }
            } else if (i10 == 1) {
                String formatDateTime = LocaleController.formatDateTime(foVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (foVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.f41.h(i12), formatDateTime));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.f41.h(i11), new Object[0]));
                }
                org.telegram.ui.Components.zc.a0(foVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                foVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i10 == 2 || i10 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(foVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(foVar);
                int i13 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", foVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i10 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new bn(this, 2));
                } else if (foVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new bn(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), a02.f31837c);
                acVar.c(i13, 36, 36, new String[0]);
                if (append2 != null) {
                    String charSequence = append2.toString();
                    int i14 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append2.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i14 >= 6) {
                            append2.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i14++;
                    }
                }
                acVar.f23513b.setText(append2);
                acVar.f23513b.setSingleLine(false);
                acVar.f23513b.setMaxLines(6);
                a02.b(acVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean d1(MessageObject messageObject) {
        rm rmVar;
        int i10 = (messageObject.getDialogId() > 1271266957L ? 1 : (messageObject.getDialogId() == 1271266957L ? 0 : -1));
        fo foVar = this.f39497a;
        if ((i10 == 0 || ((rmVar = foVar.A0) != null && rmVar.N)) && foVar.R3 != 7) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        fo foVar = this.f39497a;
        if (isHuaweiStoreApp) {
            pf.d.s(foVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.s(foVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean e0() {
        if (this.f39497a.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        this.f39497a.L7(u1Var, true, false, f7, f10, false, false, false);
    }

    @Override
    public final void f1() {
        fo foVar = this.f39497a;
        foVar.T7();
        UndoView undoView = foVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, foVar.T5, null);
    }

    @Override
    public final String g(org.telegram.ui.Cells.u1 u1Var) {
        fo foVar;
        int i10;
        if (u1Var.getMessageObject() != null && (i10 = (foVar = this.f39497a).f36157wb) != 0 && i10 == u1Var.getMessageObject().getId() && foVar.f36171xb == 3) {
            return foVar.f36196zb;
        }
        return null;
    }

    @Override
    public final void g2() {
        this.f39497a.w9();
    }

    public final void h(org.telegram.ui.Cells.u1 u1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i10;
        int i11;
        dk dkVar;
        if (u1Var == null || (primaryMessageObject = u1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        fo foVar = this.f39497a;
        ak akVar = foVar.f36160x0;
        if (akVar != null && (dkVar = foVar.f36185z0) != null && dkVar.f44835y < 0) {
            for (int childCount = akVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = foVar.f36160x0.getChildAt(childCount);
                foVar.f36160x0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i11 = foVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.x0) {
                        i11 = foVar.Q8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = -1;
        i11 = 0;
        if (z10 && i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                dk dkVar2 = foVar.f36185z0;
                foVar.f36160x0.getClass();
                dkVar2.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) foVar.f36104s9), false);
            } else {
                foVar.f36185z0.h1(i10, i11);
            }
        }
        foVar.N0 = z11;
        foVar.vc(primaryMessageObject, false);
        foVar.N0 = false;
    }

    @Override
    public final int h0(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar;
        fo foVar = this.f39497a;
        if (foVar.f36158wc.f16293f && (cVar = foVar.Cc) != null && cVar.f44656n == u1Var && cVar.f44652a.getWidth() > 0) {
            return foVar.Cc.f44652a.getHeight();
        }
        return 0;
    }

    @Override
    public final void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        fo foVar = this.f39497a;
        if (!foVar.E9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (foVar.getParentActivity() != null) {
                if (foVar.O0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || ag.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    sk skVar = foVar.Y;
                    MessageObject messageObject = u1Var.getMessageObject();
                    MessageObject messageObject2 = u1Var.getMessageObject();
                    dj djVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    pf.c cVar = foVar.Ab;
                    if (cVar != null) {
                        cVar.a(true);
                        foVar.Ab = null;
                    }
                    if (str != null && u1Var.getMessageObject() != null) {
                        dj djVar2 = new dj(foVar, u1Var.getMessageObject().getId(), str, u1Var, 1);
                        foVar.Ab = djVar2;
                        djVar = djVar2;
                    } else {
                        foVar.Ab = null;
                    }
                    skVar.a0(keyboardButtonProto, messageObject, messageObject2, djVar);
                }
            }
        }
    }

    @Override
    public final void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = rh.i.a(messageObject);
            boolean a10 = w7.m6.a(a2, 7);
            fo foVar = this.f39497a;
            if (a10) {
                org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.e_hand_2, 36, rh.i.b(messageObject, a2)).j();
            } else if (i10 < 0 && !arrayList.isEmpty()) {
                foVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                u1Var.S0(true);
            } else if (foVar.getParentActivity() != null) {
                if (foVar.f36035n2 == null) {
                    org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(5, foVar.getParentActivity(), foVar.f35932ea, false);
                    foVar.f36035n2 = v40Var;
                    v40Var.setAlpha(0.0f);
                    foVar.f36035n2.setVisibility(4);
                    int indexOfChild = foVar.X0.indexOfChild(foVar.S);
                    if (indexOfChild == -1) {
                        return;
                    }
                    foVar.X0.addView(foVar.f36035n2, indexOfChild + 1, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                }
                if (arrayList.isEmpty() && i10 < 0) {
                    ArrayList<org.telegram.ui.Cells.s1> pollButtons = u1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i16 = 0;
                    float f7 = 0.0f;
                    while (true) {
                        if (i16 < size) {
                            org.telegram.ui.Cells.s1 s1Var = pollButtons.get(i16);
                            float y3 = ((u1Var.getY() + s1Var.f21782b) - AndroidUtilities.dp(4.0f)) - foVar.f36104s9;
                            foVar.f36070q2 = AndroidUtilities.dp(13.3f) + s1Var.f21781a;
                            int b10 = org.telegram.ui.Cells.d0.b(6.0f, s1Var.f21782b, i12);
                            foVar.f36083r2 = b10;
                            if (y3 > 0.0f) {
                                i15 = foVar.f36070q2;
                                i13 = b10;
                                f7 = 0.0f;
                                break;
                            }
                            i16++;
                            f7 = y3;
                        } else {
                            i13 = i12;
                            i15 = i11;
                            break;
                        }
                    }
                    if (f7 != 0.0f) {
                        foVar.f36160x0.v0(0, (int) f7, null);
                        foVar.f36059p2 = u1Var;
                        return;
                    }
                    i14 = i15;
                } else {
                    i13 = i12;
                    i14 = i11;
                }
                foVar.f36035n2.e(u1Var, Integer.valueOf(i10), i14, i13, true);
            }
        }
    }

    @Override
    public final void i0(org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        fo foVar = this.f39497a;
        if (foVar.getParentActivity() != null) {
            if (foVar.X9 == null) {
                vh.i iVar = new vh.i(foVar.getParentActivity());
                foVar.X9 = iVar;
                foVar.X0.addView(iVar, w7.a6.e(-1, -1, 48));
            }
            vh.i iVar2 = foVar.X9;
            HashMap hashMap = iVar2.f47055a;
            ArrayList arrayList = iVar2.f47057c;
            arrayList.clear();
            int i10 = iVar2.d;
            UserConfig userConfig = UserConfig.getInstance(i10);
            long j10 = userConfig.clientUserId;
            arrayList.add(Long.valueOf(j10));
            if (userConfig.suggestContacts) {
                ArrayList<TLRPC.TL_topPeer> arrayList2 = MediaDataController.getInstance(i10).hints;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.TL_topPeer tL_topPeer = arrayList2.get(i11);
                    i11++;
                    TLRPC.TL_topPeer tL_topPeer2 = tL_topPeer;
                    long j11 = tL_topPeer2.peer.user_id;
                    if (j11 != 0) {
                        int i12 = size;
                        if (MessagesController.getInstance(i10).getUser(Long.valueOf(tL_topPeer2.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j11));
                        }
                        size = i12;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i10).getAllDialogs();
            for (int i13 = 0; i13 < allDialogs.size(); i13++) {
                TLRPC.Dialog dialog = allDialogs.get(i13);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j12 = dialog.f19220id;
                    if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                        if (DialogObject.isUserDialog(dialog.f19220id)) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(dialog.f19220id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f19363id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f19220id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f19220id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f19220id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f19220id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f19220id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = vh.i.b(u1Var);
            if (b10 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    Long l4 = (Long) obj;
                    if (hashSet.add(l4) && DialogObject.isUserDialog(l4.longValue())) {
                        arrayList4.add(l4);
                    }
                }
                vh.h hVar = new vh.h(iVar2, u1Var, arrayList4, new s9.b(17, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.f39497a.Z7(u1Var, reactionCount, z10, f7, f10);
    }

    @Override
    public final void j() {
        e();
    }

    public final boolean k() {
        fo foVar = this.f39497a;
        if (!UserObject.isUserSelf(foVar.f35935f)) {
            TLRPC.Chat chat = foVar.e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !foVar.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
        if (u1Var != null && document != null) {
            fo foVar = this.f39497a;
            if (foVar.getParentLayout() != null && Z(u1Var)) {
                org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(foVar, u1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new t1(this, u1Var, document, 24), false);
                H.f27299t = false;
                H.Z();
            }
        }
    }

    public final void l(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, boolean z10) {
        fo foVar = this.f39497a;
        TLRPC.Chat chat2 = foVar.e;
        if (chat2 != null && chat.f19216id == chat2.f19216id) {
            uj ujVar = foVar.f35872a1;
            if (ujVar != null && i10 == 0) {
                ujVar.e(false, false);
            } else if (u1Var.getMessageObject() != null) {
                foVar.j(i10, u1Var.getMessageObject().getId(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f19216id != chat2.f19216id || foVar.K9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19216id);
            if (i10 != 0) {
                bundle.putInt("message_id", i10);
            }
            ej ejVar = null;
            if (z10) {
                pf.c cVar = foVar.Ab;
                if (cVar != null) {
                    cVar.a(true);
                    foVar.Ab = null;
                }
                if (u1Var.getMessageObject() == null) {
                    foVar.Ab = null;
                } else {
                    ej ejVar2 = new ej(foVar, u1Var.getMessageObject().getId(), u1Var, 0);
                    foVar.Ab = ejVar2;
                    ejVar = ejVar2;
                }
            }
            if (foVar.getMessagesController().checkCanOpenChat(bundle, foVar, u1Var.getMessageObject(), ejVar)) {
                fo foVar2 = new fo(bundle);
                if (ejVar != null && i10 != 0) {
                    AndroidUtilities.runOnUIThread(new fi.l3(this, ejVar, chat, i10, foVar2, 17), 5000L);
                    ejVar.d();
                    return;
                }
                foVar.presentFragment(foVar2);
            }
        }
    }

    @Override
    public final boolean l0() {
        boolean z10;
        fo foVar = this.f39497a;
        if (!foVar.F9()) {
            z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean l2(int i10) {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        if (i10 != 16 && i10 != R.id.acc_action_small_button && i10 != R.id.acc_action_msg_options) {
            return false;
        }
        fo foVar = this.f39497a;
        z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
        if (z10 && foVar.J9) {
            b5Var = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
                ((ActionBarLayout) b5Var2).r();
            }
            return true;
        }
        return !c();
    }

    @Override
    public final void m(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11;
        TLRPC.Document document;
        int i12;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i13;
        TLRPC.Document document3;
        int i14;
        int i15;
        int i16;
        long j10;
        long j11;
        int i17;
        boolean z10;
        boolean z11;
        int i18;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                G1(u1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            fo foVar = this.f39497a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(foVar)) {
                    nd0 nd0Var = new nd0(3);
                    c6Var2 = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                    nd0Var.setResourceProvider(c6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = foVar.getMessagesController().getPeer(foVar.a());
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = messageMedia.geo;
                    String str = messageMedia.address;
                    if (str == null) {
                        if (pollAnswer != null && (tL_textWithEntities = pollAnswer.text) != null) {
                            str = tL_textWithEntities.text;
                        } else {
                            str = "";
                        }
                    }
                    tL_messageMediaGeo.address = str;
                    tL_message.media = tL_messageMediaGeo;
                    nd0Var.O0 = false;
                    nd0Var.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    foVar.presentFragment(nd0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                xt.q().w(foVar.getParentActivity());
                xt.q().v(new on(this, tL_messageMediaPoll, pollAnswer, u1Var));
                xt q6 = xt.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i18 = 2;
                } else {
                    i18 = 0;
                }
                MessageObject messageObject2 = u1Var.getMessageObject();
                c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                q6.t(document4, null, "", null, null, i18, false, messageObject2, c6Var, 200);
            } else {
                long j12 = 0;
                if (MessageObject.isMusicDocument(messageMedia.document)) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (MediaController.getInstance().isPlayingMessage(messageObject) && playingMessageObject != null) {
                        boolean z12 = playingMessageObject.isPlayingExplanationObject;
                        if (i10 == -3) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12 == z11) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(playingMessageObject);
                                return;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(playingMessageObject);
                                return;
                            }
                        }
                    }
                    TLRPC.Message message = messageObject.messageOwner;
                    TLRPC.TL_message F7 = fo.F7(message);
                    F7.media = messageMedia;
                    F7.attachPath = rh.f.c(message, i10);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i17 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    MessageObject messageObject3 = new MessageObject(i17, F7, false, true);
                    if (i10 == -3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    messageObject3.isPlayingExplanationObject = z10;
                    arrayList.add(messageObject3);
                    if (MediaController.getInstance().isPlayingMessage(messageObject)) {
                        MediaController.getInstance().cleanupPlayer(false, true);
                    }
                    MediaController.getInstance().setPlaylist(arrayList, messageObject3, 0L);
                    return;
                }
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !MessageObject.isVideoDocument(document5)) {
                    i15 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    rh.a aVar = new rh.a(i15, messageObject, document6, rh.f.c(messageObject.messageOwner, i10));
                    if (aVar.f44648g) {
                        FileLoader.getInstance(i15).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = u1Var.f22488y7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            rh.g gVar = u1Var.f22172c6;
                            if (gVar != null) {
                                gVar.e();
                            }
                            rh.g gVar2 = u1Var.f22157b6;
                            if (gVar2 != null) {
                                gVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f44647f) {
                        FileLoader.getInstance(i15).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = u1Var.f22488y7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            rh.g gVar3 = u1Var.f22172c6;
                            if (gVar3 != null) {
                                gVar3.e();
                            }
                            rh.g gVar4 = u1Var.f22157b6;
                            if (gVar4 != null) {
                                gVar4.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message F72 = fo.F7(message2);
                        F72.media = messageMedia;
                        F72.attachPath = rh.f.c(message2, i10);
                        i16 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i16, F72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().K2(null, foVar, foVar.f35932ea);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i19 = messageObject6.type;
                            if (i19 != 0) {
                                j10 = foVar.T5;
                            } else {
                                j10 = 0;
                            }
                            if (i19 != 0) {
                                j11 = foVar.L6;
                            } else {
                                j11 = 0;
                            }
                            if (i19 != 0) {
                                j12 = foVar.d();
                            }
                            t12.d2(messageObject6, foVar, j10, j11, j12, foVar.Ga);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, foVar.getParentActivity(), foVar.f35932ea, false);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            foVar.C6(messageObject6);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.messageOwner;
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i11 = arrayList3.size();
                    } else {
                        i11 = -1;
                    }
                    TLRPC.TL_message F73 = fo.F7(message3);
                    F73.media = messageMedia3;
                    F73.attachPath = rh.f.c(message3, -2);
                    i14 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    arrayList3.add(new MessageObject(i14, F73, false, true));
                    arrayList2.add(-2);
                } else {
                    i11 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i11 = arrayList3.size();
                    }
                    TLRPC.TL_message F74 = fo.F7(message3);
                    F74.media = messageMedia2;
                    F74.attachPath = rh.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    F74.message = pollResults2.solution;
                    F74.entities = pollResults2.solution_entities;
                    i13 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, F74, false, true));
                    arrayList2.add(-3);
                }
                ag.d.b(tL_messageMediaPoll.poll, foVar.getUserConfig().getClientUserId());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i20);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                        if (pollAnswer2.unshuffled_index == i10) {
                            i11 = arrayList3.size();
                        }
                        TLRPC.TL_message F75 = fo.F7(message3);
                        F75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        F75.message = tL_textWithEntities2.text;
                        F75.entities = tL_textWithEntities2.entities;
                        F75.attachPath = rh.f.c(message3, pollAnswer2.unshuffled_index);
                        i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        arrayList3.add(new MessageObject(i12, F75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i11 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().K2(null, foVar, foVar.f35932ea);
                    PhotoViewer.t1().b2(arrayList3, i11, foVar.a(), 0L, 0L, foVar.Ha);
                }
            }
        }
    }

    @Override
    public final void n(org.telegram.ui.Cells.u1 u1Var) {
        if (u1Var.getMessageObject().isImportedForward()) {
            f1();
            return;
        }
        fo foVar = this.f39497a;
        if (!foVar.f36011l3 && foVar.f36160x0 != null && foVar.getParentActivity() != null && foVar.fragmentView != null) {
            if (foVar.f36123u2 == null) {
                xm xmVar = foVar.X0;
                int indexOfChild = xmVar.indexOfChild(foVar.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(1, foVar.getParentActivity(), foVar.f35932ea, false);
                    foVar.f36123u2 = v40Var;
                    xmVar.addView(v40Var, indexOfChild + 1, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                    foVar.f36123u2.setAlpha(0.0f);
                    foVar.f36123u2.setVisibility(4);
                } else {
                    return;
                }
            }
            foVar.f36123u2.e(u1Var, null, 0, 0, true);
        }
    }

    @Override
    public final void n0(String str) {
        fo foVar = this.f39497a;
        wk wkVar = foVar.O0;
        if (wkVar == null || wkVar.getVisibility() != 0) {
            vk vkVar = foVar.R;
            if ((vkVar == null || vkVar.getVisibility() != 0) && foVar.Y != null && str != null && str.length() > 0) {
                sk skVar = foVar.Y;
                skVar.setFieldText("@" + str + " ");
                foVar.Y.F0();
            }
        }
    }

    @Override
    public final void n2() {
        fo foVar = this.f39497a;
        if (foVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", foVar.T5);
            bundle.putInt("start_from", 10);
            foVar.presentFragment(new org.telegram.ui.Components.cb0(bundle, foVar.f35872a1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.zc.a0(foVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", foVar.getMessagesController().recommendedChannelsLimitPremium), new bn(this, 4))).j();
    }

    @Override
    public final void o() {
        this.f39497a.X0.getClass();
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.b6 b6Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        fo foVar = this.f39497a;
        if (!foVar.getMessagesController().premiumFeaturesBlocked() && b6Var != null && !b6Var.standard) {
            long documentId = b6Var.getDocumentId();
            TLRPC.Document document = b6Var.document;
            if (document == null) {
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                document = org.telegram.ui.Components.s5.f(i10, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.ew ewVar = new org.telegram.ui.Components.ew(foVar, foVar.getParentActivity(), foVar.f35932ea, arrayList);
                org.telegram.ui.Components.uv uvVar = ewVar.f24804f;
                uvVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(uvVar);
                uvVar.v = imageReceiver;
                if (uvVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                uvVar.f29779w = true;
                uvVar.f29780x.d(1.0f, true);
                uvVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f20064m6, 0.2f, true), 0L, null, null, 0);
                uvVar.v.setLayerNum(7);
                uvVar.v.setAllowStartLottieAnimation(true);
                uvVar.v.setAllowStartAnimation(true);
                uvVar.v.setAutoRepeat(1);
                uvVar.v.setAllowDecodeSingleFrame(true);
                uvVar.v.setParentView(uvVar);
                ewVar.setCalcMandatoryInsets(foVar.C9());
                foVar.showDialog(ewVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        fo foVar = this.f39497a;
        di.d4 d4Var = foVar.A1;
        if (d4Var != null) {
            d4Var.e(true);
        }
        if (foVar.getParentActivity() != null && (messageObject = u1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e) {
                FileLog.e(e);
                str = factCheck.country;
            }
            di.d4 d4Var2 = new di.d4(foVar.getParentActivity(), 3);
            d4Var2.p(true);
            d4Var2.K = Layout.Alignment.ALIGN_NORMAL;
            d4Var2.d = -1L;
            d4Var2.T = true;
            d4Var2.e = true;
            d4Var2.q(12.0f);
            foVar.A1 = d4Var2;
            d4Var2.f6801l0 = new fc(25, this, d4Var2);
            d4Var2.s(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            foVar.X0.addView(foVar.A1, w7.a6.a(520.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 55));
            foVar.X0.post(new i2.z(this, u1Var, i11, i10, 4));
        }
    }

    public final void p(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19363id);
            org.telegram.ui.ActionBar.m2 m2Var = this.f39497a;
            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var, u1Var.getMessageObject())) {
                m2Var.presentFragment(new fo(bundle));
            }
        }
    }

    @Override
    public final void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        vh.h hVar;
        int i10;
        boolean z10;
        boolean z11;
        float f11;
        vh.i iVar = this.f39497a.X9;
        if (iVar != null && (hVar = (vh.h) iVar.f47055a.get(vh.i.b(u1Var))) != null) {
            vh.d[] dVarArr = hVar.f47052w;
            RectF rectF = hVar.f47050r;
            if (hVar.M) {
                float f12 = (f7 - rectF.left) + hVar.U;
                float f13 = (f10 - rectF.top) + hVar.V;
                int i11 = vh.g.f47037a;
                int floor = (int) Math.floor((f12 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(vh.g.f47037a + 11));
                if ((-AndroidUtilities.dp(37)) < f13 && f13 < rectF.height()) {
                    i10 = w7.s.b(floor, 0, dVarArr.length - 1);
                } else {
                    i10 = -1;
                }
                if (hVar.R != i10) {
                    hVar.f47044a.performHapticFeedback(3, 1);
                    hVar.R = i10;
                    for (int i12 = 0; i12 < dVarArr.length; i12++) {
                        vh.d dVar = dVarArr[i12];
                        if (i10 == i12) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = 1.0f;
                        if (dVar.f47016p != z10) {
                            ValueAnimator valueAnimator = dVar.f47014n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f47016p = z10;
                            float f15 = dVar.f47015o;
                            if (z10) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f15, f11);
                            dVar.f47014n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f47014n.addUpdateListener(dVar);
                            dVar.f47014n.setInterpolator(vh.f.f47020a);
                            dVar.f47014n.start();
                        }
                        vh.d dVar2 = dVarArr[i12];
                        if (i10 != i12 && i10 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f47013m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f47011k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f47013m = z11;
                            float f16 = dVar2.f47012l;
                            if (!z11) {
                                f14 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f16, f14);
                            dVar2.f47011k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f47011k.addUpdateListener(dVar2);
                            dVar2.f47011k.setInterpolator(vh.f.f47020a);
                            dVar2.f47011k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.p9 p2() {
        return this.f39497a.f35907c9;
    }

    public final void q(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19216id);
            bundle.putBoolean("expandPhoto", false);
            this.f39497a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        fo foVar = this.f39497a;
        foVar.L7(u1Var, false, false, f7, f10, true, false, false);
        foVar.f36160x0.getClass();
        fo.d2(foVar, RecyclerView.R(u1Var));
    }

    @Override
    public final void r(org.telegram.ui.Cells.u1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.r(org.telegram.ui.Cells.u1):void");
    }

    @Override
    public final void s() {
        this.f39497a.cc();
    }

    @Override
    public final void t(org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int i11;
        dk dkVar;
        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            fo foVar = this.f39497a;
            ak akVar = foVar.f36160x0;
            if (akVar != null && (dkVar = foVar.f36185z0) != null && dkVar.f44835y < 0) {
                for (int childCount = akVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = foVar.f36160x0.getChildAt(childCount);
                    foVar.f36160x0.getClass();
                    i10 = RecyclerView.R(childAt);
                    if (i10 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                                i11 = foVar.Q8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.x0) {
                            i11 = foVar.Q8(childAt);
                            break;
                        }
                    }
                }
            }
            i10 = -1;
            i11 = 0;
            foVar.vc(primaryMessageObject, false);
            di.d4 d4Var = foVar.A1;
            if (d4Var != null) {
                d4Var.e(true);
            }
            if (i10 >= 0 && u1Var.getCurrentMessagesGroup() == null) {
                foVar.f36185z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void u(org.telegram.ui.Cells.u1 u1Var) {
        MessageObject messageObject;
        int i10;
        long j10;
        MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = u1Var.getMessageObject();
        }
        MessageObject messageObject2 = messageObject;
        TLRPC.MessageReplies messageReplies = messageObject2.messageOwner.replies;
        if (messageReplies != null) {
            i10 = messageReplies.read_max_id;
            j10 = messageReplies.channel_id;
        } else {
            i10 = -1;
            j10 = 0;
        }
        int i11 = i10;
        long j11 = j10;
        fo foVar = this.f39497a;
        foVar.fa(foVar.e.f19216id, messageObject2, messageObject2.getId(), j11, i11, 0, null);
    }

    @Override
    public final void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        fo foVar = this.f39497a;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        boolean z10 = true;
        if (!kVar.t() && !foVar.F9()) {
            if (u1Var.getMessageObject() != null && u1Var.getMessageObject().isSponsored()) {
                M0(10, u1Var);
                return;
            }
            if (!ChatObject.isForum(foVar.e) && !foVar.K9()) {
                z10 = false;
            }
            v(user, z10);
            return;
        }
        fo.c2(foVar, u1Var, true, f7, f10);
    }

    public final void v(TLRPC.User user, boolean z10) {
        int i10;
        if (user != null && user.f19363id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i11 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f19363id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            fo foVar = this.f39497a;
            TLRPC.User user2 = foVar.f35935f;
            if (user2 != null && user2.f19363id == user.f19363id) {
                i11 = 1;
            }
            profileActivity.N4(i11);
            Activity parentActivity = foVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            foVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void v0(org.telegram.ui.Cells.u1 r44, float r45, float r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.v0(org.telegram.ui.Cells.u1, float, float, boolean):void");
    }

    @Override
    public final boolean v1() {
        fo foVar = this.f39497a;
        if (foVar.X0.getMeasuredWidth() > foVar.X0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final String w(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        fo foVar = this.f39497a;
        if (UserObject.isBotForum(foVar.f35935f)) {
            return null;
        }
        TLRPC.Chat chat = foVar.e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = foVar.getMessagesController().getAdminRank(foVar.e.f19216id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = foVar.f35902c4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final boolean w0(MessageObject messageObject) {
        return !this.f39497a.f36094s.containsKey(messageObject);
    }

    @Override
    public final void w1(org.telegram.ui.Cells.u1 u1Var) {
        fo.U4(this.f39497a, u1Var);
    }

    @Override
    public final void x0(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar = this.f39497a.Cc;
        if (cVar != null && cVar.f44656n == u1Var) {
            cVar.f44659w.getClass();
        }
    }

    @Override
    public final void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        h(u1Var, z10, false, false);
    }

    @Override
    public final void y0() {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.f6 animation;
        fo foVar = this.f39497a;
        if (!foVar.f36011l3 && !SharedConfig.noSoundHintShowed && foVar.f36160x0 != null && foVar.getParentActivity() != null && foVar.fragmentView != null) {
            org.telegram.ui.Components.v40 v40Var = foVar.f36110t2;
            if (v40Var == null || v40Var.getTag() == null) {
                if (foVar.f36110t2 == null) {
                    xm xmVar = foVar.X0;
                    int indexOfChild = xmVar.indexOfChild(foVar.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.v40 v40Var2 = new org.telegram.ui.Components.v40(0, foVar.getParentActivity(), foVar.f35932ea, false);
                        foVar.f36110t2 = v40Var2;
                        v40Var2.setShowingDuration(10000L);
                        xmVar.addView(foVar.f36110t2, indexOfChild + 1, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                        foVar.f36110t2.setAlpha(0.0f);
                        foVar.f36110t2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = foVar.f36160x0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = foVar.f36160x0.getChildAt(i10);
                    if ((childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = u1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && foVar.f36110t2.e(u1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        fo foVar = this.f39497a;
        if (foVar.getParentActivity() != null && tLObject != null) {
            b5Var = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
                if (((ActionBarLayout) b5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19216id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f19363id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, foVar.getParentActivity(), foVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(foVar.getParentActivity(), false, false);
                e1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                e1Var.setMinimumWidth(160);
                e1Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(foVar.getParentActivity(), false, false);
                e1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                e1Var2.setMinimumWidth(160);
                e1Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, u1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                fo foVar2 = new fo(bundle);
                foVar2.J9 = true;
                foVar.presentFragmentAsPreviewWithMenu(foVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                foVar.g7();
                return;
            }
            foVar.presentFragment(new fo(bundle));
        }
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        boolean z10;
        int i15;
        boolean z11;
        int i16;
        b5 b5Var;
        int i17;
        int i18;
        h5 h5Var;
        wk wkVar;
        vk vkVar;
        if (!k()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        fo foVar = this.f39497a;
        if (!isEmpty && foVar.e != null && (((wkVar = foVar.O0) == null || wkVar.getVisibility() != 0) && ((vkVar = foVar.R) == null || vkVar.getVisibility() != 0))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat2 = foVar.e;
        if (chat2 != null && ((foVar.f35915d4 == 0 || foVar.f35964h4) && (!ChatObject.isChannel(chat2) || foVar.e.megagroup))) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        TLRPC.Chat chat3 = foVar.e;
        if (chat3 != null && chat3.f19216id == chat.f19216id && !foVar.K9()) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        h5[] h5VarArr = new h5[i12 + 1 + i10 + i11];
        h5VarArr[0] = h5.d;
        if (i12 != 0) {
            if (chat.broadcast) {
                h5Var = h5.e;
            } else {
                h5Var = h5.f36606f;
            }
            h5VarArr[1] = h5Var;
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (i10 != 0) {
            h5VarArr[i13] = h5.f36607n;
            i13++;
        }
        if (i11 != 0) {
            h5VarArr[i13] = h5.f36608r;
        }
        TLRPC.ChatFull chatFull = foVar.getMessagesController().getChatFull(chat.f19216id);
        if (chatFull == null) {
            i14 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
            int i19 = i11;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            int i20 = i12;
            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(chat, 1);
            BitmapDrawable bitmapDrawable = null;
            if (forUserOrChat2 != null && (forUserOrChat2.photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                str = "b";
            } else {
                str = null;
            }
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                bitmapDrawable = chatPhoto.strippedBitmap;
            }
            z10 = true;
            i15 = i20;
            z11 = i10;
            i16 = i19;
            b5Var = new b5(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, chat, h5VarArr, new d5(i14, chat, NotificationCenter.chatInfoDidLoad));
        } else {
            b5Var = b5.a(chat, chatFull, h5VarArr);
            i16 = i11;
            i15 = i12;
            z10 = true;
            z11 = i10;
        }
        if (c2.b.g(b5Var)) {
            c2.b.m().y((ViewGroup) foVar.fragmentView, foVar.f35932ea, b5Var, new f7(this, chat, u1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(foVar, u1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new en(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        if (z12) {
            i17 = R.drawable.msg_channel;
        } else {
            i17 = R.drawable.msg_discussion;
        }
        if (z12) {
            i18 = R.string.OpenChannel2;
        } else {
            i18 = R.string.OpenGroup2;
        }
        H.l(i17, LocaleController.getString(i18), new t1(this, u1Var, chat, 26), i15);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new en(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new en(this, chat, 2), i16);
        H.f27299t = false;
        H.f27280i = 3;
        boolean z13 = z10;
        H.W = z13;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return z13;
    }
}
