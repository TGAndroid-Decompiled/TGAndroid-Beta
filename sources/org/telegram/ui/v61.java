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
public final class v61 extends org.telegram.ui.Components.ul0 {
    public int f37422c;
    public int d;
    public int h;
    public final l71 f37426s;
    public int e = -1;
    public int f37423f = -1;
    public int f37424n = 1;
    public final ArrayList f37425r = new ArrayList();

    public v61(l71 l71Var) {
        this.f37426s = l71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        l71 l71Var = this.f37426s;
        int i10 = l71Var.W;
        boolean z11 = l71Var.I;
        ArrayList arrayList = this.f37425r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f37422c = -1;
        boolean z12 = false;
        this.f37424n = 0;
        arrayList.clear();
        ArrayList arrayList2 = l71Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f37424n;
                this.f37424n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f37424n;
            for (int i12 = 0; i12 < l71Var.A1.size(); i12++) {
                this.f37424n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, l71Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = l71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f37424n;
                this.f37424n = i13 + 1;
                this.f37423f = i13;
                arrayList.add(2);
                this.f37422c = this.f37424n;
                for (int i14 = 0; i14 < l71Var.B1.size(); i14++) {
                    this.f37424n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, l71Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = l71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f37424n;
                    this.f37424n = i15 + 1;
                    this.f37423f = i15;
                    arrayList.add(2);
                }
                this.f37422c = this.f37424n;
                for (int i16 = 0; i16 < l71Var.C1.size(); i16++) {
                    this.f37424n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, l71Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = l71Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f37424n;
            this.h = i17;
            this.f37424n = arrayList5.size() + i17;
        }
        l();
        if (l71Var.f34609y1 && this.f37424n == 0) {
            z12 = true;
        }
        if (l71Var.G1 != z12) {
            l71Var.G1 = z12;
            ValueAnimator valueAnimator = l71Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            l71Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new s51(l71Var, z12, 1));
            l71Var.H1.addListener(new e61(l71Var, z12, 1));
            l71Var.H1.setInterpolator(org.telegram.ui.Components.wr.h);
            l71Var.H1.setDuration(100L);
            l71Var.H1.start();
            if (z12) {
                l71.D(l71Var.V, l71Var.f34578l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f37424n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f37423f) {
            return 6;
        }
        l71 l71Var = this.f37426s;
        if (l71Var.W == 14) {
            ArrayList arrayList = l71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f37422c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f37422c;
            if (i10 > i12 && (i10 - i12) - 1 < l71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = l71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (l71Var.W == 13 || ((yg.p0) l71Var.A1.get((i10 - this.d) - 1)).f47102g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= l71Var.D1.size()) {
            return 4;
        }
        if (l71Var.D1.get(i10 - this.h) instanceof i71) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        Long l4;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        yg.p0 p0Var;
        int cacheType2;
        int i13;
        int indexOf;
        l71 l71Var = this.f37426s;
        HashSet hashSet = l71Var.K;
        int i14 = l71Var.W;
        int i15 = l71Var.V;
        y51 y51Var = l71Var.f34572i0;
        int i16 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i16 == 6) {
            q61 q61Var = (q61) view;
            ArrayList arrayList = l71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) l71Var.D1.get(i10 - this.h);
                if (document2 instanceof i71) {
                    CharSequence charSequence = ((i71) document2).f33551a;
                    String str = l71Var.f34611z1;
                    q61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, q61Var.f35983f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    q61Var.f35980a.setText(charSequence);
                    q61Var.b(false);
                }
            } else if (i10 == this.e) {
                q61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                q61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                q61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            q61Var.f35982c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) l71Var.C1.get((i10 - this.f37422c) - 1);
            u61 u61Var = (u61) view;
            u61Var.a(y51Var);
            u61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.j6.f18091m6, 0.2f), 0L, "tgs", document3, 0);
            u61Var.Q = true;
            u61Var.d = document3;
            u61Var.e = null;
        } else if (i16 == 4) {
            u61 u61Var2 = (u61) view;
            u61Var2.f37129c = i10;
            ImageReceiver imageReceiver = u61Var2.f37131n;
            ArrayList arrayList2 = l71Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                p0Var = (yg.p0) l71Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = l71Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f37422c) && i10 - i12 < arrayList3.size()) {
                    p0Var = (yg.p0) l71Var.B1.get(i10 - this.f37422c);
                } else {
                    return;
                }
            }
            if (u61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(u61Var2);
                u61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                u61Var2.h.onAttachedToWindow();
            }
            u61Var2.h.setParentView(y51Var);
            u61Var2.f37135x = p0Var;
            u61Var2.f37136y = false;
            u61Var2.d(l71Var.J.contains(p0Var), false);
            u61Var2.f37128b = false;
            u61Var2.invalidate();
            if (i14 == 13) {
                u61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f47101f));
            } else if (!p0Var.f47099b && p0Var.f47101f != null) {
                u61Var2.f37133s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(p0Var.f47101f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.f18091m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        u61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                    } else {
                        yg.p0 p0Var2 = p0Var;
                        u61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), yg.l0.a());
                } else {
                    u61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                u61Var2.e = null;
                u61Var2.d = null;
                u61Var2.setDrawable(null);
                t61 t61Var = u61Var2.J;
                if (t61Var != null) {
                    t61Var.setVisibility(8);
                    u61Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && p0Var.f47099b) {
                    u61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f47101f));
                }
            } else {
                u61Var2.f37133s = false;
                u61Var2.e = new org.telegram.ui.Components.y5(p0Var.f47102g, (Paint.FontMetricsInt) null);
                u61Var2.d = null;
                u61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) y51Var.f35141d3.get(u61Var2.e.getDocumentId());
                if (p5Var == null) {
                    cacheType2 = l71Var.getCacheType();
                    p5Var = org.telegram.ui.Components.p5.n(i15, u61Var2.e.getDocumentId(), null, cacheType2);
                    y51Var.f35141d3.put(u61Var2.e.getDocumentId(), p5Var);
                }
                u61Var2.setDrawable(p5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && p0Var.f47099b && p0Var.d) {
                u61Var2.b();
                u61Var2.J.setVisibility(0);
                u61Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                u61Var2.setEmojicon(p0Var.f47101f);
            } else {
                u61Var2.setEmojicon(null);
            }
            t61 t61Var2 = u61Var2.J;
            if (t61Var2 != null) {
                t61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            u61 u61Var3 = (u61) view;
            u61Var3.f37127a = false;
            u61Var3.f37129c = i10;
            u61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            u61Var3.setDrawable(null);
            ArrayList arrayList4 = l71Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                yg.p0 p0Var3 = (yg.p0) l71Var.A1.get(i10);
                u61Var3.f37135x = p0Var3;
                long j3 = p0Var3.f47102g;
                if (j3 == 0) {
                    boolean contains2 = l71Var.J.contains(p0Var3);
                    u61Var3.f37136y = true;
                    u61Var3.setDrawable(Emoji.getEmojiDrawable(p0Var3.f47101f));
                    u61Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j3);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && p0Var3.f47099b && p0Var3.d) {
                    u61Var3.b();
                    u61Var3.J.setVisibility(0);
                } else {
                    t61 t61Var3 = u61Var3.J;
                    if (t61Var3 != null) {
                        t61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = l71Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) l71Var.D1.get(i10 - this.h);
                    if (!(document instanceof i71)) {
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
                    u61Var3.e = new org.telegram.ui.Components.y5(document, (Paint.FontMetricsInt) null);
                    u61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f17201id));
                } else {
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(l4.longValue(), (Paint.FontMetricsInt) null);
                    u61Var3.e = y5Var;
                    u61Var3.d = y5Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.p5 p5Var2 = (org.telegram.ui.Components.p5) y51Var.f35141d3.get(u61Var3.e.getDocumentId());
                if (p5Var2 == null) {
                    cacheType = l71Var.getCacheType();
                    p5Var2 = org.telegram.ui.Components.p5.n(i15, u61Var3.e.getDocumentId(), null, cacheType);
                    y51Var.f35141d3.put(u61Var3.e.getDocumentId(), p5Var2);
                }
                u61Var3.setDrawable(p5Var2);
            }
            u61Var3.d(contains, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View u61Var;
        boolean z10;
        l71 l71Var = this.f37426s;
        if (i10 == 6) {
            Context context = l71Var.getContext();
            if (l71Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            u61Var = new q61(l71Var, context, z10);
        } else if (i10 == 7) {
            u61Var = new org.telegram.ui.Components.qn(l71Var.getContext(), 24);
            u61Var.setTag("searchbox");
        } else {
            u61Var = new u61(l71Var, l71Var.getContext());
        }
        if (l71.c(l71Var)) {
            u61Var.setScaleX(0.0f);
            u61Var.setScaleY(0.0f);
        }
        return new s4.c1(u61Var);
    }
}
