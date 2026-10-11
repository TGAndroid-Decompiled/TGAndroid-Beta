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
public final class t1 extends View implements org.telegram.ui.Cells.n9 {
    public final t70 f42024a;
    public final f4 f42025b;
    public final ImageReceiver f42026c;
    public final org.telegram.ui.Components.j9 d;
    public a3 f42027e;
    public a3 f42028f;
    public a3 h;
    public a3 f42029n;
    public boolean f42030r;
    public int f42031s;
    public int v;
    public int f42032w;
    public int f42033x;
    public TL_iv.pageBlockEmbedPost f42034y;

    public t1(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f42024a = t70Var;
        this.f42025b = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f42026c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f42028f;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f42027e;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            arrayList.add(a3Var3);
        }
        a3 a3Var4 = this.f42029n;
        if (a3Var4 != null) {
            arrayList.add(a3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f42028f;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.f42027e;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            a3Var3.attach(this);
        }
        a3 a3Var4 = this.f42029n;
        if (a3Var4 != null) {
            a3Var4.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f42028f;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.f42027e;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            a3Var3.detach(this);
        }
        a3 a3Var4 = this.f42029n;
        if (a3Var4 != null) {
            a3Var4.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        float f7;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f42034y;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof w3;
            t70 t70Var = this.f42024a;
            int i12 = 0;
            if (!z10) {
                if (this.f42030r) {
                    this.f42026c.draw(canvas);
                }
                int i13 = 54;
                if (this.f42028f != null) {
                    canvas.save();
                    if (this.f42030r) {
                        i11 = 54;
                    } else {
                        i11 = 0;
                    }
                    float dp = AndroidUtilities.dp(i11 + 32);
                    if (this.f42027e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    canvas.translate(dp, AndroidUtilities.dp(f7));
                    h4.v(t70Var, canvas, this, 0);
                    this.f42028f.draw(canvas, this);
                    canvas.restore();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.f42027e != null) {
                    canvas.save();
                    if (!this.f42030r) {
                        i13 = 0;
                    }
                    canvas.translate(AndroidUtilities.dp(i13 + 32), AndroidUtilities.dp(29.0f));
                    h4.v(t70Var, canvas, this, i10);
                    this.f42027e.draw(canvas, this);
                    canvas.restore();
                    i10++;
                }
                float dp2 = AndroidUtilities.dp(18.0f);
                float dp3 = AndroidUtilities.dp(6.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                int i14 = this.f42033x;
                if (this.f42034y.level == 0) {
                    i12 = AndroidUtilities.dp(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(dp2, dp3, dp4, i14 - i12, h4.f38255q1);
                i12 = i10;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f42031s, this.v);
                h4.v(t70Var, canvas2, this, i12);
                this.h.draw(canvas2, this);
                canvas2.restore();
                i12++;
            }
            if (this.f42029n != null) {
                canvas2.save();
                canvas2.translate(this.f42031s, this.v + this.f42032w);
                h4.v(t70Var, canvas2, this, i12);
                this.f42029n.draw(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f42028f != null) {
            sb2.append(", ");
            sb2.append(this.f42028f.d.getText());
        }
        if (this.f42027e != null) {
            sb2.append(", ");
            sb2.append(this.f42027e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f42029n != null) {
            sb2.append(", ");
            sb2.append(this.f42029n.d.getText());
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
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f42034y;
        int i15 = 1;
        if (pageblockembedpost != null) {
            boolean z11 = pageblockembedpost instanceof w3;
            f4 f4Var = this.f42025b;
            int i16 = 0;
            if (z11) {
                this.f42031s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.f42034y;
                a3 q6 = h4.q(this.f42024a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.f42025b);
                this.h = q6;
                if (q6 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f42032w = height;
                    i16 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.f42034y;
                TL_iv.RichText richText = pageblockembedpost3.caption.credit;
                if (f4Var.G) {
                    alignment2 = org.telegram.ui.Components.ox0.a();
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                a3 p5 = h4.p(this.f42024a, this, null, richText, dp, 0, pageblockembedpost3, alignment2, 0, this.f42025b);
                this.f42029n = p5;
                if (p5 != null) {
                    i16 += this.f42029n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i15 = i16;
            } else {
                long j3 = pageblockembedpost.author_photo_id;
                if (j3 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f42030r = z10;
                if (z10) {
                    TLRPC.Photo e7 = e4.e(f4Var.E, j3);
                    boolean z12 = e7 instanceof TLRPC.TL_photo;
                    this.f42030r = z12;
                    if (z12) {
                        String str = this.f42034y.author;
                        org.telegram.ui.Components.j9 j9Var = this.d;
                        j9Var.n(0L, str, null);
                        this.f42026c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e7.sizes, AndroidUtilities.dp(40.0f), true), e7), "40_40", j9Var, 0L, (String) null, f4Var.E, 1);
                    }
                }
                String str2 = this.f42034y.author;
                if (this.f42030r) {
                    i12 = 54;
                } else {
                    i12 = 0;
                }
                int dp2 = size - AndroidUtilities.dp(i12 + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.f42034y;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                a3 p10 = h4.p(this.f42024a, this, str2, null, dp2, 0, pageblockembedpost4, alignment3, 1, this.f42025b);
                this.f42028f = p10;
                if (p10 != null) {
                    if (this.f42030r) {
                        i14 = 54;
                    } else {
                        i14 = 0;
                    }
                    p10.f35862s = AndroidUtilities.dp(i14 + 32);
                    a3 a3Var = this.f42028f;
                    if (this.f42027e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    a3Var.v = AndroidUtilities.dp(f7);
                }
                if (this.f42034y.date != 0) {
                    String format = LocaleController.getInstance().getChatFullDate().format(this.f42034y.date * 1000);
                    if (this.f42030r) {
                        i13 = 54;
                    } else {
                        i13 = 0;
                    }
                    this.f42027e = h4.q(this.f42024a, this, format, null, size - AndroidUtilities.dp(i13 + 50), AndroidUtilities.dp(29.0f), this.f42034y, this.f42025b);
                } else {
                    this.f42027e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.f42034y.blocks.isEmpty()) {
                    this.f42031s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.f42034y;
                    a3 q10 = h4.q(this.f42024a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.f42025b);
                    this.h = q10;
                    if (q10 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f42032w = height2;
                        dp3 = org.telegram.messenger.q.C(4.0f, height2, dp3);
                    }
                    int i17 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.f42034y;
                    TL_iv.RichText richText2 = pageblockembedpost6.caption.credit;
                    if (f4Var.G) {
                        alignment = org.telegram.ui.Components.ox0.a();
                    } else {
                        alignment = alignment3;
                    }
                    a3 p11 = h4.p(this.f42024a, this, null, richText2, dp4, 0, pageblockembedpost6, alignment, 0, this.f42025b);
                    this.f42029n = p11;
                    if (p11 != null) {
                        dp3 = this.f42029n.d.getHeight() + AndroidUtilities.dp(4.0f) + i17;
                    } else {
                        dp3 = i17;
                    }
                } else {
                    this.h = null;
                    this.f42029n = null;
                }
                a3 a3Var2 = this.f42027e;
                if (a3Var2 != null) {
                    if (this.f42030r) {
                        i16 = 54;
                    }
                    a3Var2.f35862s = AndroidUtilities.dp(i16 + 32);
                    this.f42027e.v = AndroidUtilities.dp(29.0f);
                }
                a3 a3Var3 = this.h;
                if (a3Var3 != null) {
                    a3Var3.f35862s = this.f42031s;
                    a3Var3.v = this.v;
                }
                a3 a3Var4 = this.f42029n;
                if (a3Var4 != null) {
                    a3Var4.f35862s = this.f42031s;
                    a3Var4.v = this.v;
                }
                i15 = dp3;
            }
            this.f42033x = i15;
        }
        setMeasuredDimension(size, i15);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f42024a, this.f42025b, motionEvent, this, this.h, this.f42031s, this.v)) {
            if (!h4.l(this.f42024a, this.f42025b, motionEvent, this, this.f42029n, this.f42031s, this.v + this.f42032w) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.f42034y = pageblockembedpost;
        requestLayout();
    }
}
