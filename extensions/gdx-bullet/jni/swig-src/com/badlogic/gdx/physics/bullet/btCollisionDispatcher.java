/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCollisionDispatcher extends btDispatcher {
  private long swigCPtr;

  protected btCollisionDispatcher(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btCollisionDispatcher_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btCollisionDispatcher obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btCollisionDispatcher(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int getDispatcherFlags() {
    return gdxBulletJNI.btCollisionDispatcher_getDispatcherFlags(swigCPtr, this);
  }

  public void setDispatcherFlags(int flags) {
    gdxBulletJNI.btCollisionDispatcher_setDispatcherFlags(swigCPtr, this, flags);
  }

  public void registerCollisionCreateFunc(int proxyType0, int proxyType1, btCollisionAlgorithmCreateFunc createFunc) {
    gdxBulletJNI.btCollisionDispatcher_registerCollisionCreateFunc(swigCPtr, this, proxyType0, proxyType1, btCollisionAlgorithmCreateFunc.getCPtr(createFunc), createFunc);
  }

  public btPersistentManifold getManifoldByIndexInternal(int index) {
    long cPtr = gdxBulletJNI.btCollisionDispatcher_getManifoldByIndexInternal__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
  }

  public btCollisionDispatcher(btCollisionConfiguration collisionConfiguration) {
    this(gdxBulletJNI.new_btCollisionDispatcher(btCollisionConfiguration.getCPtr(collisionConfiguration), collisionConfiguration), true);
  }

  public btCollisionAlgorithm findAlgorithm(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap, btPersistentManifold sharedManifold) {
    long cPtr = gdxBulletJNI.btCollisionDispatcher_findAlgorithm__SWIG_0(swigCPtr, this, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, btPersistentManifold.getCPtr(sharedManifold), sharedManifold);
    return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
  }

  public btCollisionAlgorithm findAlgorithm(btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap) {
    long cPtr = gdxBulletJNI.btCollisionDispatcher_findAlgorithm__SWIG_1(swigCPtr, this, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap);
    return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
  }

  public void setNearCallback(SWIGTYPE_p_f_r_btBroadphasePair_r_btCollisionDispatcher_r_q_const__btDispatcherInfo__void nearCallback) {
    gdxBulletJNI.btCollisionDispatcher_setNearCallback(swigCPtr, this, SWIGTYPE_p_f_r_btBroadphasePair_r_btCollisionDispatcher_r_q_const__btDispatcherInfo__void.getCPtr(nearCallback));
  }

  public SWIGTYPE_p_f_r_btBroadphasePair_r_btCollisionDispatcher_r_q_const__btDispatcherInfo__void getNearCallback() {
    long cPtr = gdxBulletJNI.btCollisionDispatcher_getNearCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_r_btBroadphasePair_r_btCollisionDispatcher_r_q_const__btDispatcherInfo__void(cPtr, false);
  }

  public static void defaultNearCallback(btBroadphasePair collisionPair, btCollisionDispatcher dispatcher, btDispatcherInfo dispatchInfo) {
    gdxBulletJNI.btCollisionDispatcher_defaultNearCallback(btBroadphasePair.getCPtr(collisionPair), collisionPair, btCollisionDispatcher.getCPtr(dispatcher), dispatcher, btDispatcherInfo.getCPtr(dispatchInfo), dispatchInfo);
  }

  public btCollisionConfiguration getCollisionConfiguration() {
    long cPtr = gdxBulletJNI.btCollisionDispatcher_getCollisionConfiguration__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionConfiguration(cPtr, false);
  }

  public void setCollisionConfiguration(btCollisionConfiguration config) {
    gdxBulletJNI.btCollisionDispatcher_setCollisionConfiguration(swigCPtr, this, btCollisionConfiguration.getCPtr(config), config);
  }

  public btPoolAllocator getInternalManifoldPool() {
    long cPtr = gdxBulletJNI.btCollisionDispatcher_getInternalManifoldPool__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btPoolAllocator(cPtr, false);
  }

  public final static class DispatcherFlags {
    public final static int CD_STATIC_STATIC_REPORTED = 1;
    public final static int CD_USE_RELATIVE_CONTACT_BREAKING_THRESHOLD = 2;
    public final static int CD_DISABLE_CONTACTPOOL_DYNAMIC_ALLOCATION = 4;
  }

}
