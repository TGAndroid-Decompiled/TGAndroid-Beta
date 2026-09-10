package zh;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public class x5 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public xc H;
    public org.telegram.ui.ActionBar.f6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public yg.q Q;
    public View R;
    public int f49050c;
    public TL_stories.StoryItem d;
    public boolean f49056l;
    public boolean f49057m;
    public int f49058n;
    public boolean f49059o;
    public boolean f49060p;
    public int f49061q;
    public boolean f49062r;
    public long f49063s;
    public float f49064t;
    public boolean v;
    public boolean f49066w;
    public long f49067x;
    public int f49068y;
    public int f49069z;
    public boolean f49048a = true;
    public boolean f49049b = true;
    public float e = 1.0f;
    public float f49051f = 0.0f;
    public float f49052g = 0.0f;
    public float h = 0.0f;
    public float f49053i = 0.0f;
    public float f49054j = 0.0f;
    public boolean f49055k = true;
    public float f49065u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public x5(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.E = z10;
        this.J = f6Var;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        i5 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.f49067x > 0) {
                    user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(this.f49067x));
                } else {
                    user = null;
                    chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-this.f49067x));
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.f49062r) {
                    z10 = !storiesController.h.isEmpty();
                } else {
                    if (this.f49067x <= 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f49067x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(this.f49067x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.f49067x != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && z10) {
                    xc xcVar = this.H;
                    if (xcVar == null) {
                        this.H = new xc(view, 1.5f, 5.0f);
                    } else {
                        xcVar.f29003a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        yg.q qVar = this.Q;
                        if (qVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(qVar);
                        }
                        yg.q qVar2 = new yg.q(29, this, view);
                        this.Q = qVar2;
                        AndroidUtilities.runOnUIThread(qVar2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > AndroidUtilities.touchSlop || Math.abs(this.P - motionEvent.getY()) > AndroidUtilities.touchSlop) {
                xc xcVar2 = this.H;
                if (xcVar2 != null) {
                    xcVar2.f29003a = view;
                    xcVar2.c(false);
                }
                yg.q qVar3 = this.Q;
                if (qVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(qVar3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            xc xcVar3 = this.H;
            if (xcVar3 != null) {
                xcVar3.f29003a = view;
                xcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.f49067x)) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                i5 storiesController2 = messagesController.getStoriesController();
                if (this.f49062r) {
                    f(0L);
                } else if (this.f49067x != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    if (storiesController2.I(this.f49067x)) {
                        f(this.f49067x);
                    } else {
                        long j3 = this.f49067x;
                        if (j3 > 0) {
                            TLRPC.User user2 = messagesController.getUser(Long.valueOf(j3));
                            if (user2 != null && !user2.stories_unavailable && (tL_recentStory2 = user2.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new z5().a(this.f49067x, view, this);
                            }
                        } else {
                            TLRPC.Chat chat2 = messagesController.getChat(Long.valueOf(-j3));
                            if (chat2 != null && !chat2.stories_unavailable && (tL_recentStory = chat2.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new z5().a(this.f49067x, view, this);
                            }
                        }
                    }
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.N = false;
            yg.q qVar4 = this.Q;
            if (qVar4 != null) {
                AndroidUtilities.cancelRunOnUIThread(qVar4);
            }
        }
        return this.N;
    }

    public final float b() {
        xc xcVar = this.H;
        if (xcVar == null) {
            return 1.0f;
        }
        return xcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j3) {
        return false;
    }

    public void f(long j3) {
        s5 s5Var;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R != null && this.R != null) {
            R.getOrCreateStoryViewer().getClass();
            ViewParent parent = this.R.getParent();
            if (parent instanceof RecyclerView) {
                s5Var = s5.a((vl0) parent);
            } else {
                s5Var = null;
            }
            R.getOrCreateStoryViewer().D(R.getContext(), j3, s5Var);
        }
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
