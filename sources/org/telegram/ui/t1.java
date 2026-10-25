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
public final class t1 extends View implements org.telegram.ui.Cells.r9 {
    public final h70 f43642a;
    public final h4 f43643b;
    public final ImageReceiver f43644c;
    public final org.telegram.ui.Components.j9 d;
    public a3 e;
    public a3 f43645f;
    public a3 h;
    public a3 f43646n;
    public boolean f43647r;
    public int f43648s;
    public int v;
    public int f43649w;
    public int f43650x;
    public TL_iv.pageBlockEmbedPost f43651y;

    public t1(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f43642a = h70Var;
        this.f43643b = h4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f43644c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f43645f;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            arrayList.add(a3Var3);
        }
        a3 a3Var4 = this.f43646n;
        if (a3Var4 != null) {
            arrayList.add(a3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f43645f;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            a3Var3.attach(this);
        }
        a3 a3Var4 = this.f43646n;
        if (a3Var4 != null) {
            a3Var4.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f43645f;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
        a3 a3Var3 = this.h;
        if (a3Var3 != null) {
            a3Var3.detach(this);
        }
        a3 a3Var4 = this.f43646n;
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
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f43651y;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof x3;
            h70 h70Var = this.f43642a;
            int i12 = 0;
            if (!z10) {
                if (this.f43647r) {
                    this.f43644c.draw(canvas);
                }
                int i13 = 54;
                if (this.f43645f != null) {
                    canvas.save();
                    if (this.f43647r) {
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
                    j4.v(h70Var, canvas, this, 0);
                    this.f43645f.draw(canvas, this);
                    canvas.restore();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.e != null) {
                    canvas.save();
                    if (!this.f43647r) {
                        i13 = 0;
                    }
                    canvas.translate(AndroidUtilities.dp(i13 + 32), AndroidUtilities.dp(29.0f));
                    j4.v(h70Var, canvas, this, i10);
                    this.e.draw(canvas, this);
                    canvas.restore();
                    i10++;
                }
                float dp2 = AndroidUtilities.dp(18.0f);
                float dp3 = AndroidUtilities.dp(6.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                int i14 = this.f43650x;
                if (this.f43651y.level == 0) {
                    i12 = AndroidUtilities.dp(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(dp2, dp3, dp4, i14 - i12, j4.f40416r1);
                i12 = i10;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f43648s, this.v);
                j4.v(h70Var, canvas2, this, i12);
                this.h.draw(canvas2, this);
                canvas2.restore();
                i12++;
            }
            if (this.f43646n != null) {
                canvas2.save();
                canvas2.translate(this.f43648s, this.v + this.f43649w);
                j4.v(h70Var, canvas2, this, i12);
                this.f43646n.draw(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f43645f != null) {
            sb2.append(", ");
            sb2.append(this.f43645f.d.getText());
        }
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f43646n != null) {
            sb2.append(", ");
            sb2.append(this.f43646n.d.getText());
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
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f43651y;
        int i15 = 1;
        if (pageblockembedpost != null) {
            boolean z11 = pageblockembedpost instanceof x3;
            h4 h4Var = this.f43643b;
            int i16 = 0;
            if (z11) {
                this.f43648s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.f43651y;
                a3 q5 = j4.q(this.f43642a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.f43643b);
                this.h = q5;
                if (q5 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f43649w = height;
                    i16 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.f43651y;
                TL_iv.RichText richText = pageblockembedpost3.caption.credit;
                if (h4Var.G) {
                    alignment2 = org.telegram.ui.Components.px0.a();
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                a3 p10 = j4.p(this.f43642a, this, null, richText, dp, 0, pageblockembedpost3, alignment2, 0, this.f43643b);
                this.f43646n = p10;
                if (p10 != null) {
                    i16 += this.f43646n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i15 = i16;
            } else {
                long j10 = pageblockembedpost.author_photo_id;
                if (j10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f43647r = z10;
                if (z10) {
                    TLRPC.Photo e = f4.e(h4Var.E, j10);
                    boolean z12 = e instanceof TLRPC.TL_photo;
                    this.f43647r = z12;
                    if (z12) {
                        String str = this.f43651y.author;
                        org.telegram.ui.Components.j9 j9Var = this.d;
                        j9Var.n(0L, str, null);
                        this.f43644c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e.sizes, AndroidUtilities.dp(40.0f), true), e), "40_40", j9Var, 0L, (String) null, h4Var.E, 1);
                    }
                }
                String str2 = this.f43651y.author;
                if (this.f43647r) {
                    i12 = 54;
                } else {
                    i12 = 0;
                }
                int dp2 = size - AndroidUtilities.dp(i12 + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.f43651y;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                a3 p11 = j4.p(this.f43642a, this, str2, null, dp2, 0, pageblockembedpost4, alignment3, 1, this.f43643b);
                this.f43645f = p11;
                if (p11 != null) {
                    if (this.f43647r) {
                        i14 = 54;
                    } else {
                        i14 = 0;
                    }
                    p11.f37631s = AndroidUtilities.dp(i14 + 32);
                    a3 a3Var = this.f43645f;
                    if (this.e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    a3Var.v = AndroidUtilities.dp(f7);
                }
                if (this.f43651y.date != 0) {
                    String format = LocaleController.getInstance().getChatFullDate().format(this.f43651y.date * 1000);
                    if (this.f43647r) {
                        i13 = 54;
                    } else {
                        i13 = 0;
                    }
                    this.e = j4.q(this.f43642a, this, format, null, size - AndroidUtilities.dp(i13 + 50), AndroidUtilities.dp(29.0f), this.f43651y, this.f43643b);
                } else {
                    this.e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.f43651y.blocks.isEmpty()) {
                    this.f43648s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.f43651y;
                    a3 q9 = j4.q(this.f43642a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.f43643b);
                    this.h = q9;
                    if (q9 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f43649w = height2;
                        dp3 = org.telegram.messenger.t.D(4.0f, height2, dp3);
                    }
                    int i17 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.f43651y;
                    TL_iv.RichText richText2 = pageblockembedpost6.caption.credit;
                    if (h4Var.G) {
                        alignment = org.telegram.ui.Components.px0.a();
                    } else {
                        alignment = alignment3;
                    }
                    a3 p12 = j4.p(this.f43642a, this, null, richText2, dp4, 0, pageblockembedpost6, alignment, 0, this.f43643b);
                    this.f43646n = p12;
                    if (p12 != null) {
                        dp3 = this.f43646n.d.getHeight() + AndroidUtilities.dp(4.0f) + i17;
                    } else {
                        dp3 = i17;
                    }
                } else {
                    this.h = null;
                    this.f43646n = null;
                }
                a3 a3Var2 = this.e;
                if (a3Var2 != null) {
                    if (this.f43647r) {
                        i16 = 54;
                    }
                    a3Var2.f37631s = AndroidUtilities.dp(i16 + 32);
                    this.e.v = AndroidUtilities.dp(29.0f);
                }
                a3 a3Var3 = this.h;
                if (a3Var3 != null) {
                    a3Var3.f37631s = this.f43648s;
                    a3Var3.v = this.v;
                }
                a3 a3Var4 = this.f43646n;
                if (a3Var4 != null) {
                    a3Var4.f37631s = this.f43648s;
                    a3Var4.v = this.v;
                }
                i15 = dp3;
            }
            this.f43650x = i15;
        }
        setMeasuredDimension(size, i15);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f43642a, this.f43643b, motionEvent, this, this.h, this.f43648s, this.v)) {
            if (!j4.l(this.f43642a, this.f43643b, motionEvent, this, this.f43646n, this.f43648s, this.v + this.f43649w) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.f43651y = pageblockembedpost;
        requestLayout();
    }
}
