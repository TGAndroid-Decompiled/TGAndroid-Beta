package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ra1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final x5 B0;
    public final ah.h C0;
    public final fh.d D0;
    public da1 E;
    public final fh.d E0;
    public da1 F;
    public final ah.c F0;
    public na1 G;
    public o91 G0;
    public da1 H;
    public final ArrayList H0;
    public da1 I;
    public final RectF I0;
    public da1 J;
    public final RectF J0;
    public da1 K;
    public da1 L;
    public da1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.fo R;
    public s91 S;
    public ah.n T;
    public s4.c0 U;
    public final LruCache V;
    public org.telegram.ui.Components.bj0 W;
    public w91 X;
    public p91 Y;
    public qa1 Z;
    public TLRPC.ChatFull f36752a;
    public ig.f f36753a0;
    public final long f36754b;
    public LinearLayout f36755b0;
    public boolean f36756c;
    public final boolean f36757c0;
    public da1 d;
    public final boolean f36758d0;
    public da1 e;
    public final boolean f36759e0;
    public ma1 f36760f;
    public long f36761f0;
    public long f36762g0;
    public da1 h;
    public final org.telegram.ui.ActionBar.b2[] f36763h0;
    public ci.i1 f36764i0;
    public bc f36765j0;
    public je f36766k0;
    public final boolean f36767l0;
    public bh0 m0;
    public da1 f36768n;
    public oh.b[] f36769n0;
    public int f36770o0;
    public final SparseIntArray f36771p0;
    public final SparseIntArray f36772q0;
    public da1 f36773r;
    public final ArrayList f36774r0;
    public da1 f36775s;
    public final ArrayList f36776s0;
    public final ArrayList f36777t0;
    public final ArrayList f36778u0;
    public da1 v;
    public final ArrayList f36779v0;
    public da1 f36780w;
    public boolean f36781w0;
    public da1 f36782x;
    public boolean f36783x0;
    public da1 f36784y;
    public ea1 f36785y0;
    public ai.d9 f36786z0;

    public ra1(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.f36763h0 = new org.telegram.ui.ActionBar.b2[1];
        this.f36770o0 = -1;
        this.f36771p0 = new SparseIntArray();
        this.f36772q0 = new SparseIntArray();
        this.f36774r0 = new ArrayList();
        this.f36776s0 = new ArrayList();
        this.f36777t0 = new ArrayList();
        this.f36778u0 = new ArrayList();
        this.f36779v0 = new ArrayList();
        this.f36783x0 = true;
        this.B0 = new x5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.H0 = arrayList;
        RectF rectF = new RectF();
        this.I0 = rectF;
        RectF rectF2 = new RectF();
        this.J0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = bundle.getLong("chat_id");
        this.f36754b = j3;
        this.f36757c0 = bundle.getBoolean("is_megagroup", false);
        this.f36758d0 = bundle.getBoolean("start_from_boosts", false);
        this.f36759e0 = bundle.getBoolean("start_from_monetization", false);
        this.f36767l0 = bundle.getBoolean("only_boosts", false);
        this.f36752a = getMessagesController().getChatFull(j3);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.C0 = new ah.h(false);
            this.D0 = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.E0 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.F0 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            return;
        }
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = new ah.c(cVar);
    }

    public static void U(ra1 ra1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(ra1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            ra1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new l91(ra1Var, arrayList, 0));
    }

    public static void V(ra1 ra1Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        float abs;
        boolean z10;
        float abs2;
        boolean z11;
        float abs3;
        boolean z12;
        float abs4;
        boolean z13;
        ArrayList arrayList3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        float abs5;
        int i10;
        boolean z14;
        float abs6;
        boolean z15;
        float abs7;
        boolean z16;
        int i11;
        ArrayList arrayList4;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        ArrayList arrayList5 = ra1Var.N;
        ArrayList arrayList6 = ra1Var.O;
        ArrayList arrayList7 = ra1Var.f36774r0;
        String str16 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final da1[] da1VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            da1 da1Var = da1VarArr[2];
            if (da1Var != null) {
                da1Var.f32561n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.t a2 = ma1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f35239o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f35240p = (String) a2.f7335b;
            obj.f35241q = (String) a2.e;
            obj.f35242r = ((Boolean) a2.f7336c).booleanValue();
            obj.f35243s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.t a10 = ma1.a(tL_broadcastStats.reactions_per_story);
            obj.f35244t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f35245u = (String) a10.f7335b;
            obj.v = (String) a10.e;
            obj.f35246w = ((Boolean) a10.f7336c).booleanValue();
            obj.f35247x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.t a11 = ma1.a(tL_broadcastStats.views_per_story);
            obj.f35248y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f35249z = (String) a11.f7335b;
            obj.A = (String) a11.e;
            obj.B = ((Boolean) a11.f7336c).booleanValue();
            obj.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.t a12 = ma1.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f7335b;
            obj.F = (String) a12.e;
            obj.G = ((Boolean) a12.f7336c).booleanValue();
            obj.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            if (d10 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i12 / ((float) d10)) * 100.0f);
            }
            obj.f35228a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f35229b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs5 == 0.0f) {
                i10 = i12;
                obj.f35230c = "";
            } else {
                int i13 = (int) abs5;
                if (abs5 == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i12 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str3;
                    }
                    sb2.append(str15);
                    sb2.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    String sb3 = sb2.toString();
                    obj.f35230c = sb3 + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i12 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str3;
                    }
                    sb4.append(str14);
                    sb4.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    obj.f35230c = String.format(locale2, "%s (%.1f%s)", sb4.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i10 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.d = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            if (d12 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i14 / ((float) d12)) * 100.0f);
            }
            obj.f35233i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f35234j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 != 0 && abs6 != 0.0f) {
                int i15 = (int) abs6;
                if (abs6 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i14 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str3;
                    }
                    sb5.append(str13);
                    sb5.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    String sb6 = sb5.toString();
                    obj.f35235k = sb6 + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i14 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str3;
                    }
                    sb7.append(str12);
                    sb7.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    obj.f35235k = String.format(locale4, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f35235k = "";
            }
            if (i14 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f35236l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i16 / ((float) d14)) * 100.0f);
            }
            obj.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f35231f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 != 0 && abs7 != 0.0f) {
                int i17 = (int) abs7;
                if (abs7 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i16 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str3;
                    }
                    sb8.append(str11);
                    sb8.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    String sb9 = sb8.toString();
                    obj.f35232g = sb9 + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb10 = new StringBuilder();
                    if (i16 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str3;
                    }
                    sb10.append(str10);
                    sb10.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    obj.f35232g = String.format(locale6, "%s (%.1f%s)", sb10.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f35232g = "";
            }
            if (i16 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f35237m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f7;
            if (f7 == i18) {
                Locale locale7 = Locale.ENGLISH;
                obj.f35238n = a4.a.n(i18, "%");
            } else {
                obj.f35238n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            ra1Var.f36760f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            ra1Var.f36761f0 = tL_statsDateRangeDays.max_date * 1000;
            ra1Var.f36762g0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                int i22 = i21 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f35754a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i22;
                    ra1Var.f36771p0.put(obj2.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    ra1Var.f36777t0.add(obj2);
                    ra1Var.f36772q0.put(obj2.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str16 = str9;
                i21 = i11;
                arrayList8 = arrayList4;
                size = i23;
            }
            ArrayList arrayList12 = arrayList8;
            str = str16;
            AndroidUtilities.runOnUIThread(new l91(ra1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                ra1Var.getMessagesStorage().getMessages(-ra1Var.f36754b, 0L, false, arrayList12.size(), ((oa1) arrayList12.get(0)).b(), 0, 0, ra1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(ra1Var) {
                public final ra1 f34631b;

                {
                    this.f34631b = ra1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            ra1 ra1Var2 = this.f34631b;
                            ra1Var2.getClass();
                            da1[] da1VarArr2 = da1VarArr;
                            ra1Var2.d = da1VarArr2[0];
                            ra1Var2.H = da1VarArr2[1];
                            ra1Var2.I = da1VarArr2[2];
                            ra1Var2.J = da1VarArr2[3];
                            ra1Var2.K = da1VarArr2[4];
                            ra1Var2.L = da1VarArr2[5];
                            ra1Var2.e = da1VarArr2[6];
                            ra1Var2.M = da1VarArr2[7];
                            ra1Var2.g0(da1VarArr2);
                            return;
                        default:
                            ra1 ra1Var3 = this.f34631b;
                            ra1Var3.getClass();
                            da1[] da1VarArr3 = da1VarArr;
                            ra1Var3.f36773r = da1VarArr3[0];
                            ra1Var3.h = da1VarArr3[1];
                            ra1Var3.e = da1VarArr3[2];
                            ra1Var3.f36768n = da1VarArr3[3];
                            ra1Var3.d = da1VarArr3[4];
                            ra1Var3.f36775s = da1VarArr3[5];
                            ra1Var3.v = da1VarArr3[6];
                            ra1Var3.f36780w = da1VarArr3[7];
                            ra1Var3.f36782x = da1VarArr3[8];
                            ra1Var3.f36784y = da1VarArr3[9];
                            ra1Var3.E = da1VarArr3[10];
                            ra1Var3.F = da1VarArr3[11];
                            ra1Var3.g0(da1VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final da1[] da1VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            da1 da1Var2 = da1VarArr2[6];
            if (da1Var2 != null) {
                da1Var2.f32561n = true;
            }
            da1 da1Var3 = da1VarArr2[7];
            if (da1Var3 != null) {
                da1Var3.f32562o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i24 = (int) (d15 - d16);
            if (d16 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i24 / ((float) d16)) * 100.0f);
            }
            obj3.f35476a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f35477b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i24 != 0 && abs != 0.0f) {
                int i25 = (int) abs;
                if (abs == i25) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb11 = new StringBuilder();
                    if (i24 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str3;
                    }
                    sb11.append(str8);
                    sb11.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    String sb12 = sb11.toString();
                    obj3.f35478c = sb12 + " (" + i25 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb13 = new StringBuilder();
                    if (i24 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    sb13.append(str7);
                    sb13.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    obj3.f35478c = String.format(locale9, "%s (%.1f%s)", sb13.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f35478c = "";
            }
            if (i24 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i26 = (int) (d17 - d18);
            if (d18 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i26 / ((float) d18)) * 100.0f);
            }
            obj3.f35481i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f35482j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i26 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb14 = new StringBuilder();
                if (i26 <= 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                sb14.append(str6);
                sb14.append(AndroidUtilities.formatWholeNumber(i26, 0));
                String sb15 = sb14.toString();
                obj3.f35483k = sb15;
            } else {
                obj3.f35483k = "";
            }
            if (i26 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f35484l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i27 / ((float) d20)) * 100.0f);
            }
            obj3.f35485m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f35486n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i27 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb16 = new StringBuilder();
                if (i27 <= 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                sb16.append(str5);
                sb16.append(AndroidUtilities.formatWholeNumber(i27, 0));
                String sb17 = sb16.toString();
                obj3.f35487o = sb17;
            } else {
                obj3.f35487o = "";
            }
            if (i27 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f35488p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i28 / ((float) d22)) * 100.0f);
            }
            obj3.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f35479f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i28 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb18 = new StringBuilder();
                if (i28 <= 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                sb18.append(str4);
                sb18.append(AndroidUtilities.formatWholeNumber(i28, 0));
                String sb19 = sb18.toString();
                obj3.f35480g = sb19;
            } else {
                obj3.f35480g = "";
            }
            if (i28 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            ra1Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            ra1Var.f36761f0 = tL_statsDateRangeDays2.max_date * 1000;
            ra1Var.f36762g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f34663a = ka1.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb20 = new StringBuilder();
                    int i30 = tL_statsGroupTopPoster.messages;
                    if (i30 > 0) {
                        sb20.append(LocaleController.formatPluralString("messages", i30, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb20.length() > 0) {
                            sb20.append(", ");
                        }
                        sb20.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    obj4.f34664b = sb20.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i29++;
                    arrayList2 = arrayList3;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i31 = 0; i31 < tL_megagroupStats.top_admins.size(); i31++) {
                    ArrayList arrayList19 = ra1Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f34663a = ka1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb21 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb21.append(LocaleController.formatPluralString("Deletions", i32, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    obj5.f34664b = sb21.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = ra1Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f34663a = ka1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f34664b = LocaleController.formatPluralString("Invitations", i34, new Object[0]);
                    } else {
                        obj6.f34664b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(ra1Var) {
                public final ra1 f34631b;

                {
                    this.f34631b = ra1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            ra1 ra1Var2 = this.f34631b;
                            ra1Var2.getClass();
                            da1[] da1VarArr22 = da1VarArr2;
                            ra1Var2.d = da1VarArr22[0];
                            ra1Var2.H = da1VarArr22[1];
                            ra1Var2.I = da1VarArr22[2];
                            ra1Var2.J = da1VarArr22[3];
                            ra1Var2.K = da1VarArr22[4];
                            ra1Var2.L = da1VarArr22[5];
                            ra1Var2.e = da1VarArr22[6];
                            ra1Var2.M = da1VarArr22[7];
                            ra1Var2.g0(da1VarArr22);
                            return;
                        default:
                            ra1 ra1Var3 = this.f34631b;
                            ra1Var3.getClass();
                            da1[] da1VarArr3 = da1VarArr2;
                            ra1Var3.f36773r = da1VarArr3[0];
                            ra1Var3.h = da1VarArr3[1];
                            ra1Var3.e = da1VarArr3[2];
                            ra1Var3.f36768n = da1VarArr3[3];
                            ra1Var3.d = da1VarArr3[4];
                            ra1Var3.f36775s = da1VarArr3[5];
                            ra1Var3.v = da1VarArr3[6];
                            ra1Var3.f36780w = da1VarArr3[7];
                            ra1Var3.f36782x = da1VarArr3[8];
                            ra1Var3.f36784y = da1VarArr3[9];
                            ra1Var3.E = da1VarArr3[10];
                            ra1Var3.F = da1VarArr3[11];
                            ra1Var3.g0(da1VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(ra1 ra1Var) {
        float f7;
        RectF rectF = ra1Var.J0;
        ah.h hVar = ra1Var.C0;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null && ra1Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (ra1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            ra1Var.I0.set(0.0f, -dp, ra1Var.fragmentView.getMeasuredWidth(), ra1Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), ra1Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            hVar.g(2, ra1Var.H0);
            hVar.e(ra1Var.G0, ra1Var.fragmentView.getMeasuredWidth(), ra1Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(ra1 ra1Var) {
        View currentView = ra1Var.f36764i0.getCurrentView();
        bc bcVar = ra1Var.f36765j0;
        if (currentView == bcVar) {
            ra1Var.actionBar.setAdaptiveBackground(bcVar.F);
            return;
        }
        je jeVar = ra1Var.f36766k0;
        if (currentView == jeVar) {
            ra1Var.actionBar.setAdaptiveBackground(jeVar.f34416a1);
        } else {
            ra1Var.actionBar.setAdaptiveBackground(ra1Var.S);
        }
    }

    public static void Z(ra1 ra1Var) {
        qa1 qa1Var = ra1Var.Z;
        if (qa1Var != null) {
            qa1Var.f36377b = true;
        }
        int childCount = ra1Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ra1Var.S.getChildAt(i10);
            if (childAt instanceof ca1) {
                ((ca1) childAt).f32035b.f11152t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f18083id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f18083id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new ra1(bundle);
        }
        return new w5(-chat.f18083id);
    }

    public static jg.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new jg.b(jSONObject);
        }
        if (i10 == 1) {
            return new jg.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new jg.b(jSONObject);
            int length = ((jg.a) bVar.d.get(0)).f12984a.length;
            int size = bVar.d.size();
            bVar.f12999l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f12999l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f12999l;
                    jArr[i11] = jArr[i11] + ((jg.a) bVar.d.get(i12)).f12984a[i11];
                }
            }
            bVar.f13000m = new SegmentTree(bVar.f12999l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new jg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f12990a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j10 = ((jg.a) bVar2.d.get(i13)).f12984a[i14];
                        jArr2[i13] = jArr2[i13] + j10;
                        if (j10 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j3 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j3 < 0.01d && iArr[i15] > bVar2.f12990a.length / 2.0f) {
                        arrayList.add((jg.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((jg.a) obj);
                }
            }
            int length3 = ((jg.a) bVar2.d.get(0)).f12984a.length;
            int size3 = bVar2.d.size();
            bVar2.f13001l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f13001l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f13001l;
                    jArr3[i17] = jArr3[i17] + ((jg.a) bVar2.d.get(i18)).f12984a[i17];
                }
            }
            new SegmentTree(bVar2.f13001l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static da1 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        da1 da1Var = new da1(str, i10);
        da1Var.f32560m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                jg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                da1Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                da1Var.f32555g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f12990a) == null || jArr2.length < 2) {
                    da1Var.f32559l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f12990a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    da1Var.e = new jg.e(e02, j3);
                    da1Var.f32553c = j3;
                    return da1Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            da1Var.f32554f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return da1Var;
    }

    public static void k0(da1 da1Var, ArrayList arrayList, org.telegram.ui.ActionBar.i6 i6Var) {
        jg.b bVar;
        int i10;
        if (da1Var != null && (bVar = da1Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                jg.a aVar = (jg.a) obj;
                int i12 = aVar.f12988g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.h6.c1(i12)) {
                        int i13 = aVar.f12988g;
                        if (org.telegram.ui.ActionBar.h6.I == org.telegram.ui.ActionBar.h6.J) {
                            i10 = aVar.f12989i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.h6.u1(i13, i10, false);
                        org.telegram.ui.ActionBar.h6.nl[aVar.f12988g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, i6Var, aVar.f12988g));
                }
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof ca1) {
            ((ca1) view).d();
        } else if (view instanceof org.telegram.ui.Cells.a7) {
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false)), org.telegram.ui.ActionBar.h6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f18753b7), 0, 0);
            qqVar.f27431w = true;
            view.setBackground(qqVar);
        } else if (view instanceof kg.c) {
            ((kg.c) view).a();
        } else if (view instanceof la1) {
            int i10 = la1.d;
            ((la1) view).b();
        }
    }

    public final void c0() {
        int i10;
        int i11 = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        bh0 bh0Var = this.m0;
        if (bh0Var != null) {
            bh0Var.setTranslationY(-i11);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
        if (this.f36756c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        s91 s91Var = this.S;
        if (s91Var != null) {
            s91Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        bc bcVar = this.f36765j0;
        if (bcVar != null) {
            bcVar.F.setPadding(0, currentActionBarHeight, 0, i13);
        }
        je jeVar = this.f36766k0;
        if (jeVar != null) {
            jeVar.f34416a1.setPadding(0, currentActionBarHeight, 0, i13);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        boolean z12;
        int i10;
        float f7;
        String str;
        boolean z13;
        ra1 ra1Var = this;
        ra1Var.f36753a0 = new ig.f(null);
        MessagesController messagesController = MessagesController.getInstance(ra1Var.currentAccount);
        long j3 = ra1Var.f36754b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(ra1Var.currentAccount).getChatFull(j3);
        if (chatFull != null && chatFull.can_view_stats) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        if (chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(oh.b.b(context, ra1Var.resourceProvider, oh.a.I, R.string.Statistics));
        }
        arrayList.add(oh.b.b(context, ra1Var.resourceProvider, oh.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(oh.b.b(context, ra1Var.resourceProvider, oh.a.MONETIZATION, R.string.Monetization));
        }
        ra1Var.f36769n0 = (oh.b[]) arrayList.toArray(new oh.b[0]);
        bh0 bh0Var = new bh0(context, ra1Var.resourceProvider);
        ra1Var.m0 = bh0Var;
        bh0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = ra1Var.f36769n0;
            if (i11 >= bVarArr.length) {
                break;
            }
            oh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ci.n4(ra1Var, i11, 25));
            ra1Var.m0.addView(ra1Var.f36769n0[i11]);
            ra1Var.m0.i(bVar, true, false);
            i11++;
        }
        ra1Var.f36764i0 = new ci.i1(ra1Var, ra1Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            ra1Var.f36765j0 = new bc(ra1Var, -j3, ra1Var.getResourceProvider());
        }
        if (z11) {
            Activity parentActivity = ra1Var.getParentActivity();
            int i12 = ra1Var.currentAccount;
            long j10 = -j3;
            org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            frameLayout = frameLayout2;
            je jeVar = new je(parentActivity, this, i12, j10, resourceProvider, z13, chatFull.can_view_stars_revenue);
            ra1Var = this;
            ra1Var.f36766k0 = jeVar;
            jeVar.setActionBar(ra1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z14 = z10;
        FrameLayout frameLayout3 = frameLayout;
        ra1Var.f36764i0.setAdapter(new r91(ra1Var, z14, isBoostSupported, z11, frameLayout3));
        boolean z15 = ra1Var.f36767l0;
        if (isBoostSupported && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        ra1Var.f36756c = z12;
        if (z12 && ra1Var.f36758d0) {
            ra1Var.f36764i0.setPosition(z14 ? 1 : 0);
        } else if (z12 && ra1Var.f36759e0) {
            ci.i1 i1Var = ra1Var.f36764i0;
            if (!z15 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i1Var.setPosition((z14 ? 1 : 0) + i10);
        }
        ra1Var.m0(ra1Var.f36764i0.getCurrentPosition(), false);
        w8 w8Var = new w8(ra1Var, ra1Var.getParentActivity(), 8);
        ra1Var.actionBar.setDrawBlurBackground(w8Var);
        w8Var.setBackgroundColor(ra1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7));
        hh.k kVar = new hh.k(w8Var);
        ah.c cVar = ra1Var.F0;
        cVar.f425f = kVar;
        cVar.f426g = w8Var;
        w8Var.addView(ra1Var.f36764i0, w7.x5.g());
        w8Var.addView(ra1Var.actionBar);
        if (ra1Var.f36756c) {
            w8Var.addView(ra1Var.m0, w7.x5.e(344, 72, 81));
            ra1Var.setBulletinDelegate(new ci.a9(12));
        }
        ra1Var.fragmentView = w8Var;
        s91 s91Var = new s91(ra1Var, context);
        ra1Var.S = s91Var;
        s91Var.setSections(true);
        ra1Var.S.setClipToPadding(false);
        s91 s91Var2 = ra1Var.S;
        Objects.requireNonNull(s91Var2);
        ra1Var.T = new ah.n(s91Var2, w8Var, new ts(s91Var2, 1));
        bc bcVar = ra1Var.f36765j0;
        if (bcVar != null) {
            org.telegram.ui.Components.ml0 ml0Var = bcVar.F;
            Objects.requireNonNull(ml0Var);
            bcVar.G = new ah.n(ml0Var, w8Var, new ts(ml0Var, 0));
            ra1Var.f36765j0.F.j(new q91(ra1Var, 1));
        }
        je jeVar2 = ra1Var.f36766k0;
        if (jeVar2 != null) {
            org.telegram.ui.Components.d61 d61Var = jeVar2.f34416a1;
            Objects.requireNonNull(d61Var);
            jeVar2.f34417b1 = new ah.n(d61Var, w8Var, new v8(d61Var, 0));
            ra1Var.f36766k0.f34416a1.j(new q91(ra1Var, 2));
        }
        ra1Var.G0 = new o91(ra1Var, w8Var);
        ra1Var.S.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        ra1Var.f36755b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        ra1Var.W = imageView;
        imageView.setAutoRepeat(true);
        ra1Var.W.f(R.raw.statistic_preload, 120, 120, null);
        ra1Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.h6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.h6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.ul.l(R.string.LoadingStatsDescription, textView2, 1);
        ra1Var.f36755b0.addView(ra1Var.W, w7.x5.t(120, 120, 1, 0, 0, 0, 20));
        ra1Var.f36755b0.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 10));
        ra1Var.f36755b0.addView(textView2, w7.x5.q(-2, -2, 1));
        frameLayout3.addView(ra1Var.f36755b0, w7.x5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (ra1Var.X == null) {
            ra1Var.X = new w91(ra1Var);
        }
        ra1Var.S.setAdapter(ra1Var.X);
        s4.c0 c0Var = new s4.c0();
        ra1Var.U = c0Var;
        ra1Var.S.setLayoutManager(c0Var);
        ra1Var.Y = new s4.j();
        ra1Var.S.setItemAnimator(null);
        ra1Var.S.j(new q91(ra1Var, 0));
        ra1Var.S.setOnItemClickListener(new s21(ra1Var, 6));
        ra1Var.S.setOnItemLongClickListener(new nl0(ra1Var, 18));
        frameLayout3.addView(ra1Var.S);
        org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(context, null, false, null);
        ra1Var.R = foVar;
        foVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        ra1Var.R.getAvatarImageView().setScaleX(0.9f);
        ra1Var.R.getAvatarImageView().setScaleY(0.9f);
        ra1Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar2 = ra1Var.actionBar;
        org.telegram.ui.Components.fo foVar2 = ra1Var.R;
        if (!ra1Var.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(foVar2, 0, w7.x5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = ra1Var.getMessagesController().getChat(Long.valueOf(j3));
        ra1Var.R.setChatAvatar(chat2);
        org.telegram.ui.Components.fo foVar3 = ra1Var.R;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        foVar3.setTitle(str);
        org.telegram.ui.Components.fo foVar4 = ra1Var.R;
        if (foVar4.getSubtitleTextView() != null) {
            foVar4.getSubtitleTextView().setVisibility(8);
        }
        hg.c.x(false, ra1Var.actionBar);
        ra1Var.actionBar.setActionBarMenuOnItemClick(new o81(ra1Var, 1));
        ra1Var.R.i(org.telegram.ui.ActionBar.h6.w0(null, i13, false), org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        ra1Var.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i13, false), false);
        ra1Var.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i13, false), true);
        ra1Var.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19191z8, false), false);
        ra1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
        boolean z16 = ra1Var.f36783x0;
        x5 x5Var = ra1Var.B0;
        if (z16) {
            ra1Var.f36755b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(x5Var, 500L);
            ra1Var.f36755b0.setVisibility(0);
            ra1Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            ra1Var.f36755b0.setVisibility(8);
            ra1Var.S.setVisibility(0);
        }
        ch.d c10 = cVar.c(ra1Var.m0, eh.b.f(ra1Var.resourceProvider), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.666f));
        ra1Var.m0.setBackground(c10);
        ra1Var.c0();
        ra1Var.f36785y0 = new ea1(ra1Var.X, ra1Var.U);
        return ra1Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.n2 n2Var2;
        org.telegram.ui.ActionBar.n2 n2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ai.d9) objArr[0]) == this.f36786z0) {
                j0();
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f36785y0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    n2Var = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.q3.g(2, fragmentStack);
                } else {
                    n2Var = null;
                }
                if (n2Var instanceof so) {
                    ((ActionBarLayout) getParentLayout()).a0(n2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    n2Var2 = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.q3.g(2, fragmentStack2);
                } else {
                    n2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        n2Var3 = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.q3.g(3, fragmentStack2);
                    }
                    if (n2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(n2Var2, false);
                    }
                    finishFragment();
                    if (n2Var3 instanceof xn) {
                        tg.k.f(n2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (n2Var2 instanceof ProfileActivity) {
                    tg.k.f(n2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f36774r0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f36771p0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((oa1) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((oa1) arrayList.get(i14));
                        } else {
                            ((oa1) arrayList.get(i14)).f35755b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f36776s0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    oa1 oa1Var = (oa1) arrayList.get(i12);
                    if (oa1Var.f35755b == null) {
                        this.f36770o0 = oa1Var.b();
                        break;
                    } else {
                        arrayList4.add(oa1Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f36785y0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18084id == this.f36754b && this.f36752a == null) {
                this.f36752a = chatFull;
                i0();
            }
        }
    }

    public final void g0(da1[] da1VarArr) {
        w91 w91Var = this.X;
        if (w91Var != null) {
            w91Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.f36783x0 = false;
        LinearLayout linearLayout = this.f36755b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.B0);
            this.f36755b0.animate().alpha(0.0f).setDuration(230L).setListener(new wq0(this, 21));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (da1 da1Var : da1VarArr) {
                if (da1Var != null && da1Var.d == null && da1Var.f32554f != null) {
                    da1Var.a(this.currentAccount, this.classGuid, this.f36752a.stats_dc, new org.telegram.ui.Components.r51(1, this, da1Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.i5 i5Var;
        da1 da1Var;
        da1 da1Var2;
        qy0 qy0Var = new qy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f18733a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.f18895j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{org.telegram.ui.Cells.d8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 0, new Class[]{kg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.f18859h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.f18789d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.f19189z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.h6.f19191z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.f18753b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.f19153x6));
        int i13 = org.telegram.ui.ActionBar.h6.f19008p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, i13));
        org.telegram.ui.Components.fo foVar = this.R;
        if (foVar != null) {
            i5Var = foVar.getTitleTextView();
        } else {
            i5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(i5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Oi));
        org.telegram.ui.Components.fo foVar2 = this.R;
        if (foVar2 != null) {
            view2 = foVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.h6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.h6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f18953m6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19100u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19118v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.f36757c0) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    da1Var2 = this.d;
                } else if (i14 == 1) {
                    da1Var2 = this.H;
                } else if (i14 == 2) {
                    da1Var2 = this.I;
                } else if (i14 == 3) {
                    da1Var2 = this.J;
                } else if (i14 == 4) {
                    da1Var2 = this.K;
                } else {
                    da1Var2 = this.L;
                }
                k0(da1Var2, arrayList, qy0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    da1Var = this.d;
                } else if (i15 == 1) {
                    da1Var = this.h;
                } else if (i15 == 2) {
                    da1Var = this.f36768n;
                } else if (i15 == 3) {
                    da1Var = this.f36773r;
                } else if (i15 == 4) {
                    da1Var = this.f36775s;
                } else if (i15 == 5) {
                    da1Var = this.v;
                } else if (i15 == 6) {
                    da1Var = this.f36782x;
                } else if (i15 == 7) {
                    da1Var = this.e;
                } else if (i15 == 8) {
                    da1Var = this.f36780w;
                } else if (i15 == 9) {
                    da1Var = this.f36784y;
                } else if (i15 == 10) {
                    da1Var = this.E;
                } else {
                    da1Var = this.F;
                }
                k0(da1Var, arrayList, qy0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f18121id = new ArrayList<>();
        ArrayList arrayList = this.f36774r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f36771p0.get(this.f36770o0); i11 < size; i11++) {
            if (((oa1) arrayList.get(i11)).f35755b == null) {
                tL_channels_getMessages.f18121id.add(Integer.valueOf(((oa1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f36754b);
        this.f36781w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new n91(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f36767l0) {
            return;
        }
        boolean z10 = this.f36757c0;
        long j3 = this.f36754b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new n91(this, 1), null, null, 0, this.f36752a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false)) <= 0.699999988079071d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ci.i1 i1Var = this.f36764i0;
        if (i1Var != null && (i1Var.f24569b != 0 || i1Var.f24570c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f36778u0;
        arrayList.clear();
        ArrayList arrayList2 = this.f36777t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            oa1 oa1Var = (oa1) obj;
            MessageObject f7 = this.f36786z0.f(oa1Var.b());
            if (f7 != null) {
                oa1Var.f35755b = f7;
                arrayList.add(oa1Var);
            }
        }
        this.f36772q0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.f36769n0;
            if (i11 < bVarArr.length) {
                oh.b bVar = bVarArr[i11];
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.e(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void n0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.f36769n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            oh.b bVar = this.f36769n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.m0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f36779v0;
        arrayList.clear();
        arrayList.addAll(this.f36776s0);
        arrayList.addAll(this.f36778u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ai.l9 storiesController = getMessagesController().getStoriesController();
        long j3 = this.f36754b;
        ai.d9 A = storiesController.A(-j3, 2, -1, true);
        this.f36786z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.f36752a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j3, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.f36763h0;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
            b2VarArr[0] = null;
        }
        ai.d9 d9Var = this.f36786z0;
        if (d9Var != null) {
            d9Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
