package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
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

public class vi0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public boolean B;
    public String C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final a0.g N;
    public org.telegram.ui.Components.ri0 O;
    public LinearLayout P;
    public int Q;
    public boolean R;
    public ImageReceiver S;
    public boolean T;
    public boolean U;
    public final w5 V;
    public FrameLayout W;
    public ri0 X;
    public rf.f Y;
    public final boolean Z;

    public TLRPC.ChatFull f43467a;

    public n91 f43468a0;

    public final long f43469b;

    public final int f43470c;
    public ti0 d;

    public org.telegram.ui.Components.az f43471e;

    public org.telegram.ui.Components.zk0 f43472f;
    public f2.k0 h;

    public final MessageObject f43473n;

    public c91 f43474r;

    public c91 f43475s;
    public final LruCache v;

    public p91 f43476w;

    public final ArrayList f43477x;

    public boolean f43478y;

    public vi0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.f43477x = new ArrayList();
        this.C = null;
        this.N = new a0.g(0);
        this.V = new w5(this, 10);
        this.f43473n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.f43469b = messageObject.getChatId();
            this.f43470c = messageObject.getId();
        } else {
            this.f43469b = -messageObject.getFromChatId();
            this.f43470c = messageObject.messageOwner.fwd_msg_id;
        }
        this.f43467a = getMessagesController().getChatFull(this.f43469b);
    }

    public static void U(vi0 vi0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        vi0Var.f43478y = true;
        if (tL_error != null) {
            vi0Var.g0();
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
        vi0Var.f43474r = q91.f0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        vi0Var.f43475s = q91.f0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        c91 c91Var = vi0Var.f43474r;
        if (c91Var == null || c91Var.d.f47881a.length > 5) {
            vi0Var.g0();
            return;
        }
        vi0Var.f43478y = false;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        c91 c91Var2 = vi0Var.f43474r;
        tL_loadAsyncGraph.token = c91Var2.f37026g;
        long[] jArr = c91Var2.d.f47881a;
        tL_loadAsyncGraph.f22611x = jArr[jArr.length - 1];
        tL_loadAsyncGraph.flags |= 1;
        ConnectionsManager.getInstance(vi0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(vi0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new z9(vi0Var, vi0Var.f43474r.f37026g + "_" + tL_loadAsyncGraph.f22611x, tL_loadAsyncGraph, 24), null, null, 0, vi0Var.f43467a.stats_dc, 1, true), vi0Var.classGuid);
    }

    public static void V(vi0 vi0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = vi0Var.f43477x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                vi0Var.C = tL_publicForwards.next_offset;
            } else {
                vi0Var.C = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                vi0Var.Q = i10;
            } else if (vi0Var.Q == 0) {
                vi0Var.Q = tL_publicForwards.forwards.size();
            }
            vi0Var.R = vi0Var.C == null;
            vi0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            vi0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f22617id;
                    MessageObject messageObject = new MessageObject(vi0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(vi0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.az azVar = vi0Var.f43471e;
            if (azVar != null) {
                azVar.c();
            }
        }
        vi0Var.B = true;
        vi0Var.A = false;
        vi0Var.g0();
    }

    public static void W(vi0 vi0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = vi0Var.f43477x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                vi0Var.C = tL_publicForwards.next_offset;
            } else {
                vi0Var.C = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                vi0Var.Q = i10;
            } else if (vi0Var.Q == 0) {
                vi0Var.Q = tL_publicForwards.forwards.size();
            }
            vi0Var.R = vi0Var.C == null;
            vi0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            vi0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f22617id;
                    MessageObject messageObject = new MessageObject(vi0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(vi0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.az azVar = vi0Var.f43471e;
            if (azVar != null) {
                azVar.c();
            }
        }
        vi0Var.B = true;
        vi0Var.A = false;
        vi0Var.g0();
    }

    public final boolean a0(MessageObject messageObject) {
        if (!messageObject.isStory() || !(messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            return false;
        }
        org.telegram.messenger.y1.q(R.string.StoryNotFound, org.telegram.ui.Components.mc.a0(this), R.raw.story_bomb1, 36);
        return true;
    }

    public final void b0() {
        if (this.A) {
            return;
        }
        this.A = true;
        ti0 ti0Var = this.d;
        if (ti0Var != null) {
            ti0Var.l();
        }
        MessageObject messageObject = this.f43473n;
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f22610id = messageObject.storyItem.f22617id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.f43469b);
            String str = this.C;
            tL_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new pi0(this, 1), null, null, 0, this.f43467a.stats_dc, 1, true), this.classGuid);
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
        String str2 = this.C;
        tL_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new pi0(this, 2), null, null, 0, this.f43467a.stats_dc, 1, true), this.classGuid);
    }

    public final void c0() {
        TLObject tLObject;
        MessageObject messageObject = this.f43473n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f22619id = messageObject.storyItem.f22617id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.f43469b);
            tLObject = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats.channel = getMessagesController().getInputChannel(-messageObject.getFromChatId());
                tLObject = tL_getMessageStats;
            } else {
                tL_getMessageStats.msg_id = messageObject.getId();
                tL_getMessageStats.channel = getMessagesController().getInputChannel(-messageObject.getDialogId());
                tLObject = tL_getMessageStats;
            }
        }
        getConnectionsManager().sendRequest(tLObject, new pi0(this, 0), null, null, 0, this.f43467a.stats_dc, 1, true);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        CharSequence charSequenceReplaceEmoji;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context, null);
        this.f43471e = azVar;
        azVar.setText(LocaleController.getString(R.string.NoResult));
        this.f43471e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.P = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.O = ri0Var;
        ri0Var.setAutoRepeat(true);
        this.O.f(R.raw.statistic_preload, 120, 120, null);
        this.O.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, getResourceProvider()));
        textView.setTag(Integer.valueOf(i11));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i12));
        org.telegram.messenger.rl.i(R.string.LoadingStatsDescription, textView2, 1);
        this.P.addView(this.O, h7.z5.t(120, 120, 1, 0, 0, 0, 20));
        this.P.addView(textView, h7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        this.P.addView(textView2, h7.z5.q(-2, -2, 1));
        this.P.setAlpha(0.0f);
        frameLayout2.addView(this.P, h7.z5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, getResourceProvider());
        this.f43472f = zk0Var;
        zk0Var.p1();
        org.telegram.ui.Components.zk0 zk0Var2 = this.f43472f;
        f2.k0 k0Var = new f2.k0(1, false);
        this.h = k0Var;
        zk0Var2.setLayoutManager(k0Var);
        ((f2.r1) this.f43472f.getItemAnimator()).f5819m = false;
        org.telegram.ui.Components.zk0 zk0Var3 = this.f43472f;
        ti0 ti0Var = new ti0(this, context);
        this.d = ti0Var;
        zk0Var3.setAdapter(ti0Var);
        this.f43472f.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.actionBar.setAdaptiveBackground(this.f43472f);
        this.f43472f.setOnItemClickListener(new i(this, 18));
        this.f43472f.setOnItemLongClickListener(new zt(this, 23));
        this.f43472f.setOnScrollListener(new m3(this, 20));
        this.f43471e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.W = frameLayout3;
        frameLayout3.addView(this.f43472f, h7.z5.c(-1.0f, -1));
        this.W.addView(this.f43471e, h7.z5.c(-1.0f, -1));
        this.W.setVisibility(8);
        frameLayout2.addView(this.W, h7.z5.c(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.V, 300L);
        g0();
        this.f43472f.setEmptyView(this.f43471e);
        this.X = new ri0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.S = imageReceiver;
        imageReceiver.setParentView(this.X);
        this.S.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.U = false;
        MessageObject messageObject = this.f43473n;
        if (!messageObject.isStory()) {
            if (!messageObject.needDrawBluredPreview() && (messageObject.isPhoto() || messageObject.isNewGif() || messageObject.isVideo())) {
                String str = messageObject.isWebpage() ? messageObject.messageOwner.media.webpage.type : null;
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null;
                    if (closestPhotoSizeWithSize != null) {
                        this.U = true;
                        this.T = messageObject.isVideo();
                        String attachFileName = FileLoader.getAttachFileName(photoSize);
                        if (messageObject.mediaExists || DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject) || FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                            this.S.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (messageObject.type != 1 || photoSize == null) ? 0 : photoSize.size, null, this.f43473n, 0);
                        } else {
                            this.S.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.f43473n, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequenceReplaceEmoji = messageObject.caption;
            } else if (TextUtils.isEmpty(messageObject.messageOwner.message)) {
                charSequenceReplaceEmoji = messageObject.messageText;
            } else {
                CharSequence charSequenceSubSequence = messageObject.messageText;
                if (charSequenceSubSequence.length() > 150) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, 150);
                }
                charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequenceSubSequence, this.X.getSubtitlePaint().getFontMetricsInt(), false);
            }
            if (messageObject.isVideo() || messageObject.isPhoto()) {
                ri0 ri0Var2 = this.X;
                if (ri0Var2.getSubtitleTextView() != null) {
                    ri0Var2.getSubtitleTextView().setVisibility(8);
                }
            } else {
                this.X.setSubtitle(charSequenceReplaceEmoji);
            }
        }
        if (this.U || messageObject.isStory()) {
            this.X.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i10 = 50;
        } else {
            i10 = 56;
        }
        this.actionBar.addView(this.X, 0, h7.z5.d(-2, -1.0f, 51, !this.inPreviewMode ? i10 : 0.0f, 0.0f, 40.0f, 0.0f));
        e0();
        this.X.i(org.telegram.ui.ActionBar.g6.v0(i11, getResourceProvider()), org.telegram.ui.ActionBar.g6.v0(i12, getResourceProvider()));
        View subtitleTextView = this.X.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
            ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, getResourceProvider()));
        }
        this.actionBar.D(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, getResourceProvider()), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23443z8, getResourceProvider()), false);
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 5));
        this.X.setOnClickListener(new u50(this, 10));
        f0();
        return this.fragmentView;
    }

    public final void d0(View view) {
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).c(0);
        } else if (view instanceof a91) {
            ((a91) view).d();
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, getResourceProvider()));
        } else if (view instanceof org.telegram.ui.Cells.w6) {
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, getResourceProvider())), org.telegram.ui.ActionBar.g6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7), 0, 0);
            dqVar.f27828w = true;
            view.setBackground(dqVar);
        } else if (view instanceof tf.c) {
            ((tf.c) view).a();
        } else if (view instanceof ui0) {
            int i10 = ui0.d;
            ((ui0) view).a();
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, getResourceProvider()));
        }
        if (view instanceof org.telegram.ui.Cells.i3) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, getResourceProvider()));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f43467a == null && chatFull.f22381id == this.f43469b) {
                e0();
                this.f43467a = chatFull;
                c0();
                b0();
                f0();
            }
        }
    }

    public final void e0() {
        MessageObject messageObject = this.f43473n;
        if (!messageObject.isStory()) {
            this.X.setTitle(LocaleController.getString(R.string.PostStatistics));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f43469b));
            if (chat == null || this.U) {
                return;
            }
            this.X.setChatAvatar(chat);
            return;
        }
        this.X.setTitle(LocaleController.getString(R.string.StoryStatistics));
        ri0 ri0Var = this.X;
        if (ri0Var.getSubtitleTextView() != null) {
            ri0Var.getSubtitleTextView().setVisibility(8);
        }
        ri0 ri0Var2 = this.X;
        ri0Var2.f32212b = true;
        ri0Var2.setStoriesForceState(1);
        ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
        if (arrayList != null) {
            this.X.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.f43473n);
            this.X.setClipChildren(false);
            this.X.getAvatarImageView().setScaleX(0.96f);
            this.X.getAvatarImageView().setScaleY(0.96f);
        }
    }

    public final void f0() {
        TLRPC.ChatFull chatFull;
        if (this.Z && (chatFull = this.f43467a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
            ArrayList arrayList = zVarN.f23986e;
            if (arrayList != null) {
                arrayList.clear();
            }
            zVarN.removeAllViews();
            zVarN.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
        }
    }

    public final void g0() {
        a0.g gVar = this.N;
        gVar.clear();
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.K = -1;
        this.J = -1;
        this.M = 0;
        if (this.B && this.f43478y) {
            AndroidUtilities.cancelRunOnUIThread(this.V);
            if (this.W.getVisibility() == 8) {
                this.P.animate().alpha(0.0f).setListener(new f50(this, 4));
                this.W.setVisibility(0);
                this.W.setAlpha(0.0f);
                this.W.animate().alpha(1.0f).start();
            }
            int i10 = this.M;
            this.K = i10;
            this.J = i10 + 1;
            this.M = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f43474r != null) {
                int i11 = this.M;
                this.H = i11;
                this.M = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f43475s != null) {
                int i12 = this.M;
                this.I = i12;
                this.M = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f43477x;
            if (!arrayList.isEmpty()) {
                int i13 = this.M;
                int i14 = i13 + 1;
                this.M = i14;
                this.D = i13;
                this.E = i14;
                int size = arrayList.size() + i14;
                this.F = size;
                this.L = size;
                this.M = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.R) {
                    int i15 = this.M;
                    this.M = i15 + 1;
                    this.G = i15;
                }
            }
        }
        ti0 ti0Var = this.d;
        if (ti0Var != null) {
            ti0Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 25);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43472f, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.y4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        ri0 ri0Var = this.X;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ri0Var != null ? ri0Var.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Oi));
        ri0 ri0Var2 = this.X;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ri0Var2 != null ? ri0Var2.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43472f, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43472f, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43472f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43472f, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43472f, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43472f, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43472f, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43472f, 0, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f23234n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43472f, 0, new Class[]{org.telegram.ui.Cells.y4.class}, null, org.telegram.ui.ActionBar.g6.f23295r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        q91.k0(this.f43474r, arrayList, eVar);
        q91.k0(this.f43475s, arrayList, eVar);
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, getResourceProvider())) > 0.699999988079071d;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f43467a != null) {
            c0();
            b0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.f43469b, this.classGuid, true);
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
        ti0 ti0Var = this.d;
        if (ti0Var != null) {
            ti0Var.l();
        }
    }

    public vi0(MessageObject messageObject, boolean z10, long j10) {
        super(null);
        this.v = new LruCache(15);
        this.f43477x = new ArrayList();
        this.C = null;
        this.N = new a0.g(0);
        this.V = new w5(this, 10);
        this.f43473n = messageObject;
        this.f43470c = 0;
        this.f43469b = j10;
        this.f43467a = getMessagesController().getChatFull(j10);
        this.Z = z10;
    }
}
