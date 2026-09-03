package wh;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.q70;
public final class l4 implements View.OnClickListener {
    public final int f49901a;
    public final o4 f49902b;

    public l4(o4 o4Var, int i10) {
        this.f49901a = i10;
        this.f49902b = o4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f49901a) {
            case 0:
                final o4 o4Var = this.f49902b;
                ArrayList arrayList = o4Var.B;
                int indexOf = arrayList.indexOf(view);
                if (o4Var.K != null && o4Var.f50211a != null) {
                    List m9 = o4Var.m();
                    if (indexOf >= 0 && indexOf < m9.size() && indexOf < arrayList.size()) {
                        final t tVar = (t) m9.get(indexOf);
                        q70 P = o4Var.K.f49864a.f50016e3.P((View) arrayList.get(indexOf));
                        boolean z4 = tVar.f50077n;
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
                        P.c(i10, LocaleController.getString(i11), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        o4 o4Var2 = o4Var;
                                        k3 k3Var = o4Var2.K;
                                        if (k3Var != null && (aVar3 = o4Var2.f50211a) != null) {
                                            r3 r3Var = k3Var.f49864a;
                                            r3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                d2 d2Var = r3Var.G3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                tVar2.f50077n = !tVar2.f50077n;
                                                TL_iv.PageBlock M3 = r3.M3(aVar3, tVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = tVar2.f50077n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = tVar2.f50077n;
                                                }
                                                r3Var.m4(aVar3);
                                                d2 d2Var2 = r3Var.G3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                r3Var.f50016e3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        o4 o4Var3 = o4Var;
                                        k3 k3Var2 = o4Var3.K;
                                        if (k3Var2 != null && (aVar4 = o4Var3.f50211a) != null) {
                                            r3.M1(aVar4, tVar, k3Var2.f49864a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        P.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        o4 o4Var2 = o4Var;
                                        k3 k3Var = o4Var2.K;
                                        if (k3Var != null && (aVar3 = o4Var2.f50211a) != null) {
                                            r3 r3Var = k3Var.f49864a;
                                            r3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                d2 d2Var = r3Var.G3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                tVar2.f50077n = !tVar2.f50077n;
                                                TL_iv.PageBlock M3 = r3.M3(aVar3, tVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = tVar2.f50077n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = tVar2.f50077n;
                                                }
                                                r3Var.m4(aVar3);
                                                d2 d2Var2 = r3Var.G3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                r3Var.f50016e3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        o4 o4Var3 = o4Var;
                                        k3 k3Var2 = o4Var3.K;
                                        if (k3Var2 != null && (aVar4 = o4Var3.f50211a) != null) {
                                            r3.M1(aVar4, tVar, k3Var2.f49864a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        P.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (o4Var.E) {
                            P.f30335u = false;
                            P.v = true;
                            P.f30333s = 0;
                        }
                        P.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o4 o4Var2 = this.f49902b;
                k3 k3Var = o4Var2.K;
                if (k3Var != null && (aVar = o4Var2.f50211a) != null) {
                    r3 r3Var = k3Var.f49864a;
                    r3Var.Y3 = aVar;
                    r3Var.f50016e3.p(0);
                    return;
                }
                return;
            default:
                o4 o4Var3 = this.f49902b;
                k3 k3Var2 = o4Var3.K;
                if (k3Var2 != null && (aVar2 = o4Var3.f50211a) != null) {
                    r3 r3Var2 = k3Var2.f49864a;
                    r3Var2.getClass();
                    if (r3.A3(aVar2.f49653b)) {
                        d2 d2Var = r3Var2.G3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> f32 = r3.f3(aVar2.f49653b);
                        TL_iv.PageBlock pageBlock = aVar2.f49653b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (f32 == null) {
                                f32 = new ArrayList<>();
                            }
                            pageblockcollage.items = f32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (f32 == null) {
                                f32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = f32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.f49653b = pageblockslideshow;
                        d2 d2Var2 = r3Var2.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        View y12 = r3Var2.y1(aVar2);
                        if (y12 instanceof o4) {
                            o4 o4Var4 = (o4) y12;
                            ValueAnimator valueAnimator = o4Var4.f49944f0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                o4Var4.f49944f0 = null;
                            }
                            if (o4Var4.getParent() != null) {
                                o4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = o4Var4.f49943e0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                o4Var4.f49943e0 = null;
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
