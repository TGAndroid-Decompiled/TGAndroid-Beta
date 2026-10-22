package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class ua1 extends org.telegram.ui.Components.im0 {
    public final Context f41920c;
    public boolean d = true;
    public final ThemeActivity e;

    public ua1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.f41920c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45923f;
        if (i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.J0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        ThemeActivity themeActivity = this.e;
        if (i10 != themeActivity.f33901a0 && i10 != themeActivity.K && i10 != themeActivity.f33903b0 && i10 != themeActivity.Y && i10 != themeActivity.P && i10 != themeActivity.Q && i10 != themeActivity.M && i10 != themeActivity.L) {
            if (i10 != themeActivity.f33909f0 && i10 != themeActivity.Z && i10 != themeActivity.f33927v0 && i10 != themeActivity.A0 && i10 != themeActivity.G0) {
                if (i10 != themeActivity.f33922r0 && i10 != themeActivity.V && i10 != themeActivity.f33905c0 && i10 != themeActivity.O && i10 != themeActivity.f33911h0 && i10 != themeActivity.f33917n0 && i10 != themeActivity.f33914k0 && i10 != themeActivity.J && i10 != themeActivity.I0 && i10 != themeActivity.f33934z0 && i10 != themeActivity.B0 && i10 != themeActivity.C0 && i10 != themeActivity.D0) {
                    if (i10 != themeActivity.R && i10 != themeActivity.S && i10 != themeActivity.T && i10 != themeActivity.U) {
                        if (i10 != themeActivity.W && i10 != themeActivity.f33906d0 && i10 != themeActivity.f33910g0 && i10 != themeActivity.f33930x && i10 != themeActivity.f33912i0 && i10 != themeActivity.f33928w && i10 != themeActivity.f33915l0 && i10 != themeActivity.f33913j0 && i10 != themeActivity.f33925t0 && i10 != themeActivity.f33929w0 && i10 != themeActivity.H0 && i10 != themeActivity.E0 && i10 != themeActivity.F0) {
                            if (i10 == themeActivity.f33907e0) {
                                return 6;
                            }
                            if (i10 != themeActivity.X && i10 != themeActivity.G && i10 != themeActivity.E) {
                                i11 = themeActivity.raiseToListenRow;
                                if (i10 != i11) {
                                    i12 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i12 && i10 != themeActivity.f33932y && i10 != themeActivity.f33924s0) {
                                        i13 = themeActivity.pauseOnMediaRow;
                                        if (i10 != i13 && i10 != themeActivity.F) {
                                            i14 = themeActivity.sensitiveContentRow;
                                            if (i10 != i14) {
                                                i15 = themeActivity.textSizeRow;
                                                if (i10 == i15) {
                                                    return 8;
                                                }
                                                if (i10 != themeActivity.m0) {
                                                    i16 = themeActivity.nightThemeRow;
                                                    if (i10 != i16) {
                                                        i17 = themeActivity.browserRow;
                                                        if (i10 != i17) {
                                                            if (i10 == themeActivity.f33918o0) {
                                                                return 11;
                                                            }
                                                            if (i10 != themeActivity.f33920q0) {
                                                                i18 = themeActivity.bubbleRadiusRow;
                                                                if (i10 != i18) {
                                                                    i19 = themeActivity.backgroundRow;
                                                                    if (i10 != i19 && i10 != themeActivity.f33933y0) {
                                                                        i20 = themeActivity.createNewThemeRow;
                                                                        if (i10 != i20) {
                                                                            i21 = themeActivity.liteModeRow;
                                                                            if (i10 != i21) {
                                                                                i22 = themeActivity.stickersRow;
                                                                                if (i10 != i22) {
                                                                                    if (i10 == themeActivity.f33926u0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i10 == themeActivity.f33931x0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i10 == themeActivity.f33919p0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i10 != themeActivity.H && i10 != themeActivity.I) {
                                                                                        i23 = themeActivity.appIconSelectorRow;
                                                                                        if (i10 != i23) {
                                                                                            i24 = themeActivity.changeUserColor;
                                                                                            if (i10 == i24) {
                                                                                                return 21;
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        return 20;
                                                                                    }
                                                                                    return 19;
                                                                                }
                                                                                return 14;
                                                                            }
                                                                            return 14;
                                                                        }
                                                                        return 14;
                                                                    }
                                                                    return 14;
                                                                }
                                                                return 13;
                                                            }
                                                            return 12;
                                                        }
                                                        return 10;
                                                    }
                                                    return 10;
                                                }
                                                return 9;
                                            }
                                            return 7;
                                        }
                                        return 7;
                                    }
                                    return 7;
                                }
                                return 7;
                            }
                            return 7;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        String string;
        String string2;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        String string3;
        String string4;
        int i24 = b1Var.f45923f;
        View view = b1Var.f45920a;
        ThemeActivity themeActivity = this.e;
        boolean z11 = false;
        boolean z12 = true;
        if (i24 != 1) {
            if (i24 != 2) {
                if (i24 != 4) {
                    if (i24 != 5) {
                        if (i24 != 6) {
                            if (i24 != 7) {
                                if (i24 != 14) {
                                    if (i24 != 17) {
                                        if (i24 != 19) {
                                            if (i24 != 21) {
                                                switch (i24) {
                                                    case 10:
                                                        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                                                        i22 = themeActivity.nightThemeRow;
                                                        if (i10 != i22) {
                                                            i23 = themeActivity.browserRow;
                                                            if (i10 == i23) {
                                                                i5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.h6.f21189o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            string3 = org.telegram.ui.ActionBar.h6.A0();
                                                        } else {
                                                            string3 = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                                                        }
                                                        if (z11) {
                                                            int i25 = org.telegram.ui.ActionBar.h6.f21189o;
                                                            if (i25 == 1) {
                                                                string4 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                                                            } else if (i25 == 3) {
                                                                string4 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                                                            } else {
                                                                string4 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                                                            }
                                                            string3 = a1.g.C(string4, " ", string3);
                                                        }
                                                        i5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string3, R.drawable.menu_night_mode_24, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f33904c.y1(themeActivity.f33902b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.jm0 jm0Var = (org.telegram.ui.Components.jm0) view;
                                                        wa1 wa1Var = (wa1) jm0Var.getAdapter();
                                                        wa1Var.l();
                                                        int indexOf = wa1Var.e.indexOf(wa1Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = wa1Var.h() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((s4.b0) jm0Var.getLayoutManager()).h1(indexOf, (themeActivity.f33902b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((no0) view).set(themeActivity.getUserConfig().getCurrentUser());
                                            return;
                                        }
                                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                                        if (i10 == themeActivity.H) {
                                            i6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            i6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((ru) view).b();
                                    return;
                                }
                                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                                q8Var.v = 48;
                                i17 = themeActivity.backgroundRow;
                                if (i10 == i17) {
                                    q8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.h6.q6;
                                    q8Var.e(i26, i26);
                                    String string5 = LocaleController.getString(R.string.ChangeChatBackground);
                                    int i27 = R.drawable.msg_background;
                                    i21 = themeActivity.changeUserColor;
                                    if (i21 >= 0) {
                                        z11 = true;
                                    }
                                    q8Var.m(i27, string5, z11);
                                    return;
                                } else if (i10 != themeActivity.f33933y0) {
                                    i18 = themeActivity.createNewThemeRow;
                                    if (i10 != i18) {
                                        i19 = themeActivity.liteModeRow;
                                        if (i10 != i19) {
                                            i20 = themeActivity.stickersRow;
                                            if (i10 == i20) {
                                                q8Var.e(org.telegram.ui.ActionBar.h6.J5, org.telegram.ui.ActionBar.h6.G6);
                                                q8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                                                q8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                                                q8Var.f22791s = 64;
                                                q8Var.v = 60;
                                                q8Var.f22792w = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        q8Var.e(org.telegram.ui.ActionBar.h6.J5, org.telegram.ui.ActionBar.h6.G6);
                                        q8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                                        q8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                                        q8Var.v = 60;
                                        q8Var.f22791s = 64;
                                        q8Var.f22792w = 20;
                                        return;
                                    }
                                    q8Var.setSubtitle(null);
                                    int i28 = org.telegram.ui.ActionBar.h6.q6;
                                    q8Var.e(i28, i28);
                                    q8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                                    return;
                                } else {
                                    q8Var.setSubtitle(null);
                                    int i29 = org.telegram.ui.ActionBar.h6.q6;
                                    q8Var.e(i29, i29);
                                    q8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                            if (i10 == themeActivity.X) {
                                v8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.h6.f21207p, true);
                                return;
                            } else if (i10 == themeActivity.N) {
                                v8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                                return;
                            } else if (i10 == themeActivity.G) {
                                v8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i10 != themeActivity.E) {
                                i13 = themeActivity.raiseToListenRow;
                                if (i10 == i13) {
                                    v8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                                    return;
                                } else if (i10 != themeActivity.F) {
                                    i14 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i14) {
                                        i15 = themeActivity.pauseOnMediaRow;
                                        if (i10 == i15) {
                                            v8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                                            return;
                                        } else if (i10 != themeActivity.f33932y) {
                                            i16 = themeActivity.sensitiveContentRow;
                                            if (i10 == i16) {
                                                v8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                                                return;
                                            } else if (i10 == themeActivity.f33924s0) {
                                                v8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            v8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                                            return;
                                        }
                                    }
                                    v8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                                    return;
                                } else {
                                    v8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                                    return;
                                }
                            } else {
                                v8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.h6.f21224q);
                        return;
                    }
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    if (i10 == themeActivity.W) {
                        l4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                        return;
                    } else if (i10 == themeActivity.f33906d0) {
                        l4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                        return;
                    } else if (i10 == themeActivity.f33910g0) {
                        l4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                        return;
                    } else if (i10 == themeActivity.f33930x) {
                        l4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                        return;
                    } else if (i10 == themeActivity.f33912i0) {
                        if (themeActivity.f33908f == 3) {
                            l4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                            return;
                        } else {
                            l4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                            return;
                        }
                    } else if (i10 == themeActivity.f33928w) {
                        l4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                        return;
                    } else if (i10 == themeActivity.f33915l0) {
                        l4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                        return;
                    } else if (i10 == themeActivity.f33913j0) {
                        l4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                        return;
                    } else if (i10 == themeActivity.f33925t0) {
                        l4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                        return;
                    } else if (i10 == themeActivity.f33929w0) {
                        l4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                        return;
                    } else if (i10 == themeActivity.H0) {
                        l4Var.setText(LocaleController.getString(R.string.AppIcon));
                        return;
                    } else if (i10 == themeActivity.F0) {
                        l4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                        return;
                    } else if (i10 == themeActivity.E0) {
                        l4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                if (i10 == themeActivity.R) {
                    String string6 = LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled);
                    if (org.telegram.ui.ActionBar.h6.f21189o == 0) {
                        z11 = true;
                    }
                    gaVar.a(string6, z11, true);
                    return;
                } else if (i10 == themeActivity.S) {
                    String string7 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                    if (org.telegram.ui.ActionBar.h6.f21189o == 1) {
                        z11 = true;
                    }
                    gaVar.a(string7, z11, true);
                    return;
                } else if (i10 == themeActivity.T) {
                    String string8 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                    if (org.telegram.ui.ActionBar.h6.f21189o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.U != -1) {
                        z11 = true;
                    }
                    gaVar.a(string8, z10, z11);
                    return;
                } else if (i10 == themeActivity.U) {
                    String string9 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                    if (org.telegram.ui.ActionBar.h6.f21189o != 3) {
                        z12 = false;
                    }
                    gaVar.a(string9, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            d9Var.setFixedSize(0);
            if (i10 == themeActivity.f33909f0) {
                d9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.h6.f21224q * 100.0f))));
                return;
            } else if (i10 == themeActivity.Z) {
                d9Var.setText(ThemeActivity.y0());
                return;
            } else if (i10 == themeActivity.f33927v0) {
                d9Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.G0) {
                d9Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                d9Var.setFixedSize(12);
                d9Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
        i11 = themeActivity.nightThemeRow;
        if (i10 == i11) {
            if (org.telegram.ui.ActionBar.h6.f21189o != 0 && org.telegram.ui.ActionBar.h6.J != null) {
                baVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.h6.A0(), false, false);
            } else {
                baVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
            }
        } else if (i10 == themeActivity.f33901a0) {
            int i30 = org.telegram.ui.ActionBar.h6.f21243r;
            int i31 = i30 / 60;
            baVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, true);
        } else if (i10 == themeActivity.f33903b0) {
            int i32 = org.telegram.ui.ActionBar.h6.f21263s;
            int i33 = i32 / 60;
            baVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i33), Integer.valueOf(i32 - (i33 * 60))), false, false);
        } else if (i10 == themeActivity.Y) {
            baVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.h6.f21338w, false, false);
        } else if (i10 == themeActivity.Q) {
            int i34 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
            if (i34 == 0) {
                string2 = LocaleController.getString("Default", R.string.Default);
            } else if (i34 == 1) {
                string2 = LocaleController.getString("FirstName", R.string.SortFirstName);
            } else {
                string2 = LocaleController.getString("LastName", R.string.SortLastName);
            }
            baVar.c(LocaleController.getString("SortBy", R.string.SortBy), string2, false, true);
        } else if (i10 == themeActivity.P) {
            baVar.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
        } else if (i10 == themeActivity.K) {
            int i35 = SharedConfig.distanceSystemType;
            if (i35 == 0) {
                string = LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic);
            } else if (i35 == 1) {
                string = LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers);
            } else {
                string = LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles);
            }
            String string10 = LocaleController.getString("DistanceUnits", R.string.DistanceUnits);
            boolean z13 = themeActivity.O0;
            if (themeActivity.D0 < 0) {
                z12 = false;
            }
            baVar.c(string10, string, z13, z12);
            themeActivity.O0 = false;
        } else if (i10 == themeActivity.L) {
            baVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.m1.a().f42728a, themeActivity.P0, false);
        } else if (i10 == themeActivity.M) {
            String string11 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            if (SharedConfig.recordViaSco) {
                i12 = R.string.MicrophoneForVoiceMessagesSco;
            } else {
                i12 = R.string.MicrophoneForVoiceMessagesBuiltIn;
            }
            baVar.c(string11, LocaleController.getString(i12), themeActivity.N0, false);
            themeActivity.N0 = false;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ?? frameLayout;
        int i11;
        int i12;
        float f7;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        sa1 i5Var;
        int i15;
        org.telegram.ui.ActionBar.d5 d5Var;
        int i16;
        int i17;
        float f10 = 21.0f;
        int i18 = 4;
        int i19 = 5;
        ThemeActivity themeActivity = this.e;
        Context context = this.f41920c;
        switch (i10) {
            case 1:
                i5Var = new org.telegram.ui.Cells.ba(context);
                break;
            case 2:
                i5Var = new org.telegram.ui.Cells.d9(context);
                break;
            case 3:
                i5Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f22311a = textView;
                org.telegram.messenger.ok.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11 | 16);
                boolean z12 = LocaleController.isRTL;
                if (z12) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                int i20 = i12 | 48;
                if (z12) {
                    f7 = 71.0f;
                } else {
                    f7 = 21.0f;
                }
                if (!z12) {
                    f10 = 23.0f;
                }
                frameLayout.addView(textView, w7.z5.d(-1, -1.0f, i20, f7, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f22312b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                if (LocaleController.isRTL) {
                    i19 = 3;
                }
                frameLayout.addView(imageView, w7.z5.d(19, 14.0f, i19 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                i5Var = frameLayout;
                break;
            case 5:
                i5Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 6:
                i5Var = new pa1(this, context);
                break;
            case 7:
                i5Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                i5Var = new va1(themeActivity, context);
                break;
            case 9:
                frameLayout = new qa1(context);
                frameLayout.f40522b = new org.telegram.ui.Cells.y0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i21 = 0;
                while (true) {
                    ?? r32 = (org.telegram.ui.Cells.y0[]) frameLayout.f40522b;
                    if (i21 >= r32.length) {
                        i5Var = frameLayout;
                        break;
                    } else {
                        if (i21 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.f23836c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.d = textPaint;
                        frameLayout2.setWillNotDraw(false);
                        frameLayout2.f23835b = z10;
                        if (z10) {
                            i13 = R.string.ChatListExpanded;
                        } else {
                            i13 = R.string.ChatListDefault;
                        }
                        frameLayout2.setContentDescription(LocaleController.getString(i13));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(frameLayout2, context);
                        frameLayout2.f23834a = x0Var;
                        x0Var.setSize(AndroidUtilities.dp(20.0f));
                        frameLayout2.addView(x0Var, w7.z5.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && SharedConfig.useThreeLinesLayout) || (!z10 && !SharedConfig.useThreeLinesLayout)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        x0Var.a(z11, false);
                        r32[i21] = frameLayout2;
                        org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) frameLayout.f40522b)[i21];
                        if (i21 == 1) {
                            i14 = 10;
                        } else {
                            i14 = 0;
                        }
                        frameLayout.addView(y0Var, w7.z5.m(0.5f, -1, -1, i14, 0, 0));
                        ((org.telegram.ui.Cells.y0[]) frameLayout.f40522b)[i21].setOnClickListener(new ci.h2(3, frameLayout, z10));
                        i21++;
                    }
                }
                break;
            case 10:
                i5Var = new org.telegram.ui.Cells.i5(21, 60, this.f41920c, null, true);
                break;
            case 11:
                this.d = true;
                ra1 ra1Var = new ra1(this, this.f41920c, themeActivity, themeActivity.f33908f, themeActivity.e, themeActivity.d);
                themeActivity.f33904c = ra1Var;
                ra1Var.setDrawDivider(themeActivity.v);
                themeActivity.f33904c.setFocusable(false);
                View view = themeActivity.f33904c;
                view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(148.0f)));
                i5Var = view;
                break;
            case 12:
                sa1 sa1Var = new sa1(context, 0, null);
                sa1Var.setFocusable(false);
                sa1Var.setItemAnimator(null);
                sa1Var.setLayoutAnimation(null);
                sa1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                sa1Var.setClipToPadding(false);
                s4.b0 b0Var = new s4.b0();
                b0Var.j1(0);
                sa1Var.setLayoutManager(b0Var);
                wa1 wa1Var = new wa1(themeActivity, context);
                sa1Var.setAdapter(wa1Var);
                sa1Var.setOnItemClickListener(new na1(this, wa1Var, sa1Var, 0));
                sa1Var.setOnItemLongClickListener(new en0(18, this, wa1Var));
                sa1Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(62.0f)));
                i5Var = sa1Var;
                break;
            case 13:
                i5Var = new ka1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                i5Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 15:
                i15 = ((org.telegram.ui.ActionBar.n2) themeActivity).currentAccount;
                ?? frameLayout3 = new FrameLayout(context);
                Paint paint = new Paint(1);
                frameLayout3.f29166a = paint;
                frameLayout3.f29167b = new Paint(1);
                Paint paint2 = new Paint(1);
                frameLayout3.f29168c = paint2;
                Paint paint3 = new Paint(1);
                frameLayout3.d = paint3;
                frameLayout3.e = new RectF();
                int i22 = 6;
                frameLayout3.h = r14;
                frameLayout3.f29170n = r15;
                frameLayout3.f29171r = new org.telegram.ui.Components.vj0[6];
                frameLayout3.v = new org.telegram.ui.Components.yj0[2];
                float f11 = 1.0f;
                frameLayout3.f29174x = 1.0f;
                String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                int i23 = org.telegram.ui.ActionBar.h6.f20977c9;
                int[] iArr = {i23, i23, i23, i23, org.telegram.ui.ActionBar.h6.Y5, org.telegram.ui.ActionBar.h6.f20996d9};
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                paint2.setStyle(style);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint2.setStrokeCap(cap);
                paint2.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint3.setStyle(style);
                paint3.setStrokeCap(cap);
                paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
                org.telegram.ui.Components.nz0 nz0Var = new org.telegram.ui.Components.nz0(frameLayout3, context);
                frameLayout3.f29169f = nz0Var;
                nz0Var.setMinValue(0);
                nz0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i15).dialogFilters.isEmpty();
                if (!isEmpty) {
                    i18 = 5;
                }
                nz0Var.setMaxValue(i18);
                if (isEmpty) {
                    i22 = 5;
                }
                nz0Var.setAllItemsCount(i22);
                nz0Var.setWrapSelectorWheel(true);
                nz0Var.setFormatter(new org.telegram.ui.Components.mz0(frameLayout3));
                nz0Var.setOnValueChangedListener(new org.telegram.ui.Components.mz0(frameLayout3));
                nz0Var.setImportantForAccessibility(2);
                nz0Var.setValue(SharedConfig.getChatSwipeAction(i15));
                frameLayout3.addView(nz0Var, w7.z5.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                frameLayout3.setWillNotDraw(false);
                frameLayout3.f29172s = 0;
                for (int i24 = 0; i24 < 2; i24++) {
                    frameLayout3.v[i24] = new ImageView(context);
                    frameLayout3.addView(frameLayout3.v[i24], w7.z5.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.vj0 a2 = frameLayout3.a(frameLayout3.f29169f.getValue());
                if (a2 != null) {
                    frameLayout3.v[0].setImageDrawable(a2);
                    a2.M(a2.e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[1], false, 0.5f, false);
                if (frameLayout3.f29169f.getValue() != 5) {
                    f11 = 0.0f;
                }
                frameLayout3.f29173w = f11;
                frameLayout3.F = frameLayout3.f29169f.getValue();
                i5Var = frameLayout3;
                break;
            case 16:
                d5Var = ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout;
                View faVar = new org.telegram.ui.Cells.fa(context, d5Var, 0);
                faVar.setImportantForAccessibility(4);
                i5Var = faVar;
                break;
            case 17:
                View ruVar = new ru(themeActivity.f33908f, context, themeActivity);
                ruVar.setFocusable(false);
                ruVar.setLayoutParams(new s4.o0(-1, -2));
                i5Var = ruVar;
                break;
            case 19:
                i5Var = new org.telegram.ui.Cells.i6(context, false);
                break;
            case 20:
                i16 = ((org.telegram.ui.ActionBar.n2) themeActivity).currentAccount;
                ?? jm0Var = new org.telegram.ui.Components.jm0(context, null);
                jm0Var.V2 = new ArrayList();
                jm0Var.X2 = i16;
                jm0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                jm0Var.setFocusable(false);
                jm0Var.setItemAnimator(null);
                jm0Var.setLayoutAnimation(null);
                s4.b0 b0Var2 = new s4.b0(0, false);
                jm0Var.W2 = b0Var2;
                jm0Var.setLayoutManager(b0Var2);
                jm0Var.setAdapter(new z7(jm0Var, 1));
                jm0Var.i(new ei.q1(jm0Var, 1));
                jm0Var.setOnItemClickListener(new ci.g0(jm0Var, themeActivity, context, 3));
                jm0Var.x1();
                i5Var = jm0Var;
                break;
            case 21:
                i17 = ((org.telegram.ui.ActionBar.n2) themeActivity).currentAccount;
                frameLayout = new no0(i17, 0L, this.f41920c, themeActivity.getResourceProvider());
                i5Var = frameLayout;
                break;
        }
        return new s4.b1(i5Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        if (b1Var.f45923f == 4) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) b1Var.f45920a;
            if (b1Var.b() == org.telegram.ui.ActionBar.h6.f21189o) {
                z10 = true;
            } else {
                z10 = false;
            }
            gaVar.setTypeChecked(z10);
        }
    }
}
