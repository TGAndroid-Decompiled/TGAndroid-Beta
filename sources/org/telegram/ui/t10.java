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
public final class t10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public static final SpannableStringBuilder[] f41354p0 = new SpannableStringBuilder[3];
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
    public final l10 P;
    public final m10 Q;
    public final r10 R;
    public final o10 S;
    public final q10 T;
    public final o10 U;
    public final o10 V;
    public final ArrayList W;
    public final xd.a f41355a;
    public final ArrayList f41356a0;
    public final mh.d1 f41357b;
    public boolean f41358b0;
    public final org.telegram.ui.Components.zw0 f41359c;
    public final z5 f41360c0;
    public org.telegram.ui.Components.rl0 d;
    public final g10 f41361d0;
    public d10 f41362e;
    public k10 f41363e0;
    public final ArrayList f41364f;
    public org.telegram.ui.Components.zn0 f41365f0;
    public final f2.j0 f41366g0;
    public final SparseArray h;
    public final h10 f41367h0;
    public final AnimationNotificationsLocker f41368i0;
    public final oh.b3 f41369j0;
    public final c10 f41370k0;
    public s10 f41371l0;
    public boolean m0;
    public final ArrayList f41372n;
    public int f41373n0;
    public boolean f41374o0;
    public final HashMap f41375r;
    public int f41376s;
    public int v;
    public String f41377w;
    public String f41378x;
    public uf.e0 f41379y;

    public t10(org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getParentActivity());
        this.f41355a = new xd.a(0, this, org.telegram.ui.Components.pr.h, 380L, false);
        this.f41364f = new ArrayList();
        this.h = new SparseArray();
        this.f41372n = new ArrayList();
        this.f41375r = new HashMap();
        this.f41376s = 3;
        this.P = new l10(0, 0L);
        this.W = new ArrayList();
        this.f41356a0 = new ArrayList();
        this.f41360c0 = new z5(this, 4);
        this.f41361d0 = new g10(this);
        this.f41368i0 = new AnimationNotificationsLocker();
        this.f41370k0 = new c10(this, 0);
        this.I = p2Var;
        Activity parentActivity = p2Var.getParentActivity();
        this.H = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        mh.d1 d1Var = new mh.d1(this, parentActivity, 26);
        this.f41357b = d1Var;
        d1Var.setOnItemClickListener(new j(this, 11));
        d1Var.setOnItemLongClickListener(new h(this, 16));
        f2.j0 j0Var = new f2.j0();
        this.f41366g0 = j0Var;
        d1Var.setLayoutManager(j0Var);
        h10 h10Var = new h10(this, parentActivity, 0);
        this.f41367h0 = h10Var;
        addView(h10Var);
        addView(d1Var);
        d1Var.setSectionsType(2);
        d1Var.setSkipDrawSection(true);
        d1Var.setOnScrollListener(new i10(this));
        oh.b3 b3Var = new oh.b3(parentActivity);
        this.f41369j0 = b3Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) b3Var.d, formatDateChat)) {
            b3Var.d = formatDateChat;
            ((org.telegram.ui.Components.j6) b3Var.f16886b).q(formatDateChat, true, true);
        }
        addView(b3Var, k7.c6.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.Q = new m10(this);
        this.R = new r10(this, getContext());
        this.S = new o10(this, getContext(), 1);
        this.T = new q10(this, getContext());
        this.U = new o10(this, getContext(), 4);
        this.V = new o10(this, getContext(), 2);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(parentActivity, h10Var, 1, null);
        this.f41359c = zw0Var;
        addView(zw0Var);
        d1Var.setEmptyView(zw0Var);
        zw0Var.setVisibility(8);
        b();
    }

    public static void a(t10 t10Var, MessageObject messageObject, View view, int i10) {
        if (!t10Var.f41371l0.f()) {
            t10Var.f41371l0.a();
        }
        if (t10Var.f41371l0.f()) {
            t10Var.f41371l0.d(messageObject, view, i10);
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
                vf.o1 c3 = vf.p1.f(messageObject.currentAccount).c(messageObject.getQuickReplyId());
                if (c3 != null) {
                    return c3.f49197b;
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
                SpannableStringBuilder[] spannableStringBuilderArr = f41354p0;
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
                    org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(i12, mutate);
                    if (i10 == 1 || i10 == 2) {
                        oqVar.setScale(0.85f);
                    }
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                    spannableStringBuilder.setSpan(oqVar, 0, spannableStringBuilder.length(), 0);
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
                    if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f20845id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence2 = bg.e.j(findTopic2, null, null);
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
                    if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f20845id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
                        charSequence3 = bg.e.j(findTopic, null, null);
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
        float f10 = this.f41355a.f50541e;
        float f11 = (1.0f - f10) * (-AndroidUtilities.dp(24.0f));
        oh.b3 b3Var = this.f41369j0;
        b3Var.setTranslationY(f11);
        b3Var.setAlpha(f10);
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        b3Var.setVisibility(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            mh.d1 d1Var = this.f41357b;
            int childCount = d1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (d1Var.getChildAt(i12) instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) d1Var.getChildAt(i12)).b0(0, true);
                }
                d1Var.getChildAt(i12).invalidate();
            }
        }
    }

    public final void e(long r11, java.util.ArrayList r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t10.e(long, java.util.ArrayList):void");
    }

    public final void f(int i10, View view, MessageObject messageObject, int i11) {
        TLRPC.WebPage webPage;
        String str;
        if (messageObject != null) {
            if (this.f41371l0.f()) {
                this.f41371l0.d(messageObject, view, i11);
            } else if (view instanceof org.telegram.ui.Cells.r2) {
                this.f41371l0.c(messageObject);
            } else {
                int i12 = this.f41379y.d;
                g10 g10Var = this.f41361d0;
                ArrayList arrayList = this.f41364f;
                String str2 = null;
                org.telegram.ui.ActionBar.p2 p2Var = this.I;
                if (i12 == 0) {
                    PhotoViewer.t1().K2(null, p2Var, null);
                    PhotoViewer.t1().a2(arrayList, i10, 0L, 0L, 0L, g10Var);
                    this.O = PhotoViewer.t1().f34239c;
                } else if (i12 != 3 && i12 != 5) {
                    if (i12 == 1) {
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                            TLRPC.Document document = messageObject.getDocument();
                            if (i7Var.D) {
                                if (messageObject.canPreviewDocument()) {
                                    PhotoViewer.t1().K2(null, p2Var, null);
                                    int indexOf = arrayList.indexOf(messageObject);
                                    if (indexOf < 0) {
                                        ArrayList m9 = org.telegram.messenger.y3.m(messageObject);
                                        PhotoViewer.t1().K2(null, p2Var, null);
                                        PhotoViewer.t1().a2(m9, 0, 0L, 0L, 0L, g10Var);
                                        this.O = PhotoViewer.t1().f34239c;
                                        return;
                                    }
                                    PhotoViewer.t1().K2(null, p2Var, null);
                                    PhotoViewer.t1().a2(arrayList, indexOf, 0L, 0L, 0L, g10Var);
                                    this.O = PhotoViewer.t1().f34239c;
                                    return;
                                }
                                AndroidUtilities.openDocument(messageObject, this.H, p2Var);
                            } else if (!i7Var.C) {
                                MessageObject message = i7Var.getMessage();
                                message.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document, message, 0, 0);
                                i7Var.f(true);
                            } else {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document);
                                i7Var.f(true);
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
                                    org.telegram.ui.Components.ru.I(this.I, messageObject, this.f41361d0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.l7) view).B;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            org.telegram.ui.Components.z4.q0(this.I, str, true, true);
        } else {
            af.g.s(this.H, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        f fVar = new f(this, 14);
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21733h5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        mh.d1 d1Var = this.f41357b;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        int i12 = org.telegram.ui.ActionBar.k6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 2048, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.f21753i7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.k6.f21788k7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21734h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.f21695f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4, new Class[]{org.telegram.ui.Cells.h7.class}, org.telegram.ui.ActionBar.k6.f21713g3, null, null, org.telegram.ui.ActionBar.k6.f22055z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, null, null, null, org.telegram.ui.ActionBar.k6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, org.telegram.ui.ActionBar.k6.m0, null, null, org.telegram.ui.ActionBar.k6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 32, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 524304, new Class[]{org.telegram.ui.Cells.m7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 524288, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.m7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, org.telegram.ui.ActionBar.k6.f21908r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.f21994w0, null, null, org.telegram.ui.ActionBar.k6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.f22032y0, null, null, org.telegram.ui.ActionBar.k6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.L0, null, null, org.telegram.ui.ActionBar.k6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21602a1}, null, org.telegram.ui.ActionBar.k6.f21609a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.k6.f21711g1, org.telegram.ui.ActionBar.k6.f21729h1};
        int i15 = org.telegram.ui.ActionBar.k6.f21772j9;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21764j1, org.telegram.ui.ActionBar.k6.f21782k1, org.telegram.ui.ActionBar.k6.Z0}, null, org.telegram.ui.ActionBar.k6.f21628b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.k6.D0}, null, -1, null, org.telegram.ui.ActionBar.k6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.k6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.k6.E0}, null, -1, null, org.telegram.ui.ActionBar.k6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.F0[1], null, null, org.telegram.ui.ActionBar.k6.f21755i9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.F0[0], null, null, org.telegram.ui.ActionBar.k6.f21719g9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.G0, null, null, org.telegram.ui.ActionBar.k6.m9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.k6.H0, null, -1, null, org.telegram.ui.ActionBar.k6.f21880p9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.I0, null, null, org.telegram.ui.ActionBar.k6.f21899q9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.f21975v0, null, null, org.telegram.ui.ActionBar.k6.s9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.f21957u0, null, null, org.telegram.ui.ActionBar.k6.t9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.T0}, null, org.telegram.ui.ActionBar.k6.f21966u9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.V0, org.telegram.ui.ActionBar.k6.W0}, null, org.telegram.ui.ActionBar.k6.f21984v9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.X0}, null, org.telegram.ui.ActionBar.k6.f22003w9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.f22013x0, null, null, org.telegram.ui.ActionBar.k6.f22022x9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.Y0}, null, org.telegram.ui.ActionBar.k6.f22041y9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21747i1}, null, org.telegram.ui.ActionBar.k6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class, org.telegram.ui.Cells.h6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21693f1}, null, org.telegram.ui.ActionBar.k6.f22058z9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21639c1}, null, org.telegram.ui.ActionBar.k6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21818m1}, null, org.telegram.ui.ActionBar.k6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21664d9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21646c9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, org.telegram.ui.ActionBar.k6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8192, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 16384, new Class[]{org.telegram.ui.Cells.r2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 524288, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21699f7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 524304, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21680e7));
        org.telegram.ui.Components.zw0 zw0Var = this.f41359c;
        arrayList.add(new org.telegram.ui.ActionBar.m6(zw0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(zw0Var.f34033e, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f22038y6));
        return arrayList;
    }

    public final void h(final long j10, final long j11, final long j12, final long j13, final uf.e0 e0Var, final boolean z4, String str, boolean z10) {
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
        String str4 = this.f41378x;
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
        this.f41379y = e0Var;
        this.B = j10;
        this.C = j11;
        this.E = j12;
        this.D = j13;
        this.F = str2;
        this.G = z4;
        d10 d10Var = this.f41362e;
        if (d10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(d10Var);
        }
        z5 z5Var = this.f41360c0;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        if (!z11 || !z10) {
            ArrayList arrayList2 = this.f41356a0;
            final boolean z13 = z11;
            ArrayList arrayList3 = this.W;
            org.telegram.ui.Components.zw0 zw0Var = this.f41359c;
            ArrayList arrayList4 = this.f41364f;
            long j14 = 0;
            if (!z12 && (e0Var != null || j11 != 0 || j10 != 0 || j12 != 0 || j13 != 0)) {
                if (!z10 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f41372n.clear();
                this.f41375r.clear();
                this.J = true;
                zw0Var.setVisibility(0);
                org.telegram.ui.Components.rl0 rl0Var = this.d;
                if (rl0Var != null) {
                    rl0Var.l();
                }
                this.M++;
                mh.d1 d1Var = this.f41357b;
                if (d1Var.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    d1Var.getPinnedHeader().setAlpha(0.0f);
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
            org.telegram.ui.Components.rl0 rl0Var2 = this.d;
            if (rl0Var2 != null) {
                rl0Var2.l();
            }
            if (!z13) {
                z5Var.run();
                zw0Var.e(true, !z10);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                k10 k10Var = this.f41363e0;
                if (k10Var != null) {
                    ((tv) k10Var).h(false, null, null, false);
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
                    final t10 t10Var = t10.this;
                    ArrayList arrayList5 = t10Var.f41364f;
                    final long j17 = j10;
                    long j18 = j11;
                    final String str5 = str2;
                    final uf.e0 e0Var2 = e0Var;
                    int i16 = i12;
                    long j19 = j12;
                    long j20 = j13;
                    final boolean z14 = z13;
                    ArrayList<Object> arrayList6 = null;
                    if (j17 != 0 && j18 == 0) {
                        ?? tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f20954q = str5;
                        tL_messages_search.limit = 20;
                        if (e0Var2 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = e0Var2.f48585e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = AccountInstance.getInstance(i16).getMessagesController().getInputPeer(j17);
                        if (j19 > 0) {
                            tL_messages_search.min_date = (int) (j19 / 1000);
                        }
                        if (j20 > 0) {
                            tL_messages_search.max_date = (int) (j20 / 1000);
                        }
                        if (z14 && str5.equals(t10Var.f41377w) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) l.d.i(1, arrayList5)).getId();
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
                        tL_messages_searchGlobal2.f20956q = str5;
                        if (e0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = e0Var2.f48585e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = MessagesController.getInstance(i13).getInputChannel(j18);
                        if (j16 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j16 / 1000);
                        }
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                        }
                        if (z14 && str5.equals(t10Var.f41377w) && !arrayList5.isEmpty()) {
                            i15 = 1;
                            MessageObject messageObject = (MessageObject) l.d.i(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = messageObject.getId();
                            tL_messages_searchGlobal2.offset_rate = t10Var.v;
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
                    t10Var.f41377w = str5;
                    t10Var.f41378x = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    uf.g0.x1(t10Var.f41377w, arrayList10);
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
                            final t10 t10Var2 = t10.this;
                            final int i21 = i17;
                            final boolean z16 = z14;
                            final uf.e0 e0Var3 = e0Var2;
                            final long j22 = j17;
                            final long j23 = j21;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f10.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.f41362e = r02;
            AndroidUtilities.runOnUIThread(r02, (!z13 || arrayList.isEmpty()) ? 350L : 350L);
            h10 h10Var = this.f41367h0;
            if (e0Var == null) {
                h10Var.setViewType(1);
                return;
            }
            int i13 = e0Var.d;
            if (i13 == 0) {
                if (!TextUtils.isEmpty(this.F)) {
                    h10Var.setViewType(1);
                } else {
                    h10Var.setViewType(2);
                }
            } else if (i13 == 1) {
                h10Var.setViewType(3);
            } else if (i13 != 3 && i13 != 5) {
                if (i13 == 2) {
                    h10Var.setViewType(5);
                }
            } else {
                h10Var.setViewType(4);
            }
        }
    }

    public final void i(k10 k10Var, boolean z4) {
        this.f41363e0 = k10Var;
        if (z4 && k10Var != null) {
            ArrayList arrayList = this.W;
            if (!arrayList.isEmpty()) {
                ((tv) k10Var).h(false, arrayList, this.f41356a0, this.f41358b0);
            }
        }
    }

    public final void j(int i10, int i11, boolean z4) {
        setClipToPadding(false);
        this.f41374o0 = z4;
        setPadding(0, i10, 0, i11);
        mh.d1 d1Var = this.f41357b;
        if (z4) {
            d1Var.n1(0, i10, 0, i11);
        } else {
            d1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f41374o0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.f41373n0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f41373n0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.rl0 rl0Var;
        int i12 = this.f41376s;
        if (AndroidUtilities.isTablet()) {
            this.f41376s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f41376s = 6;
        } else {
            this.f41376s = 3;
        }
        if (i12 != this.f41376s && (rl0Var = this.d) == this.R) {
            this.f41374o0 = true;
            rl0Var.l();
            this.f41374o0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f41374o0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(og.a aVar) {
        rg.d dVar = new rg.d(null);
        dVar.f46842e = new s0.b(22);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(0, 0);
        dVar.f46843f = 1.0f;
        dVar.h = 1.0f;
        oh.b3 b3Var = this.f41369j0;
        qg.b c3 = aVar.c(b3Var, dVar, false);
        b3Var.f16887c = c3;
        c3.p(AndroidUtilities.dp(11.5f));
        ((qg.b) b3Var.f16887c).o(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.zn0 zn0Var) {
        this.f41365f0 = zn0Var;
    }

    public void setUiCallback(s10 s10Var) {
        this.f41371l0 = s10Var;
    }

    public void setUseFromUserAsAvatar(boolean z4) {
        this.m0 = z4;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
