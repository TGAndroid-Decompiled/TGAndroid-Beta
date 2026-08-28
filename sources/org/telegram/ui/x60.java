package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class x60 extends org.telegram.ui.Components.vk0 {
    public final Context f44384c;
    public final z60 d;

    public x60(z60 z60Var, Context context) {
        this.d = z60Var;
        this.f44384c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.C;
    }

    @Override
    public final int j(int i9) {
        z60 z60Var = this.d;
        if ((i9 >= z60Var.A && i9 < z60Var.B) || i9 == z60Var.F) {
            return 0;
        }
        if (i9 != z60Var.f45051y && i9 != z60Var.D) {
            if (i9 != z60Var.f45050x && i9 != z60Var.G) {
                if (i9 != z60Var.E) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        boolean z10;
        long j10;
        int i11;
        int i12;
        z60 z60Var = this.d;
        boolean z11 = z60Var.J;
        int i13 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z12 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 4) {
                    if (i13 == 5) {
                        w60 w60Var = (w60) view;
                        if (z60Var.F <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = z60Var.f45047r;
                        w60Var.f43681b = z12;
                        org.telegram.ui.Components.mt mtVar = w60Var.f43680a;
                        v60 v60Var = w60Var.f43684f;
                        mtVar.removeTextChangedListener(v60Var);
                        if (tL_messages_stickerSet == null) {
                            mtVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            mtVar.setText(str);
                            mtVar.setSelection(str.length());
                        }
                        mtVar.addTextChangedListener(v60Var);
                        return;
                    }
                    return;
                } else if (i9 == z60Var.D) {
                    ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (z11) {
                        i12 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i12 = R.string.ChooseStickerSetHeader;
                    }
                    m4Var.setText(LocaleController.getString(i12));
                    return;
                }
            } else if (i9 == z60Var.f45050x) {
                if (z11) {
                    i11 = R.string.ChooseEmojiPackMy;
                } else {
                    i11 = R.string.ChooseStickerSetMy;
                }
                String string = LocaleController.getString(i11);
                int indexOf = string.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.b9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        ((org.telegram.ui.Cells.b9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.b9) view).setText(string);
                return;
            } else if (i9 == z60Var.G) {
                ((org.telegram.ui.Cells.b9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
        if (i9 != z60Var.F) {
            i10 = ((org.telegram.ui.ActionBar.o2) z60Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(z60Var.b0());
            int i14 = i9 - z60Var.A;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i14);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i14);
            if (i14 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k8Var.d(tL_messages_stickerSet3, z10, false);
            k8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = z60Var.f45047r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f22407id;
            } else if (z60Var.a0(z60Var.v) != null) {
                j10 = z60Var.a0(z60Var.v).f22407id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f22407id != j10) {
                z12 = false;
            }
            k8Var.b(z12, false);
            return;
        }
        k8Var.b(false, false);
        k8Var.d(z60Var.f45047r, false, false);
        k8Var.setDeleteAction(new q50(this, 3));
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        Context context = this.f44384c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 5) {
                    FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                    frameLayout = m4Var;
                } else {
                    z60 z60Var = this.d;
                    w60 w60Var = new w60(z60Var, context);
                    z60Var.K = w60Var;
                    frameLayout = w60Var;
                }
            } else {
                FrameLayout b9Var = new org.telegram.ui.Cells.b9(context);
                b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                frameLayout = b9Var;
            }
        } else {
            FrameLayout k8Var = new org.telegram.ui.Cells.k8(context, 3);
            k8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            frameLayout = k8Var;
        }
        frameLayout.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(frameLayout);
    }
}
