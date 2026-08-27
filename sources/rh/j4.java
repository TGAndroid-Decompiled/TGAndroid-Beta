package rh;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b70;

public final class j4 implements View.OnClickListener {

    public final int f47224a;

    public final m4 f47225b;

    public j4(m4 m4Var, int i10) {
        this.f47224a = i10;
        this.f47225b = m4Var;
    }

    @Override
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.PageBlock pageBlock;
        switch (this.f47224a) {
            case 0:
                final m4 m4Var = this.f47225b;
                ArrayList arrayList = m4Var.A;
                int iIndexOf = arrayList.indexOf(view);
                if (m4Var.J != null && m4Var.f47594a != null) {
                    List listM = m4Var.m();
                    if (iIndexOf >= 0 && iIndexOf < listM.size() && iIndexOf < arrayList.size()) {
                        final s sVar = (s) listM.get(iIndexOf);
                        b70 b70VarA1 = m4Var.J.f47191a.f47340d3.A1((View) arrayList.get(iIndexOf));
                        boolean z10 = sVar.f47425n;
                        final int i10 = 0;
                        b70VarA1.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z10 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        m4 m4Var2 = m4Var;
                                        i3 i3Var = m4Var2.J;
                                        if (i3Var != null && (aVar3 = m4Var2.f47594a) != null) {
                                            p3 p3Var = i3Var.f47191a;
                                            p3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                b2 b2Var = p3Var.F3;
                                                if (b2Var != null) {
                                                    b2Var.d();
                                                }
                                                sVar2.f47425n = !sVar2.f47425n;
                                                TL_iv.PageBlock pageBlockN3 = p3.N3(aVar3, sVar2);
                                                if (pageBlockN3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) pageBlockN3).spoiler = sVar2.f47425n;
                                                } else if (pageBlockN3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) pageBlockN3).spoiler = sVar2.f47425n;
                                                }
                                                p3Var.n4(aVar3);
                                                b2 b2Var2 = p3Var.F3;
                                                if (b2Var2 != null) {
                                                    b2Var2.h();
                                                }
                                                p3Var.f47340d3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        m4 m4Var3 = m4Var;
                                        i3 i3Var2 = m4Var3.J;
                                        if (i3Var2 != null && (aVar4 = m4Var3.f47594a) != null) {
                                            p3.N1(aVar4, sVar, i3Var2.f47191a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        b70VarA1.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        m4 m4Var2 = m4Var;
                                        i3 i3Var = m4Var2.J;
                                        if (i3Var != null && (aVar3 = m4Var2.f47594a) != null) {
                                            p3 p3Var = i3Var.f47191a;
                                            p3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                b2 b2Var = p3Var.F3;
                                                if (b2Var != null) {
                                                    b2Var.d();
                                                }
                                                sVar2.f47425n = !sVar2.f47425n;
                                                TL_iv.PageBlock pageBlockN3 = p3.N3(aVar3, sVar2);
                                                if (pageBlockN3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) pageBlockN3).spoiler = sVar2.f47425n;
                                                } else if (pageBlockN3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) pageBlockN3).spoiler = sVar2.f47425n;
                                                }
                                                p3Var.n4(aVar3);
                                                b2 b2Var2 = p3Var.F3;
                                                if (b2Var2 != null) {
                                                    b2Var2.h();
                                                }
                                                p3Var.f47340d3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        m4 m4Var3 = m4Var;
                                        i3 i3Var2 = m4Var3.J;
                                        if (i3Var2 != null && (aVar4 = m4Var3.f47594a) != null) {
                                            p3.N1(aVar4, sVar, i3Var2.f47191a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        b70VarA1.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (m4Var.D) {
                            b70VarA1.f26994u = false;
                            b70VarA1.v = true;
                            b70VarA1.f26992s = 0;
                        }
                        b70VarA1.Z();
                        break;
                    }
                }
                break;
            case 1:
                m4 m4Var2 = this.f47225b;
                i3 i3Var = m4Var2.J;
                if (i3Var != null && (aVar = m4Var2.f47594a) != null) {
                    p3 p3Var = i3Var.f47191a;
                    p3Var.X3 = aVar;
                    p3Var.f47340d3.c0(0);
                    break;
                }
                break;
            default:
                m4 m4Var3 = this.f47225b;
                i3 i3Var2 = m4Var3.J;
                if (i3Var2 != null && (aVar2 = m4Var3.f47594a) != null) {
                    p3 p3Var2 = i3Var2.f47191a;
                    p3Var2.getClass();
                    if (p3.B3(aVar2.f47028b)) {
                        b2 b2Var = p3Var2.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> arrayListG3 = p3.g3(aVar2.f47028b);
                        TL_iv.PageBlock pageBlock2 = aVar2.f47028b;
                        TL_iv.PageCaption pageCaption = pageBlock2.caption;
                        if (pageBlock2 instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (arrayListG3 == null) {
                                arrayListG3 = new ArrayList<>();
                            }
                            pageblockcollage.items = arrayListG3;
                            pageblockcollage.caption = pageCaption;
                            pageBlock = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                            if (arrayListG3 == null) {
                                arrayListG3 = new ArrayList<>();
                            }
                            pageblockslideshow.items = arrayListG3;
                            pageblockslideshow.caption = pageCaption;
                            pageBlock = pageblockslideshow;
                        }
                        aVar2.f47028b = pageBlock;
                        b2 b2Var2 = p3Var2.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        View viewZ1 = p3Var2.z1(aVar2);
                        if (viewZ1 instanceof m4) {
                            m4 m4Var4 = (m4) viewZ1;
                            ValueAnimator valueAnimator = m4Var4.f47277e0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                m4Var4.f47277e0 = null;
                            }
                            if (m4Var4.getParent() != null) {
                                m4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = m4Var4.f47276d0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                m4Var4.f47276d0 = null;
                            }
                            m4Var4.S = 0;
                            m4Var4.T = 0.0f;
                            m4Var4.o(true);
                            m4Var4.requestLayout();
                            m4Var4.invalidate();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
