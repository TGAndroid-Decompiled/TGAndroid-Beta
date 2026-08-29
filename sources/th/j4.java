package th;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j70;
public final class j4 implements View.OnClickListener {
    public final int f48524a;
    public final m4 f48525b;

    public j4(m4 m4Var, int i10) {
        this.f48524a = i10;
        this.f48525b = m4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f48524a) {
            case 0:
                final m4 m4Var = this.f48525b;
                ArrayList arrayList = m4Var.A;
                int indexOf = arrayList.indexOf(view);
                if (m4Var.J != null && m4Var.f48892a != null) {
                    List m10 = m4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) m10.get(indexOf);
                        j70 q12 = m4Var.J.f48491a.f48638d3.q1((View) arrayList.get(indexOf));
                        boolean z10 = sVar.f48723n;
                        if (z10) {
                            i10 = R.drawable.msg_spoiler_off;
                        } else {
                            i10 = R.drawable.msg_spoiler;
                        }
                        if (z10) {
                            i11 = R.string.DisablePhotoSpoiler;
                        } else {
                            i11 = R.string.EnablePhotoSpoiler;
                        }
                        q12.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        m4 m4Var2 = m4Var;
                                        i3 i3Var = m4Var2.J;
                                        if (i3Var != null && (aVar3 = m4Var2.f48892a) != null) {
                                            p3 p3Var = i3Var.f48491a;
                                            p3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                b2 b2Var = p3Var.F3;
                                                if (b2Var != null) {
                                                    b2Var.d();
                                                }
                                                sVar2.f48723n = !sVar2.f48723n;
                                                TL_iv.PageBlock N3 = p3.N3(aVar3, sVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = sVar2.f48723n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = sVar2.f48723n;
                                                }
                                                p3Var.n4(aVar3);
                                                b2 b2Var2 = p3Var.F3;
                                                if (b2Var2 != null) {
                                                    b2Var2.h();
                                                }
                                                p3Var.f48638d3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        m4 m4Var3 = m4Var;
                                        i3 i3Var2 = m4Var3.J;
                                        if (i3Var2 != null && (aVar4 = m4Var3.f48892a) != null) {
                                            p3.N1(aVar4, sVar, i3Var2.f48491a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        q12.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        m4 m4Var2 = m4Var;
                                        i3 i3Var = m4Var2.J;
                                        if (i3Var != null && (aVar3 = m4Var2.f48892a) != null) {
                                            p3 p3Var = i3Var.f48491a;
                                            p3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                b2 b2Var = p3Var.F3;
                                                if (b2Var != null) {
                                                    b2Var.d();
                                                }
                                                sVar2.f48723n = !sVar2.f48723n;
                                                TL_iv.PageBlock N3 = p3.N3(aVar3, sVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = sVar2.f48723n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = sVar2.f48723n;
                                                }
                                                p3Var.n4(aVar3);
                                                b2 b2Var2 = p3Var.F3;
                                                if (b2Var2 != null) {
                                                    b2Var2.h();
                                                }
                                                p3Var.f48638d3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        m4 m4Var3 = m4Var;
                                        i3 i3Var2 = m4Var3.J;
                                        if (i3Var2 != null && (aVar4 = m4Var3.f48892a) != null) {
                                            p3.N1(aVar4, sVar, i3Var2.f48491a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        q12.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (m4Var.D) {
                            q12.f29602u = false;
                            q12.v = true;
                            q12.f29600s = 0;
                        }
                        q12.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m4 m4Var2 = this.f48525b;
                i3 i3Var = m4Var2.J;
                if (i3Var != null && (aVar = m4Var2.f48892a) != null) {
                    p3 p3Var = i3Var.f48491a;
                    p3Var.X3 = aVar;
                    p3Var.f48638d3.W(0);
                    return;
                }
                return;
            default:
                m4 m4Var3 = this.f48525b;
                i3 i3Var2 = m4Var3.J;
                if (i3Var2 != null && (aVar2 = m4Var3.f48892a) != null) {
                    p3 p3Var2 = i3Var2.f48491a;
                    p3Var2.getClass();
                    if (p3.B3(aVar2.f48328b)) {
                        b2 b2Var = p3Var2.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> g32 = p3.g3(aVar2.f48328b);
                        TL_iv.PageBlock pageBlock = aVar2.f48328b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (g32 == null) {
                                g32 = new ArrayList<>();
                            }
                            pageblockcollage.items = g32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (g32 == null) {
                                g32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = g32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.f48328b = pageblockslideshow;
                        b2 b2Var2 = p3Var2.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        View z12 = p3Var2.z1(aVar2);
                        if (z12 instanceof m4) {
                            m4 m4Var4 = (m4) z12;
                            ValueAnimator valueAnimator = m4Var4.f48577e0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                m4Var4.f48577e0 = null;
                            }
                            if (m4Var4.getParent() != null) {
                                m4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = m4Var4.f48576d0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                m4Var4.f48576d0 = null;
                            }
                            m4Var4.S = 0;
                            m4Var4.T = 0.0f;
                            m4Var4.o(true);
                            m4Var4.requestLayout();
                            m4Var4.invalidate();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
