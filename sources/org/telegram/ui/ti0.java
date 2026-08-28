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
public class ti0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.pi0 O;
    public LinearLayout P;
    public int Q;
    public boolean R;
    public ImageReceiver S;
    public boolean T;
    public boolean U;
    public final v5 V;
    public FrameLayout W;
    public pi0 X;
    public qf.f Y;
    public final boolean Z;
    public TLRPC.ChatFull f43010a;
    public p91 f43011a0;
    public final long f43012b;
    public final int f43013c;
    public ri0 d;
    public org.telegram.ui.Components.yy f43014e;
    public org.telegram.ui.Components.wk0 f43015f;
    public f2.m0 h;
    public final MessageObject f43016n;
    public e91 f43017r;
    public e91 f43018s;
    public final LruCache v;
    public r91 f43019w;
    public final ArrayList f43020x;
    public boolean f43021y;

    public ti0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.f43020x = new ArrayList();
        this.C = null;
        this.N = new a0.g(0);
        this.V = new v5(this, 10);
        this.f43016n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.f43012b = messageObject.getChatId();
            this.f43013c = messageObject.getId();
        } else {
            this.f43012b = -messageObject.getFromChatId();
            this.f43013c = messageObject.messageOwner.fwd_msg_id;
        }
        this.f43010a = getMessagesController().getChatFull(this.f43012b);
    }

    public static void T(ti0 ti0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        ti0Var.f43021y = true;
        if (tL_error != null) {
            ti0Var.f0();
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
        ti0Var.f43017r = s91.e0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        ti0Var.f43018s = s91.e0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        e91 e91Var = ti0Var.f43017r;
        if (e91Var != null && e91Var.d.f47160a.length <= 5) {
            ti0Var.f43021y = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            e91 e91Var2 = ti0Var.f43017r;
            tL_loadAsyncGraph.token = e91Var2.f37874g;
            long[] jArr = e91Var2.d.f47160a;
            tL_loadAsyncGraph.f22611x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(ti0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(ti0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new y9(ti0Var, ti0Var.f43017r.f37874g + "_" + tL_loadAsyncGraph.f22611x, tL_loadAsyncGraph, 24), null, null, 0, ti0Var.f43010a.stats_dc, 1, true), ti0Var.classGuid);
            return;
        }
        ti0Var.f0();
    }

    public static void U(ti0 ti0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = ti0Var.f43020x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                ti0Var.C = tL_publicForwards.next_offset;
            } else {
                ti0Var.C = null;
            }
            int i9 = tL_publicForwards.count;
            if (i9 != 0) {
                ti0Var.Q = i9;
            } else if (ti0Var.Q == 0) {
                ti0Var.Q = tL_publicForwards.forwards.size();
            }
            if (ti0Var.C == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ti0Var.R = z10;
            ti0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            ti0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i10);
                i10++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f22617id;
                    MessageObject messageObject = new MessageObject(ti0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(ti0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.yy yyVar = ti0Var.f43014e;
            if (yyVar != null) {
                yyVar.c();
            }
        }
        ti0Var.B = true;
        ti0Var.A = false;
        ti0Var.f0();
    }

    public static void V(ti0 ti0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = ti0Var.f43020x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                ti0Var.C = tL_publicForwards.next_offset;
            } else {
                ti0Var.C = null;
            }
            int i9 = tL_publicForwards.count;
            if (i9 != 0) {
                ti0Var.Q = i9;
            } else if (ti0Var.Q == 0) {
                ti0Var.Q = tL_publicForwards.forwards.size();
            }
            if (ti0Var.C == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ti0Var.R = z10;
            ti0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            ti0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i10);
                i10++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f22617id;
                    MessageObject messageObject = new MessageObject(ti0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(ti0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.yy yyVar = ti0Var.f43014e;
            if (yyVar != null) {
                yyVar.c();
            }
        }
        ti0Var.B = true;
        ti0Var.A = false;
        ti0Var.f0();
    }

    public final boolean Z(MessageObject messageObject) {
        if (messageObject.isStory() && (messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.l0.p(R.string.StoryNotFound, org.telegram.ui.Components.oc.a0(this), R.raw.story_bomb1, 36);
            return true;
        }
        return false;
    }

    public final void a0() {
        if (this.A) {
            return;
        }
        this.A = true;
        ri0 ri0Var = this.d;
        if (ri0Var != null) {
            ri0Var.l();
        }
        MessageObject messageObject = this.f43016n;
        String str = "";
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f22610id = messageObject.storyItem.f22617id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.f43012b);
            String str2 = this.C;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new ni0(this, 1), null, null, 0, this.f43010a.stats_dc, 1, true), this.classGuid);
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
        String str3 = this.C;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new ni0(this, 2), null, null, 0, this.f43010a.stats_dc, 1, true), this.classGuid);
    }

    public final void b0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        MessageObject messageObject = this.f43016n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f22619id = messageObject.storyItem.f22617id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.f43012b);
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
        getConnectionsManager().sendRequest(tL_getMessageStats, new ni0(this, 0), null, null, 0, this.f43010a.stats_dc, 1, true);
    }

    public final void c0(View view) {
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).c(0);
        } else if (view instanceof c91) {
            ((c91) view).d();
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, getResourceProvider()));
        } else if (view instanceof org.telegram.ui.Cells.z6) {
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, getResourceProvider())), org.telegram.ui.ActionBar.f6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7), 0, 0);
            fqVar.f28550w = true;
            view.setBackground(fqVar);
        } else if (view instanceof sf.c) {
            ((sf.c) view).a();
        } else if (view instanceof si0) {
            int i9 = si0.d;
            ((si0) view).a();
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, getResourceProvider()));
        }
        if (view instanceof org.telegram.ui.Cells.l3) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, getResourceProvider()));
        }
    }

    @Override
    public final View createView(Context context) {
        int i9;
        int i10;
        float f10;
        CharSequence charSequence;
        String str;
        int i11;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        TLRPC.PhotoSize photoSize = null;
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.f43014e = yyVar;
        yyVar.setText(LocaleController.getString(R.string.NoResult));
        this.f43014e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.P = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.O = imageView;
        imageView.setAutoRepeat(true);
        this.O.f(R.raw.statistic_preload, 120, 120, null);
        this.O.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.f6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, getResourceProvider()));
        textView.setTag(Integer.valueOf(i12));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i13 = org.telegram.ui.ActionBar.f6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i13));
        org.telegram.messenger.ll.l(R.string.LoadingStatsDescription, textView2, 1);
        this.P.addView(this.O, g7.e6.t(120, 120, 1, 0, 0, 0, 20));
        this.P.addView(textView, g7.e6.t(-2, -2, 1, 0, 0, 0, 10));
        this.P.addView(textView2, g7.e6.q(-2, -2, 1));
        this.P.setAlpha(0.0f);
        frameLayout2.addView(this.P, g7.e6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, getResourceProvider());
        this.f43015f = wk0Var;
        wk0Var.p1();
        org.telegram.ui.Components.wk0 wk0Var2 = this.f43015f;
        f2.m0 m0Var = new f2.m0(1, false);
        this.h = m0Var;
        wk0Var2.setLayoutManager(m0Var);
        ((f2.t1) this.f43015f.getItemAnimator()).f5532m = false;
        org.telegram.ui.Components.wk0 wk0Var3 = this.f43015f;
        ri0 ri0Var = new ri0(this, context);
        this.d = ri0Var;
        wk0Var3.setAdapter(ri0Var);
        org.telegram.ui.Components.wk0 wk0Var4 = this.f43015f;
        if (LocaleController.isRTL) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        wk0Var4.setVerticalScrollbarPosition(i9);
        this.actionBar.setAdaptiveBackground(this.f43015f);
        this.f43015f.setOnItemClickListener(new i(this, 18));
        this.f43015f.setOnItemLongClickListener(new wt(this, 23));
        this.f43015f.setOnScrollListener(new l3(this, 20));
        this.f43014e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.W = frameLayout3;
        frameLayout3.addView(this.f43015f, g7.e6.c(-1.0f, -1));
        this.W.addView(this.f43014e, g7.e6.c(-1.0f, -1));
        this.W.setVisibility(8);
        frameLayout2.addView(this.W, g7.e6.c(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.V, 300L);
        f0();
        this.f43015f.setEmptyView(this.f43014e);
        this.X = new pi0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.S = imageReceiver;
        imageReceiver.setParentView(this.X);
        this.S.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.U = false;
        MessageObject messageObject = this.f43016n;
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
                        this.U = true;
                        this.T = messageObject.isVideo();
                        String attachFileName = FileLoader.getAttachFileName(photoSize);
                        if (!messageObject.mediaExists && !DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject) && !FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                            this.S.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.f43016n, 0);
                        } else {
                            if (messageObject.type == 1 && photoSize != null) {
                                i11 = photoSize.size;
                            } else {
                                i11 = 0;
                            }
                            this.S.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", i11, null, this.f43016n, 0);
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
                charSequence = Emoji.replaceEmoji(charSequence2, this.X.getSubtitlePaint().getFontMetricsInt(), false);
            } else {
                charSequence = messageObject.messageText;
            }
            if (!messageObject.isVideo() && !messageObject.isPhoto()) {
                this.X.setSubtitle(charSequence);
            } else {
                pi0 pi0Var = this.X;
                if (pi0Var.getSubtitleTextView() != null) {
                    pi0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.U && !messageObject.isStory()) {
            i10 = 56;
        } else {
            this.X.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i10 = 50;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        pi0 pi0Var2 = this.X;
        if (!this.inPreviewMode) {
            f10 = i10;
        } else {
            f10 = 0.0f;
        }
        kVar.addView(pi0Var2, 0, g7.e6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        d0();
        this.X.i(org.telegram.ui.ActionBar.f6.v0(i12, getResourceProvider()), org.telegram.ui.ActionBar.f6.v0(i13, getResourceProvider()));
        View subtitleTextView = this.X.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
            ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i13, getResourceProvider()));
        }
        this.actionBar.C(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, getResourceProvider()), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23388z8, getResourceProvider()), false);
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 4));
        this.X.setOnClickListener(new q50(this, 10));
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        MessageObject messageObject = this.f43016n;
        if (messageObject.isStory()) {
            this.X.setTitle(LocaleController.getString(R.string.StoryStatistics));
            pi0 pi0Var = this.X;
            if (pi0Var.getSubtitleTextView() != null) {
                pi0Var.getSubtitleTextView().setVisibility(8);
            }
            pi0 pi0Var2 = this.X;
            pi0Var2.f32726b = true;
            pi0Var2.setStoriesForceState(1);
            ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
            if (arrayList != null) {
                this.X.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.f43016n);
                this.X.setClipChildren(false);
                this.X.getAvatarImageView().setScaleX(0.96f);
                this.X.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.X.setTitle(LocaleController.getString(R.string.PostStatistics));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f43012b));
        if (chat != null && !this.U) {
            this.X.setChatAvatar(chat);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f43010a == null && chatFull.f22381id == this.f43012b) {
                d0();
                this.f43010a = chatFull;
                b0();
                a0();
                e0();
            }
        }
    }

    public final void e0() {
        TLRPC.ChatFull chatFull;
        if (this.Z && (chatFull = this.f43010a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            ArrayList arrayList = n10.f24001e;
            if (arrayList != null) {
                arrayList.clear();
            }
            n10.removeAllViews();
            n10.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
        }
    }

    public final void f0() {
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
        if (this.B && this.f43021y) {
            AndroidUtilities.cancelRunOnUIThread(this.V);
            if (this.W.getVisibility() == 8) {
                this.P.animate().alpha(0.0f).setListener(new bc0(this, 2));
                this.W.setVisibility(0);
                this.W.setAlpha(0.0f);
                this.W.animate().alpha(1.0f).start();
            }
            int i9 = this.M;
            this.K = i9;
            this.J = i9 + 1;
            this.M = i9 + 3;
            gVar.add(Integer.valueOf(i9 + 2));
            if (this.f43017r != null) {
                int i10 = this.M;
                this.H = i10;
                this.M = i10 + 2;
                gVar.add(Integer.valueOf(i10 + 1));
            }
            if (this.f43018s != null) {
                int i11 = this.M;
                this.I = i11;
                this.M = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            ArrayList arrayList = this.f43020x;
            if (!arrayList.isEmpty()) {
                int i12 = this.M;
                int i13 = i12 + 1;
                this.M = i13;
                this.D = i12;
                this.E = i13;
                int size = arrayList.size() + i13;
                this.F = size;
                this.L = size;
                this.M = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.R) {
                    int i14 = this.M;
                    this.M = i14 + 1;
                    this.G = i14;
                }
            }
        }
        ri0 ri0Var = this.d;
        if (ri0Var != null) {
            ri0Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.h5 h5Var;
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 25);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43015f, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        pi0 pi0Var = this.X;
        View view = null;
        if (pi0Var != null) {
            h5Var = pi0Var.getTitleTextView();
        } else {
            h5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(h5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.Oi));
        pi0 pi0Var2 = this.X;
        if (pi0Var2 != null) {
            view = pi0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.f6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43015f, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43015f, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43015f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43015f, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43015f, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43015f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43015f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43015f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f43015f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.f6.F8));
        s91.j0(this.f43017r, arrayList, eVar);
        s91.j0(this.f43018s, arrayList, eVar);
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f43010a != null) {
            b0();
            a0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.f43012b, this.classGuid, true);
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
        ri0 ri0Var = this.d;
        if (ri0Var != null) {
            ri0Var.l();
        }
    }

    public ti0(MessageObject messageObject, boolean z10, long j10) {
        super(null);
        this.v = new LruCache(15);
        this.f43020x = new ArrayList();
        this.C = null;
        this.N = new a0.g(0);
        this.V = new v5(this, 10);
        this.f43016n = messageObject;
        this.f43013c = 0;
        this.f43012b = j10;
        this.f43010a = getMessagesController().getChatFull(j10);
        this.Z = z10;
    }
}
