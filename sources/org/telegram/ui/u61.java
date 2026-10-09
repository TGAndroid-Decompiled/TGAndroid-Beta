package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class u61 extends org.telegram.ui.Components.pm0 {
    public int f42343c;
    public int d;
    public int h;
    public final k71 f42348s;
    public int f42344e = -1;
    public int f42345f = -1;
    public int f42346n = 1;
    public final ArrayList f42347r = new ArrayList();

    public u61(k71 k71Var) {
        this.f42348s = k71Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47662f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        k71 k71Var = this.f42348s;
        int i10 = k71Var.W;
        boolean z11 = k71Var.I;
        ArrayList arrayList = this.f42347r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f42343c = -1;
        boolean z12 = false;
        this.f42346n = 0;
        arrayList.clear();
        ArrayList arrayList2 = k71Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f42346n;
                this.f42346n = i11 + 1;
                this.f42344e = i11;
                arrayList.add(1);
            }
            this.d = this.f42346n;
            for (int i12 = 0; i12 < k71Var.A1.size(); i12++) {
                this.f42346n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, k71Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = k71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f42346n;
                this.f42346n = i13 + 1;
                this.f42345f = i13;
                arrayList.add(2);
                this.f42343c = this.f42346n;
                for (int i14 = 0; i14 < k71Var.B1.size(); i14++) {
                    this.f42346n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, k71Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = k71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f42346n;
                    this.f42346n = i15 + 1;
                    this.f42345f = i15;
                    arrayList.add(2);
                }
                this.f42343c = this.f42346n;
                for (int i16 = 0; i16 < k71Var.C1.size(); i16++) {
                    this.f42346n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, k71Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = k71Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f42346n;
            this.h = i17;
            this.f42346n = arrayList5.size() + i17;
        }
        l();
        if (k71Var.f39171y1 && this.f42346n == 0) {
            z12 = true;
        }
        if (k71Var.G1 != z12) {
            k71Var.G1 = z12;
            ValueAnimator valueAnimator = k71Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            k71Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new p51(k71Var, z12, 1));
            k71Var.H1.addListener(new d61(k71Var, z12, 1));
            k71Var.H1.setInterpolator(org.telegram.ui.Components.hs.h);
            k71Var.H1.setDuration(100L);
            k71Var.H1.start();
            if (z12) {
                k71.D(k71Var.V, k71Var.f39140l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f42346n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.f42344e || i10 == this.f42345f) {
            return 6;
        }
        k71 k71Var = this.f42348s;
        if (k71Var.W == 14) {
            ArrayList arrayList = k71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f42343c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f42343c;
            if (i10 > i12 && (i10 - i12) - 1 < k71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = k71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (k71Var.W == 13 || ((zg.n0) k71Var.A1.get((i10 - this.d) - 1)).f54618g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= k71Var.D1.size()) {
            return 4;
        }
        if (k71Var.D1.get(i10 - this.h) instanceof h71) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        zg.n0 n0Var;
        int cacheType2;
        int i13;
        int indexOf;
        k71 k71Var = this.f42348s;
        HashSet hashSet = k71Var.K;
        int i14 = k71Var.W;
        int i15 = k71Var.V;
        x51 x51Var = k71Var.f39134i0;
        int i16 = d1Var.f47662f;
        View view = d1Var.f47658a;
        if (i16 == 6) {
            p61 p61Var = (p61) view;
            ArrayList arrayList = k71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) k71Var.D1.get(i10 - this.h);
                if (document2 instanceof h71) {
                    CharSequence charSequence = ((h71) document2).f38222a;
                    String str = k71Var.f39173z1;
                    p61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ue, p61Var.f40687f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    p61Var.f40683a.setText(charSequence);
                    p61Var.b(false);
                }
            } else if (i10 == this.f42344e) {
                p61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                p61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                p61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            p61Var.f40685c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) k71Var.C1.get((i10 - this.f42343c) - 1);
            t61 t61Var = (t61) view;
            t61Var.a(x51Var);
            t61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.i6.f20962m6, 0.2f), 0L, "tgs", document3, 0);
            t61Var.Q = true;
            t61Var.d = document3;
            t61Var.f41873e = null;
        } else if (i16 == 4) {
            t61 t61Var2 = (t61) view;
            t61Var2.f41872c = i10;
            ImageReceiver imageReceiver = t61Var2.f41875n;
            ArrayList arrayList2 = k71Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                n0Var = (zg.n0) k71Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = k71Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f42343c) && i10 - i12 < arrayList3.size()) {
                    n0Var = (zg.n0) k71Var.B1.get(i10 - this.f42343c);
                } else {
                    return;
                }
            }
            if (t61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(t61Var2);
                t61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                t61Var2.h.onAttachedToWindow();
            }
            t61Var2.h.setParentView(x51Var);
            t61Var2.f41879x = n0Var;
            t61Var2.f41880y = false;
            t61Var2.d(k71Var.J.contains(n0Var), false);
            t61Var2.f41871b = false;
            t61Var2.invalidate();
            if (i14 == 13) {
                t61Var2.setDrawable(Emoji.getEmojiDrawable(n0Var.f54617f));
            } else if (!n0Var.f54614b && n0Var.f54617f != null) {
                t61Var2.f41877s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(n0Var.f54617f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.i6.f20962m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        t61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", n0Var, 0);
                    } else {
                        zg.n0 n0Var2 = n0Var;
                        t61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", n0Var2, 0);
                        n0Var = n0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.j0.a());
                } else {
                    t61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                t61Var2.f41873e = null;
                t61Var2.d = null;
                t61Var2.setDrawable(null);
                s61 s61Var = t61Var2.J;
                if (s61Var != null) {
                    s61Var.setVisibility(8);
                    t61Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && n0Var.f54614b) {
                    t61Var2.setDrawable(Emoji.getEmojiDrawable(n0Var.f54617f));
                }
            } else {
                t61Var2.f41877s = false;
                t61Var2.f41873e = new org.telegram.ui.Components.b6(n0Var.f54618g, (Paint.FontMetricsInt) null);
                t61Var2.d = null;
                t61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) x51Var.f39779b3.get(t61Var2.f41873e.getDocumentId());
                if (s5Var == null) {
                    cacheType2 = k71Var.getCacheType();
                    s5Var = org.telegram.ui.Components.s5.n(i15, t61Var2.f41873e.getDocumentId(), null, cacheType2);
                    x51Var.f39779b3.put(t61Var2.f41873e.getDocumentId(), s5Var);
                }
                t61Var2.setDrawable(s5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && n0Var.f54614b && n0Var.d) {
                t61Var2.b();
                t61Var2.J.setVisibility(0);
                t61Var2.setEmojicon(null);
                return;
            }
            if (n0Var.f54616e) {
                t61Var2.setEmojicon(n0Var.f54617f);
            } else {
                t61Var2.setEmojicon(null);
            }
            s61 s61Var2 = t61Var2.J;
            if (s61Var2 != null) {
                s61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            t61 t61Var3 = (t61) view;
            t61Var3.f41870a = false;
            t61Var3.f41872c = i10;
            t61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            t61Var3.setDrawable(null);
            ArrayList arrayList4 = k71Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                zg.n0 n0Var3 = (zg.n0) k71Var.A1.get(i10);
                t61Var3.f41879x = n0Var3;
                long j3 = n0Var3.f54618g;
                if (j3 == 0) {
                    boolean contains2 = k71Var.J.contains(n0Var3);
                    t61Var3.f41880y = true;
                    t61Var3.setDrawable(Emoji.getEmojiDrawable(n0Var3.f54617f));
                    t61Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j3);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && n0Var3.f54614b && n0Var3.d) {
                    t61Var3.b();
                    t61Var3.J.setVisibility(0);
                } else {
                    s61 s61Var3 = t61Var3.J;
                    if (s61Var3 != null) {
                        s61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = k71Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) k71Var.D1.get(i10 - this.h);
                    if (!(document instanceof h71)) {
                        l4 = null;
                    }
                }
                document = null;
                l4 = null;
            }
            if (l4 == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    t61Var3.f41873e = new org.telegram.ui.Components.b6(document, (Paint.FontMetricsInt) null);
                    t61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f20044id));
                } else {
                    org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(l4.longValue(), (Paint.FontMetricsInt) null);
                    t61Var3.f41873e = b6Var;
                    t61Var3.d = b6Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.s5 s5Var2 = (org.telegram.ui.Components.s5) x51Var.f39779b3.get(t61Var3.f41873e.getDocumentId());
                if (s5Var2 == null) {
                    cacheType = k71Var.getCacheType();
                    s5Var2 = org.telegram.ui.Components.s5.n(i15, t61Var3.f41873e.getDocumentId(), null, cacheType);
                    x51Var.f39779b3.put(t61Var3.f41873e.getDocumentId(), s5Var2);
                }
                t61Var3.setDrawable(s5Var2);
            }
            t61Var3.d(contains, false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View t61Var;
        boolean z10;
        k71 k71Var = this.f42348s;
        if (i10 == 6) {
            Context context = k71Var.getContext();
            if (k71Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            t61Var = new p61(k71Var, context, z10);
        } else if (i10 == 7) {
            t61Var = new org.telegram.ui.Components.ao(k71Var.getContext(), 25);
            t61Var.setTag("searchbox");
        } else {
            t61Var = new t61(k71Var, k71Var.getContext());
        }
        if (k71.c(k71Var)) {
            t61Var.setScaleX(0.0f);
            t61Var.setScaleY(0.0f);
        }
        return new s4.d1(t61Var);
    }
}
