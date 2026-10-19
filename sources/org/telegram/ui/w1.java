package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class w1 extends View implements org.telegram.ui.Cells.m9 {
    public final b70 f42423a;
    public final j4 f42424b;
    public final ImageReceiver f42425c;
    public final org.telegram.ui.Components.h9 d;
    public d3 e;
    public d3 f42426f;
    public d3 h;
    public d3 f42427n;
    public boolean f42428r;
    public int f42429s;
    public int v;
    public int f42430w;
    public int f42431x;
    public TL_iv.pageBlockEmbedPost f42432y;

    public w1(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f42423a = b70Var;
        this.f42424b = j4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f42425c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f42426f;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.e;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
        d3 d3Var3 = this.h;
        if (d3Var3 != null) {
            arrayList.add(d3Var3);
        }
        d3 d3Var4 = this.f42427n;
        if (d3Var4 != null) {
            arrayList.add(d3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f42426f;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.e;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
        d3 d3Var3 = this.h;
        if (d3Var3 != null) {
            d3Var3.attach(this);
        }
        d3 d3Var4 = this.f42427n;
        if (d3Var4 != null) {
            d3Var4.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f42426f;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.e;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
        d3 d3Var3 = this.h;
        if (d3Var3 != null) {
            d3Var3.detach(this);
        }
        d3 d3Var4 = this.f42427n;
        if (d3Var4 != null) {
            d3Var4.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        float f7;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f42432y;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof z3;
            b70 b70Var = this.f42423a;
            int i12 = 0;
            if (!z10) {
                if (this.f42428r) {
                    this.f42425c.draw(canvas);
                }
                int i13 = 54;
                if (this.f42426f != null) {
                    canvas.save();
                    if (this.f42428r) {
                        i11 = 54;
                    } else {
                        i11 = 0;
                    }
                    float dp = AndroidUtilities.dp(i11 + 32);
                    if (this.e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    canvas.translate(dp, AndroidUtilities.dp(f7));
                    l4.v(b70Var, canvas, this, 0);
                    this.f42426f.draw(canvas, this);
                    canvas.restore();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.e != null) {
                    canvas.save();
                    if (!this.f42428r) {
                        i13 = 0;
                    }
                    canvas.translate(AndroidUtilities.dp(i13 + 32), AndroidUtilities.dp(29.0f));
                    l4.v(b70Var, canvas, this, i10);
                    this.e.draw(canvas, this);
                    canvas.restore();
                    i10++;
                }
                float dp2 = AndroidUtilities.dp(18.0f);
                float dp3 = AndroidUtilities.dp(6.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                int i14 = this.f42431x;
                if (this.f42432y.level == 0) {
                    i12 = AndroidUtilities.dp(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(dp2, dp3, dp4, i14 - i12, l4.f38742q1);
                i12 = i10;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f42429s, this.v);
                l4.v(b70Var, canvas2, this, i12);
                this.h.draw(canvas2, this);
                canvas2.restore();
                i12++;
            }
            if (this.f42427n != null) {
                canvas2.save();
                canvas2.translate(this.f42429s, this.v + this.f42430w);
                l4.v(b70Var, canvas2, this, i12);
                this.f42427n.draw(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f42426f != null) {
            sb2.append(", ");
            sb2.append(this.f42426f.d.getText());
        }
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f42427n != null) {
            sb2.append(", ");
            sb2.append(this.f42427n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        Layout.Alignment alignment;
        int i13;
        int i14;
        float f7;
        Layout.Alignment alignment2;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f42432y;
        int i15 = 1;
        if (pageblockembedpost != null) {
            boolean z11 = pageblockembedpost instanceof z3;
            j4 j4Var = this.f42424b;
            int i16 = 0;
            if (z11) {
                this.f42429s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.f42432y;
                d3 q6 = l4.q(this.f42423a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.f42424b);
                this.h = q6;
                if (q6 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f42430w = height;
                    i16 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.f42432y;
                TL_iv.RichText richText = pageblockembedpost3.caption.credit;
                if (j4Var.G) {
                    alignment2 = org.telegram.ui.Components.ex0.a();
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                d3 p5 = l4.p(this.f42423a, this, null, richText, dp, 0, pageblockembedpost3, alignment2, 0, this.f42424b);
                this.f42427n = p5;
                if (p5 != null) {
                    i16 += this.f42427n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i15 = i16;
            } else {
                long j10 = pageblockembedpost.author_photo_id;
                if (j10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f42428r = z10;
                if (z10) {
                    TLRPC.Photo e = h4.e(j4Var.E, j10);
                    boolean z12 = e instanceof TLRPC.TL_photo;
                    this.f42428r = z12;
                    if (z12) {
                        String str = this.f42432y.author;
                        org.telegram.ui.Components.h9 h9Var = this.d;
                        h9Var.n(0L, str, null);
                        this.f42425c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e.sizes, AndroidUtilities.dp(40.0f), true), e), "40_40", h9Var, 0L, (String) null, j4Var.E, 1);
                    }
                }
                String str2 = this.f42432y.author;
                if (this.f42428r) {
                    i12 = 54;
                } else {
                    i12 = 0;
                }
                int dp2 = size - AndroidUtilities.dp(i12 + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.f42432y;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                d3 p9 = l4.p(this.f42423a, this, str2, null, dp2, 0, pageblockembedpost4, alignment3, 1, this.f42424b);
                this.f42426f = p9;
                if (p9 != null) {
                    if (this.f42428r) {
                        i14 = 54;
                    } else {
                        i14 = 0;
                    }
                    p9.f36235s = AndroidUtilities.dp(i14 + 32);
                    d3 d3Var = this.f42426f;
                    if (this.e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    d3Var.v = AndroidUtilities.dp(f7);
                }
                if (this.f42432y.date != 0) {
                    String format = LocaleController.getInstance().getChatFullDate().format(this.f42432y.date * 1000);
                    if (this.f42428r) {
                        i13 = 54;
                    } else {
                        i13 = 0;
                    }
                    this.e = l4.q(this.f42423a, this, format, null, size - AndroidUtilities.dp(i13 + 50), AndroidUtilities.dp(29.0f), this.f42432y, this.f42424b);
                } else {
                    this.e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.f42432y.blocks.isEmpty()) {
                    this.f42429s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.f42432y;
                    d3 q10 = l4.q(this.f42423a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.f42424b);
                    this.h = q10;
                    if (q10 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f42430w = height2;
                        dp3 = org.telegram.messenger.g0.C(4.0f, height2, dp3);
                    }
                    int i17 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.f42432y;
                    TL_iv.RichText richText2 = pageblockembedpost6.caption.credit;
                    if (j4Var.G) {
                        alignment = org.telegram.ui.Components.ex0.a();
                    } else {
                        alignment = alignment3;
                    }
                    d3 p10 = l4.p(this.f42423a, this, null, richText2, dp4, 0, pageblockembedpost6, alignment, 0, this.f42424b);
                    this.f42427n = p10;
                    if (p10 != null) {
                        dp3 = this.f42427n.d.getHeight() + AndroidUtilities.dp(4.0f) + i17;
                    } else {
                        dp3 = i17;
                    }
                } else {
                    this.h = null;
                    this.f42427n = null;
                }
                d3 d3Var2 = this.e;
                if (d3Var2 != null) {
                    if (this.f42428r) {
                        i16 = 54;
                    }
                    d3Var2.f36235s = AndroidUtilities.dp(i16 + 32);
                    this.e.v = AndroidUtilities.dp(29.0f);
                }
                d3 d3Var3 = this.h;
                if (d3Var3 != null) {
                    d3Var3.f36235s = this.f42429s;
                    d3Var3.v = this.v;
                }
                d3 d3Var4 = this.f42427n;
                if (d3Var4 != null) {
                    d3Var4.f36235s = this.f42429s;
                    d3Var4.v = this.v;
                }
                i15 = dp3;
            }
            this.f42431x = i15;
        }
        setMeasuredDimension(size, i15);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f42423a, this.f42424b, motionEvent, this, this.h, this.f42429s, this.v)) {
            if (!l4.l(this.f42423a, this.f42424b, motionEvent, this, this.f42427n, this.f42429s, this.v + this.f42430w) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.f42432y = pageblockembedpost;
        requestLayout();
    }
}
