package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class ty extends org.telegram.ui.ActionBar.j {
    public final zy f38255a;

    public ty(zy zyVar) {
        this.f38255a = zyVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        zy zyVar = this.f38255a;
        int i12 = zyVar.f40602w;
        ArrayList arrayList = zyVar.e;
        int i13 = zyVar.f40603x;
        if (i10 == -1) {
            if (zyVar.f40604y == null) {
                zyVar.Y();
            } else {
                zyVar.finishFragment();
            }
        } else if (i10 == 1 && zyVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            zyVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = zyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.m2) zyVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(zyVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(zyVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(zyVar.getParentActivity(), appWidgetManager, i13);
            }
            z0 z0Var = zyVar.f40604y;
            if (z0Var != null) {
                int i15 = z0Var.f40300a;
                Object obj = z0Var.f40301b;
                switch (i15) {
                    case 25:
                        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                        int i16 = ChatsWidgetConfigActivity.F;
                        Intent intent = new Intent();
                        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
                        chatsWidgetConfigActivity.setResult(-1, intent);
                        chatsWidgetConfigActivity.finish();
                        return;
                    default:
                        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                        int i17 = ContactsWidgetConfigActivity.F;
                        Intent intent2 = new Intent();
                        intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
                        contactsWidgetConfigActivity.setResult(-1, intent2);
                        contactsWidgetConfigActivity.finish();
                        return;
                }
            }
            zyVar.Y();
        }
    }
}
