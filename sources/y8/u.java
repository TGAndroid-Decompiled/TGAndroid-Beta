package y8;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
public final class u extends Fragment {
    public static final int d = 0;
    public int f61118a;
    public t f61119b;
    public boolean f61120c;

    public final void a(Task task) {
        if (!this.f61120c) {
            int i7 = 1;
            this.f61120c = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (task != null) {
                int i10 = this.f61118a;
                int i11 = a.f61041c;
                if (activity.isFinishing()) {
                    if (Log.isLoggable("AutoResolveHelper", 3)) {
                        Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                        return;
                    }
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof com.google.android.gms.common.api.p) {
                    try {
                        ((com.google.android.gms.common.api.p) exception).getStatus().c(activity, i10);
                        return;
                    } catch (IntentSender.SendIntentException e10) {
                        if (Log.isLoggable("AutoResolveHelper", 6)) {
                            Log.e("AutoResolveHelper", "Error starting pending intent!", e10);
                            return;
                        }
                        return;
                    }
                }
                Intent intent = new Intent();
                if (task.isSuccessful()) {
                    i iVar = (i) task.getResult();
                    iVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    iVar.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
                    i7 = -1;
                } else if (exception instanceof com.google.android.gms.common.api.f) {
                    com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) exception;
                    intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(fVar.getStatusCode(), fVar.getMessage(), null, null));
                } else {
                    if (Log.isLoggable("AutoResolveHelper", 6)) {
                        Log.e("AutoResolveHelper", "Unexpected non API exception!", exception);
                    }
                    intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
                }
                a.b(activity, i10, i7, intent);
                return;
            }
            a.b(activity, this.f61118a, 0, new Intent());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f61118a = getArguments().getInt("requestCode");
        if (a.f61040b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f61119b = null;
        } else {
            this.f61119b = (t) t.f61113e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z10 = true;
        }
        this.f61120c = z10;
    }

    @Override
    public final void onPause() {
        super.onPause();
        t tVar = this.f61119b;
        if (tVar != null && tVar.f61116b == this) {
            tVar.f61116b = null;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        t tVar = this.f61119b;
        if (tVar != null) {
            tVar.f61116b = this;
            tVar.a();
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        a(null);
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f61120c);
        t tVar = this.f61119b;
        if (tVar != null && tVar.f61116b == this) {
            tVar.f61116b = null;
        }
    }
}
