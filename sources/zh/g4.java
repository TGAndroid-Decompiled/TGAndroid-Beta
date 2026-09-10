package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ld0;
public final class g4 extends FrameLayout {
    public final b4 E;
    public final ArrayList F;
    public final ArrayList G;
    public final m3 H;
    public float I;
    public final d4 f48440a;
    public float f48441b;
    public float f48442c;
    public float d;
    public final e4 e;
    public float f48443f;
    public final a4 h;
    public float f48444n;
    public final u7 f48445r;
    public final Drawable f48446s;
    public float v;
    public boolean f48447w;
    public int f48448x;
    public long f48449y;

    public g4(Context context, u7 u7Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new m3();
        b bVar = u7Var.f48972y;
        this.f48445r = u7Var;
        a4 a4Var = new a4(getContext(), this, u7Var);
        this.h = a4Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.f48446s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, bVar), PorterDuff.Mode.MULTIPLY));
        e4 e4Var = new e4(this, context);
        this.e = e4Var;
        b4 b4Var = new b4(this, context);
        this.E = b4Var;
        b4Var.b(new ld0(2, this));
        d4 d4Var = new d4(context, this, u7Var);
        this.f48440a = d4Var;
        b4Var.setAdapter(d4Var);
        e4Var.addView(b4Var, w7.a6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a4Var, w7.a6.c(-1.0f, -1));
        addView(e4Var);
        setVisibility(4);
    }

    public float getCurrentTopOffset() {
        float f7 = this.d;
        z3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.getTopOffset();
        }
        return f7;
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.f48449y = j3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ?? obj = new Object();
            obj.f48412a = (TL_stories.StoryItem) arrayList.get(i11);
            arrayList2.add(obj);
        }
        ArrayList E = MessagesController.getInstance(this.f48445r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                ?? obj2 = new Object();
                obj2.f48413b = (h5) E.get(i12);
                arrayList2.add(obj2);
            }
        }
        a4 a4Var = this.h;
        ArrayList arrayList3 = a4Var.G;
        ArrayList arrayList4 = a4Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        a4Var.d();
        if (a4Var.getMeasuredHeight() > 0) {
            a4Var.c(i10, false, false);
        } else {
            a4Var.f48437w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((f3) arrayList3.get(i13)).a(((f3) arrayList3.get(i13)).f48409b);
        }
        b4 b4Var = this.E;
        b4Var.setAdapter(null);
        d4 d4Var = this.f48440a;
        b4Var.setAdapter(d4Var);
        d4Var.g();
        b4Var.setCurrentItem(i10);
    }

    public f3 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public z3 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 < arrayList.size()) {
                if (((Integer) ((z3) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                    return (z3) arrayList.get(i10);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition >= 0) {
            ArrayList arrayList = this.F;
            if (closestPosition < arrayList.size()) {
                return ((f4) arrayList.get(closestPosition)).f48412a;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.f48445r.f48921b) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        a4 a4Var = this.h;
        ((FrameLayout.LayoutParams) a4Var.getLayoutParams()).topMargin = i12;
        this.f48444n = a4Var.getFinalHeight();
        this.f48441b = AndroidUtilities.dp(20.0f) + i12;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i12) + this.f48444n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.f48442c = size - dp;
        while (true) {
            ArrayList arrayList = this.G;
            if (i13 < arrayList.size()) {
                ((z3) arrayList.get(i13)).setListBottomPadding(this.d);
                i13++;
            } else {
                super.onMeasure(i10, i11);
                return;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        boolean z10;
        boolean z11;
        z3 currentPage;
        float f7;
        if (this.f48448x >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 >= AndroidUtilities.dp(20.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            float f10 = this.I;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            ofFloat.addUpdateListener(new qg.o(this, 25));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.f48448x = i10;
        if (i10 > 0 && (currentPage = getCurrentPage()) != null) {
            currentPage.f49142r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
            FrameLayout frameLayout = currentPage.f49139c;
            if (frameLayout.getTranslationY() != 0.0f) {
                currentPage.d.v((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.r1.f18592w);
            }
        }
    }

    public void setOffset(float f7) {
        int i10;
        int closestPosition;
        int i11;
        if (this.v != f7) {
            this.v = f7;
            this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
            float f10 = this.f48443f;
            float clamp = Utilities.clamp(f7 / this.f48442c, 1.0f, 0.0f);
            this.f48443f = clamp;
            Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
            u7 u7Var = this.f48445r;
            a3 t10 = u7Var.t();
            r7 r7Var = u7Var.f48959s0;
            a4 a4Var = this.h;
            if (f10 == 1.0f && this.f48443f != 1.0f) {
                if (u7Var.O0 != null) {
                    MessageObject messageObject = (MessageObject) u7Var.O0.f48240i.get(Utilities.clamp(a4Var.getClosestPosition(), u7Var.O0.f48240i.size() - 1, 0));
                    long b10 = a5.b(messageObject);
                    ImageReceiver imageReceiver = r7Var.f48843c;
                    if (imageReceiver != null) {
                        imageReceiver.setVisible(true, true);
                        r7Var.f48843c = null;
                    }
                    k7 k7Var = u7Var.f48947n0;
                    int i12 = messageObject.storyItem.f17435id;
                    u7 u7Var2 = k7Var.N0;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= k7Var.f48418x0.size()) {
                            break;
                        } else if (b10 == a5.b(u7Var2.O0.f(((Integer) ((ArrayList) k7Var.f48418x0.get(i13)).get(0)).intValue()))) {
                            if (u7Var2.R0) {
                                i11 = (k7Var.f48418x0.size() - 1) - i13;
                            } else {
                                i11 = i13;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < ((ArrayList) k7Var.f48418x0.get(i13)).size()) {
                                    if (((Integer) ((ArrayList) k7Var.f48418x0.get(i13)).get(i14)).intValue() == i12) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = 0;
                                    break;
                                }
                            }
                            if (k7Var.getCurrentPeerView() != null && k7Var.getCurrentItem() == i11) {
                                a3 currentPeerView = k7Var.getCurrentPeerView();
                                if (currentPeerView.J1 != i14) {
                                    currentPeerView.J1 = i14;
                                    currentPeerView.f1(false);
                                }
                            } else {
                                k7Var.x(i11, false);
                                a3 currentPeerView2 = k7Var.getCurrentPeerView();
                                if (currentPeerView2 != null) {
                                    e6 e6Var = (e6) currentPeerView2.getParent();
                                    e6Var.a(true);
                                    if (k7Var.f48418x0 != null) {
                                        a3 a3Var = e6Var.f48384a;
                                        long j3 = e6Var.f48385b;
                                        ArrayList arrayList = e6Var.f48386c;
                                        a3Var.B1 = j3;
                                        a3Var.f48232z1 = arrayList;
                                        a3Var.o0(i14);
                                    } else {
                                        e6Var.f48384a.U0(i14, e6Var.f48385b);
                                    }
                                }
                            }
                        } else {
                            i13++;
                        }
                    }
                } else if (t10 != null && t10.J1 != (closestPosition = a4Var.getClosestPosition())) {
                    t10.J1 = closestPosition;
                    t10.f1(false);
                }
                a4Var.d.abortAnimation();
                ValueAnimator valueAnimator = a4Var.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    a4Var.M = null;
                }
                a4Var.c(a4Var.K, false, true);
            }
            if (t10 != null) {
                h2 h2Var = t10.f48160c1;
                a4Var.f48430a = h2Var.getTop();
                a4Var.f48431b = h2Var.getMeasuredWidth();
                a4Var.f48432c = h2Var.getMeasuredHeight();
            }
            a4Var.setProgressToOpen(this.f48443f);
            b4 b4Var = this.E;
            if (b4Var.f48305w0 && this.f48443f != 1.0f) {
                b4Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            }
            if (this.f48443f == 0.0f) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            setVisibility(i10);
            if (this.f48443f != 1.0f) {
                b4Var.f48305w0 = false;
            }
        }
    }
}
