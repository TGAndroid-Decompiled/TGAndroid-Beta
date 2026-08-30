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
public final class z51 extends org.telegram.ui.Components.rl0 {
    public int f40685c;
    public int d;
    public int h;
    public final q61 f40689s;
    public int e = -1;
    public int f40686f = -1;
    public int f40687n = 1;
    public final ArrayList f40688r = new ArrayList();

    public z51(q61 q61Var) {
        this.f40689s = q61Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z4) {
        q61 q61Var = this.f40689s;
        int i10 = q61Var.T;
        boolean z10 = q61Var.F;
        ArrayList arrayList = this.f40688r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f40685c = -1;
        boolean z11 = false;
        this.f40687n = 0;
        arrayList.clear();
        ArrayList arrayList2 = q61Var.f37648x1;
        if (arrayList2 != null) {
            if (i10 == 4 && !arrayList2.isEmpty()) {
                int i11 = this.f40687n;
                this.f40687n = i11 + 1;
                this.e = i11;
                arrayList.add(1);
            }
            this.d = this.f40687n;
            for (int i12 = 0; i12 < q61Var.f37648x1.size(); i12++) {
                this.f40687n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, q61Var.f37648x1.get(i12))));
            }
        }
        if (i10 == 14) {
            ArrayList arrayList3 = q61Var.f37651y1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i13 = this.f40687n;
                this.f40687n = i13 + 1;
                this.f40686f = i13;
                arrayList.add(2);
                this.f40685c = this.f40687n;
                for (int i14 = 0; i14 < q61Var.f37651y1.size(); i14++) {
                    this.f40687n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, q61Var.f37651y1.get(i14))));
                }
            }
        } else {
            ArrayList arrayList4 = q61Var.f37653z1;
            if (arrayList4 != null) {
                if (i10 == 4 && !arrayList4.isEmpty()) {
                    int i15 = this.f40687n;
                    this.f40687n = i15 + 1;
                    this.f40686f = i15;
                    arrayList.add(2);
                }
                this.f40685c = this.f40687n;
                for (int i16 = 0; i16 < q61Var.f37653z1.size(); i16++) {
                    this.f40687n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, q61Var.f37653z1.get(i16))));
                }
            }
        }
        ArrayList arrayList5 = q61Var.A1;
        if (arrayList5 != null) {
            int i17 = this.f40687n;
            this.h = i17;
            this.f40687n = arrayList5.size() + i17;
        }
        l();
        if (q61Var.f37642v1 && this.f40687n == 0) {
            z11 = true;
        }
        if (q61Var.D1 != z11) {
            q61Var.D1 = z11;
            ValueAnimator valueAnimator = q61Var.E1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            q61Var.E1 = ofFloat;
            ofFloat.addUpdateListener(new u41(q61Var, z11, 1));
            q61Var.E1.addListener(new i51(q61Var, z11, 1));
            q61Var.E1.setInterpolator(org.telegram.ui.Components.nr.h);
            q61Var.E1.setDuration(100L);
            q61Var.E1.start();
            if (z11) {
                q61.D(q61Var.S, q61Var.f37614i0);
            }
        }
    }

    @Override
    public final int h() {
        return this.f40687n;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (i10 == this.e || i10 == this.f40686f) {
            return 6;
        }
        q61 q61Var = this.f40689s;
        if (q61Var.T == 14) {
            ArrayList arrayList = q61Var.f37651y1;
            if (arrayList != null && i10 >= (i11 = this.f40685c) && i10 - i11 < arrayList.size()) {
                return 4;
            }
        } else {
            int i12 = this.f40685c;
            if (i10 > i12 && (i10 - i12) - 1 < q61Var.f37653z1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = q61Var.f37648x1;
        if (arrayList2 == null) {
            return 3;
        }
        int i13 = this.d;
        if (i10 > i13 && (i10 - i13) - 1 < arrayList2.size() && (q61Var.T == 13 || ((mg.q0) q61Var.f37648x1.get((i10 - this.d) - 1)).f14108g != 0)) {
            return 3;
        }
        int i14 = this.h;
        if (i10 - i14 < 0 || i10 - i14 >= q61Var.A1.size()) {
            return 4;
        }
        if (q61Var.A1.get(i10 - this.h) instanceof n61) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.Document document;
        Long l10;
        int i11;
        boolean contains;
        int cacheType;
        int i12;
        mg.q0 q0Var;
        int cacheType2;
        int i13;
        int indexOf;
        q61 q61Var = this.f40689s;
        HashSet hashSet = q61Var.H;
        int i14 = q61Var.T;
        int i15 = q61Var.S;
        b51 b51Var = q61Var.f37608f0;
        int i16 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i16 == 6) {
            u51 u51Var = (u51) view;
            ArrayList arrayList = q61Var.A1;
            if (arrayList != null && (i13 = i10 - this.h) >= 0 && i13 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) q61Var.A1.get(i10 - this.h);
                if (document2 instanceof n61) {
                    CharSequence charSequence = ((n61) document2).f36472a;
                    String str = q61Var.f37645w1;
                    u51Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, u51Var.f38848f.W0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    u51Var.f38845a.setText(charSequence);
                    u51Var.b(false);
                }
            } else if (i10 == this.e) {
                u51Var.a(LocaleController.getString(R.string.Emoji), false);
            } else if (i14 == 14) {
                u51Var.a(LocaleController.getString(R.string.StickerEffects), false);
            } else {
                u51Var.a(LocaleController.getString(R.string.AccDescrStickers), false);
            }
            u51Var.f38847c.setVisibility(8);
        } else if (i16 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) q61Var.f37653z1.get((i10 - this.f40685c) - 1);
            y51 y51Var = (y51) view;
            y51Var.a(b51Var);
            y51Var.h.setImage(ImageLocation.getForDocument(document3), "100_100_firstframe", null, null, DocumentObject.getSvgThumb(document3, org.telegram.ui.ActionBar.j6.f20067m6, 0.2f), 0L, "tgs", document3, 0);
            y51Var.N = true;
            y51Var.d = document3;
            y51Var.e = null;
        } else if (i16 == 4) {
            y51 y51Var2 = (y51) view;
            y51Var2.f40401c = i10;
            ImageReceiver imageReceiver = y51Var2.f40403n;
            ArrayList arrayList2 = q61Var.f37648x1;
            if (arrayList2 != null && i10 >= 0 && i10 < arrayList2.size()) {
                q0Var = (mg.q0) q61Var.f37648x1.get(i10);
            } else {
                ArrayList arrayList3 = q61Var.f37651y1;
                if (arrayList3 != null && i10 >= (i12 = this.f40685c) && i10 - i12 < arrayList3.size()) {
                    q0Var = (mg.q0) q61Var.f37651y1.get(i10 - this.f40685c);
                } else {
                    return;
                }
            }
            if (y51Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(y51Var2);
                y51Var2.h = imageReceiver2;
                imageReceiver2.setLayerNum(7);
                y51Var2.h.onAttachedToWindow();
            }
            y51Var2.h.setParentView(b51Var);
            y51Var2.f40407x = q0Var;
            y51Var2.f40408y = false;
            y51Var2.d(q61Var.G.contains(q0Var), false);
            y51Var2.f40400b = false;
            y51Var2.invalidate();
            if (i14 == 13) {
                y51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f14107f));
            } else if (!q0Var.f14105b && q0Var.f14107f != null) {
                y51Var2.f40405s = true;
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i15).getReactionsMap().get(q0Var.f14107f);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.j6.f20067m6, 0.2f);
                    if (!LiteMode.isEnabled(8200)) {
                        y51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, svgThumb, 0L, "tgs", q0Var, 0);
                    } else {
                        mg.q0 q0Var2 = q0Var;
                        y51Var2.h.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", ImageLocation.getForDocument(tL_availableReaction.select_animation), "30_30_firstframe", null, null, svgThumb, 0L, "tgs", q0Var2, 0);
                        q0Var = q0Var2;
                    }
                    MediaDataController.getInstance(i15).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), mg.m0.a());
                } else {
                    y51Var2.h.clearImage();
                    imageReceiver.clearImage();
                }
                y51Var2.e = null;
                y51Var2.d = null;
                y51Var2.setDrawable(null);
                x51 x51Var = y51Var2.G;
                if (x51Var != null) {
                    x51Var.setVisibility(8);
                    y51Var2.G.setImageReceiver(null);
                }
                if (tL_availableReaction == null && q0Var.f14105b) {
                    y51Var2.setDrawable(Emoji.getEmojiDrawable(q0Var.f14107f));
                }
            } else {
                y51Var2.f40405s = false;
                y51Var2.e = new org.telegram.ui.Components.u5(q0Var.f14108g, (Paint.FontMetricsInt) null);
                y51Var2.d = null;
                y51Var2.h.clearImage();
                imageReceiver.clearImage();
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) b51Var.f37923a3.get(y51Var2.e.getDocumentId());
                if (l5Var == null) {
                    cacheType2 = q61Var.getCacheType();
                    l5Var = org.telegram.ui.Components.l5.n(i15, y51Var2.e.getDocumentId(), null, cacheType2);
                    b51Var.f37923a3.put(y51Var2.e.getDocumentId(), l5Var);
                }
                y51Var2.setDrawable(l5Var);
            }
            if (!UserConfig.getInstance(i15).isPremium() && i14 == 14 && q0Var.f14105b && q0Var.d) {
                y51Var2.b();
                y51Var2.G.setVisibility(0);
                y51Var2.setEmojicon(null);
                return;
            }
            if (q0Var.e) {
                y51Var2.setEmojicon(q0Var.f14107f);
            } else {
                y51Var2.setEmojicon(null);
            }
            x51 x51Var2 = y51Var2.G;
            if (x51Var2 != null) {
                x51Var2.setVisibility(4);
            }
        } else if (i16 == 3) {
            y51 y51Var3 = (y51) view;
            y51Var3.f40399a = false;
            y51Var3.f40401c = i10;
            y51Var3.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            y51Var3.setDrawable(null);
            ArrayList arrayList4 = q61Var.f37648x1;
            if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                mg.q0 q0Var3 = (mg.q0) q61Var.f37648x1.get(i10);
                y51Var3.f40407x = q0Var3;
                long j10 = q0Var3.f14108g;
                if (j10 == 0) {
                    boolean contains2 = q61Var.G.contains(q0Var3);
                    y51Var3.f40408y = true;
                    y51Var3.setDrawable(Emoji.getEmojiDrawable(q0Var3.f14107f));
                    y51Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j10);
                if (i14 == 14 && !UserConfig.getInstance(i15).isPremium() && q0Var3.f14105b && q0Var3.d) {
                    y51Var3.b();
                    y51Var3.G.setVisibility(0);
                } else {
                    x51 x51Var3 = y51Var3.G;
                    if (x51Var3 != null) {
                        x51Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = q61Var.A1;
                if (arrayList5 != null && (i11 = i10 - this.h) >= 0 && i11 < arrayList5.size()) {
                    document = (TLRPC.Document) q61Var.A1.get(i10 - this.h);
                    if (!(document instanceof n61)) {
                        l10 = null;
                    }
                }
                document = null;
                l10 = null;
            }
            if (l10 == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    y51Var3.e = new org.telegram.ui.Components.u5(document, (Paint.FontMetricsInt) null);
                    y51Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f19190id));
                } else {
                    org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(l10.longValue(), (Paint.FontMetricsInt) null);
                    y51Var3.e = u5Var;
                    y51Var3.d = u5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.l5 l5Var2 = (org.telegram.ui.Components.l5) b51Var.f37923a3.get(y51Var3.e.getDocumentId());
                if (l5Var2 == null) {
                    cacheType = q61Var.getCacheType();
                    l5Var2 = org.telegram.ui.Components.l5.n(i15, y51Var3.e.getDocumentId(), null, cacheType);
                    b51Var.f37923a3.put(y51Var3.e.getDocumentId(), l5Var2);
                }
                y51Var3.setDrawable(l5Var2);
            }
            y51Var3.d(contains, false);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View y51Var;
        boolean z4;
        q61 q61Var = this.f40689s;
        if (i10 == 6) {
            Context context = q61Var.getContext();
            if (q61Var.T == 6) {
                z4 = true;
            } else {
                z4 = false;
            }
            y51Var = new u51(q61Var, context, z4);
        } else if (i10 == 7) {
            y51Var = new org.telegram.ui.Components.hn(q61Var.getContext(), 22);
            y51Var.setTag("searchbox");
        } else {
            y51Var = new y51(q61Var, q61Var.getContext());
        }
        if (q61.c(q61Var)) {
            y51Var.setScaleX(0.0f);
            y51Var.setScaleY(0.0f);
        }
        return new f2.l1(y51Var);
    }
}
