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
public class si0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.aj0 O;
    public LinearLayout P;
    public int Q;
    public boolean R;
    public ImageReceiver S;
    public boolean T;
    public boolean U;
    public final w5 V;
    public FrameLayout W;
    public oi0 X;
    public tf.f Y;
    public final boolean Z;
    public TLRPC.ChatFull f42401a;
    public q91 f42402a0;
    public final long f42403b;
    public final int f42404c;
    public qi0 d;
    public org.telegram.ui.Components.hz f42405e;
    public org.telegram.ui.Components.jl0 f42406f;
    public f2.j0 h;
    public final MessageObject f42407n;
    public f91 f42408r;
    public f91 f42409s;
    public final LruCache v;
    public s91 f42410w;
    public final ArrayList f42411x;
    public boolean f42412y;

    public si0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.f42411x = new ArrayList();
        this.C = null;
        this.N = new a0.g(0);
        this.V = new w5(this, 10);
        this.f42407n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.f42403b = messageObject.getChatId();
            this.f42404c = messageObject.getId();
        } else {
            this.f42403b = -messageObject.getFromChatId();
            this.f42404c = messageObject.messageOwner.fwd_msg_id;
        }
        this.f42401a = getMessagesController().getChatFull(this.f42403b);
    }

    public static void U(si0 si0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        si0Var.f42412y = true;
        if (tL_error != null) {
            si0Var.g0();
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
        si0Var.f42408r = t91.f0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        si0Var.f42409s = t91.f0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        f91 f91Var = si0Var.f42408r;
        if (f91Var != null && f91Var.d.f49197a.length <= 5) {
            si0Var.f42412y = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            f91 f91Var2 = si0Var.f42408r;
            tL_loadAsyncGraph.token = f91Var2.f38074g;
            long[] jArr = f91Var2.d.f49197a;
            tL_loadAsyncGraph.f22623x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(si0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(si0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new x9(si0Var, si0Var.f42408r.f38074g + "_" + tL_loadAsyncGraph.f22623x, tL_loadAsyncGraph, 24), null, null, 0, si0Var.f42401a.stats_dc, 1, true), si0Var.classGuid);
            return;
        }
        si0Var.g0();
    }

    public static void V(si0 si0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = si0Var.f42411x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                si0Var.C = tL_publicForwards.next_offset;
            } else {
                si0Var.C = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                si0Var.Q = i10;
            } else if (si0Var.Q == 0) {
                si0Var.Q = tL_publicForwards.forwards.size();
            }
            if (si0Var.C == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            si0Var.R = z10;
            si0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            si0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f22629id;
                    MessageObject messageObject = new MessageObject(si0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(si0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.hz hzVar = si0Var.f42405e;
            if (hzVar != null) {
                hzVar.c();
            }
        }
        si0Var.B = true;
        si0Var.A = false;
        si0Var.g0();
    }

    public static void W(si0 si0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = si0Var.f42411x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                si0Var.C = tL_publicForwards.next_offset;
            } else {
                si0Var.C = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                si0Var.Q = i10;
            } else if (si0Var.Q == 0) {
                si0Var.Q = tL_publicForwards.forwards.size();
            }
            if (si0Var.C == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            si0Var.R = z10;
            si0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            si0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
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
                    storyItem.messageId = storyItem.f22629id;
                    MessageObject messageObject = new MessageObject(si0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(si0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.hz hzVar = si0Var.f42405e;
            if (hzVar != null) {
                hzVar.c();
            }
        }
        si0Var.B = true;
        si0Var.A = false;
        si0Var.g0();
    }

    public final boolean a0(MessageObject messageObject) {
        if (messageObject.isStory() && (messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            j7.l1.v(R.string.StoryNotFound, org.telegram.ui.Components.tc.a0(this), R.raw.story_bomb1, 36);
            return true;
        }
        return false;
    }

    public final void b0() {
        if (this.A) {
            return;
        }
        this.A = true;
        qi0 qi0Var = this.d;
        if (qi0Var != null) {
            qi0Var.l();
        }
        MessageObject messageObject = this.f42407n;
        String str = "";
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f22622id = messageObject.storyItem.f22629id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.f42403b);
            String str2 = this.C;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new mi0(this, 1), null, null, 0, this.f42401a.stats_dc, 1, true), this.classGuid);
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
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new mi0(this, 2), null, null, 0, this.f42401a.stats_dc, 1, true), this.classGuid);
    }

    public final void c0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        MessageObject messageObject = this.f42407n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f22631id = messageObject.storyItem.f22629id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.f42403b);
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
        getConnectionsManager().sendRequest(tL_getMessageStats, new mi0(this, 0), null, null, 0, this.f42401a.stats_dc, 1, true);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        float f9;
        CharSequence charSequence;
        String str;
        int i12;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        TLRPC.PhotoSize photoSize = null;
        org.telegram.ui.Components.hz hzVar = new org.telegram.ui.Components.hz(context, null);
        this.f42405e = hzVar;
        hzVar.setText(LocaleController.getString(R.string.NoResult));
        this.f42405e.setVisibility(8);
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
        int i13 = org.telegram.ui.ActionBar.g6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, getResourceProvider()));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.g6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i14));
        b.i(R.string.LoadingStatsDescription, textView2, 1);
        this.P.addView(this.O, i7.f6.t(120, 120, 1, 0, 0, 0, 20));
        this.P.addView(textView, i7.f6.t(-2, -2, 1, 0, 0, 0, 10));
        this.P.addView(textView2, i7.f6.q(-2, -2, 1));
        this.P.setAlpha(0.0f);
        frameLayout2.addView(this.P, i7.f6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, getResourceProvider());
        this.f42406f = jl0Var;
        jl0Var.p1();
        org.telegram.ui.Components.jl0 jl0Var2 = this.f42406f;
        f2.j0 j0Var = new f2.j0(1, false);
        this.h = j0Var;
        jl0Var2.setLayoutManager(j0Var);
        ((f2.q1) this.f42406f.getItemAnimator()).f6463m = false;
        org.telegram.ui.Components.jl0 jl0Var3 = this.f42406f;
        qi0 qi0Var = new qi0(this, context);
        this.d = qi0Var;
        jl0Var3.setAdapter(qi0Var);
        org.telegram.ui.Components.jl0 jl0Var4 = this.f42406f;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        jl0Var4.setVerticalScrollbarPosition(i10);
        this.actionBar.setAdaptiveBackground(this.f42406f);
        this.f42406f.setOnItemClickListener(new j(this, 18));
        this.f42406f.setOnItemLongClickListener(new xt(this, 23));
        this.f42406f.setOnScrollListener(new m3(this, 20));
        this.f42405e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.W = frameLayout3;
        frameLayout3.addView(this.f42406f, i7.f6.c(-1.0f, -1));
        this.W.addView(this.f42405e, i7.f6.c(-1.0f, -1));
        this.W.setVisibility(8);
        frameLayout2.addView(this.W, i7.f6.c(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.V, 300L);
        g0();
        this.f42406f.setEmptyView(this.f42405e);
        this.X = new oi0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.S = imageReceiver;
        imageReceiver.setParentView(this.X);
        this.S.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.U = false;
        MessageObject messageObject = this.f42407n;
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
                            this.S.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.f42407n, 0);
                        } else {
                            if (messageObject.type == 1 && photoSize != null) {
                                i12 = photoSize.size;
                            } else {
                                i12 = 0;
                            }
                            this.S.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", i12, null, this.f42407n, 0);
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
                oi0 oi0Var = this.X;
                if (oi0Var.getSubtitleTextView() != null) {
                    oi0Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.U && !messageObject.isStory()) {
            i11 = 56;
        } else {
            this.X.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i11 = 50;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        oi0 oi0Var2 = this.X;
        if (!this.inPreviewMode) {
            f9 = i11;
        } else {
            f9 = 0.0f;
        }
        lVar.addView(oi0Var2, 0, i7.f6.d(-2, -1.0f, 51, f9, 0.0f, 40.0f, 0.0f));
        e0();
        this.X.i(org.telegram.ui.ActionBar.g6.v0(i13, getResourceProvider()), org.telegram.ui.ActionBar.g6.v0(i14, getResourceProvider()));
        View subtitleTextView = this.X.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
            ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i14, getResourceProvider()));
        }
        this.actionBar.C(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, getResourceProvider()), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23452z8, getResourceProvider()), false);
        th.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 26));
        this.X.setOnClickListener(new t50(this, 10));
        f0();
        return this.fragmentView;
    }

    public final void d0(View view) {
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).c(0);
        } else if (view instanceof d91) {
            ((d91) view).d();
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, getResourceProvider()));
        } else if (view instanceof org.telegram.ui.Cells.x6) {
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, getResourceProvider())), org.telegram.ui.ActionBar.g6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7), 0, 0);
            jqVar.f29792w = true;
            view.setBackground(jqVar);
        } else if (view instanceof vf.c) {
            ((vf.c) view).a();
        } else if (view instanceof ri0) {
            int i10 = ri0.d;
            ((ri0) view).a();
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, getResourceProvider()));
        }
        if (view instanceof org.telegram.ui.Cells.i3) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, getResourceProvider()));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f42401a == null && chatFull.f22393id == this.f42403b) {
                e0();
                this.f42401a = chatFull;
                c0();
                b0();
                f0();
            }
        }
    }

    public final void e0() {
        MessageObject messageObject = this.f42407n;
        if (messageObject.isStory()) {
            this.X.setTitle(LocaleController.getString(R.string.StoryStatistics));
            oi0 oi0Var = this.X;
            if (oi0Var.getSubtitleTextView() != null) {
                oi0Var.getSubtitleTextView().setVisibility(8);
            }
            oi0 oi0Var2 = this.X;
            oi0Var2.f34785b = true;
            oi0Var2.setStoriesForceState(1);
            ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
            if (arrayList != null) {
                this.X.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.f42407n);
                this.X.setClipChildren(false);
                this.X.getAvatarImageView().setScaleX(0.96f);
                this.X.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.X.setTitle(LocaleController.getString(R.string.PostStatistics));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f42403b));
        if (chat != null && !this.U) {
            this.X.setChatAvatar(chat);
        }
    }

    public final void f0() {
        TLRPC.ChatFull chatFull;
        if (this.Z && (chatFull = this.f42401a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
            ArrayList arrayList = n10.f22721e;
            if (arrayList != null) {
                arrayList.clear();
            }
            n10.removeAllViews();
            n10.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
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
        if (this.B && this.f42412y) {
            AndroidUtilities.cancelRunOnUIThread(this.V);
            if (this.W.getVisibility() == 8) {
                this.P.animate().alpha(0.0f).setListener(new e50(this, 4));
                this.W.setVisibility(0);
                this.W.setAlpha(0.0f);
                this.W.animate().alpha(1.0f).start();
            }
            int i10 = this.M;
            this.K = i10;
            this.J = i10 + 1;
            this.M = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f42408r != null) {
                int i11 = this.M;
                this.H = i11;
                this.M = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f42409s != null) {
                int i12 = this.M;
                this.I = i12;
                this.M = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f42411x;
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
        qi0 qi0Var = this.d;
        if (qi0Var != null) {
            qi0Var.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.h5 h5Var;
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 25);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42406f, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.z4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        oi0 oi0Var = this.X;
        View view = null;
        if (oi0Var != null) {
            h5Var = oi0Var.getTitleTextView();
        } else {
            h5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(h5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Oi));
        oi0 oi0Var2 = this.X;
        if (oi0Var2 != null) {
            view = oi0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42406f, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42406f, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42406f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42406f, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42406f, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42406f, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42406f, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42406f, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42406f, 0, new Class[]{org.telegram.ui.Cells.z4.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        t91.k0(this.f42408r, arrayList, fVar);
        t91.k0(this.f42409s, arrayList, fVar);
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f42401a != null) {
            c0();
            b0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.f42403b, this.classGuid, true);
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
        qi0 qi0Var = this.d;
        if (qi0Var != null) {
            qi0Var.l();
        }
    }

    public si0(MessageObject messageObject, boolean z10, long j10) {
        super(null);
        this.v = new LruCache(15);
        this.f42411x = new ArrayList();
        this.C = null;
        this.N = new a0.g(0);
        this.V = new w5(this, 10);
        this.f42407n = messageObject;
        this.f42404c = 0;
        this.f42403b = j10;
        this.f42401a = getMessagesController().getChatFull(j10);
        this.Z = z10;
    }
}
