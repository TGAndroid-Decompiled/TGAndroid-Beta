package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class xo extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout A;
    public LinearLayout B;
    public org.telegram.ui.Components.i80 C;
    public org.telegram.ui.Cells.l8 D;
    public org.telegram.ui.Cells.x8 E;
    public org.telegram.ui.Cells.w6 F;
    public wo G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ka K;
    public ArrayList L;
    public LinearLayout M;
    public org.telegram.ui.Cells.j4 N;
    public org.telegram.ui.Cells.p8 O;
    public org.telegram.ui.Cells.x8 P;
    public to Q;
    public boolean R;
    public boolean S;
    public TLRPC.Chat T;
    public TLRPC.ChatFull U;
    public long V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    public gg.g f44548a;

    public org.telegram.ui.Cells.w6 f44549a0;

    public EditTextBoldCursor f44550b;

    public ArrayList f44551b0;

    public org.telegram.ui.Cells.x8 f44552c;

    public org.telegram.ui.Cells.p4 f44553c0;
    public org.telegram.ui.Cells.j4 d;

    public int f44554d0;

    public org.telegram.ui.Cells.j4 f44555e;

    public String f44556e0;

    public ro f44557f;

    public rd f44558f0;

    public boolean f44559g0;
    public hh.m h;

    public TLRPC.TL_chatInviteExported f44560h0;

    public boolean f44561i0;

    public boolean f44562j0;

    public HashMap f44563k0;

    public org.telegram.ui.Components.f60 f44564l0;
    public mo m0;

    public org.telegram.ui.ActionBar.v0 f44565n;

    public ValueAnimator f44566n0;

    public Boolean f44567o0;

    public boolean f44568p0;

    public org.telegram.ui.Components.dr f44569r;

    public LinearLayout f44570s;
    public org.telegram.ui.Cells.f6 v;

    public org.telegram.ui.Cells.f6 f44571w;

    public LinearLayout f44572x;

    public LinearLayout f44573y;

    public final void V() {
        if (!this.R && this.f44548a.length() <= 0) {
            ArrayList arrayList = this.J;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.f44565n.setEnabled(false);
            this.f44565n.setAlpha(0.5f);
            return;
        }
        this.f44565n.setEnabled(true);
        this.f44565n.setAlpha(1.0f);
    }

    public final boolean W(String str) {
        if (str == null || str.length() <= 0) {
            this.f44557f.setVisibility(8);
        } else {
            this.f44557f.setVisibility(0);
        }
        rd rdVar = this.f44558f0;
        if (rdVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rdVar);
            this.f44558f0 = null;
            this.f44556e0 = null;
            if (this.f44554d0 != 0) {
                getConnectionsManager().cancelRequest(this.f44554d0, true);
            }
        }
        this.f44559g0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.f44557f.setText(LocaleController.getString(R.string.LinkInvalid));
                this.f44557f.setTextColorByKey(org.telegram.ui.ActionBar.g6.f23269p7);
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (i10 == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    if (this.W) {
                        this.f44557f.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    } else {
                        this.f44557f.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                    }
                    this.f44557f.setTextColorByKey(org.telegram.ui.ActionBar.g6.f23269p7);
                    return false;
                }
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    this.f44557f.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.f44557f.setTextColorByKey(org.telegram.ui.ActionBar.g6.f23269p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.W) {
                this.f44557f.setText(LocaleController.getString(R.string.LinkInvalidShort));
            } else {
                this.f44557f.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
            }
            this.f44557f.setTextColorByKey(org.telegram.ui.ActionBar.g6.f23269p7);
            return false;
        }
        if (str.length() > 32) {
            this.f44557f.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.f44557f.setTextColorByKey(org.telegram.ui.ActionBar.g6.f23269p7);
            return false;
        }
        this.f44557f.setText(LocaleController.getString(R.string.LinkChecking));
        this.f44557f.setTextColorByKey(org.telegram.ui.ActionBar.g6.F6);
        this.f44556e0 = str;
        rd rdVar2 = new rd(21, this, str);
        this.f44558f0 = rdVar2;
        AndroidUtilities.runOnUIThread(rdVar2, 300L);
        return true;
    }

    public final void X(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.V);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new lh.n3(6, this, z10)), this.classGuid);
    }

    public final void Y() {
        boolean z10;
        boolean z11;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z12;
        final xo xoVar = this;
        AndroidUtilities.runOnUIThread(xoVar.m0, 200L);
        boolean z13 = true;
        if (xoVar.getParentActivity() == null) {
            z11 = false;
        } else {
            String publicUsername = ChatObject.getPublicUsername(xoVar.T, true);
            if (xoVar.R || (((publicUsername != null || xoVar.f44548a.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(xoVar.f44548a.getText().toString()))) || xoVar.f44548a.length() == 0 || xoVar.f44559g0)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String string = xoVar.R ? "" : xoVar.f44548a.getText().toString();
                if (publicUsername.equals(string)) {
                    if (!xoVar.R || (arrayList = xoVar.T.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (xoVar.f44568p0) {
                        z10 = false;
                    } else {
                        xoVar.f44568p0 = true;
                        boolean z14 = false;
                        for (int i10 = 0; i10 < xoVar.T.usernames.size(); i10++) {
                            TLRPC.TL_username tL_username = xoVar.T.usernames.get(i10);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(xoVar.T);
                            xoVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new ko(xoVar, 1));
                        } else {
                            xoVar.f44568p0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                    }
                } else if (ChatObject.isChannel(xoVar.T)) {
                    xoVar.getMessagesController().updateChannelUserName(xoVar, xoVar.V, string, new mo(xoVar, 1), new mo(xoVar, 2));
                    xoVar = xoVar;
                } else {
                    final int i11 = 1;
                    xoVar.getMessagesController().convertToMegaGroup(xoVar.getParentActivity(), xoVar.V, xoVar, new MessagesStorage.LongCallback(xoVar) {

                        public final xo f40164b;

                        {
                            this.f40164b = xoVar;
                        }

                        @Override
                        public final void run(long j10) {
                            switch (i11) {
                                case 0:
                                    xo xoVar2 = this.f40164b;
                                    if (j10 == 0) {
                                        xoVar2.getClass();
                                    } else {
                                        xoVar2.V = j10;
                                        xoVar2.T = xoVar2.getMessagesController().getChat(Long.valueOf(j10));
                                        xoVar2.Y();
                                    }
                                    break;
                                case 1:
                                    xo xoVar3 = this.f40164b;
                                    if (j10 == 0) {
                                        xoVar3.getClass();
                                    } else {
                                        xoVar3.V = j10;
                                        xoVar3.T = xoVar3.getMessagesController().getChat(Long.valueOf(j10));
                                        xoVar3.Y();
                                    }
                                    break;
                                default:
                                    xo xoVar4 = this.f40164b;
                                    if (j10 == 0) {
                                        xoVar4.getClass();
                                    } else {
                                        xoVar4.V = j10;
                                        xoVar4.T = xoVar4.getMessagesController().getChat(Long.valueOf(j10));
                                        MessagesController messagesController = xoVar4.getMessagesController();
                                        long j11 = -xoVar4.V;
                                        TLRPC.Chat chat = xoVar4.T;
                                        boolean z15 = xoVar4.X;
                                        chat.noforwards = z15;
                                        messagesController.toggleChatNoForwards(j11, z15);
                                        xoVar4.Y();
                                    }
                                    break;
                            }
                        }
                    });
                }
            } else {
                Vibrator vibrator = (Vibrator) xoVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(xoVar.f44557f);
                xoVar.a0(false);
            }
            z11 = false;
        }
        if (z11) {
            TLRPC.Chat chat = xoVar.T;
            if (chat.noforwards == xoVar.X) {
                z12 = true;
            } else if (ChatObject.isChannel(chat)) {
                MessagesController messagesController = xoVar.getMessagesController();
                long j10 = -xoVar.V;
                TLRPC.Chat chat2 = xoVar.T;
                boolean z15 = xoVar.X;
                chat2.noforwards = z15;
                messagesController.toggleChatNoForwards(j10, z15);
                z12 = true;
            } else {
                xoVar.a0(true);
                final int i12 = 2;
                xoVar.getMessagesController().convertToMegaGroup(xoVar.getParentActivity(), xoVar.V, xoVar, new MessagesStorage.LongCallback(xoVar) {

                    public final xo f40164b;

                    {
                        this.f40164b = xoVar;
                    }

                    @Override
                    public final void run(long j11) {
                        switch (i12) {
                            case 0:
                                xo xoVar2 = this.f40164b;
                                if (j11 == 0) {
                                    xoVar2.getClass();
                                } else {
                                    xoVar2.V = j11;
                                    xoVar2.T = xoVar2.getMessagesController().getChat(Long.valueOf(j11));
                                    xoVar2.Y();
                                }
                                break;
                            case 1:
                                xo xoVar3 = this.f40164b;
                                if (j11 == 0) {
                                    xoVar3.getClass();
                                } else {
                                    xoVar3.V = j11;
                                    xoVar3.T = xoVar3.getMessagesController().getChat(Long.valueOf(j11));
                                    xoVar3.Y();
                                }
                                break;
                            default:
                                xo xoVar4 = this.f40164b;
                                if (j11 == 0) {
                                    xoVar4.getClass();
                                } else {
                                    xoVar4.V = j11;
                                    xoVar4.T = xoVar4.getMessagesController().getChat(Long.valueOf(j11));
                                    MessagesController messagesController2 = xoVar4.getMessagesController();
                                    long j12 = -xoVar4.V;
                                    TLRPC.Chat chat3 = xoVar4.T;
                                    boolean z16 = xoVar4.X;
                                    chat3.noforwards = z16;
                                    messagesController2.toggleChatNoForwards(j12, z16);
                                    xoVar4.Y();
                                }
                                break;
                        }
                    }
                });
                z12 = false;
            }
            if (z12) {
                if (xoVar.Q != null) {
                    if (xoVar.getParentActivity() != null) {
                        if (!xoVar.W && !ChatObject.isChannel(xoVar.T)) {
                            to toVar = xoVar.Q;
                            if (toVar.f34532f || toVar.h) {
                                final int i13 = 0;
                                xoVar.getMessagesController().convertToMegaGroup(xoVar.getParentActivity(), xoVar.V, xoVar, new MessagesStorage.LongCallback(xoVar) {

                                    public final xo f40164b;

                                    {
                                        this.f40164b = xoVar;
                                    }

                                    @Override
                                    public final void run(long j11) {
                                        switch (i13) {
                                            case 0:
                                                xo xoVar2 = this.f40164b;
                                                if (j11 == 0) {
                                                    xoVar2.getClass();
                                                } else {
                                                    xoVar2.V = j11;
                                                    xoVar2.T = xoVar2.getMessagesController().getChat(Long.valueOf(j11));
                                                    xoVar2.Y();
                                                }
                                                break;
                                            case 1:
                                                xo xoVar3 = this.f40164b;
                                                if (j11 == 0) {
                                                    xoVar3.getClass();
                                                } else {
                                                    xoVar3.V = j11;
                                                    xoVar3.T = xoVar3.getMessagesController().getChat(Long.valueOf(j11));
                                                    xoVar3.Y();
                                                }
                                                break;
                                            default:
                                                xo xoVar4 = this.f40164b;
                                                if (j11 == 0) {
                                                    xoVar4.getClass();
                                                } else {
                                                    xoVar4.V = j11;
                                                    xoVar4.T = xoVar4.getMessagesController().getChat(Long.valueOf(j11));
                                                    MessagesController messagesController2 = xoVar4.getMessagesController();
                                                    long j12 = -xoVar4.V;
                                                    TLRPC.Chat chat3 = xoVar4.T;
                                                    boolean z16 = xoVar4.X;
                                                    chat3.noforwards = z16;
                                                    messagesController2.toggleChatNoForwards(j12, z16);
                                                    xoVar4.Y();
                                                }
                                                break;
                                        }
                                    }
                                });
                                z13 = false;
                            }
                        }
                        if (xoVar.T.join_to_send != xoVar.Q.f34532f) {
                            MessagesController messagesController2 = xoVar.getMessagesController();
                            long j11 = xoVar.V;
                            TLRPC.Chat chat3 = xoVar.T;
                            boolean z16 = xoVar.Q.f34532f;
                            chat3.join_to_send = z16;
                            messagesController2.toggleChatJoinToSend(j11, z16, null, null);
                        }
                        if (xoVar.T.join_request != xoVar.Q.h || xoVar.S) {
                            MessagesController messagesController3 = xoVar.getMessagesController();
                            long j12 = xoVar.V;
                            TLRPC.Chat chat4 = xoVar.T;
                            boolean z17 = xoVar.Q.h;
                            chat4.join_request = z17;
                            messagesController3.toggleChatJoinRequest(j12, 0L, z17, xoVar.S, false, null, null);
                        }
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    xoVar.finishFragment();
                }
            }
        }
    }

    public final void Z() {
        if (getParentActivity() == null) {
            return;
        }
        ag.i1 i1Var = new ag.i1(2, this.currentAccount, getParentActivity(), this, null);
        i1Var.f445r0 = this.W;
        i1Var.D0 = new mo(this, 0);
        showDialog(i1Var);
    }

    public final void a0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.m0);
        }
        if (this.f44569r != null) {
            ValueAnimator valueAnimator = this.f44566n0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f44569r.f27834c, z10 ? 1.0f : 0.0f);
            this.f44566n0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g3(this, 7));
            this.f44566n0.setDuration((long) (Math.abs(this.f44569r.f27834c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.f44566n0.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.f44566n0.start();
        }
    }

    public final void b0() {
        if (this.F == null) {
            return;
        }
        int i10 = 8;
        if (this.R || this.Y || !getUserConfig().isPremium()) {
            org.telegram.ui.Cells.x8 x8Var = this.f44552c;
            int i11 = org.telegram.ui.ActionBar.g6.B6;
            x8Var.setTag(Integer.valueOf(i11));
            this.f44552c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            if (this.f44562j0) {
                this.F.setVisibility(8);
            } else {
                this.F.setVisibility(0);
            }
            this.f44549a0.setVisibility(8);
            this.f44572x.setVisibility(8);
            this.f44573y.setVisibility(0);
            this.f44553c0.setVisibility(8);
            if (this.W) {
                this.f44552c.setText(LocaleController.getString(this.R ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.d.setText(LocaleController.getString(this.R ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.f44552c.setText(LocaleController.getString(this.R ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.d.setText(LocaleController.getString(this.R ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.A.setVisibility(this.R ? 8 : 0);
            this.B.setVisibility(this.R ? 0 : 8);
            this.M.setVisibility(0);
            this.D.setVisibility(0);
            this.E.setVisibility(0);
            this.f44573y.setPadding(0, 0, 0, this.R ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.i80 i80Var = this.C;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f44560h0;
            i80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.C.c(this.f44560h0, this.V);
            ro roVar = this.f44557f;
            roVar.setVisibility((this.R || roVar.f25948a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.V);
            this.E.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.V)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.f44552c.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.x8 x8Var2 = this.f44552c;
            int i12 = org.telegram.ui.ActionBar.g6.f23269p7;
            x8Var2.setTag(Integer.valueOf(i12));
            this.f44552c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.f44573y.setVisibility(8);
            this.f44557f.setVisibility(8);
            this.F.setVisibility(8);
            this.f44549a0.setVisibility(0);
            if (this.Z) {
                this.f44553c0.setVisibility(0);
                this.f44572x.setVisibility(8);
            } else {
                this.f44553c0.setVisibility(8);
                this.f44572x.setVisibility(0);
            }
        }
        this.v.a(!this.R);
        this.f44571w.a(this.R);
        this.f44548a.clearFocus();
        to toVar = this.Q;
        if (toVar != null) {
            toVar.setVisibility((!this.W || this.R) ? 0 : 8);
            to toVar2 = this.Q;
            TLRPC.ChatFull chatFull2 = this.U;
            toVar2.c((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.W) ? false : true);
        }
        wo woVar = this.G;
        if (woVar != null) {
            if (!this.R && !this.J.isEmpty()) {
                i10 = 0;
            }
            woVar.setVisibility(i10);
        }
        V();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 27));
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i13 = org.telegram.ui.ActionBar.g6.f23375v8;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i13, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.dr drVar = new org.telegram.ui.Components.dr(drawableMutate, new org.telegram.ui.Components.hp(org.telegram.ui.ActionBar.g6.w0(null, i13, false)));
        this.f44569r = drVar;
        this.f44565n = zVarN.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), drVar);
        this.h = new hh.m(context);
        po poVar = new po(this, context, this.h, this.resourceProvider);
        this.fragmentView = poVar;
        poVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        org.telegram.ui.Components.kn0 kn0Var = (org.telegram.ui.Components.kn0) this.fragmentView;
        kn0Var.setFillViewport(true);
        kn0Var.addView(this.h, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(kn0Var);
        this.h.setOrientation(1);
        boolean z10 = this.f44562j0;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.W) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44570s = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f44570s, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, 23);
        this.f44555e = j4Var;
        j4Var.setHeight(46);
        if (this.W) {
            this.f44555e.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.f44555e.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.f44570s.addView(this.f44555e);
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, false);
        this.f44571w = f6Var;
        if (this.W) {
            f6Var.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.R);
        } else {
            f6Var.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.R);
        }
        this.f44570s.addView(this.f44571w, h7.z5.n(-1, -2));
        this.f44571w.setOnClickListener(new oo(this, i12));
        org.telegram.ui.Cells.f6 f6Var2 = new org.telegram.ui.Cells.f6(context, false);
        this.v = f6Var2;
        if (this.W) {
            f6Var2.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.R);
        } else {
            f6Var2.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.R);
        }
        this.f44570s.addView(this.v, h7.z5.n(-1, -2));
        this.v.setOnClickListener(new oo(this, 2));
        org.telegram.ui.Cells.w6 w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        this.F = w6Var;
        this.h.addView(w6Var, h7.z5.n(-1, -2));
        if (z10) {
            this.f44571w.setVisibility(8);
            this.v.setVisibility(8);
            this.F.setVisibility(8);
            this.f44555e.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f44573y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.h.addView(this.f44573y, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.j4 j4Var2 = new org.telegram.ui.Cells.j4(context, 23);
        this.d = j4Var2;
        this.f44573y.addView(j4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.A = linearLayout3;
        linearLayout3.setOrientation(0);
        this.f44573y.addView(this.A, h7.z5.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f44550b = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.f44550b.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f44550b;
        int i14 = org.telegram.ui.ActionBar.g6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f44550b;
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f44550b.setMaxLines(1);
        this.f44550b.setLines(1);
        this.f44550b.setEnabled(false);
        this.f44550b.setBackground(null);
        this.f44550b.setPadding(0, 0, 0, 0);
        this.f44550b.setSingleLine(true);
        this.f44550b.setInputType(163840);
        this.f44550b.setImeOptions(6);
        this.A.addView(this.f44550b, h7.z5.n(-2, 36));
        gg.g gVar = new gg.g(this, context, 4);
        this.f44548a = gVar;
        gVar.setTextSize(1, 18.0f);
        this.f44548a.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.f44548a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f44548a.setMaxLines(1);
        this.f44548a.setLines(1);
        this.f44548a.setBackground(null);
        this.f44548a.setPadding(0, 0, 0, 0);
        this.f44548a.setSingleLine(true);
        this.f44548a.setInputType(163872);
        this.f44548a.setImeOptions(6);
        this.f44548a.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.f44548a.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f44548a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f44548a.setCursorWidth(1.5f);
        this.A.addView(this.f44548a, h7.z5.n(-1, 36));
        int i16 = 3;
        this.f44548a.addTextChangedListener(new p0(this, i16));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.B = linearLayout4;
        linearLayout4.setOrientation(1);
        this.f44573y.addView(this.B, h7.z5.n(-1, -2));
        org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(context, this, null, true, ChatObject.isChannel(this.T));
        this.C = i80Var;
        i80Var.setDelegate(new qo(this, context));
        this.C.d(0, null, false);
        this.B.addView(this.C);
        ro roVar = new ro(this, context, this.resourceProvider);
        this.f44557f = roVar;
        roVar.setBottomPadding(6);
        this.h.addView(this.f44557f, h7.z5.n(-2, -2));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        this.f44552c = x8Var;
        x8Var.setImportantForAccessibility(1);
        this.h.addView(this.f44552c, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
        this.f44553c0 = p4Var;
        this.h.addView(p4Var, h7.z5.n(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.f44572x = linearLayout5;
        linearLayout5.setOrientation(1);
        this.h.addView(this.f44572x, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.w6 w6Var2 = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        this.f44549a0 = w6Var2;
        this.h.addView(w6Var2, h7.z5.n(-1, -2));
        hh.m mVar = this.h;
        wo woVar = new wo(this, context);
        this.G = woVar;
        mVar.addView(woVar, h7.z5.n(-1, -2));
        this.G.setVisibility((this.R || this.J.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
        this.D = l8Var;
        l8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ManageInviteLinks), false);
        this.D.setOnClickListener(new oo(this, i16));
        this.h.addView(this.D, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        this.E = x8Var2;
        this.h.addView(x8Var2, h7.z5.n(-1, -2));
        to toVar = new to(this, context, this.T, context);
        this.Q = toVar;
        TLRPC.ChatFull chatFull = this.U;
        toVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.W) ? false : true);
        to toVar2 = this.Q;
        TLRPC.ChatFull chatFull2 = this.U;
        org.telegram.ui.Cells.x8 x8Var3 = toVar2.f34531e;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(toVar2.f34533n);
        boolean zIsPublic = ChatObject.isPublic(toVar2.f34533n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            if (zIsChannelAndNotMegaGroup) {
                i10 = R.string.ChannelSettingsJoinRequestInfo2;
            } else {
                i10 = zIsPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            x8Var3.setText(LocaleController.getString(i10));
        } else {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (zIsChannelAndNotMegaGroup) {
                i11 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else {
                i11 = zIsPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            x8Var3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i11, str), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.il, false), new org.telegram.ui.Components.xq(24, chatFull2, this)));
        }
        this.h.addView(this.Q);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.M = linearLayout6;
        linearLayout6.setOrientation(1);
        this.h.addView(this.M);
        org.telegram.ui.Cells.j4 j4Var3 = new org.telegram.ui.Cells.j4(context, 23);
        this.N = j4Var3;
        j4Var3.setHeight(46);
        this.N.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.M.addView(this.N, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
        this.O = p8Var;
        p8Var.f(LocaleController.getString(R.string.RestrictSavingContent), this.X, false);
        this.O.setOnClickListener(new oo(this, 4));
        this.M.addView(this.O, h7.z5.n(-1, -2));
        this.P = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        if (!this.W || ChatObject.isMegagroup(this.T)) {
            this.P.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        } else {
            this.P.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        }
        this.M.addView(this.P, h7.z5.n(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.T, true);
        if (!this.R && publicUsername != null) {
            this.f44561i0 = true;
            this.f44548a.setText(publicUsername);
            this.f44548a.setSelection(publicUsername.length());
            this.f44561i0 = false;
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22381id == this.V) {
                this.U = chatFull;
                this.f44560h0 = chatFull.exported_invite;
                b0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.V) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var == null || b5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        int i10 = org.telegram.ui.ActionBar.g6.f23018b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23144i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4096, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f23269p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4096, null, null, null, null, i12));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44548a, 4, null, null, null, null, i14));
        gg.g gVar = this.f44548a;
        int i15 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gVar, 8388608, null, null, null, null, i15));
        LinearLayout linearLayout = this.f44570s;
        int i16 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44573y, 1, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44555e, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44550b, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44550b, 8388608, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44557f, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44557f, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44557f, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23391w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44552c, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44552c, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44552c, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44549a0, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44572x, 1, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44553c0, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4096, null, null, null, null, i12));
        int i18 = org.telegram.ui.ActionBar.g6.f23109g7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 8192, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        int i19 = org.telegram.ui.ActionBar.g6.f23126h7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 16384, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i20 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44571w, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44571w, 8192, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44571w, 16384, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44571w, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44571w, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"valueTextView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44572x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        int i21 = org.telegram.ui.ActionBar.g6.f23423y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44572x, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44572x, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44572x, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23295r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4096, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23215m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        gg.g gVar;
        super.onBecomeFullyVisible();
        if (!this.f44562j0 || (gVar = this.f44548a) == null) {
            return;
        }
        gVar.requestFocus();
        AndroidUtilities.showKeyboard(this.f44548a);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xo.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        hh.m mVar = this.h;
        if (mVar != null) {
            mVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.U;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.f44560h0 = tL_chatInviteExported;
            this.C.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.C.c(this.f44560h0, this.V);
        }
    }
}
