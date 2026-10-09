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
public final class w10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, me.d {
    public static final SpannableStringBuilder[] f43039s0 = new SpannableStringBuilder[3];
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.n2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final o10 S;
    public final p10 T;
    public final u10 U;
    public final r10 V;
    public final t10 W;
    public final me.b f43040a;
    public final r10 f43041a0;
    public final ai.w0 f43042b;
    public final r10 f43043b0;
    public final org.telegram.ui.Components.ay0 f43044c;
    public final ArrayList f43045c0;
    public org.telegram.ui.Components.pm0 d;
    public final ArrayList f43046d0;
    public g10 f43047e;
    public boolean f43048e0;
    public final ArrayList f43049f;
    public final w5 f43050f0;
    public final j10 f43051g0;
    public final SparseArray h;
    public n10 f43052h0;
    public org.telegram.ui.Components.zo0 f43053i0;
    public final s4.d0 f43054j0;
    public final k10 f43055k0;
    public final AnimationNotificationsLocker f43056l0;
    public final ai.o4 m0;
    public final ArrayList f43057n;
    public final uz f43058n0;
    public v10 f43059o0;
    public boolean f43060p0;
    public int f43061q0;
    public final HashMap f43062r;
    public boolean f43063r0;
    public int f43064s;
    public int v;
    public String f43065w;
    public String f43066x;
    public gg.p0 f43067y;

    public w10(org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getParentActivity());
        this.f43040a = new me.b(0, this, org.telegram.ui.Components.hs.h, 380L, false);
        this.f43049f = new ArrayList();
        this.h = new SparseArray();
        this.f43057n = new ArrayList();
        this.f43062r = new HashMap();
        this.f43064s = 3;
        this.S = new o10(0, 0L);
        this.f43045c0 = new ArrayList();
        this.f43046d0 = new ArrayList();
        this.f43050f0 = new w5(this, 4);
        this.f43051g0 = new j10(this);
        this.f43056l0 = new AnimationNotificationsLocker();
        this.f43058n0 = new uz(this, 1);
        this.L = n2Var;
        Activity parentActivity = n2Var.getParentActivity();
        this.K = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
        ai.w0 w0Var = new ai.w0(this, parentActivity, 28);
        this.f43042b = w0Var;
        w0Var.setOnItemClickListener(new i(this, 11));
        w0Var.setOnItemLongClickListener(new g(this, 16));
        s4.d0 d0Var = new s4.d0();
        this.f43054j0 = d0Var;
        w0Var.setLayoutManager(d0Var);
        k10 k10Var = new k10(this, parentActivity, 0);
        this.f43055k0 = k10Var;
        addView(k10Var);
        addView(w0Var);
        w0Var.setSectionsType(2);
        w0Var.setSkipDrawSection(true);
        w0Var.setOnScrollListener(new l10(this));
        ai.o4 o4Var = new ai.o4(parentActivity);
        this.m0 = o4Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) o4Var.d, formatDateChat)) {
            o4Var.d = formatDateChat;
            ((org.telegram.ui.Components.q6) o4Var.f1526b).t(formatDateChat, true, true);
        }
        addView(o4Var, w7.x5.a(33.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1, 49));
        this.T = new p10(this);
        this.U = new u10(this, getContext());
        this.V = new r10(this, getContext(), 1);
        this.W = new t10(this, getContext());
        this.f43041a0 = new r10(this, getContext(), 4);
        this.f43043b0 = new r10(this, getContext(), 2);
        org.telegram.ui.Components.ay0 ay0Var = new org.telegram.ui.Components.ay0(parentActivity, k10Var, 1, null);
        this.f43044c = ay0Var;
        addView(ay0Var);
        w0Var.setEmptyView(ay0Var);
        ay0Var.setVisibility(8);
        b();
    }

    public static void a(w10 w10Var, MessageObject messageObject, View view, int i10) {
        if (!w10Var.f43059o0.g()) {
            w10Var.f43059o0.a();
        }
        if (w10Var.f43059o0.g()) {
            w10Var.f43059o0.e(messageObject, view, i10);
        }
    }

    public static CharSequence c(MessageObject messageObject, boolean z10) {
        return d(messageObject, z10, 0, null);
    }

    public static CharSequence d(MessageObject messageObject, boolean z10, int i10, TextPaint textPaint) {
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
                hg.b2 c10 = hg.c2.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
                if (c10 != null) {
                    return c10.f11175b;
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
                SpannableStringBuilder[] spannableStringBuilderArr = f43039s0;
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
                    org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(i12, mutate);
                    if (i10 == 1 || i10 == 2) {
                        erVar.setScale(0.85f);
                    }
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                    spannableStringBuilder.setSpan(erVar, 0, spannableStringBuilder.length(), 0);
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
                    if (!ChatObject.isChannelAndNotMegaGroup(chat2) && !z10) {
                        user2 = user;
                        chat2 = null;
                    } else {
                        user2 = user;
                    }
                }
                if (user2 != null && chat2 != null) {
                    CharSequence charSequence2 = chat2.title;
                    if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f20038id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence2 = ng.d.j(findTopic2, null, null);
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
                    if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f20038id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence3 = ng.d.j(findTopic, null, null);
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

    public final void b() {
        int i10;
        float f7 = this.f43040a.f16337e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(24.0f));
        ai.o4 o4Var = this.m0;
        o4Var.setTranslationY(f10);
        o4Var.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        o4Var.setVisibility(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ai.w0 w0Var = this.f43042b;
            int childCount = w0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (w0Var.getChildAt(i12) instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) w0Var.getChildAt(i12)).b0(0, true);
                }
                w0Var.getChildAt(i12).invalidate();
            }
        }
    }

    public final void e(long r10, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w10.e(long, java.util.ArrayList):void");
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        if (messageObject != null) {
            if (this.f43059o0.g()) {
                this.f43059o0.e(messageObject, view, i11);
            } else if (view instanceof org.telegram.ui.Cells.s2) {
                this.f43059o0.d(messageObject);
            } else {
                int i12 = this.f43067y.d;
                j10 j10Var = this.f43051g0;
                ArrayList arrayList = this.f43049f;
                String str2 = null;
                org.telegram.ui.ActionBar.n2 n2Var = this.L;
                if (i12 == 0) {
                    PhotoViewer.t1().K2(null, n2Var, null);
                    PhotoViewer.t1().b2(arrayList, i10, 0L, 0L, 0L, j10Var);
                    this.R = PhotoViewer.t1().f33884c;
                } else if (i12 != 3 && i12 != 5) {
                    if (i12 == 1) {
                        if (view instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                            TLRPC.Document document = messageObject.getDocument();
                            if (k7Var.G) {
                                if (messageObject.canPreviewDocument()) {
                                    PhotoViewer.t1().K2(null, n2Var, null);
                                    int indexOf = arrayList.indexOf(messageObject);
                                    if (indexOf < 0) {
                                        ArrayList k10 = org.telegram.messenger.q.k(messageObject);
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        PhotoViewer.t1().b2(k10, 0, 0L, 0L, 0L, j10Var);
                                        this.R = PhotoViewer.t1().f33884c;
                                        return;
                                    }
                                    PhotoViewer.t1().K2(null, n2Var, null);
                                    PhotoViewer.t1().b2(arrayList, indexOf, 0L, 0L, 0L, j10Var);
                                    this.R = PhotoViewer.t1().f33884c;
                                    return;
                                }
                                AndroidUtilities.openDocument(messageObject, this.K, n2Var);
                            } else if (!k7Var.F) {
                                MessageObject message = k7Var.getMessage();
                                message.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                                k7Var.f(true);
                            } else {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                                k7Var.f(true);
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
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                                        n2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.lv.J(this.L, messageObject, this.f43051g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.n7) view).E;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    ((org.telegram.ui.Cells.j7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.g5.p0(this.L, str, true, true);
        } else {
            of.f.s(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        e eVar = new e(this, 14);
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20868h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        ai.w0 w0Var = this.f43042b;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.A6));
        int i12 = org.telegram.ui.ActionBar.i6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 2048, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.f20889i7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.i6.f20926k7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20869h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.i6.f20831f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.i6.f20850g3, null, null, org.telegram.ui.ActionBar.i6.f21199z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.i6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.i6.m0, null, null, org.telegram.ui.ActionBar.i6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 524288, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, org.telegram.ui.ActionBar.i6.f21049r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.f21140w0, null, null, org.telegram.ui.ActionBar.i6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.f21176y0, null, null, org.telegram.ui.ActionBar.i6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.L0, null, null, org.telegram.ui.ActionBar.i6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20736a1}, null, org.telegram.ui.ActionBar.i6.f20743a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.i6.f20848g1, org.telegram.ui.ActionBar.i6.f20864h1};
        int i15 = org.telegram.ui.ActionBar.i6.f20909j9;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20902j1, org.telegram.ui.ActionBar.i6.f20920k1, org.telegram.ui.ActionBar.i6.Z0}, null, org.telegram.ui.ActionBar.i6.f20763b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.i6.D0}, null, -1, null, org.telegram.ui.ActionBar.i6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.i6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.i6.E0}, null, -1, null, org.telegram.ui.ActionBar.i6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.F0[1], null, null, org.telegram.ui.ActionBar.i6.f20891i9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.F0[0], null, null, org.telegram.ui.ActionBar.i6.f20856g9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.G0, null, null, org.telegram.ui.ActionBar.i6.f20965m9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.i6.H0, null, -1, null, org.telegram.ui.ActionBar.i6.f21020p9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.I0, null, null, org.telegram.ui.ActionBar.i6.f21039q9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.f21122v0, null, null, org.telegram.ui.ActionBar.i6.f21076s9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.f21104u0, null, null, org.telegram.ui.ActionBar.i6.f21095t9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.T0}, null, org.telegram.ui.ActionBar.i6.f21113u9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.V0, org.telegram.ui.ActionBar.i6.W0}, null, org.telegram.ui.ActionBar.i6.v9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.X0}, null, org.telegram.ui.ActionBar.i6.f21149w9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.f21159x0, null, null, org.telegram.ui.ActionBar.i6.f21168x9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.Y0}, null, org.telegram.ui.ActionBar.i6.f21184y9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20883i1}, null, org.telegram.ui.ActionBar.i6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20829f1}, null, org.telegram.ui.ActionBar.i6.f21202z9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20775c1}, null, org.telegram.ui.ActionBar.i6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20957m1}, null, org.telegram.ui.ActionBar.i6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20800d9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20783c9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.i6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 8192, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 16384, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 524288, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        org.telegram.ui.Components.ay0 ay0Var = this.f43044c;
        arrayList.add(new org.telegram.ui.ActionBar.k6(ay0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(ay0Var.f24802e, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f21181y6));
        return arrayList;
    }

    public final void h(final long j3, final long j10, final long j11, final long j12, final gg.p0 p0Var, final boolean z10, String str, boolean z11) {
        final String str2;
        int i10;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Locale locale = Locale.ENGLISH;
        if (p0Var == null) {
            i10 = -1;
        } else {
            i10 = p0Var.d;
        }
        final String str3 = j3 + j10 + j11 + j12 + i10 + str2 + z10;
        String str4 = this.f43066x;
        if (str4 != null && str4.equals(str3)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f43067y = p0Var;
        this.E = j3;
        this.F = j10;
        this.H = j11;
        this.G = j12;
        this.I = str2;
        this.J = z10;
        g10 g10Var = this.f43047e;
        if (g10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g10Var);
        }
        w5 w5Var = this.f43050f0;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f43046d0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f43045c0;
            org.telegram.ui.Components.ay0 ay0Var = this.f43044c;
            ArrayList arrayList4 = this.f43049f;
            long j13 = 0;
            if (!z13 && (p0Var != null || j10 != 0 || j3 != 0 || j11 != 0 || j12 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f43057n.clear();
                this.f43062r.clear();
                this.M = true;
                ay0Var.setVisibility(0);
                org.telegram.ui.Components.pm0 pm0Var = this.d;
                if (pm0Var != null) {
                    pm0Var.l();
                }
                this.P++;
                ai.w0 w0Var = this.f43042b;
                if (w0Var.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    w0Var.getPinnedHeader().setAlpha(0.0f);
                } else {
                    arrayList = arrayList4;
                }
                arrayList3.clear();
                arrayList2.clear();
                if (!z13) {
                    return;
                }
            }
            this.M = true;
            org.telegram.ui.Components.pm0 pm0Var2 = this.d;
            if (pm0Var2 != null) {
                pm0Var2.l();
            }
            if (!z14) {
                w5Var.run();
                ay0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                n10 n10Var = this.f43052h0;
                if (n10Var != null) {
                    ((vv) n10Var).i(false, null, null, false);
                }
            }
            final int i11 = this.P + 1;
            this.P = i11;
            final int i12 = UserConfig.selectedAccount;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i13;
                    String str5;
                    gg.p0 p0Var2;
                    int i14;
                    long j14;
                    boolean z15;
                    long j15;
                    int i15;
                    TLRPC.MessagesFilter messagesFilter;
                    int i16;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final w10 w10Var = w10.this;
                    ArrayList arrayList5 = w10Var.f43049f;
                    final long j16 = j3;
                    int i17 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                    long j17 = j10;
                    String str6 = str2;
                    gg.p0 p0Var3 = p0Var;
                    int i18 = i12;
                    long j18 = j11;
                    long j19 = j12;
                    boolean z16 = z14;
                    ArrayList<Object> arrayList6 = null;
                    if (i17 != 0 && j17 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f20147q = str6;
                        tL_messages_search.limit = 20;
                        if (p0Var3 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = p0Var3.f10763e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = AccountInstance.getInstance(i18).getMessagesController().getInputPeer(j16);
                        if (j18 > 0) {
                            tL_messages_search.min_date = (int) (j18 / 1000);
                        }
                        if (j19 > 0) {
                            tL_messages_search.max_date = (int) (j19 / 1000);
                        }
                        if (z16 && str6.equals(w10Var.f43065w) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList5)).getId();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        i13 = i18;
                        str5 = str6;
                        p0Var2 = p0Var3;
                        j14 = j18;
                        tL_messages_searchGlobal = tL_messages_search;
                        z15 = z16;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str6);
                        boolean z17 = z10;
                        if (!isEmpty) {
                            j14 = j18;
                            ArrayList<Object> arrayList7 = new ArrayList<>();
                            ArrayList<CharSequence> arrayList8 = new ArrayList<>();
                            z15 = z16;
                            ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i18);
                            j15 = j19;
                            i13 = i18;
                            str5 = str6;
                            p0Var2 = p0Var3;
                            i15 = 20;
                            messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                            i14 = z17 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i13 = i18;
                            str5 = str6;
                            p0Var2 = p0Var3;
                            i14 = z17 ? 1 : 0;
                            j14 = j18;
                            z15 = z16;
                            j15 = j19;
                            i15 = 20;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i15;
                        tL_messages_searchGlobal2.f20149q = str5;
                        if (p0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = p0Var2.f10763e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = MessagesController.getInstance(i13).getInputChannel(j17);
                        if (j14 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                        }
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                        }
                        if (z15 && str5.equals(w10Var.f43065w) && !arrayList5.isEmpty()) {
                            i16 = 1;
                            MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = messageObject.getId();
                            tL_messages_searchGlobal2.offset_rate = w10Var.v;
                            tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i13).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                        } else {
                            i16 = 1;
                            tL_messages_searchGlobal2.offset_rate = 0;
                            tL_messages_searchGlobal2.offset_id = 0;
                            tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                        tL_messages_searchGlobal2.flags |= i16;
                        tL_messages_searchGlobal2.folder_id = i14;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                    w10Var.f43065w = str5;
                    w10Var.f43066x = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    gg.r0.z1(w10Var.f43065w, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                    final boolean z18 = z15;
                    final int i19 = i11;
                    final gg.p0 p0Var4 = p0Var2;
                    final String str7 = str5;
                    final int i20 = i13;
                    final ArrayList<Object> arrayList11 = arrayList6;
                    final long j20 = j14;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                            final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            final ArrayList arrayList12 = new ArrayList();
                            final int i21 = i20;
                            final String str8 = str7;
                            if (tL_error == null) {
                                int size = messages_messages.messages.size();
                                for (int i22 = 0; i22 < size; i22++) {
                                    MessageObject messageObject2 = new MessageObject(i21, messages_messages.messages.get(i22), false, true);
                                    messageObject2.setQuery(str8);
                                    arrayList12.add(messageObject2);
                                }
                            }
                            final w10 w10Var2 = w10.this;
                            final int i23 = i19;
                            final boolean z19 = z18;
                            final gg.p0 p0Var5 = p0Var4;
                            final long j21 = j16;
                            final long j22 = j20;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i10.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.f43047e = r02;
            AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            k10 k10Var = this.f43055k0;
            if (p0Var == null) {
                k10Var.setViewType(1);
                return;
            }
            int i13 = p0Var.d;
            if (i13 == 0) {
                if (!TextUtils.isEmpty(this.I)) {
                    k10Var.setViewType(1);
                } else {
                    k10Var.setViewType(2);
                }
            } else if (i13 == 1) {
                k10Var.setViewType(3);
            } else if (i13 != 3 && i13 != 5) {
                if (i13 == 2) {
                    k10Var.setViewType(5);
                }
            } else {
                k10Var.setViewType(4);
            }
        }
    }

    public final void i(n10 n10Var, boolean z10) {
        this.f43052h0 = n10Var;
        if (z10 && n10Var != null) {
            ArrayList arrayList = this.f43045c0;
            if (!arrayList.isEmpty()) {
                ((vv) n10Var).i(false, arrayList, this.f43046d0, this.f43048e0);
            }
        }
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.f43063r0 = z10;
        setPadding(0, i10, 0, i11);
        ai.w0 w0Var = this.f43042b;
        if (z10) {
            w0Var.o1(0, i10, 0, i11);
        } else {
            w0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f43063r0 = false;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.f43061q0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f43061q0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.pm0 pm0Var;
        int i12 = this.f43064s;
        if (AndroidUtilities.isTablet()) {
            this.f43064s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f43064s = 6;
        } else {
            this.f43064s = 3;
        }
        if (i12 != this.f43064s && (pm0Var = this.d) == this.U) {
            this.f43063r0 = true;
            pm0Var.l();
            this.f43063r0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f43063r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        dh.e eVar = new dh.e(null);
        eVar.f8366e = new d2.c(5);
        eVar.e(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(0, 0);
        eVar.f8367f = 1.0f;
        eVar.h = 1.0f;
        ai.o4 o4Var = this.m0;
        ch.d c10 = cVar.c(o4Var, eVar, false);
        o4Var.f1527c = c10;
        c10.q(AndroidUtilities.dp(11.5f));
        ((ch.d) o4Var.f1527c).p(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.zo0 zo0Var) {
        this.f43053i0 = zo0Var;
    }

    public void setUiCallback(v10 v10Var) {
        this.f43059o0 = v10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f43060p0 = z10;
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
