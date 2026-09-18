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
public final class s61 extends org.telegram.ui.Components.ll0 {
    public int f37396c;
    public int d;
    public int h;
    public final i71 f37400s;
    public int e = -1;
    public int f37397f = -1;
    public int f37398n = 1;
    public final ArrayList f37399r = new ArrayList();

    public s61(i71 i71Var) {
        this.f37400s = i71Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42705f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        i71 i71Var = this.f37400s;
        int i10 = i71Var.W;
        boolean z11 = i71Var.I;
        ArrayList arrayList = this.f37399r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f37396c = -1;
        boolean z12 = false;
        this.f37398n = 0;
        arrayList.clear();
        ArrayList arrayList2 = i71Var.A1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f37398n;
                this.f37398n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f37398n;
            for (int i12 = 0; i12 < i71Var.A1.size(); i12++) {
                this.f37398n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, i71Var.A1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = i71Var.B1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f37398n;
                this.f37398n = i13 + 1;
                this.f37397f = i13;
                arrayList.add(2);
                this.f37396c = this.f37398n;
                for (int i14 = 0; i14 < i71Var.B1.size(); i14++) {
                    this.f37398n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, i71Var.B1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = i71Var.C1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f37398n;
                    this.f37398n = i15 + 1;
                    this.f37397f = i15;
                    arrayList.add(2);
                }
                this.f37396c = this.f37398n;
                for (int i16 = 0; i16 < i71Var.C1.size(); i16++) {
                    this.f37398n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, i71Var.C1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = i71Var.D1;
        if (arrayList5 != null) {
            int i17 = this.f37398n;
            this.h = i17;
            this.f37398n = arrayList5.size() + i17;
        }
        l();
        if (i71Var.f34505y1 && this.f37398n == 0) {
            z12 = true;
        }
        if (i71Var.G1 != z12) {
            i71Var.G1 = z12;
            ValueAnimator valueAnimator = i71Var.H1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            i71Var.H1 = ofFloat;
            ofFloat.addUpdateListener(new p51(i71Var, z12, 1));
            i71Var.H1.addListener(new b61(i71Var, z12, 1));
            i71Var.H1.setInterpolator(org.telegram.ui.Components.qr.h);
            i71Var.H1.setDuration(100L);
            i71Var.H1.start();
            if (z12) {
                i71.D(i71Var.V, i71Var.f34474l0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f37398n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f37397f) {
            return 6;
        }
        i71 i71Var = this.f37400s;
        if (i71Var.W == 14) {
            ArrayList arrayList = i71Var.B1;
            if (arrayList != null && i10 >= (i11 = this.f37396c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f37396c;
            if (i10 > i12 && (i10 - i12) - 1 < i71Var.C1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = i71Var.A1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (i71Var.W == 13 || ((zg.p0) i71Var.A1.get((i10 - this.d) - 1)).f49156g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= i71Var.D1.size()) {
            return 4;
        }
        if (i71Var.D1.get(i10 - this.h) instanceof f71) {
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
        zg.p0 p0Var;
        int cacheType2;
        int i13;
        int indexOf;
        i71 i71Var = this.f37400s;
        HashSet hashSet = i71Var.K;
        int i14 = i71Var.W;
        int i15 = i71Var.V;
        v51 v51Var = i71Var.f34468i0;
        int i16 = c1Var.f42705f;
        View view = c1Var.f42702a;
        if (i16 == 6) {
            n61 n61Var = (n61) view;
            ArrayList arrayList = i71Var.D1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) i71Var.D1.get(i10 - this.h);
                if (document2 instanceof f71) {
                    CharSequence charSequence = ((f71) document2).f33573a;
                    String str = i71Var.f34507z1;
                    n61Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, n61Var.f35958f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    n61Var.f35955a.setText(charSequence);
                    n61Var.b(false);
                }
            } else if (i10 == this.e) {
                n61Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                n61Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                n61Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            n61Var.f35957c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) i71Var.C1.get((i10 - this.f37396c) - 1);
            r61 r61Var = (r61) view;
            r61Var.a(v51Var);
            r61Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.j6.f19028m6, 0.2f), 0L, "tgs", document3, 0);
            r61Var.Q = true;
            r61Var.d = document3;
            r61Var.e = null;
        } else if (i16 == 4) {
            r61 r61Var2 = (r61) view;
            r61Var2.f37100c = i10;
            ImageReceiver imageReceiver = r61Var2.f37102n;
            ArrayList arrayList2 = i71Var.A1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                p0Var = (zg.p0) i71Var.A1.get(i10);
            } else {
                ArrayList arrayList3 = i71Var.B1;
                if (arrayList3 != null && i10 >= (i12 = this.f37396c) && i10 - i12 < arrayList3.size()) {
                    p0Var = (zg.p0) i71Var.B1.get(i10 - this.f37396c);
                } else {
                    return;
                }
            }
            if (r61Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(r61Var2);
                r61Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                r61Var2.h.onAttachedToWindow();
            }
            r61Var2.h.setParentView(v51Var);
            r61Var2.f37106x = p0Var;
            r61Var2.f37107y = false;
            r61Var2.d(i71Var.J.contains(p0Var), false);
            r61Var2.f37099b = false;
            r61Var2.invalidate();
            if (i14 == 13) {
                r61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f49155f));
            } else if (!p0Var.f49153b && p0Var.f49155f != null) {
                r61Var2.f37104s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(p0Var.f49155f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.f19028m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        r61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", p0Var, 0);
                    } else {
                        zg.p0 p0Var2 = p0Var;
                        r61Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a());
                } else {
                    r61Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                r61Var2.e = null;
                r61Var2.d = null;
                r61Var2.setDrawable(null);
                q61 q61Var = r61Var2.J;
                if (q61Var != null) {
                    q61Var.setVisibility(8);
                    r61Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && p0Var.f49153b) {
                    r61Var2.setDrawable(Emoji.getEmojiDrawable(p0Var.f49155f));
                }
            } else {
                r61Var2.f37104s = false;
                r61Var2.e = new org.telegram.ui.Components.x5(p0Var.f49156g, (Paint.FontMetricsInt) null);
                r61Var2.d = null;
                r61Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) v51Var.f35127d3.get(r61Var2.e.getDocumentId());
                if (o5Var == null) {
                    cacheType2 = i71Var.getCacheType();
                    o5Var = org.telegram.ui.Components.o5.n(i15, r61Var2.e.getDocumentId(), null, cacheType2);
                    v51Var.f35127d3.put(r61Var2.e.getDocumentId(), o5Var);
                }
                r61Var2.setDrawable(o5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && p0Var.f49153b && p0Var.d) {
                r61Var2.b();
                r61Var2.J.setVisibility(0);
                r61Var2.setEmojicon(null);
                return;
            }
            if (p0Var.e) {
                r61Var2.setEmojicon(p0Var.f49155f);
            } else {
                r61Var2.setEmojicon(null);
            }
            q61 q61Var2 = r61Var2.J;
            if (q61Var2 != null) {
                q61Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            r61 r61Var3 = (r61) view;
            r61Var3.f37098a = false;
            r61Var3.f37100c = i10;
            r61Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            r61Var3.setDrawable(null);
            ArrayList arrayList4 = i71Var.A1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                zg.p0 p0Var3 = (zg.p0) i71Var.A1.get(i10);
                r61Var3.f37106x = p0Var3;
                long j3 = p0Var3.f49156g;
                if (j3 == 0) {
                    boolean contains2 = i71Var.J.contains(p0Var3);
                    r61Var3.f37107y = true;
                    r61Var3.setDrawable(Emoji.getEmojiDrawable(p0Var3.f49155f));
                    r61Var3.d(contains2, false);
                    return;
                }
                l4 = Long.valueOf(j3);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && p0Var3.f49153b && p0Var3.d) {
                    r61Var3.b();
                    r61Var3.J.setVisibility(0);
                } else {
                    q61 q61Var3 = r61Var3.J;
                    if (q61Var3 != null) {
                        q61Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = i71Var.D1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) i71Var.D1.get(i10 - this.h);
                    if (!(document instanceof f71)) {
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
                    r61Var3.e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                    r61Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f18127id));
                } else {
                    org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(l4.longValue(), (Paint.FontMetricsInt) null);
                    r61Var3.e = x5Var;
                    r61Var3.d = x5Var.document;
                    contains = hashSet.contains(l4);
                }
                org.telegram.ui.Components.o5 o5Var2 = (org.telegram.ui.Components.o5) v51Var.f35127d3.get(r61Var3.e.getDocumentId());
                if (o5Var2 == null) {
                    cacheType = i71Var.getCacheType();
                    o5Var2 = org.telegram.ui.Components.o5.n(i15, r61Var3.e.getDocumentId(), null, cacheType);
                    v51Var.f35127d3.put(r61Var3.e.getDocumentId(), o5Var2);
                }
                r61Var3.setDrawable(o5Var2);
            }
            r61Var3.d(contains, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View r61Var;
        boolean z10;
        i71 i71Var = this.f37400s;
        if (i10 == 6) {
            Context context = i71Var.getContext();
            if (i71Var.W == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            r61Var = new n61(i71Var, context, z10);
        } else if (i10 == 7) {
            r61Var = new org.telegram.ui.Components.kn(i71Var.getContext(), 25);
            r61Var.setTag("searchbox");
        } else {
            r61Var = new r61(i71Var, i71Var.getContext());
        }
        if (i71.c(i71Var)) {
            r61Var.setScaleX(0.0f);
            r61Var.setScaleY(0.0f);
        }
        return new s4.c1(r61Var);
    }
}
