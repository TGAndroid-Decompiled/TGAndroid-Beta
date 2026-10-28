package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
public class xi0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final a0.g R;
    public org.telegram.ui.Components.bk0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final y5 Z;
    public TLRPC.ChatFull f45695a;
    public FrameLayout f45696a0;
    public final long f45697b;
    public ti0 f45698b0;
    public final int f45699c;
    public kg.g f45700c0;
    public vi0 d;
    public final boolean f45701d0;
    public org.telegram.ui.Components.uz e;
    public v91 f45702e0;
    public org.telegram.ui.Components.nm0 f45703f;
    public s4.c0 h;
    public final MessageObject f45704n;
    public k91 f45705r;
    public k91 f45706s;
    public final LruCache v;
    public x91 f45707w;
    public final ArrayList f45708x;
    public boolean f45709y;

    public xi0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.f45708x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new y5(this, 11);
        this.f45704n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.f45697b = messageObject.getChatId();
            this.f45699c = messageObject.getId();
        } else {
            this.f45697b = -messageObject.getFromChatId();
            this.f45699c = messageObject.messageOwner.fwd_msg_id;
        }
        this.f45695a = getMessagesController().getChatFull(this.f45697b);
    }

    public static void V(xi0 xi0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        xi0Var.f45709y = true;
        if (tL_error != null) {
            xi0Var.i0();
            return;
        }
        if (tLObject instanceof TL_stories.TL_stats_storyStats) {
            TL_stories.TL_stats_storyStats tL_stats_storyStats = (TL_stories.TL_stats_storyStats) tLObject;
            statsGraph = tL_stats_storyStats.views_graph;
            statsGraph2 = tL_stats_storyStats.reactions_by_emotion_graph;
        } else {
            TL_stats.TL_messageStats tL_messageStats = (TL_stats.TL_messageStats) tLObject;
            statsGraph = tL_messageStats.views_graph;
            statsGraph2 = tL_messageStats.reactions_by_emotion_graph;
        }
        xi0Var.f45705r = y91.e0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        xi0Var.f45706s = y91.e0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        k91 k91Var = xi0Var.f45705r;
        if (k91Var != null && k91Var.d.f17010a.length <= 5) {
            xi0Var.f45709y = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            k91 k91Var2 = xi0Var.f45705r;
            tL_loadAsyncGraph.token = k91Var2.f40708g;
            long[] jArr = k91Var2.d.f17010a;
            tL_loadAsyncGraph.f22261x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(xi0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(xi0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new ea(xi0Var, xi0Var.f45705r.f40708g + "_" + tL_loadAsyncGraph.f22261x, tL_loadAsyncGraph, 24), null, null, 0, xi0Var.f45695a.stats_dc, 1, true), xi0Var.classGuid);
            return;
        }
        xi0Var.i0();
    }

    public static void W(xi0 xi0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = xi0Var.f45708x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                xi0Var.G = tL_publicForwards.next_offset;
            } else {
                xi0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                xi0Var.U = i10;
            } else if (xi0Var.U == 0) {
                xi0Var.U = tL_publicForwards.forwards.size();
            }
            if (xi0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            xi0Var.V = z10;
            xi0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            xi0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f22267id;
                    MessageObject messageObject = new MessageObject(xi0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(xi0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.uz uzVar = xi0Var.e;
            if (uzVar != null) {
                uzVar.c();
            }
        }
        xi0Var.F = true;
        xi0Var.E = false;
        xi0Var.i0();
    }

    public static void X(xi0 xi0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = xi0Var.f45708x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                xi0Var.G = tL_publicForwards.next_offset;
            } else {
                xi0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                xi0Var.U = i10;
            } else if (xi0Var.U == 0) {
                xi0Var.U = tL_publicForwards.forwards.size();
            }
            if (xi0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            xi0Var.V = z10;
            xi0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            xi0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f22267id;
                    MessageObject messageObject = new MessageObject(xi0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(xi0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.uz uzVar = xi0Var.e;
            if (uzVar != null) {
                uzVar.c();
            }
        }
        xi0Var.F = true;
        xi0Var.E = false;
        xi0Var.i0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.rj));
    }

    public final void b0() {
        View subtitleTextView;
        org.telegram.ui.Components.nm0 nm0Var = this.f45703f;
        if (nm0Var != null) {
            int childCount = nm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                f0(this.f45703f.getChildAt(i10));
            }
            int hiddenChildCount = this.f45703f.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                f0(this.f45703f.V(i11));
            }
            int cachedChildCount = this.f45703f.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                f0(this.f45703f.P(i12));
            }
            int attachedScrapChildCount = this.f45703f.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                f0(this.f45703f.O(i13));
            }
            this.f45703f.getRecycledViewPool().a();
        }
        kg.g gVar = this.f45700c0;
        if (gVar != null) {
            gVar.f16566g = true;
        }
        ti0 ti0Var = this.f45698b0;
        if (ti0Var == null) {
            subtitleTextView = null;
        } else {
            subtitleTextView = ti0Var.getSubtitleTextView();
        }
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.b6) {
            ((org.telegram.ui.ActionBar.b6) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Pi, getResourceProvider()));
        }
    }

    public final boolean c0(MessageObject messageObject) {
        if (messageObject.isStory() && (messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.t.q(R.string.StoryNotFound, org.telegram.ui.Components.wc.b0(this), R.raw.story_bomb1, 36);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        CharSequence charSequence;
        String str;
        int i12;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23300a7, frameLayout, getResourceProvider());
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        TLRPC.PhotoSize photoSize = null;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.e = uzVar;
        uzVar.setText(LocaleController.getString(R.string.NoResult));
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.S = imageView;
        imageView.setAutoRepeat(true);
        this.S.f(R.raw.statistic_preload, 120, 120, null);
        this.S.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.y6.Oi;
        org.telegram.ui.ActionBar.f7.V(textView, i13, getResourceProvider());
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.y6.Pi;
        org.telegram.ui.ActionBar.f7.V(textView2, i14, getResourceProvider());
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.wh.k(R.string.LoadingStatsDescription, textView2, 1);
        this.T.addView(this.S, org.telegram.ui.Components.kb1.x(120, 120, 1, 0, 0, 0, 20));
        this.T.addView(textView, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 0, 0, 10));
        this.T.addView(textView2, org.telegram.ui.Components.kb1.u(-2, -2, 1));
        float f7 = 0.0f;
        this.T.setAlpha(0.0f);
        frameLayout2.addView(this.T, org.telegram.ui.Components.kb1.h(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, getResourceProvider());
        this.f45703f = nm0Var;
        nm0Var.u1();
        org.telegram.ui.Components.nm0 nm0Var2 = this.f45703f;
        s4.c0 c0Var = new s4.c0(1, false);
        this.h = c0Var;
        nm0Var2.setLayoutManager(c0Var);
        ((s4.g1) this.f45703f.getItemAnimator()).f47798m = false;
        org.telegram.ui.Components.nm0 nm0Var3 = this.f45703f;
        vi0 vi0Var = new vi0(this, context);
        this.d = vi0Var;
        nm0Var3.setAdapter(vi0Var);
        org.telegram.ui.Components.nm0 nm0Var4 = this.f45703f;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        nm0Var4.setVerticalScrollbarPosition(i10);
        this.actionBar.setAdaptiveBackground(this.f45703f);
        this.f45703f.setOnItemClickListener(new h(this, 19));
        this.f45703f.setOnItemLongClickListener(new st(this, 23));
        this.f45703f.setOnScrollListener(new i3(this, 21));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f45696a0 = frameLayout3;
        frameLayout3.addView(this.f45703f, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.f45696a0.addView(this.e, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.f45696a0.setVisibility(8);
        frameLayout2.addView(this.f45696a0, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.Z, 300L);
        i0();
        this.f45703f.setEmptyView(this.e);
        this.f45698b0 = new ti0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.W = imageReceiver;
        imageReceiver.setParentView(this.f45698b0);
        this.W.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.Y = false;
        MessageObject messageObject = this.f45704n;
        if (!messageObject.isStory()) {
            if (!messageObject.needDrawBluredPreview() && (messageObject.isPhoto() || messageObject.isNewGif() || messageObject.isVideo())) {
                if (messageObject.isWebpage()) {
                    str = messageObject.messageOwner.media.webpage.type;
                } else {
                    str = null;
                }
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                        photoSize = closestPhotoSizeWithSize2;
                    }
                    if (closestPhotoSizeWithSize != null) {
                        this.Y = true;
                        this.X = messageObject.isVideo();
                        String attachFileName = FileLoader.getAttachFileName(photoSize);
                        if (!messageObject.mediaExists && !DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject) && !FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                            this.W.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.f45704n, 0);
                        } else {
                            if (messageObject.type == 1 && photoSize != null) {
                                i12 = photoSize.size;
                            } else {
                                i12 = 0;
                            }
                            this.W.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", i12, null, this.f45704n, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequence = messageObject.caption;
            } else if (!TextUtils.isEmpty(messageObject.messageOwner.message)) {
                CharSequence charSequence2 = messageObject.messageText;
                if (charSequence2.length() > 150) {
                    charSequence2 = charSequence2.subSequence(0, 150);
                }
                charSequence = Emoji.replaceEmoji(charSequence2, this.f45698b0.getSubtitlePaint().getFontMetricsInt(), false);
            } else {
                charSequence = messageObject.messageText;
            }
            if (!messageObject.isVideo() && !messageObject.isPhoto()) {
                this.f45698b0.setSubtitle(charSequence);
            } else {
                ti0 ti0Var = this.f45698b0;
                if (ti0Var.getSubtitleTextView() != null) {
                    ti0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.Y && !messageObject.isStory()) {
            i11 = 56;
        } else {
            this.f45698b0.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i11 = 50;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        ti0 ti0Var2 = this.f45698b0;
        if (!this.inPreviewMode) {
            f7 = i11;
        }
        kVar.addView(ti0Var2, 0, org.telegram.ui.Components.kb1.h(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        g0();
        this.f45698b0.i(org.telegram.ui.ActionBar.y6.w0(i13, getResourceProvider()), org.telegram.ui.ActionBar.y6.w0(i14, getResourceProvider()));
        View subtitleTextView = this.f45698b0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.b6) {
            ((org.telegram.ui.ActionBar.b6) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.y6.w0(i14, getResourceProvider()));
        }
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.f23770z8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.actionBar.setActionBarMenuOnItemClick(new c20(this, 14));
        this.f45698b0.setOnClickListener(new z50(this, 11));
        h0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.E) {
            return;
        }
        this.E = true;
        vi0 vi0Var = this.d;
        if (vi0Var != null) {
            vi0Var.l();
        }
        MessageObject messageObject = this.f45704n;
        String str = "";
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f22260id = messageObject.storyItem.f22267id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.f45697b);
            String str2 = this.G;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new ri0(this, 1), null, null, 0, this.f45695a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-messageObject.getFromChatId());
        } else {
            tL_getMessagePublicForwards.msg_id = messageObject.getId();
            tL_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-messageObject.getDialogId());
        }
        String str3 = this.G;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new ri0(this, 2), null, null, 0, this.f45695a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f45695a == null && chatFull.f22029id == this.f45697b) {
                g0();
                this.f45695a = chatFull;
                e0();
                d0();
                h0();
            }
        }
    }

    public final void e0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        MessageObject messageObject = this.f45704n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f22269id = messageObject.storyItem.f22267id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.f45697b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().getInputChannel(-messageObject.getFromChatId());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = messageObject.getId();
                tL_getMessageStats2.channel = getMessagesController().getInputChannel(-messageObject.getDialogId());
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new ri0(this, 0), null, null, 0, this.f45695a.stats_dc, 1, true);
    }

    public final void f0(View view) {
        if (view instanceof org.telegram.ui.Cells.f5) {
            org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23749y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23541n6, getResourceProvider());
            f5Var.O = true;
            f5Var.H = w02;
            f5Var.I = w03;
            f5Var.d(0);
        } else if (view instanceof i91) {
            ((i91) view).d();
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, view, getResourceProvider());
        } else {
            boolean z10 = view instanceof org.telegram.ui.Cells.f7;
            if (z10 && (view.getBackground() instanceof org.telegram.ui.Components.ar) && (((org.telegram.ui.Components.ar) view.getBackground()).f26639a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.ar) view.getBackground()).f26639a).setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23300a7, getResourceProvider()));
                view.invalidate();
            } else if (z10) {
                org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23300a7, getResourceProvider())), org.telegram.ui.ActionBar.y6.X0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.y6.f23319b7), 0, 0);
                arVar.f26646w = true;
                view.setBackground(arVar);
            } else if (view instanceof mg.c) {
                ((mg.c) view).a();
            } else if (view instanceof wi0) {
                int i10 = wi0.d;
                ((wi0) view).a();
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.i3) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, view, getResourceProvider());
        }
    }

    public final void g0() {
        MessageObject messageObject = this.f45704n;
        if (messageObject.isStory()) {
            this.f45698b0.setTitle(LocaleController.getString(R.string.StoryStatistics));
            ti0 ti0Var = this.f45698b0;
            if (ti0Var.getSubtitleTextView() != null) {
                ti0Var.getSubtitleTextView().setVisibility(8);
            }
            ti0 ti0Var2 = this.f45698b0;
            ti0Var2.f31651b = true;
            ti0Var2.setStoriesForceState(1);
            ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
            if (arrayList != null) {
                this.f45698b0.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.f45704n);
                this.f45698b0.setClipChildren(false);
                this.f45698b0.getAvatarImageView().setScaleX(0.96f);
                this.f45698b0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f45698b0.setTitle(LocaleController.getString(R.string.PostStatistics));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f45697b));
        if (chat != null && !this.Y) {
            this.f45698b0.setChatAvatar(chat);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.b6 b6Var;
        ArrayList arrayList = new ArrayList();
        j6 j6Var = new j6(14, this);
        ti0 ti0Var = this.f45698b0;
        View view = null;
        if (ti0Var != null) {
            b6Var = ti0Var.getTitleTextView();
        } else {
            b6Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(b6Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Oi));
        ti0 ti0Var2 = this.f45698b0;
        if (ti0Var2 != null) {
            view = ti0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(org.telegram.ui.ActionBar.y6.Pi, view));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45703f, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23749y6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45703f, 0, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23541n6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.F8));
        y91.j0(this.f45705r, arrayList, j6Var);
        y91.j0(this.f45706s, arrayList, j6Var);
        return arrayList;
    }

    public final void h0() {
        TLRPC.ChatFull chatFull;
        if (this.f45701d0 && (chatFull = this.f45695a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
            ArrayList arrayList = l4.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            l4.removeAllViews();
            l4.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
        }
    }

    public final void i0() {
        a0.g gVar = this.R;
        gVar.clear();
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.O = -1;
        this.N = -1;
        this.Q = 0;
        if (this.F && this.f45709y) {
            AndroidUtilities.cancelRunOnUIThread(this.Z);
            if (this.f45696a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new k50(this, 4));
                this.f45696a0.setVisibility(0);
                this.f45696a0.setAlpha(0.0f);
                this.f45696a0.animate().alpha(1.0f).start();
            }
            int i10 = this.Q;
            this.O = i10;
            this.N = i10 + 1;
            this.Q = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f45705r != null) {
                int i11 = this.Q;
                this.L = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f45706s != null) {
                int i12 = this.Q;
                this.M = i12;
                this.Q = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f45708x;
            if (!arrayList.isEmpty()) {
                int i13 = this.Q;
                int i14 = i13 + 1;
                this.Q = i14;
                this.H = i13;
                this.I = i14;
                int size = arrayList.size() + i14;
                this.J = size;
                this.P = size;
                this.Q = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.V) {
                    int i15 = this.Q;
                    this.Q = i15 + 1;
                    this.K = i15;
                }
            }
        }
        vi0 vi0Var = this.d;
        if (vi0Var != null) {
            vi0Var.l();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f45695a != null) {
            e0();
            d0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.f45697b, this.classGuid, true);
        }
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatInfoDidLoad);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        vi0 vi0Var = this.d;
        if (vi0Var != null) {
            vi0Var.l();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ti0 ti0Var = this.f45698b0;
            if (ti0Var != null) {
                ti0Var.i(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oi, getResourceProvider()), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Pi, getResourceProvider()));
            }
            b0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public xi0(MessageObject messageObject, boolean z10, long j10) {
        super(null);
        this.v = new LruCache(15);
        this.f45708x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new y5(this, 11);
        this.f45704n = messageObject;
        this.f45699c = 0;
        this.f45697b = j10;
        this.f45695a = getMessagesController().getChatFull(j10);
        this.f45701d0 = z10;
    }
}
