package vh;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.o70;
public final class l4 implements View.OnClickListener {
    public final int f46004a;
    public final o4 f46005b;

    public l4(o4 o4Var, int i10) {
        this.f46004a = i10;
        this.f46005b = o4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f46004a) {
            case 0:
                final o4 o4Var = this.f46005b;
                ArrayList arrayList = o4Var.B;
                int indexOf = arrayList.indexOf(view);
                if (o4Var.K != null && o4Var.f46283a != null) {
                    List m9 = o4Var.m();
                    if (indexOf >= 0 && indexOf < m9.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) m9.get(indexOf);
                        o70 C = o4Var.K.f45978a.f46112e3.C((View) arrayList.get(indexOf));
                        boolean z4 = sVar.f46160n;
                        if (z4) {
                            i10 = R.drawable.msg_spoiler_off;
                        } else {
                            i10 = R.drawable.msg_spoiler;
                        }
                        if (z4) {
                            i11 = R.string.DisablePhotoSpoiler;
                        } else {
                            i11 = R.string.EnablePhotoSpoiler;
                        }
                        C.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        o4 o4Var2 = o4Var;
                                        k3 k3Var = o4Var2.K;
                                        if (k3Var != null && (aVar3 = o4Var2.f46283a) != null) {
                                            r3 r3Var = k3Var.f45978a;
                                            r3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                c2 c2Var = r3Var.G3;
                                                if (c2Var != null) {
                                                    c2Var.d();
                                                }
                                                sVar2.f46160n = !sVar2.f46160n;
                                                TL_iv.PageBlock N3 = r3.N3(aVar3, sVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = sVar2.f46160n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = sVar2.f46160n;
                                                }
                                                r3Var.n4(aVar3);
                                                c2 c2Var2 = r3Var.G3;
                                                if (c2Var2 != null) {
                                                    c2Var2.h();
                                                }
                                                r3Var.f46112e3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        o4 o4Var3 = o4Var;
                                        k3 k3Var2 = o4Var3.K;
                                        if (k3Var2 != null && (aVar4 = o4Var3.f46283a) != null) {
                                            r3.N1(aVar4, sVar, k3Var2.f45978a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        C.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        o4 o4Var2 = o4Var;
                                        k3 k3Var = o4Var2.K;
                                        if (k3Var != null && (aVar3 = o4Var2.f46283a) != null) {
                                            r3 r3Var = k3Var.f45978a;
                                            r3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                c2 c2Var = r3Var.G3;
                                                if (c2Var != null) {
                                                    c2Var.d();
                                                }
                                                sVar2.f46160n = !sVar2.f46160n;
                                                TL_iv.PageBlock N3 = r3.N3(aVar3, sVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = sVar2.f46160n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = sVar2.f46160n;
                                                }
                                                r3Var.n4(aVar3);
                                                c2 c2Var2 = r3Var.G3;
                                                if (c2Var2 != null) {
                                                    c2Var2.h();
                                                }
                                                r3Var.f46112e3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        o4 o4Var3 = o4Var;
                                        k3 k3Var2 = o4Var3.K;
                                        if (k3Var2 != null && (aVar4 = o4Var3.f46283a) != null) {
                                            r3.N1(aVar4, sVar, k3Var2.f45978a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        C.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (o4Var.E) {
                            C.f27491u = false;
                            C.v = true;
                            C.f27489s = 0;
                        }
                        C.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o4 o4Var2 = this.f46005b;
                k3 k3Var = o4Var2.K;
                if (k3Var != null && (aVar = o4Var2.f46283a) != null) {
                    r3 r3Var = k3Var.f45978a;
                    r3Var.Y3 = aVar;
                    r3Var.f46112e3.m(0);
                    return;
                }
                return;
            default:
                o4 o4Var3 = this.f46005b;
                k3 k3Var2 = o4Var3.K;
                if (k3Var2 != null && (aVar2 = o4Var3.f46283a) != null) {
                    r3 r3Var2 = k3Var2.f45978a;
                    r3Var2.getClass();
                    if (r3.B3(aVar2.f45775b)) {
                        c2 c2Var = r3Var2.G3;
                        if (c2Var != null) {
                            c2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> g32 = r3.g3(aVar2.f45775b);
                        TL_iv.PageBlock pageBlock = aVar2.f45775b;
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
                        aVar2.f45775b = pageblockslideshow;
                        c2 c2Var2 = r3Var2.G3;
                        if (c2Var2 != null) {
                            c2Var2.h();
                        }
                        View z12 = r3Var2.z1(aVar2);
                        if (z12 instanceof o4) {
                            o4 o4Var4 = (o4) z12;
                            ValueAnimator valueAnimator = o4Var4.f46048f0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                o4Var4.f46048f0 = null;
                            }
                            if (o4Var4.getParent() != null) {
                                o4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = o4Var4.f46047e0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                o4Var4.f46047e0 = null;
                            }
                            o4Var4.T = 0;
                            o4Var4.U = 0.0f;
                            o4Var4.o(true);
                            o4Var4.requestLayout();
                            o4Var4.invalidate();
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
