package th;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.mx0;
public final class n5 implements k7 {
    public final uk0 f49273a;
    public final mx0 f49274b;
    public final int[] f49275c;
    public final boolean d;
    public m5 e;
    public boolean f49276f;
    public boolean h;
    public boolean f49277n;
    public boolean f49278r;
    public int f49279s;

    public n5(uk0 uk0Var, boolean z10) {
        this.f49275c = new int[2];
        this.f49273a = uk0Var;
        this.d = z10;
        this.f49274b = null;
    }

    public static n5 a(uk0 uk0Var) {
        return new n5(uk0Var, false);
    }

    public final void b(l7 l7Var) {
        View view = l7Var.f49201g;
        if (view == null) {
            return;
        }
        if (view instanceof l5) {
            int[] iArr = this.f49275c;
            ((l5) view).a(iArr);
            l7Var.h = iArr[0];
            l7Var.f49202i = iArr[1] - this.f49279s;
        } else if (view instanceof r9) {
            l7Var.h = ((r9) view).f29962e3;
            l7Var.f49202i = (view.getMeasuredHeight() - l7Var.f49201g.getPaddingBottom()) - this.f49279s;
        } else {
            l7Var.h = view.getPaddingTop();
            l7Var.f49202i = (l7Var.f49201g.getMeasuredHeight() - l7Var.f49201g.getPaddingBottom()) - this.f49279s;
        }
    }

    @Override
    public final void c(boolean z10) {
        m5 m5Var = this.e;
        if (m5Var != null) {
            m5Var.c(z10);
        }
    }

    @Override
    public final void d(long j10, int i10, i2 i2Var) {
        ArrayList arrayList;
        uk0 uk0Var = this.f49273a;
        if (uk0Var != null && (uk0Var.getParent() instanceof m)) {
            m mVar = (m) uk0Var.getParent();
            if (mVar.k(j10)) {
                mVar.f49212b0.add(i2Var);
                return;
            } else {
                i2Var.run();
                return;
            }
        }
        int i11 = 0;
        if (uk0Var != null && (uk0Var.getParent() instanceof y3)) {
            y3 y3Var = (y3) uk0Var.getParent();
            az azVar = y3Var.f49693y;
            u3 u3Var = y3Var.f49692x;
            if (u3Var != null && (arrayList = u3Var.f49527c) != null && azVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        q3 q3Var = (q3) arrayList.get(i11);
                        if (q3Var != null) {
                            TL_stories.StoryReaction storyReaction = q3Var.f49401c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.o5.o(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f20032id == i10) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    int L0 = azVar.L0();
                    int N0 = azVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        azVar.h1(i11, org.telegram.messenger.i0.L(60.0f));
                        uk0Var.post(i2Var);
                        return;
                    }
                }
            }
            i2Var.run();
            return;
        }
        if (this.d) {
            e5 O1 = wp.r1(e20.f15506s0).O1();
            ArrayList arrayList2 = O1.h;
            O1.v(arrayList2);
            Collections.sort(arrayList2, O1.J);
            at.f(O1.f48918a).k(at.f14805v5, new Object[0]);
        }
        i2Var.run();
    }

    @Override
    public final boolean v(long j10, int i10, int i11, int i12, l7 l7Var) {
        m mVar;
        ViewGroup viewGroup;
        boolean z10;
        i7 i7Var = null;
        l7Var.f49197a = null;
        l7Var.f49198b = null;
        l7Var.f49199c = null;
        l7Var.e = null;
        uk0 uk0Var = this.f49273a;
        if (uk0Var != null && (uk0Var.getParent() instanceof m)) {
            mVar = (m) uk0Var.getParent();
        } else {
            mVar = null;
        }
        if (mVar != null && !mVar.g()) {
            viewGroup = mVar.f49230r;
        } else {
            viewGroup = uk0Var;
        }
        ViewGroup viewGroup2 = this.f49274b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof l) {
                    l lVar = (l) childAt;
                    if (lVar.E == j10) {
                        l7Var.f49197a = childAt;
                        l7Var.f49198b = lVar.f49170r;
                        l7Var.f49206m = lVar.O;
                        l7Var.d = lVar.R;
                        m mVar2 = (m) lVar.getParent().getParent();
                        l7Var.f49201g = mVar2;
                        l7Var.f49202i = 0.0f;
                        l7Var.h = 0.0f;
                        l7Var.f49204k = 1.0f;
                        if (lVar.G && mVar2.g()) {
                            l7Var.f49200f = new rh.d0(new Path(), 15);
                            return true;
                        }
                        l7Var.f49200f = i7Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v2) {
                    org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                    ImageReceiver imageReceiver = v2Var.Y1;
                    org.telegram.ui.Cells.m2 m2Var = v2Var.f23274u0;
                    int i14 = (v2Var.getDialogId() > j10 ? 1 : (v2Var.getDialogId() == j10 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i14 == 0 && !z11) || (z11 && v2Var.V())) {
                        l7Var.f49197a = childAt;
                        l7Var.f49206m = m2Var;
                        l7Var.f49198b = imageReceiver;
                        l7Var.f49201g = (View) v2Var.getParent();
                        if (z11) {
                            l7Var.f49205l = imageReceiver;
                            boolean z12 = m2Var.f49497w;
                        }
                        l7Var.f49204k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().f1() == i10) {
                        l7Var.f49197a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            l7Var.f49199c = q1Var.R7;
                        } else {
                            l7Var.f49199c = q1Var.getPhotoImage();
                        }
                        l7Var.f49201g = (View) q1Var.getParent();
                        l7Var.f49204k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                    if (s0Var.getMessageObject().f1() == i10) {
                        l7Var.f49197a = childAt;
                        if (s0Var.getMessageObject().f16690k.media.storyItem.noforwards) {
                            l7Var.f49198b = s0Var.getPhotoImage();
                        } else {
                            l7Var.f49199c = s0Var.getPhotoImage();
                        }
                        l7Var.f49201g = (View) s0Var.getParent();
                        l7Var.f49204k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.s7) && uk0Var != null) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                    kj messageObject = s7Var.getMessageObject();
                    if ((s7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.x4() && messageObject.f1() == i11 && messageObject.f16694l.dialogId == j10)) {
                        ak0 fastScroll = uk0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        l7Var.f49197a = childAt;
                        l7Var.f49199c = s7Var.f23022c;
                        l7Var.e = new q5.a(s7Var, fastScroll, iArr, 6);
                        l7Var.f49201g = (View) s7Var.getParent();
                        l7Var.f49204k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof pa) {
                    pa paVar = (pa) childAt;
                    if (paVar.getDialogId() == j10) {
                        ag.d2 d2Var = paVar.f22469a;
                        l7Var.f49197a = d2Var;
                        l7Var.f49206m = paVar.T;
                        l7Var.f49198b = d2Var.getImageReceiver();
                        l7Var.f49201g = (View) paVar.getParent();
                        l7Var.f49204k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q6) {
                    org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) childAt;
                    g9 g9Var = q6Var.h;
                    if (q6Var.D != j10) {
                        continue;
                    } else {
                        if (g9Var != null && g9Var.getImageReceiver() != null && g9Var.getImageReceiver().S != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (q6Var.f22839n == i11 && z10) {
                            l7Var.f49197a = g9Var;
                            l7Var.f49199c = g9Var.getImageReceiver();
                            l7Var.f49201g = (View) q6Var.getParent();
                            float alphaInternal = q6Var.getAlphaInternal() * q6Var.getAlpha();
                            l7Var.f49204k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                l7Var.f49203j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, q6Var.getResourcesProvider()));
                            }
                            b(l7Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.p6 p6Var = q6Var.f22837c;
                            l7Var.f49197a = p6Var;
                            l7Var.f49206m = q6Var.E;
                            l7Var.f49198b = p6Var.getImageReceiver();
                            l7Var.f49201g = (View) q6Var.getParent();
                            float alphaInternal2 = q6Var.getAlphaInternal() * q6Var.getAlpha();
                            l7Var.f49204k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                l7Var.f49203j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, q6Var.getResourcesProvider()));
                            }
                            b(l7Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k6) {
                    org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                    if (k6Var.getDialogId() == j10) {
                        l7Var.f49197a = k6Var;
                        l7Var.f49206m = k6Var.f22147u0;
                        l7Var.f49198b = k6Var.f22142r;
                        l7Var.f49201g = (View) k6Var.getParent();
                        l7Var.f49204k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof a8) {
                    a8 a8Var = (a8) childAt;
                    if (a8Var.getPostInfo().b() == i11) {
                        l7Var.f49197a = a8Var.getImageView();
                        l7Var.f49206m = a8Var.getStoryAvatarParams();
                        l7Var.f49199c = a8Var.getImageView().getImageReceiver();
                        l7Var.f49201g = (View) a8Var.getParent();
                        l7Var.f49204k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.e5) {
                    org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) childAt;
                    if (e5Var.getStoryItem() != null && e5Var.getStoryItem().dialogId == j10 && e5Var.getStoryItem().messageId == i10) {
                        l7Var.f49197a = e5Var.getAvatarImageView();
                        l7Var.f49206m = e5Var.getStoryAvatarParams();
                        l7Var.f49198b = e5Var.getAvatarImageView().getImageReceiver();
                        l7Var.f49201g = (View) e5Var.getParent();
                        l7Var.f49204k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                i7Var = null;
            }
        }
        return false;
    }

    public n5(mx0 mx0Var) {
        this.f49275c = new int[2];
        this.f49274b = mx0Var;
        this.f49273a = null;
    }
}
