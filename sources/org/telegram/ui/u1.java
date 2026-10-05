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
public final class u1 extends View implements org.telegram.ui.Cells.p9 {
    public final t70 f41069a;
    public final g4 f41070b;
    public final ImageReceiver f41071c;
    public final org.telegram.ui.Components.h9 d;
    public b3 f41072e;
    public b3 f41073f;
    public b3 h;
    public b3 f41074n;
    public boolean f41075r;
    public int f41076s;
    public int v;
    public int f41077w;
    public int f41078x;
    public TL_iv.pageBlockEmbedPost f41079y;

    public u1(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f41069a = t70Var;
        this.f41070b = g4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f41071c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f41073f;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.f41072e;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
        b3 b3Var3 = this.h;
        if (b3Var3 != null) {
            arrayList.add(b3Var3);
        }
        b3 b3Var4 = this.f41074n;
        if (b3Var4 != null) {
            arrayList.add(b3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f41073f;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.f41072e;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
        b3 b3Var3 = this.h;
        if (b3Var3 != null) {
            b3Var3.attach(this);
        }
        b3 b3Var4 = this.f41074n;
        if (b3Var4 != null) {
            b3Var4.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f41073f;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.f41072e;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
        b3 b3Var3 = this.h;
        if (b3Var3 != null) {
            b3Var3.detach(this);
        }
        b3 b3Var4 = this.f41074n;
        if (b3Var4 != null) {
            b3Var4.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        float f7;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f41079y;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof x3;
            t70 t70Var = this.f41069a;
            int i12 = 0;
            if (!z10) {
                if (this.f41075r) {
                    this.f41071c.draw(canvas);
                }
                int i13 = 54;
                if (this.f41073f != null) {
                    canvas.save();
                    if (this.f41075r) {
                        i11 = 54;
                    } else {
                        i11 = 0;
                    }
                    float dp = AndroidUtilities.dp(i11 + 32);
                    if (this.f41072e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    canvas.translate(dp, AndroidUtilities.dp(f7));
                    i4.v(t70Var, canvas, this, 0);
                    this.f41073f.draw(canvas, this);
                    canvas.restore();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.f41072e != null) {
                    canvas.save();
                    if (!this.f41075r) {
                        i13 = 0;
                    }
                    canvas.translate(AndroidUtilities.dp(i13 + 32), AndroidUtilities.dp(29.0f));
                    i4.v(t70Var, canvas, this, i10);
                    this.f41072e.draw(canvas, this);
                    canvas.restore();
                    i10++;
                }
                float dp2 = AndroidUtilities.dp(18.0f);
                float dp3 = AndroidUtilities.dp(6.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                int i14 = this.f41078x;
                if (this.f41079y.level == 0) {
                    i12 = AndroidUtilities.dp(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(dp2, dp3, dp4, i14 - i12, i4.f37253q1);
                i12 = i10;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f41076s, this.v);
                i4.v(t70Var, canvas2, this, i12);
                this.h.draw(canvas2, this);
                canvas2.restore();
                i12++;
            }
            if (this.f41074n != null) {
                canvas2.save();
                canvas2.translate(this.f41076s, this.v + this.f41077w);
                i4.v(t70Var, canvas2, this, i12);
                this.f41074n.draw(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f41073f != null) {
            sb2.append(", ");
            sb2.append(this.f41073f.d.getText());
        }
        if (this.f41072e != null) {
            sb2.append(", ");
            sb2.append(this.f41072e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f41074n != null) {
            sb2.append(", ");
            sb2.append(this.f41074n.d.getText());
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
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f41079y;
        int i15 = 1;
        if (pageblockembedpost != null) {
            boolean z11 = pageblockembedpost instanceof x3;
            g4 g4Var = this.f41070b;
            int i16 = 0;
            if (z11) {
                this.f41076s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.f41079y;
                b3 q6 = i4.q(this.f41069a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.f41070b);
                this.h = q6;
                if (q6 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f41077w = height;
                    i16 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.f41079y;
                TL_iv.RichText richText = pageblockembedpost3.caption.credit;
                if (g4Var.G) {
                    alignment2 = org.telegram.ui.Components.gx0.a();
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                b3 p5 = i4.p(this.f41069a, this, null, richText, dp, 0, pageblockembedpost3, alignment2, 0, this.f41070b);
                this.f41074n = p5;
                if (p5 != null) {
                    i16 += this.f41074n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i15 = i16;
            } else {
                long j3 = pageblockembedpost.author_photo_id;
                if (j3 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f41075r = z10;
                if (z10) {
                    TLRPC.Photo e7 = f4.e(g4Var.E, j3);
                    boolean z12 = e7 instanceof TLRPC.TL_photo;
                    this.f41075r = z12;
                    if (z12) {
                        String str = this.f41079y.author;
                        org.telegram.ui.Components.h9 h9Var = this.d;
                        h9Var.n(0L, str, null);
                        this.f41071c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e7.sizes, AndroidUtilities.dp(40.0f), true), e7), "40_40", h9Var, 0L, (String) null, g4Var.E, 1);
                    }
                }
                String str2 = this.f41079y.author;
                if (this.f41075r) {
                    i12 = 54;
                } else {
                    i12 = 0;
                }
                int dp2 = size - AndroidUtilities.dp(i12 + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.f41079y;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                b3 p10 = i4.p(this.f41069a, this, str2, null, dp2, 0, pageblockembedpost4, alignment3, 1, this.f41070b);
                this.f41073f = p10;
                if (p10 != null) {
                    if (this.f41075r) {
                        i14 = 54;
                    } else {
                        i14 = 0;
                    }
                    p10.f35035s = AndroidUtilities.dp(i14 + 32);
                    b3 b3Var = this.f41073f;
                    if (this.f41072e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    b3Var.v = AndroidUtilities.dp(f7);
                }
                if (this.f41079y.date != 0) {
                    String format = LocaleController.getInstance().getChatFullDate().format(this.f41079y.date * 1000);
                    if (this.f41075r) {
                        i13 = 54;
                    } else {
                        i13 = 0;
                    }
                    this.f41072e = i4.q(this.f41069a, this, format, null, size - AndroidUtilities.dp(i13 + 50), AndroidUtilities.dp(29.0f), this.f41079y, this.f41070b);
                } else {
                    this.f41072e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.f41079y.blocks.isEmpty()) {
                    this.f41076s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.f41079y;
                    b3 q10 = i4.q(this.f41069a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.f41070b);
                    this.h = q10;
                    if (q10 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f41077w = height2;
                        dp3 = org.telegram.messenger.q.C(4.0f, height2, dp3);
                    }
                    int i17 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.f41079y;
                    TL_iv.RichText richText2 = pageblockembedpost6.caption.credit;
                    if (g4Var.G) {
                        alignment = org.telegram.ui.Components.gx0.a();
                    } else {
                        alignment = alignment3;
                    }
                    b3 p11 = i4.p(this.f41069a, this, null, richText2, dp4, 0, pageblockembedpost6, alignment, 0, this.f41070b);
                    this.f41074n = p11;
                    if (p11 != null) {
                        dp3 = this.f41074n.d.getHeight() + AndroidUtilities.dp(4.0f) + i17;
                    } else {
                        dp3 = i17;
                    }
                } else {
                    this.h = null;
                    this.f41074n = null;
                }
                b3 b3Var2 = this.f41072e;
                if (b3Var2 != null) {
                    if (this.f41075r) {
                        i16 = 54;
                    }
                    b3Var2.f35035s = AndroidUtilities.dp(i16 + 32);
                    this.f41072e.v = AndroidUtilities.dp(29.0f);
                }
                b3 b3Var3 = this.h;
                if (b3Var3 != null) {
                    b3Var3.f35035s = this.f41076s;
                    b3Var3.v = this.v;
                }
                b3 b3Var4 = this.f41074n;
                if (b3Var4 != null) {
                    b3Var4.f35035s = this.f41076s;
                    b3Var4.v = this.v;
                }
                i15 = dp3;
            }
            this.f41078x = i15;
        }
        setMeasuredDimension(size, i15);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f41069a, this.f41070b, motionEvent, this, this.h, this.f41076s, this.v)) {
            if (!i4.l(this.f41069a, this.f41070b, motionEvent, this, this.f41074n, this.f41076s, this.v + this.f41077w) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.f41079y = pageblockembedpost;
        requestLayout();
    }
}
