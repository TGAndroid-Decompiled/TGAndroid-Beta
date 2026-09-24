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
public final class t10 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.e {
    public static final SpannableStringBuilder[] f37901s0 = new SpannableStringBuilder[3];
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.m2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final l10 S;
    public final m10 T;
    public final r10 U;
    public final o10 V;
    public final q10 W;
    public final le.c f37902a;
    public final o10 f37903a0;
    public final ai.w0 f37904b;
    public final o10 f37905b0;
    public final org.telegram.ui.Components.ix0 f37906c;
    public final ArrayList f37907c0;
    public org.telegram.ui.Components.vl0 d;
    public final ArrayList f37908d0;
    public d10 e;
    public boolean f37909e0;
    public final ArrayList f37910f;
    public final w5 f37911f0;
    public final g10 f37912g0;
    public final SparseArray h;
    public k10 f37913h0;
    public org.telegram.ui.Components.ho0 f37914i0;
    public final s4.c0 f37915j0;
    public final h10 f37916k0;
    public final AnimationNotificationsLocker f37917l0;
    public final ai.n4 m0;
    public final ArrayList f37918n;
    public final c10 f37919n0;
    public s10 f37920o0;
    public boolean f37921p0;
    public int f37922q0;
    public final HashMap f37923r;
    public boolean f37924r0;
    public int f37925s;
    public int v;
    public String f37926w;
    public String f37927x;
    public gg.q0 f37928y;

    public t10(org.telegram.ui.ActionBar.m2 m2Var) {
        super(m2Var.getParentActivity());
        this.f37902a = new le.c(0, this, org.telegram.ui.Components.rr.h, 380L, false);
        this.f37910f = new ArrayList();
        this.h = new SparseArray();
        this.f37918n = new ArrayList();
        this.f37923r = new HashMap();
        this.f37925s = 3;
        this.S = new l10(0, 0L);
        this.f37907c0 = new ArrayList();
        this.f37908d0 = new ArrayList();
        this.f37911f0 = new w5(this, 4);
        this.f37912g0 = new g10(this);
        this.f37917l0 = new AnimationNotificationsLocker();
        this.f37919n0 = new c10(this, 0);
        this.L = m2Var;
        Activity parentActivity = m2Var.getParentActivity();
        this.K = parentActivity;
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
        ai.w0 w0Var = new ai.w0(this, parentActivity, 28);
        this.f37904b = w0Var;
        w0Var.setOnItemClickListener(new i(this, 11));
        w0Var.setOnItemLongClickListener(new g(this, 16));
        s4.c0 c0Var = new s4.c0();
        this.f37915j0 = c0Var;
        w0Var.setLayoutManager(c0Var);
        h10 h10Var = new h10(this, parentActivity, 0);
        this.f37916k0 = h10Var;
        addView(h10Var);
        addView(w0Var);
        w0Var.setSectionsType(2);
        w0Var.setSkipDrawSection(true);
        w0Var.setOnScrollListener(new i10(this));
        ai.n4 n4Var = new ai.n4(parentActivity);
        this.m0 = n4Var;
        String formatDateChat = LocaleController.formatDateChat((int) (System.currentTimeMillis() / 1000));
        if (!TextUtils.equals((String) n4Var.d, formatDateChat)) {
            n4Var.d = formatDateChat;
            ((org.telegram.ui.Components.o6) n4Var.f1293b).q(formatDateChat, true, true);
        }
        addView(n4Var, w7.y5.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new m10(this);
        this.U = new r10(this, getContext());
        this.V = new o10(this, getContext(), 1);
        this.W = new q10(this, getContext());
        this.f37903a0 = new o10(this, getContext(), 4);
        this.f37905b0 = new o10(this, getContext(), 2);
        org.telegram.ui.Components.ix0 ix0Var = new org.telegram.ui.Components.ix0(parentActivity, h10Var, 1, null);
        this.f37906c = ix0Var;
        addView(ix0Var);
        w0Var.setEmptyView(ix0Var);
        ix0Var.setVisibility(8);
        b();
    }

    public static void a(t10 t10Var, MessageObject messageObject, View view, int i10) {
        if (!t10Var.f37920o0.g()) {
            t10Var.f37920o0.a();
        }
        if (t10Var.f37920o0.g()) {
            t10Var.f37920o0.e(messageObject, view, i10);
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
                    return c10.f10206b;
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
                SpannableStringBuilder[] spannableStringBuilderArr = f37901s0;
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
                    org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(i12, mutate);
                    if (i10 == 1 || i10 == 2) {
                        pqVar.setScale(0.85f);
                    }
                    SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i10];
                    spannableStringBuilder.setSpan(pqVar, 0, spannableStringBuilder.length(), 0);
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
                    if (ChatObject.isForum(chat2) && (findTopic2 = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat2.f18321id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
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
                    if (ChatObject.isForum(chat) && (findTopic = MessagesController.getInstance(UserConfig.selectedAccount).getTopicsController().findTopic(chat.f18321id, MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
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

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
            b();
        }
    }

    public final void b() {
        int i10;
        float f7 = this.f37902a.e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(24.0f));
        ai.n4 n4Var = this.m0;
        n4Var.setTranslationY(f10);
        n4Var.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        n4Var.setVisibility(i10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            ai.w0 w0Var = this.f37904b;
            int childCount = w0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                if (w0Var.getChildAt(i12) instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) w0Var.getChildAt(i12)).b0(0, true);
                }
                w0Var.getChildAt(i12).invalidate();
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
            if (this.f37920o0.g()) {
                this.f37920o0.e(messageObject, view, i11);
            } else if (view instanceof org.telegram.ui.Cells.s2) {
                this.f37920o0.d(messageObject);
            } else {
                int i12 = this.f37928y.d;
                g10 g10Var = this.f37912g0;
                ArrayList arrayList = this.f37910f;
                String str2 = null;
                org.telegram.ui.ActionBar.m2 m2Var = this.L;
                if (i12 == 0) {
                    PhotoViewer.t1().J2(null, m2Var, null);
                    PhotoViewer.t1().a2(arrayList, i10, 0L, 0L, 0L, g10Var);
                    this.R = PhotoViewer.t1().f31190c;
                } else if (i12 != 3 && i12 != 5) {
                    if (i12 == 1) {
                        if (view instanceof org.telegram.ui.Cells.k7) {
                            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                            TLRPC.Document document = messageObject.getDocument();
                            if (k7Var.G) {
                                if (messageObject.canPreviewDocument()) {
                                    PhotoViewer.t1().J2(null, m2Var, null);
                                    int indexOf = arrayList.indexOf(messageObject);
                                    if (indexOf < 0) {
                                        ArrayList k10 = org.telegram.messenger.f0.k(messageObject);
                                        PhotoViewer.t1().J2(null, m2Var, null);
                                        PhotoViewer.t1().a2(k10, 0, 0L, 0L, 0L, g10Var);
                                        this.R = PhotoViewer.t1().f31190c;
                                        return;
                                    }
                                    PhotoViewer.t1().J2(null, m2Var, null);
                                    PhotoViewer.t1().a2(arrayList, indexOf, 0L, 0L, 0L, g10Var);
                                    this.R = PhotoViewer.t1().f31190c;
                                    return;
                                }
                                AndroidUtilities.openDocument(messageObject, this.K, m2Var);
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
                                        m2Var.createArticleViewer(false).N(messageObject, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.wu.J(this.L, messageObject, this.f37912g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
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
                        } catch (Exception e) {
                            FileLog.e(e);
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
            org.telegram.ui.Components.e5.q0(this.L, str, true, true);
        } else {
            nf.f.s(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        e eVar = new e(this, 14);
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.h6.f19045d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19115h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f18989a7));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        ai.w0 w0Var = this.f37904b;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"dateTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        int i12 = org.telegram.ui.ActionBar.h6.Ih;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 2048, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"progressView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"statusImageView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.f19135i7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.f19173k7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 8, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"thumbImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"extTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19116h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 8192, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 16384, new Class[]{org.telegram.ui.Cells.j7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.h6.f19078f3, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4, new Class[]{org.telegram.ui.Cells.j7.class}, org.telegram.ui.ActionBar.h6.f19096g3, null, null, org.telegram.ui.ActionBar.h6.f19447z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 8192, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 16384, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, org.telegram.ui.ActionBar.h6.m0, null, null, org.telegram.ui.ActionBar.h6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32, new Class[]{org.telegram.ui.Cells.n7.class}, new String[]{"letterDrawable"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 524304, new Class[]{org.telegram.ui.Cells.o7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 524288, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.o7.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, org.telegram.ui.ActionBar.h6.f19296r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.f19388w0, null, null, org.telegram.ui.ActionBar.h6.U8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.f19423y0, null, null, org.telegram.ui.ActionBar.h6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.L0, null, null, org.telegram.ui.ActionBar.h6.W8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f18984a1}, null, org.telegram.ui.ActionBar.h6.f18991a9));
        Drawable[] drawableArr = {org.telegram.ui.ActionBar.h6.f19094g1, org.telegram.ui.ActionBar.h6.f19111h1};
        int i15 = org.telegram.ui.ActionBar.h6.f19155j9;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19148j1, org.telegram.ui.ActionBar.h6.f19167k1, org.telegram.ui.ActionBar.h6.Z0}, null, org.telegram.ui.ActionBar.h6.f19011b9));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.F0[1], null, null, org.telegram.ui.ActionBar.h6.f19137i9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.F0[0], null, null, org.telegram.ui.ActionBar.h6.f19102g9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.G0, null, null, org.telegram.ui.ActionBar.h6.f19212m9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.h6.H0, null, -1, null, org.telegram.ui.ActionBar.h6.f19267p9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.I0, null, null, org.telegram.ui.ActionBar.h6.f19286q9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.f19370v0, null, null, org.telegram.ui.ActionBar.h6.f19324s9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.f19352u0, null, null, org.telegram.ui.ActionBar.h6.f19343t9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.T0}, null, org.telegram.ui.ActionBar.h6.f19361u9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.V0, org.telegram.ui.ActionBar.h6.W0}, null, org.telegram.ui.ActionBar.h6.v9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.X0}, null, org.telegram.ui.ActionBar.h6.f19397w9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.f19405x0, null, null, org.telegram.ui.ActionBar.h6.f19414x9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.Y0}, null, org.telegram.ui.ActionBar.h6.f19431y9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19129i1}, null, org.telegram.ui.ActionBar.h6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class, org.telegram.ui.Cells.i6.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19076f1}, null, org.telegram.ui.ActionBar.h6.f19450z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19022c1}, null, org.telegram.ui.ActionBar.h6.B9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19204m1}, null, org.telegram.ui.ActionBar.h6.C9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19048d9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19030c9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, org.telegram.ui.ActionBar.h6.T8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 8192, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"checkBox"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 16384, new Class[]{org.telegram.ui.Cells.s2.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 524288, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 524304, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.h6.e7));
        org.telegram.ui.Components.ix0 ix0Var = this.f37906c;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ix0Var.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ix0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19428y6));
        return arrayList;
    }

    public final void h(final long j3, final long j10, final long j11, final long j12, final gg.q0 q0Var, final boolean z10, String str, boolean z11) {
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
        if (q0Var == null) {
            i10 = -1;
        } else {
            i10 = q0Var.d;
        }
        final String str3 = j3 + j10 + j11 + j12 + i10 + str2 + z10;
        String str4 = this.f37927x;
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
        this.f37928y = q0Var;
        this.E = j3;
        this.F = j10;
        this.H = j11;
        this.G = j12;
        this.I = str2;
        this.J = z10;
        d10 d10Var = this.e;
        if (d10Var != null) {
            AndroidUtilities.cancelRunOnUIThread(d10Var);
        }
        w5 w5Var = this.f37911f0;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f37908d0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f37907c0;
            org.telegram.ui.Components.ix0 ix0Var = this.f37906c;
            ArrayList arrayList4 = this.f37910f;
            long j13 = 0;
            if (!z13 && (q0Var != null || j10 != 0 || j3 != 0 || j11 != 0 || j12 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f37918n.clear();
                this.f37923r.clear();
                this.M = true;
                ix0Var.setVisibility(0);
                org.telegram.ui.Components.vl0 vl0Var = this.d;
                if (vl0Var != null) {
                    vl0Var.l();
                }
                this.P++;
                ai.w0 w0Var = this.f37904b;
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
            org.telegram.ui.Components.vl0 vl0Var2 = this.d;
            if (vl0Var2 != null) {
                vl0Var2.l();
            }
            if (!z14) {
                w5Var.run();
                ix0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                k10 k10Var = this.f37913h0;
                if (k10Var != null) {
                    ((sv) k10Var).i(false, null, null, false);
                }
            }
            final int i11 = this.P + 1;
            this.P = i11;
            final int i12 = UserConfig.selectedAccount;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i13;
                    long j14;
                    long j15;
                    int i14;
                    ?? r10;
                    TLRPC.MessagesFilter messagesFilter;
                    int i15;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final t10 t10Var = t10.this;
                    ArrayList arrayList5 = t10Var.f37910f;
                    final long j16 = j3;
                    long j17 = j10;
                    final String str5 = str2;
                    final gg.q0 q0Var2 = q0Var;
                    int i16 = i12;
                    long j18 = j11;
                    long j19 = j12;
                    final boolean z15 = z14;
                    ArrayList<Object> arrayList6 = null;
                    if (j16 != 0 && j17 == 0) {
                        ?? tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f18430q = str5;
                        tL_messages_search.limit = 20;
                        if (q0Var2 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = q0Var2.e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = AccountInstance.getInstance(i16).getMessagesController().getInputPeer(j16);
                        if (j18 > 0) {
                            tL_messages_search.min_date = (int) (j18 / 1000);
                        }
                        if (j19 > 0) {
                            tL_messages_search.max_date = (int) (j19 / 1000);
                        }
                        if (z15 && str5.equals(t10Var.f37926w) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList5)).getId();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        tL_messages_searchGlobal = tL_messages_search;
                        i13 = i16;
                        j15 = j18;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str5);
                        boolean z16 = z10;
                        if (!isEmpty) {
                            j14 = j19;
                            ArrayList<Object> arrayList7 = new ArrayList<>();
                            ArrayList<CharSequence> arrayList8 = new ArrayList<>();
                            ArrayList<TLRPC.User> arrayList9 = new ArrayList<>();
                            j15 = j18;
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i16);
                            i13 = i16;
                            i14 = 20;
                            messagesStorage.localSearch(0, str5, arrayList7, arrayList8, arrayList9, null, z16 ? 1 : 0);
                            r10 = z16 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i13 = i16;
                            j14 = j19;
                            j15 = j18;
                            i14 = 20;
                            r10 = z16;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i14;
                        tL_messages_searchGlobal2.f18432q = str5;
                        if (q0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = q0Var2.e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = MessagesController.getInstance(i13).getInputChannel(j17);
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j15 / 1000);
                        }
                        if (j14 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j14 / 1000);
                        }
                        if (z15 && str5.equals(t10Var.f37926w) && !arrayList5.isEmpty()) {
                            i15 = 1;
                            MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList5);
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
                    t10Var.f37926w = str5;
                    t10Var.f37927x = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    gg.s0.y1(t10Var.f37926w, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
                    final int i17 = i11;
                    final ArrayList<Object> arrayList11 = arrayList6;
                    final int i18 = i13;
                    final long j20 = j15;
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
                            final boolean z17 = z15;
                            final gg.q0 q0Var3 = q0Var2;
                            final long j21 = j16;
                            final long j22 = j20;
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
            this.e = r02;
            AndroidUtilities.runOnUIThread(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            h10 h10Var = this.f37916k0;
            if (q0Var == null) {
                h10Var.setViewType(1);
                return;
            }
            int i13 = q0Var.d;
            if (i13 == 0) {
                if (!TextUtils.isEmpty(this.I)) {
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

    public final void i(k10 k10Var, boolean z10) {
        this.f37913h0 = k10Var;
        if (z10 && k10Var != null) {
            ArrayList arrayList = this.f37907c0;
            if (!arrayList.isEmpty()) {
                ((sv) k10Var).i(false, arrayList, this.f37908d0, this.f37909e0);
            }
        }
    }

    public final void j(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.f37924r0 = z10;
        setPadding(0, i10, 0, i11);
        ai.w0 w0Var = this.f37904b;
        if (z10) {
            w0Var.o1(0, i10, 0, i11);
        } else {
            w0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.f37924r0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = UserConfig.selectedAccount;
        this.f37922q0 = i10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f37922q0).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.vl0 vl0Var;
        int i12 = this.f37925s;
        if (AndroidUtilities.isTablet()) {
            this.f37925s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f37925s = 6;
        } else {
            this.f37925s = 3;
        }
        if (i12 != this.f37925s && (vl0Var = this.d) == this.U) {
            this.f37924r0 = true;
            vl0Var.l();
            this.f37924r0 = false;
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f37924r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        dh.e eVar = new dh.e(null);
        eVar.e = new d2.c(5);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(0, 0);
        eVar.f7724f = 1.0f;
        eVar.h = 1.0f;
        ai.n4 n4Var = this.m0;
        ch.d c10 = cVar.c(n4Var, eVar, false);
        n4Var.f1294c = c10;
        c10.q(AndroidUtilities.dp(11.5f));
        ((ch.d) n4Var.f1294c).p(AndroidUtilities.dp(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.ho0 ho0Var) {
        this.f37914i0 = ho0Var;
    }

    public void setUiCallback(s10 s10Var) {
        this.f37920o0 = s10Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f37921p0 = z10;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
