package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public static final SpannableStringBuilder[] f38637p0 = new SpannableStringBuilder[3];
    public long B;
    public long C;
    public long D;
    public long E;
    public String F;
    public boolean G;
    public final Activity H;
    public final org.telegram.ui.ActionBar.p2 I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public String N;
    public int O;
    public final m10 P;
    public final n10 Q;
    public final s10 R;
    public final p10 S;
    public final r10 T;
    public final p10 U;
    public final p10 V;
    public final ArrayList W;
    public final xd.a f38638a;
    public final ArrayList f38639a0;
    public final lh.e1 f38640b;
    public boolean f38641b0;
    public final org.telegram.ui.Components.zw0 f38642c;
    public final b6 f38643c0;
    public org.telegram.ui.Components.ql0 d;
    public final h10 f38644d0;
    public e10 e;
    public l10 f38645e0;
    public final ArrayList f38646f;
    public org.telegram.ui.Components.yn0 f38647f0;
    public final f2.i0 f38648g0;
    public final SparseArray h;
    public final i10 f38649h0;
    public final AnimationNotificationsLocker f38650i0;
    public final nh.a3 f38651j0;
    public final d10 f38652k0;
    public t10 f38653l0;
    public boolean m0;
    public final ArrayList f38654n;
    public int f38655n0;
    public boolean f38656o0;
    public final HashMap f38657r;
    public int f38658s;
    public int v;
    public String f38659w;
    public String f38660x;
    public tf.e0 f38661y;

    public u10(org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getParentActivity());
        this.f38638a = new xd.a(0, this, org.telegram.ui.Components.mr.h, 380L, false);
        this.f38646f = new ArrayList();
        this.h = new SparseArray();
        this.f38654n = new ArrayList();
        this.f38657r = new HashMap();
        this.f38658s = 3;
        this.P = new m10(0, 0L);
        this.W = new ArrayList();
        this.f38639a0 = new ArrayList();
        this.f38643c0 = new b6(this, 4);
        this.f38644d0 = new h10(this);
        this.f38650i0 = new AnimationNotificationsLocker();
        this.f38652k0 = new d10(this, 0);
        this.I = p2Var;
        Activity parentActivity = p2Var.getParentActivity();
        this.H = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        lh.e1 e1Var = new lh.e1(this, parentActivity, 26);
        this.f38640b = e1Var;
        e1Var.setOnItemClickListener(new j(this, 11));
        e1Var.setOnItemLongClickListener(new h(this, 16));
        f2.i0 i0Var = new f2.i0();
        this.f38648g0 = i0Var;
        e1Var.setLayoutManager(i0Var);
        i10 i10Var = new i10(this, parentActivity, 0);
        this.f38649h0 = i10Var;
        addView(i10Var);
        addView(e1Var);
        e1Var.setSectionsType(2);
        e1Var.setSkipDrawSection(true);
        e1Var.setOnScrollListener(new j10(this));
        nh.a3 a3Var = new nh.a3(parentActivity);
        this.f38651j0 = a3Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) a3Var.d, formatDateChat)) {
            a3Var.d = formatDateChat;
            ((org.telegram.ui.Components.j6) a3Var.f15030b).q(formatDateChat, true, true);
        }
        addView(a3Var, k7.b6.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.Q = new n10(this);
        this.R = new s10(this, getContext());
        this.S = new p10(this, getContext(), 1);
        this.T = new r10(this, getContext());
        this.U = new p10(this, getContext(), 4);
        this.V = new p10(this, getContext(), 2);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(parentActivity, i10Var, 1, null);
        this.f38642c = zw0Var;
        addView(zw0Var);
        e1Var.setEmptyView(zw0Var);
        zw0Var.setVisibility(8);
        b();
    }

    public static void a(u10 u10Var, MessageObject messageObject, View view, int i10) {
        if (!u10Var.f38653l0.f()) {
            u10Var.f38653l0.a();
        }
        if (u10Var.f38653l0.f()) {
            u10Var.f38653l0.d(messageObject, view, i10);
        }
    }

    public static CharSequence c(MessageObject messageObject, boolean z4) {
        return d(messageObject, z4, 0, null);
    }

    public static CharSequence d(MessageObject messageObject, boolean z4, int i10, TextPaint textPaint) {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        TLRPC.TL_forumTopic findTopic;
        Paint.FontMetricsInt fontMetricsInt;
        TLRPC.TL_forumTopic findTopic2;
        int i11;
        int i12;
        if (messageObject != null && messageObject.messageOwner != null) {
            if (messageObject.isQuickReply()) {
                uf.o1 c3 = uf.p1.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
                if (c3 != null) {
                    return c3.f45472b;
                }
                return "";
            } else if (messageObject.isSponsored()) {
                if (messageObject.sponsoredCanReport) {
                    return LocaleController.getString(R.string.SponsoredMessageAd);
                }
                if (messageObject.sponsoredRecommended) {
                    return LocaleController.getString(R.string.SponsoredMessage2Recommended);
                }
                return LocaleController.getString(R.string.SponsoredMessage2);
            } else {
                SpannableStringBuilder[] spannableStringBuilderArr = f38637p0;
                if (spannableStringBuilderArr[i10] == null) {
                    spannableStringBuilderArr[i10] = new SpannableStringBuilder(">");
                    if (i10 == 0) {
                        i11 = R.drawable.attach_arrow_right;
                    } else if (i10 == 1) {
                        i11 = R.drawable.msg_mini_arrow_mediathin;
                    } else if (i10 == 2) {
                        i11 = R.drawable.msg_mini_arrow_mediabold;
                    } else {
                        return "";
                    }
                    Drawable mutate = ApplicationLoader.applicationContext.getDrawable(i11).mutate();
                    if (i10 == 0) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(i12, mutate);
                    if (i10 == 1 || i10 == 2) {
                        lqVar.setScale(0.85f);
                    }
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                    spannableStringBuilder.setSpan(lqVar, 0, spannableStringBuilder.length(), 0);
                }
                TLRPC.Message message = messageObject.messageOwner;
                CharSequence charSequence = null;
                Paint.FontMetricsInt fontMetricsInt2 = null;
                Paint.FontMetricsInt fontMetricsInt3 = null;
                Paint.FontMetricsInt fontMetricsInt4 = null;
                if (message.saved_peer_id != null) {
                    if (messageObject.getSavedDialogId() >= 0) {
                        user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.getSavedDialogId()));
                        chat = null;
                    } else if (messageObject.getSavedDialogId() < 0) {
                        chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getSavedDialogId()));
                        user2 = null;
                        chat2 = null;
                    } else {
                        user2 = null;
                        chat = null;
                    }
                    chat2 = chat;
                } else {
                    if (message.from_id.user_id != 0) {
                        user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
                    } else {
                        user = null;
                    }
                    if (messageObject.messageOwner.from_id.chat_id != 0) {
                        chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id));
                    } else {
                        chat = null;
                    }
                    if (chat == null) {
                        if (messageObject.messageOwner.from_id.channel_id != 0) {
                            chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id));
                        } else {
                            chat = null;
                        }
                    }
                    if (messageObject.messageOwner.peer_id.channel_id != 0) {
                        chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.channel_id));
                    } else {
                        chat2 = null;
                    }
                    if (chat2 == null) {
                        if (messageObject.messageOwner.peer_id.chat_id != 0) {
                            chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(messageObject.messageOwner.peer_id.chat_id));
                        } else {
                            chat2 = null;
                        }
                    }
                    if (!ChatObject.isChannelAndNotMegaGroup(chat2) && !z4) {
                        user2 = user;
                        chat2 = null;
                    } else {
                        user2 = user;
                    }
                }
                if (user2 != null && chat2 != null) {
                    CharSequence charSequence2 = chat2.title;
                    if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f19159id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence2 = ag.f.j(findTopic2, null, null);
                    }
                    if (textPaint == null) {
                        fontMetricsInt = null;
                    } else {
                        fontMetricsInt = textPaint.getFontMetricsInt();
                    }
                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence2, fontMetricsInt, false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    String firstName = UserObject.getFirstName(user2);
                    if (textPaint != null) {
                        fontMetricsInt2 = textPaint.getFontMetricsInt();
                    }
                    spannableStringBuilder2.append(Emoji.replaceEmoji(firstName, fontMetricsInt2, false)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i10]).append((char) 8202).append(replaceEmoji);
                    charSequence = spannableStringBuilder2;
                } else if (user2 != null) {
                    String userName = UserObject.getUserName(user2);
                    if (textPaint != null) {
                        fontMetricsInt3 = textPaint.getFontMetricsInt();
                    }
                    charSequence = Emoji.replaceEmoji(userName, fontMetricsInt3, false);
                } else if (chat != null) {
                    CharSequence charSequence3 = chat.title;
                    if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f19159id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence3 = ag.f.j(findTopic, null, null);
                    }
                    if (textPaint != null) {
                        fontMetricsInt4 = textPaint.getFontMetricsInt();
                    }
                    charSequence = Emoji.replaceEmoji(charSequence3, fontMetricsInt4, false);
                }
                if (charSequence != null) {
                    return charSequence;
                }
                return "";
            }
        }
        return "";
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            b();
        }
    }

    public final void b() {
        int i10;
        float f10 = this.f38638a.e;
        float f11 = (1.0f - f10) * (-AndroidUtilities.dp(24.0f));
        nh.a3 a3Var = this.f38651j0;
        a3Var.setTranslationY(f11);
        a3Var.setAlpha(f10);
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        a3Var.setVisibility(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            lh.e1 e1Var = this.f38640b;
            int childCount = e1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (e1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) e1Var.getChildAt(i12)).b0(0, true);
                }
                e1Var.getChildAt(i12).invalidate();
            }
        }
    }

    public final void e(long r11, java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u10.e(long, java.util.ArrayList):void");
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        if (messageObject != null) {
            if (this.f38653l0.f()) {
                this.f38653l0.d(messageObject, view, i11);
            } else if (view instanceof org.telegram.ui.Cells.q2) {
                this.f38653l0.c(messageObject);
            } else {
                int i12 = this.f38661y.d;
                h10 h10Var = this.f38644d0;
                ArrayList arrayList = this.f38646f;
                String str2 = null;
                org.telegram.ui.ActionBar.p2 p2Var = this.I;
                if (i12 == 0) {
                    PhotoViewer.t1().K2(null, p2Var, null);
                    PhotoViewer.t1().a2(arrayList, i10, 0L, 0L, 0L, h10Var);
                    this.O = PhotoViewer.t1().f31688c;
                } else if (i12 != 3 && i12 != 5) {
                    if (i12 == 1) {
                        if (view instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                            TLRPC.Document document = messageObject.getDocument();
                            if (h7Var.D) {
                                if (messageObject.canPreviewDocument()) {
                                    PhotoViewer.t1().K2(null, p2Var, null);
                                    int indexOf = arrayList.indexOf(messageObject);
                                    if (indexOf < 0) {
                                        ArrayList m9 = org.telegram.messenger.y3.m(messageObject);
                                        PhotoViewer.t1().K2(null, p2Var, null);
                                        PhotoViewer.t1().a2(m9, 0, 0L, 0L, 0L, h10Var);
                                        this.O = PhotoViewer.t1().f31688c;
                                        return;
                                    }
                                    PhotoViewer.t1().K2(null, p2Var, null);
                                    PhotoViewer.t1().a2(arrayList, indexOf, 0L, 0L, 0L, h10Var);
                                    this.O = PhotoViewer.t1().f31688c;
                                    return;
                                }
                                AndroidUtilities.openDocument(messageObject, this.H, p2Var);
                            } else if (!h7Var.C) {
                                MessageObject message = h7Var.getMessage();
                                message.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                                h7Var.f(true);
                            } else {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                                h7Var.f(true);
                            }
                        }
                    } else if (i12 == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                                        p2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.ou.I(this.I, messageObject, this.f38644d0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.k7) view).B;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.z4.q0(this.I, str, true, true);
        } else {
            ze.d.s(this.H, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        f fVar = new f(this, 14);
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19952h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        lh.e1 e1Var = this.f38640b;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i12 = org.telegram.ui.ActionBar.j6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 2048, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.f19972i7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.f20007k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19953h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.j6.f19914f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 4, new Class[]{org.telegram.ui.Cells.g7.class}, org.telegram.ui.ActionBar.j6.f19932g3, null, null, org.telegram.ui.ActionBar.j6.f20273z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.k7.class}, null, null, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.k7.class}, org.telegram.ui.ActionBar.j6.m0, null, null, org.telegram.ui.ActionBar.j6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 32, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 524304, new Class[]{org.telegram.ui.Cells.l7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 524288, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class, org.telegram.ui.Cells.g6.class}, null, org.telegram.ui.ActionBar.j6.f20126r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, org.telegram.ui.ActionBar.j6.f20213w0, null, null, org.telegram.ui.ActionBar.j6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, org.telegram.ui.ActionBar.j6.f20250y0, null, null, org.telegram.ui.ActionBar.j6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, org.telegram.ui.ActionBar.j6.L0, null, null, org.telegram.ui.ActionBar.j6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class, org.telegram.ui.Cells.g6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19822a1}, null, org.telegram.ui.ActionBar.j6.f19829a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.j6.f19930g1, org.telegram.ui.ActionBar.j6.f19948h1};
        int i15 = org.telegram.ui.ActionBar.j6.f19991j9;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class, org.telegram.ui.Cells.g6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19983j1, org.telegram.ui.ActionBar.j6.f20001k1, org.telegram.ui.ActionBar.j6.Z0}, null, org.telegram.ui.ActionBar.j6.f19848b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class, org.telegram.ui.Cells.g6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class, org.telegram.ui.Cells.g6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, org.telegram.ui.ActionBar.j6.F0[1], null, null, org.telegram.ui.ActionBar.j6.f19974i9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, org.telegram.ui.ActionBar.j6.F0[0], null, null, org.telegram.ui.ActionBar.j6.f19938g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, org.telegram.ui.ActionBar.j6.G0, null, null, org.telegram.ui.ActionBar.j6.m9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, org.telegram.ui.ActionBar.j6.H0, null, -1, null, org.telegram.ui.ActionBar.j6.f20099p9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, org.telegram.ui.ActionBar.j6.I0, null, null, org.telegram.ui.ActionBar.j6.f20118q9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, org.telegram.ui.ActionBar.j6.f20194v0, null, null, org.telegram.ui.ActionBar.j6.s9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, org.telegram.ui.ActionBar.j6.f20176u0, null, null, org.telegram.ui.ActionBar.j6.t9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.T0}, null, org.telegram.ui.ActionBar.j6.f20185u9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.V0, org.telegram.ui.ActionBar.j6.W0}, null, org.telegram.ui.ActionBar.j6.f20203v9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.X0}, null, org.telegram.ui.ActionBar.j6.f20222w9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, org.telegram.ui.ActionBar.j6.f20232x0, null, null, org.telegram.ui.ActionBar.j6.f20241x9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.Y0}, null, org.telegram.ui.ActionBar.j6.f20259y9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class, org.telegram.ui.Cells.g6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19966i1}, null, org.telegram.ui.ActionBar.j6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class, org.telegram.ui.Cells.g6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19912f1}, null, org.telegram.ui.ActionBar.j6.f20276z9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19859c1}, null, org.telegram.ui.ActionBar.j6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20037m1}, null, org.telegram.ui.ActionBar.j6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19884d9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19866c9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, null, null, org.telegram.ui.ActionBar.j6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 8192, new Class[]{org.telegram.ui.Cells.q2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 16384, new Class[]{org.telegram.ui.Cells.q2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 524288, new Class[]{org.telegram.ui.Cells.t3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19918f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 524304, new Class[]{org.telegram.ui.Cells.t3.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19899e7));
        org.telegram.ui.Components.zw0 zw0Var = this.f38642c;
        arrayList.add(new org.telegram.ui.ActionBar.l6(zw0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(zw0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20256y6));
        return arrayList;
    }

    public final void h(final long j10, final long j11, final long j12, final long j13, final tf.e0 e0Var, final boolean z4, String str, boolean z10) {
        final String str2;
        int i10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Locale locale = Locale.ENGLISH;
        if (e0Var == null) {
            i10 = -1;
        } else {
            i10 = e0Var.d;
        }
        final String str3 = j10 + j11 + j12 + j13 + i10 + str2 + z4;
        String str4 = this.f38660x;
        if (str4 != null && str4.equals(str3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f38661y = e0Var;
        this.B = j10;
        this.C = j11;
        this.E = j12;
        this.D = j13;
        this.F = str2;
        this.G = z4;
        e10 e10Var = this.e;
        if (e10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(e10Var);
        }
        b6 b6Var = this.f38643c0;
        AndroidUtilities.cancelRunOnUIThread(b6Var);
        if (!z11 || !z10) {
            ArrayList arrayList2 = this.f38639a0;
            final boolean z13 = z11;
            ArrayList arrayList3 = this.W;
            org.telegram.ui.Components.zw0 zw0Var = this.f38642c;
            ArrayList arrayList4 = this.f38646f;
            long j14 = 0;
            if (!z12 && (e0Var != null || j11 != 0 || j10 != 0 || j12 != 0 || j13 != 0)) {
                if (!z10 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f38654n.clear();
                this.f38657r.clear();
                this.J = true;
                zw0Var.setVisibility(0);
                org.telegram.ui.Components.ql0 ql0Var = this.d;
                if (ql0Var != null) {
                    ql0Var.l();
                }
                this.M++;
                lh.e1 e1Var = this.f38640b;
                if (e1Var.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    e1Var.getPinnedHeader().setAlpha(0.0f);
                } else {
                    arrayList = arrayList4;
                }
                arrayList3.clear();
                arrayList2.clear();
                if (!z12) {
                    return;
                }
            }
            this.J = true;
            org.telegram.ui.Components.ql0 ql0Var2 = this.d;
            if (ql0Var2 != null) {
                ql0Var2.l();
            }
            if (!z13) {
                b6Var.run();
                zw0Var.e(true, !z10);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                l10 l10Var = this.f38645e0;
                if (l10Var != null) {
                    ((uv) l10Var).h(false, null, null, false);
                }
            }
            final int i11 = this.M + 1;
            this.M = i11;
            final int i12 = UserConfig.selectedAccount;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i13;
                    long j15;
                    long j16;
                    int i14;
                    ?? r10;
                    TLRPC.MessagesFilter messagesFilter;
                    int i15;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final u10 u10Var = u10.this;
                    ArrayList arrayList5 = u10Var.f38646f;
                    final long j17 = j10;
                    long j18 = j11;
                    final String str5 = str2;
                    final tf.e0 e0Var2 = e0Var;
                    int i16 = i12;
                    long j19 = j12;
                    long j20 = j13;
                    final boolean z14 = z13;
                    ArrayList<Object> arrayList6 = null;
                    if (j17 != 0 && j18 == 0) {
                        ?? tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f19268q = str5;
                        tL_messages_search.limit = 20;
                        if (e0Var2 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = e0Var2.e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = AccountInstance.getInstance(i16).getMessagesController().getInputPeer(j17);
                        if (j19 > 0) {
                            tL_messages_search.min_date = (int) (j19 / 1000);
                        }
                        if (j20 > 0) {
                            tL_messages_search.max_date = (int) (j20 / 1000);
                        }
                        if (z14 && str5.equals(u10Var.f38659w) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) kf.k0.i(1, arrayList5)).getId();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        tL_messages_searchGlobal = tL_messages_search;
                        i13 = i16;
                        j16 = j19;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str5);
                        boolean z15 = z4;
                        if (!isEmpty) {
                            j15 = j20;
                            ArrayList<Object> arrayList7 = new ArrayList<>();
                            ArrayList<CharSequence> arrayList8 = new ArrayList<>();
                            ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                            j16 = j19;
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i16);
                            i13 = i16;
                            i14 = 20;
                            messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z15 ? 1 : 0);
                            r10 = z15 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i13 = i16;
                            j15 = j20;
                            j16 = j19;
                            i14 = 20;
                            r10 = z15;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i14;
                        tL_messages_searchGlobal2.f19270q = str5;
                        if (e0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = e0Var2.e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = MessagesController.getInstance(i13).getInputChannel(j18);
                        if (j16 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j16 / 1000);
                        }
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                        }
                        if (z14 && str5.equals(u10Var.f38659w) && !arrayList5.isEmpty()) {
                            i15 = 1;
                            MessageObject messageObject = (MessageObject) kf.k0.i(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = messageObject.getId();
                            tL_messages_searchGlobal2.offset_rate = u10Var.v;
                            tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i13).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                        } else {
                            i15 = 1;
                            tL_messages_searchGlobal2.offset_rate = 0;
                            tL_messages_searchGlobal2.offset_id = 0;
                            tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                        tL_messages_searchGlobal2.flags |= i15;
                        tL_messages_searchGlobal2.folder_id = r10;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                    u10Var.f38659w = str5;
                    u10Var.f38660x = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    tf.g0.x1(u10Var.f38659w, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                    final int i17 = i11;
                    final ArrayList<Object> arrayList11 = arrayList6;
                    final int i18 = i13;
                    final long j21 = j16;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                            final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            final ArrayList arrayList12 = new ArrayList();
                            final int i19 = i18;
                            final String str6 = str5;
                            if (tL_error == null) {
                                int size = messages_messages.messages.size();
                                for (int i20 = 0; i20 < size; i20++) {
                                    MessageObject messageObject2 = new MessageObject(i19, messages_messages.messages.get(i20), false, true);
                                    messageObject2.setQuery(str6);
                                    arrayList12.add(messageObject2);
                                }
                            }
                            final u10 u10Var2 = u10.this;
                            final int i21 = i17;
                            final boolean z16 = z14;
                            final tf.e0 e0Var3 = e0Var2;
                            final long j22 = j17;
                            final long j23 = j21;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g10.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.e = r02;
            AndroidUtilities.runOnUIThread(r02, (!z13 || arrayList.isEmpty()) ? 350L : 350L);
            i10 i10Var = this.f38649h0;
            if (e0Var == null) {
                i10Var.setViewType(1);
                return;
            }
            int i13 = e0Var.d;
            if (i13 == 0) {
                if (!TextUtils.isEmpty(this.F)) {
                    i10Var.setViewType(1);
                } else {
                    i10Var.setViewType(2);
                }
            } else if (i13 == 1) {
                i10Var.setViewType(3);
            } else if (i13 != 3 && i13 != 5) {
                if (i13 == 2) {
                    i10Var.setViewType(5);
                }
            } else {
                i10Var.setViewType(4);
            }
        }
    }

    public final void i(l10 l10Var, boolean z4) {
        this.f38645e0 = l10Var;
        if (z4 && l10Var != null) {
            ArrayList arrayList = this.W;
            if (!arrayList.isEmpty()) {
                ((uv) l10Var).h(false, arrayList, this.f38639a0, this.f38641b0);
            }
        }
    }

    public final void j(int i10, int i11, boolean z4) {
        setClipToPadding(false);
        this.f38656o0 = z4;
        setPadding(0, i10, 0, i11);
        lh.e1 e1Var = this.f38640b;
        if (z4) {
            e1Var.n1(0, i10, 0, i11);
        } else {
            e1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f38656o0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.f38655n0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f38655n0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.ql0 ql0Var;
        int i12 = this.f38658s;
        if (AndroidUtilities.isTablet()) {
            this.f38658s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f38658s = 6;
        } else {
            this.f38658s = 3;
        }
        if (i12 != this.f38658s && (ql0Var = this.d) == this.R) {
            this.f38656o0 = true;
            ql0Var.l();
            this.f38656o0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f38656o0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(ng.a aVar) {
        qg.d dVar = new qg.d(null);
        dVar.e = new rg.a(0);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(0, 0);
        dVar.f43087f = 1.0f;
        dVar.h = 1.0f;
        nh.a3 a3Var = this.f38651j0;
        pg.b c3 = aVar.c(a3Var, dVar, false);
        a3Var.f15031c = c3;
        c3.p(AndroidUtilities.dp(11.5f));
        ((pg.b) a3Var.f15031c).o(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.yn0 yn0Var) {
        this.f38647f0 = yn0Var;
    }

    public void setUiCallback(t10 t10Var) {
        this.f38653l0 = t10Var;
    }

    public void setUseFromUserAsAvatar(boolean z4) {
        this.m0 = z4;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
