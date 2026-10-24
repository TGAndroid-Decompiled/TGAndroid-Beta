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
public class xi0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.ak0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final z5 Z;
    public TLRPC.ChatFull f43614a;
    public FrameLayout f43615a0;
    public final long f43616b;
    public ti0 f43617b0;
    public final int f43618c;
    public jg.f f43619c0;
    public vi0 d;
    public final boolean f43620d0;
    public org.telegram.ui.Components.tz e;
    public q91 f43621e0;
    public org.telegram.ui.Components.lm0 f43622f;
    public s4.b0 h;
    public final MessageObject f43623n;
    public f91 f43624r;
    public f91 f43625s;
    public final LruCache v;
    public s91 f43626w;
    public final ArrayList f43627x;
    public boolean f43628y;

    public xi0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.f43627x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new z5(this, 11);
        this.f43623n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.f43616b = messageObject.getChatId();
            this.f43618c = messageObject.getId();
        } else {
            this.f43616b = -messageObject.getFromChatId();
            this.f43618c = messageObject.messageOwner.fwd_msg_id;
        }
        this.f43614a = getMessagesController().getChatFull(this.f43616b);
    }

    public static void U(xi0 xi0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        xi0Var.f43628y = true;
        if (tL_error != null) {
            xi0Var.h0();
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
        xi0Var.f43624r = t91.f0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        xi0Var.f43625s = t91.f0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        f91 f91Var = xi0Var.f43624r;
        if (f91Var != null && f91Var.d.f15098a.length <= 5) {
            xi0Var.f43628y = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            f91 f91Var2 = xi0Var.f43624r;
            tL_loadAsyncGraph.token = f91Var2.f37247g;
            long[] jArr = f91Var2.d.f15098a;
            tL_loadAsyncGraph.f20572x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(xi0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(xi0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new ca(xi0Var, xi0Var.f43624r.f37247g + "_" + tL_loadAsyncGraph.f20572x, tL_loadAsyncGraph, 24), null, null, 0, xi0Var.f43614a.stats_dc, 1, true), xi0Var.classGuid);
            return;
        }
        xi0Var.h0();
    }

    public static void V(xi0 xi0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = xi0Var.f43627x;
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
                    storyItem.messageId = storyItem.f20578id;
                    MessageObject messageObject = new MessageObject(xi0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(xi0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.tz tzVar = xi0Var.e;
            if (tzVar != null) {
                tzVar.c();
            }
        }
        xi0Var.F = true;
        xi0Var.E = false;
        xi0Var.h0();
    }

    public static void W(xi0 xi0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = xi0Var.f43627x;
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
                    storyItem.messageId = storyItem.f20578id;
                    MessageObject messageObject = new MessageObject(xi0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(xi0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.tz tzVar = xi0Var.e;
            if (tzVar != null) {
                tzVar.c();
            }
        }
        xi0Var.F = true;
        xi0Var.E = false;
        xi0Var.h0();
    }

    public final void a0() {
        View subtitleTextView;
        org.telegram.ui.Components.lm0 lm0Var = this.f43622f;
        if (lm0Var != null) {
            int childCount = lm0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                e0(this.f43622f.getChildAt(i10));
            }
            int hiddenChildCount = this.f43622f.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                e0(this.f43622f.V(i11));
            }
            int cachedChildCount = this.f43622f.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                e0(this.f43622f.P(i12));
            }
            int attachedScrapChildCount = this.f43622f.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                e0(this.f43622f.O(i13));
            }
            this.f43622f.getRecycledViewPool().a();
        }
        jg.f fVar = this.f43619c0;
        if (fVar != null) {
            fVar.f14474g = true;
        }
        ti0 ti0Var = this.f43617b0;
        if (ti0Var == null) {
            subtitleTextView = null;
        } else {
            subtitleTextView = ti0Var.getSubtitleTextView();
        }
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.n5) {
            ((org.telegram.ui.ActionBar.n5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pi, getResourceProvider()));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.rj));
    }

    public final boolean b0(MessageObject messageObject) {
        if (messageObject.isStory() && (messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.v0.p(R.string.StoryNotFound, org.telegram.ui.Components.vc.a0(this), R.raw.story_bomb1, 36);
            return true;
        }
        return false;
    }

    public final void c0() {
        if (this.E) {
            return;
        }
        this.E = true;
        vi0 vi0Var = this.d;
        if (vi0Var != null) {
            vi0Var.l();
        }
        MessageObject messageObject = this.f43623n;
        String str = "";
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f20571id = messageObject.storyItem.f20578id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.f43616b);
            String str2 = this.G;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new ri0(this, 1), null, null, 0, this.f43614a.stats_dc, 1, true), this.classGuid);
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
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new ri0(this, 2), null, null, 0, this.f43614a.stats_dc, 1, true), this.classGuid);
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
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, getResourceProvider());
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        TLRPC.PhotoSize photoSize = null;
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.e = tzVar;
        tzVar.setText(LocaleController.getString(R.string.NoResult));
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
        int i13 = org.telegram.ui.ActionBar.k6.Oi;
        org.telegram.ui.ActionBar.r6.W(textView, i13, getResourceProvider());
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Pi;
        org.telegram.ui.ActionBar.r6.W(textView2, i14, getResourceProvider());
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.tl.m(R.string.LoadingStatsDescription, textView2, 1);
        this.T.addView(this.S, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        this.T.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        this.T.addView(textView2, w7.z5.q(-2, -2, 1));
        float f7 = 0.0f;
        this.T.setAlpha(0.0f);
        frameLayout2.addView(this.T, w7.z5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, getResourceProvider());
        this.f43622f = lm0Var;
        lm0Var.t1();
        org.telegram.ui.Components.lm0 lm0Var2 = this.f43622f;
        s4.b0 b0Var = new s4.b0(1, false);
        this.h = b0Var;
        lm0Var2.setLayoutManager(b0Var);
        ((s4.e1) this.f43622f.getItemAnimator()).f46376m = false;
        org.telegram.ui.Components.lm0 lm0Var3 = this.f43622f;
        vi0 vi0Var = new vi0(this, context);
        this.d = vi0Var;
        lm0Var3.setAdapter(vi0Var);
        org.telegram.ui.Components.lm0 lm0Var4 = this.f43622f;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        lm0Var4.setVerticalScrollbarPosition(i10);
        this.actionBar.setAdaptiveBackground(this.f43622f);
        this.f43622f.setOnItemClickListener(new h(this, 19));
        this.f43622f.setOnItemLongClickListener(new xt(this, 22));
        this.f43622f.setOnScrollListener(new j3(this, 20));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f43615a0 = frameLayout3;
        frameLayout3.addView(this.f43622f, w7.z5.c(-1.0f, -1));
        this.f43615a0.addView(this.e, w7.z5.c(-1.0f, -1));
        this.f43615a0.setVisibility(8);
        frameLayout2.addView(this.f43615a0, w7.z5.c(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.Z, 300L);
        h0();
        this.f43622f.setEmptyView(this.e);
        this.f43617b0 = new ti0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.W = imageReceiver;
        imageReceiver.setParentView(this.f43617b0);
        this.W.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.Y = false;
        MessageObject messageObject = this.f43623n;
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
                            this.W.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.f43623n, 0);
                        } else {
                            if (messageObject.type == 1 && photoSize != null) {
                                i12 = photoSize.size;
                            } else {
                                i12 = 0;
                            }
                            this.W.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", i12, null, this.f43623n, 0);
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
                charSequence = Emoji.replaceEmoji(charSequence2, this.f43617b0.getSubtitlePaint().getFontMetricsInt(), false);
            } else {
                charSequence = messageObject.messageText;
            }
            if (!messageObject.isVideo() && !messageObject.isPhoto()) {
                this.f43617b0.setSubtitle(charSequence);
            } else {
                ti0 ti0Var = this.f43617b0;
                if (ti0Var.getSubtitleTextView() != null) {
                    ti0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.Y && !messageObject.isStory()) {
            i11 = 56;
        } else {
            this.f43617b0.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i11 = 50;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        ti0 ti0Var2 = this.f43617b0;
        if (!this.inPreviewMode) {
            f7 = i11;
        }
        kVar.addView(ti0Var2, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        f0();
        this.f43617b0.i(org.telegram.ui.ActionBar.k6.w0(i13, getResourceProvider()), org.telegram.ui.ActionBar.k6.w0(i14, getResourceProvider()));
        View subtitleTextView = this.f43617b0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.n5) {
            ((org.telegram.ui.ActionBar.n5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i14, getResourceProvider()));
        }
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21591z8, getResourceProvider());
        i2.o1.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 12));
        this.f43617b0.setOnClickListener(new w50(this, 10));
        g0();
        return this.fragmentView;
    }

    public final void d0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        MessageObject messageObject = this.f43623n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f20580id = messageObject.storyItem.f20578id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.f43616b);
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
        getConnectionsManager().sendRequest(tL_getMessageStats, new ri0(this, 0), null, null, 0, this.f43614a.stats_dc, 1, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f43614a == null && chatFull.f20345id == this.f43616b) {
                f0();
                this.f43614a = chatFull;
                d0();
                c0();
                g0();
            }
        }
    }

    public final void e0(View view) {
        if (view instanceof org.telegram.ui.Cells.a5) {
            org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21572y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21367n6, getResourceProvider());
            a5Var.O = true;
            a5Var.H = w02;
            a5Var.I = w03;
            a5Var.d(0);
        } else if (view instanceof d91) {
            ((d91) view).d();
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, view, getResourceProvider());
        } else {
            boolean z10 = view instanceof org.telegram.ui.Cells.b7;
            if (z10 && (view.getBackground() instanceof org.telegram.ui.Components.wq) && (((org.telegram.ui.Components.wq) view.getBackground()).f32322a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.wq) view.getBackground()).f32322a).setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21126a7, getResourceProvider()));
                view.invalidate();
            } else if (z10) {
                org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21126a7, getResourceProvider())), org.telegram.ui.ActionBar.k6.X0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21146b7), 0, 0);
                wqVar.f32329w = true;
                view.setBackground(wqVar);
            } else if (view instanceof lg.c) {
                ((lg.c) view).a();
            } else if (view instanceof wi0) {
                int i10 = wi0.d;
                ((wi0) view).a();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.j3) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, view, getResourceProvider());
        }
    }

    public final void f0() {
        MessageObject messageObject = this.f43623n;
        if (messageObject.isStory()) {
            this.f43617b0.setTitle(LocaleController.getString(R.string.StoryStatistics));
            ti0 ti0Var = this.f43617b0;
            if (ti0Var.getSubtitleTextView() != null) {
                ti0Var.getSubtitleTextView().setVisibility(8);
            }
            ti0 ti0Var2 = this.f43617b0;
            ti0Var2.f28632b = true;
            ti0Var2.setStoriesForceState(1);
            ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
            if (arrayList != null) {
                this.f43617b0.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.f43623n);
                this.f43617b0.setClipChildren(false);
                this.f43617b0.getAvatarImageView().setScaleX(0.96f);
                this.f43617b0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f43617b0.setTitle(LocaleController.getString(R.string.PostStatistics));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f43616b));
        if (chat != null && !this.Y) {
            this.f43617b0.setChatAvatar(chat);
        }
    }

    public final void g0() {
        TLRPC.ChatFull chatFull;
        if (this.f43620d0 && (chatFull = this.f43614a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
            ArrayList arrayList = m10.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            m10.removeAllViews();
            m10.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.n5 n5Var;
        ArrayList arrayList = new ArrayList();
        i6 i6Var = new i6(14, this);
        ti0 ti0Var = this.f43617b0;
        View view = null;
        if (ti0Var != null) {
            n5Var = ti0Var.getTitleTextView();
        } else {
            n5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(n5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        ti0 ti0Var2 = this.f43617b0;
        if (ti0Var2 != null) {
            view = ti0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(org.telegram.ui.ActionBar.k6.Pi, view));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43622f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21572y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43622f, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21367n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        t91.k0(this.f43624r, arrayList, i6Var);
        t91.k0(this.f43625s, arrayList, i6Var);
        return arrayList;
    }

    public final void h0() {
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
        if (this.F && this.f43628y) {
            AndroidUtilities.cancelRunOnUIThread(this.Z);
            if (this.f43615a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new v70(this, 3));
                this.f43615a0.setVisibility(0);
                this.f43615a0.setAlpha(0.0f);
                this.f43615a0.animate().alpha(1.0f).start();
            }
            int i10 = this.Q;
            this.O = i10;
            this.N = i10 + 1;
            this.Q = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f43624r != null) {
                int i11 = this.Q;
                this.L = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f43625s != null) {
                int i12 = this.Q;
                this.M = i12;
                this.Q = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f43627x;
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
        if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f43614a != null) {
            d0();
            c0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.f43616b, this.classGuid, true);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
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
            ti0 ti0Var = this.f43617b0;
            if (ti0Var != null) {
                ti0Var.i(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oi, getResourceProvider()), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Pi, getResourceProvider()));
            }
            a0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public xi0(MessageObject messageObject, boolean z10, long j10) {
        super(null);
        this.v = new LruCache(15);
        this.f43627x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new z5(this, 11);
        this.f43623n = messageObject;
        this.f43618c = 0;
        this.f43616b = j10;
        this.f43614a = getMessagesController().getChatFull(j10);
        this.f43620d0 = z10;
    }
}
