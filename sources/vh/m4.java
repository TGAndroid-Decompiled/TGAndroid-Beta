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
import org.telegram.ui.Components.p70;
public final class m4 implements View.OnClickListener {
    public final int f46101a;
    public final p4 f46102b;

    public m4(p4 p4Var, int i10) {
        this.f46101a = i10;
        this.f46102b = p4Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f46101a) {
            case 0:
                final p4 p4Var = this.f46102b;
                ArrayList arrayList = p4Var.B;
                int indexOf = arrayList.indexOf(view);
                if (p4Var.K != null && p4Var.f46414a != null) {
                    List m9 = p4Var.m();
                    if (indexOf >= 0 && indexOf < m9.size() && indexOf < arrayList.size()) {
                        final t tVar = (t) m9.get(indexOf);
                        p70 C = p4Var.K.f46075a.f46209e3.C((View) arrayList.get(indexOf));
                        boolean z4 = tVar.f46257n;
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
                                        p4 p4Var2 = p4Var;
                                        l3 l3Var = p4Var2.K;
                                        if (l3Var != null && (aVar3 = p4Var2.f46414a) != null) {
                                            s3 s3Var = l3Var.f46075a;
                                            s3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                d2 d2Var = s3Var.G3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                tVar2.f46257n = !tVar2.f46257n;
                                                TL_iv.PageBlock M3 = s3.M3(aVar3, tVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = tVar2.f46257n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = tVar2.f46257n;
                                                }
                                                s3Var.m4(aVar3);
                                                d2 d2Var2 = s3Var.G3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                s3Var.f46209e3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        p4 p4Var3 = p4Var;
                                        l3 l3Var2 = p4Var3.K;
                                        if (l3Var2 != null && (aVar4 = p4Var3.f46414a) != null) {
                                            s3.M1(aVar4, tVar, l3Var2.f46075a);
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
                                        p4 p4Var2 = p4Var;
                                        l3 l3Var = p4Var2.K;
                                        if (l3Var != null && (aVar3 = p4Var2.f46414a) != null) {
                                            s3 s3Var = l3Var.f46075a;
                                            s3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                d2 d2Var = s3Var.G3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                tVar2.f46257n = !tVar2.f46257n;
                                                TL_iv.PageBlock M3 = s3.M3(aVar3, tVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = tVar2.f46257n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = tVar2.f46257n;
                                                }
                                                s3Var.m4(aVar3);
                                                d2 d2Var2 = s3Var.G3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                s3Var.f46209e3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        p4 p4Var3 = p4Var;
                                        l3 l3Var2 = p4Var3.K;
                                        if (l3Var2 != null && (aVar4 = p4Var3.f46414a) != null) {
                                            s3.M1(aVar4, tVar, l3Var2.f46075a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        C.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (p4Var.E) {
                            C.f27779u = false;
                            C.v = true;
                            C.f27777s = 0;
                        }
                        C.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                p4 p4Var2 = this.f46102b;
                l3 l3Var = p4Var2.K;
                if (l3Var != null && (aVar = p4Var2.f46414a) != null) {
                    s3 s3Var = l3Var.f46075a;
                    s3Var.Y3 = aVar;
                    s3Var.f46209e3.n(0);
                    return;
                }
                return;
            default:
                p4 p4Var3 = this.f46102b;
                l3 l3Var2 = p4Var3.K;
                if (l3Var2 != null && (aVar2 = p4Var3.f46414a) != null) {
                    s3 s3Var2 = l3Var2.f46075a;
                    s3Var2.getClass();
                    if (s3.A3(aVar2.f45853b)) {
                        d2 d2Var = s3Var2.G3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> f32 = s3.f3(aVar2.f45853b);
                        TL_iv.PageBlock pageBlock = aVar2.f45853b;
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
                        aVar2.f45853b = pageblockslideshow;
                        d2 d2Var2 = s3Var2.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        View y12 = s3Var2.y1(aVar2);
                        if (y12 instanceof p4) {
                            p4 p4Var4 = (p4) y12;
                            ValueAnimator valueAnimator = p4Var4.f46145f0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                p4Var4.f46145f0 = null;
                            }
                            if (p4Var4.getParent() != null) {
                                p4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = p4Var4.f46144e0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                p4Var4.f46144e0 = null;
                            }
                            p4Var4.T = 0;
                            p4Var4.U = 0.0f;
                            p4Var4.o(true);
                            p4Var4.requestLayout();
                            p4Var4.invalidate();
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
