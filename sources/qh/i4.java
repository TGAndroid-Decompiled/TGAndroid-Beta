package qh;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.x60;
public final class i4 implements View.OnClickListener {
    public final int f46446a;
    public final l4 f46447b;

    public i4(l4 l4Var, int i9) {
        this.f46446a = i9;
        this.f46447b = l4Var;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.f46446a) {
            case 0:
                final l4 l4Var = this.f46447b;
                ArrayList arrayList = l4Var.A;
                int indexOf = arrayList.indexOf(view);
                if (l4Var.J != null && l4Var.f46834a != null) {
                    List m10 = l4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) m10.get(indexOf);
                        x60 J1 = l4Var.J.f46419a.f46565d3.J1((View) arrayList.get(indexOf));
                        boolean z10 = sVar.f46679n;
                        if (z10) {
                            i9 = R.drawable.msg_spoiler_off;
                        } else {
                            i9 = R.drawable.msg_spoiler;
                        }
                        if (z10) {
                            i10 = R.string.DisablePhotoSpoiler;
                        } else {
                            i10 = R.string.EnablePhotoSpoiler;
                        }
                        J1.c(i9, LocaleController.getString(i10), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        l4 l4Var2 = l4Var;
                                        h3 h3Var = l4Var2.J;
                                        if (h3Var != null && (aVar3 = l4Var2.f46834a) != null) {
                                            o3 o3Var = h3Var.f46419a;
                                            o3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                b2 b2Var = o3Var.F3;
                                                if (b2Var != null) {
                                                    b2Var.d();
                                                }
                                                sVar2.f46679n = !sVar2.f46679n;
                                                TL_iv.PageBlock N3 = o3.N3(aVar3, sVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = sVar2.f46679n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = sVar2.f46679n;
                                                }
                                                o3Var.n4(aVar3);
                                                b2 b2Var2 = o3Var.F3;
                                                if (b2Var2 != null) {
                                                    b2Var2.h();
                                                }
                                                o3Var.f46565d3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        l4 l4Var3 = l4Var;
                                        h3 h3Var2 = l4Var3.J;
                                        if (h3Var2 != null && (aVar4 = l4Var3.f46834a) != null) {
                                            o3.N1(aVar4, sVar, h3Var2.f46419a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, false);
                        J1.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                            @Override
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (r3) {
                                    case 0:
                                        l4 l4Var2 = l4Var;
                                        h3 h3Var = l4Var2.J;
                                        if (h3Var != null && (aVar3 = l4Var2.f46834a) != null) {
                                            o3 o3Var = h3Var.f46419a;
                                            o3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                b2 b2Var = o3Var.F3;
                                                if (b2Var != null) {
                                                    b2Var.d();
                                                }
                                                sVar2.f46679n = !sVar2.f46679n;
                                                TL_iv.PageBlock N3 = o3.N3(aVar3, sVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = sVar2.f46679n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = sVar2.f46679n;
                                                }
                                                o3Var.n4(aVar3);
                                                b2 b2Var2 = o3Var.F3;
                                                if (b2Var2 != null) {
                                                    b2Var2.h();
                                                }
                                                o3Var.f46565d3.onContentChanged();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        l4 l4Var3 = l4Var;
                                        h3 h3Var2 = l4Var3.J;
                                        if (h3Var2 != null && (aVar4 = l4Var3.f46834a) != null) {
                                            o3.N1(aVar4, sVar, h3Var2.f46419a);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, true);
                        J1.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (l4Var.D) {
                            J1.f34582u = false;
                            J1.v = true;
                            J1.f34580s = 0;
                        }
                        J1.Z();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                l4 l4Var2 = this.f46447b;
                h3 h3Var = l4Var2.J;
                if (h3Var != null && (aVar = l4Var2.f46834a) != null) {
                    o3 o3Var = h3Var.f46419a;
                    o3Var.X3 = aVar;
                    o3Var.f46565d3.c0(0);
                    return;
                }
                return;
            default:
                l4 l4Var3 = this.f46447b;
                h3 h3Var2 = l4Var3.J;
                if (h3Var2 != null && (aVar2 = l4Var3.f46834a) != null) {
                    o3 o3Var2 = h3Var2.f46419a;
                    o3Var2.getClass();
                    if (o3.B3(aVar2.f46269b)) {
                        b2 b2Var = o3Var2.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> g32 = o3.g3(aVar2.f46269b);
                        TL_iv.PageBlock pageBlock = aVar2.f46269b;
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
                        aVar2.f46269b = pageblockslideshow;
                        b2 b2Var2 = o3Var2.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        View z12 = o3Var2.z1(aVar2);
                        if (z12 instanceof l4) {
                            l4 l4Var4 = (l4) z12;
                            ValueAnimator valueAnimator = l4Var4.f46507e0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                l4Var4.f46507e0 = null;
                            }
                            if (l4Var4.getParent() != null) {
                                l4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = l4Var4.f46506d0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                l4Var4.f46506d0 = null;
                            }
                            l4Var4.S = 0;
                            l4Var4.T = 0.0f;
                            l4Var4.o(true);
                            l4Var4.requestLayout();
                            l4Var4.invalidate();
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
