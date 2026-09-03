package u0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
public final class i implements ActionMode.Callback {
    public final ActionMode.Callback f48257a;
    public final TextView f48258b;
    public Class f48259c;
    public Method d;
    public boolean f48260e;
    public boolean f48261f = false;

    public i(ActionMode.Callback callback, TextView textView) {
        this.f48257a = callback;
        this.f48258b = textView;
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f48257a.onActionItemClicked(actionMode, menuItem);
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f48257a.onCreateActionMode(actionMode, menu);
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f48257a.onDestroyActionMode(actionMode);
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method declaredMethod;
        boolean z4;
        TextView textView = this.f48258b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z10 = this.f48261f;
        Class<?> cls = Integer.TYPE;
        if (!z10) {
            this.f48261f = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f48259c = cls2;
                this.d = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f48260e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f48259c = null;
                this.d = null;
                this.f48260e = false;
            }
        }
        try {
            if (this.f48260e && this.f48259c.isInstance(menu)) {
                declaredMethod = this.d;
            } else {
                declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", cls);
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i10);
                MenuItem add = menu.add(0, 0, i10 + 100, resolveInfo2.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z4);
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f48257a.onPrepareActionMode(actionMode, menu);
    }
}
