/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class SoftBodyConfigData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SoftBodyConfigData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SoftBodyConfigData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_SoftBodyConfigData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_aeroModel(int value) {
    gdxBulletJNI.SoftBodyConfigData_m_aeroModel_set(swigCPtr, this, value);
  }

  public int getM_aeroModel() {
    return gdxBulletJNI.SoftBodyConfigData_m_aeroModel_get(swigCPtr, this);
  }

  public void setM_baumgarte(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_baumgarte_set(swigCPtr, this, value);
  }

  public float getM_baumgarte() {
    return gdxBulletJNI.SoftBodyConfigData_m_baumgarte_get(swigCPtr, this);
  }

  public void setM_damping(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_damping_set(swigCPtr, this, value);
  }

  public float getM_damping() {
    return gdxBulletJNI.SoftBodyConfigData_m_damping_get(swigCPtr, this);
  }

  public void setM_drag(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_drag_set(swigCPtr, this, value);
  }

  public float getM_drag() {
    return gdxBulletJNI.SoftBodyConfigData_m_drag_get(swigCPtr, this);
  }

  public void setM_lift(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_lift_set(swigCPtr, this, value);
  }

  public float getM_lift() {
    return gdxBulletJNI.SoftBodyConfigData_m_lift_get(swigCPtr, this);
  }

  public void setM_pressure(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_pressure_set(swigCPtr, this, value);
  }

  public float getM_pressure() {
    return gdxBulletJNI.SoftBodyConfigData_m_pressure_get(swigCPtr, this);
  }

  public void setM_volume(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_volume_set(swigCPtr, this, value);
  }

  public float getM_volume() {
    return gdxBulletJNI.SoftBodyConfigData_m_volume_get(swigCPtr, this);
  }

  public void setM_dynamicFriction(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_dynamicFriction_set(swigCPtr, this, value);
  }

  public float getM_dynamicFriction() {
    return gdxBulletJNI.SoftBodyConfigData_m_dynamicFriction_get(swigCPtr, this);
  }

  public void setM_poseMatch(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_poseMatch_set(swigCPtr, this, value);
  }

  public float getM_poseMatch() {
    return gdxBulletJNI.SoftBodyConfigData_m_poseMatch_get(swigCPtr, this);
  }

  public void setM_rigidContactHardness(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_rigidContactHardness_set(swigCPtr, this, value);
  }

  public float getM_rigidContactHardness() {
    return gdxBulletJNI.SoftBodyConfigData_m_rigidContactHardness_get(swigCPtr, this);
  }

  public void setM_kineticContactHardness(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_kineticContactHardness_set(swigCPtr, this, value);
  }

  public float getM_kineticContactHardness() {
    return gdxBulletJNI.SoftBodyConfigData_m_kineticContactHardness_get(swigCPtr, this);
  }

  public void setM_softContactHardness(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_softContactHardness_set(swigCPtr, this, value);
  }

  public float getM_softContactHardness() {
    return gdxBulletJNI.SoftBodyConfigData_m_softContactHardness_get(swigCPtr, this);
  }

  public void setM_anchorHardness(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_anchorHardness_set(swigCPtr, this, value);
  }

  public float getM_anchorHardness() {
    return gdxBulletJNI.SoftBodyConfigData_m_anchorHardness_get(swigCPtr, this);
  }

  public void setM_softRigidClusterHardness(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_softRigidClusterHardness_set(swigCPtr, this, value);
  }

  public float getM_softRigidClusterHardness() {
    return gdxBulletJNI.SoftBodyConfigData_m_softRigidClusterHardness_get(swigCPtr, this);
  }

  public void setM_softKineticClusterHardness(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_softKineticClusterHardness_set(swigCPtr, this, value);
  }

  public float getM_softKineticClusterHardness() {
    return gdxBulletJNI.SoftBodyConfigData_m_softKineticClusterHardness_get(swigCPtr, this);
  }

  public void setM_softSoftClusterHardness(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_softSoftClusterHardness_set(swigCPtr, this, value);
  }

  public float getM_softSoftClusterHardness() {
    return gdxBulletJNI.SoftBodyConfigData_m_softSoftClusterHardness_get(swigCPtr, this);
  }

  public void setM_softRigidClusterImpulseSplit(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_softRigidClusterImpulseSplit_set(swigCPtr, this, value);
  }

  public float getM_softRigidClusterImpulseSplit() {
    return gdxBulletJNI.SoftBodyConfigData_m_softRigidClusterImpulseSplit_get(swigCPtr, this);
  }

  public void setM_softKineticClusterImpulseSplit(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_softKineticClusterImpulseSplit_set(swigCPtr, this, value);
  }

  public float getM_softKineticClusterImpulseSplit() {
    return gdxBulletJNI.SoftBodyConfigData_m_softKineticClusterImpulseSplit_get(swigCPtr, this);
  }

  public void setM_softSoftClusterImpulseSplit(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_softSoftClusterImpulseSplit_set(swigCPtr, this, value);
  }

  public float getM_softSoftClusterImpulseSplit() {
    return gdxBulletJNI.SoftBodyConfigData_m_softSoftClusterImpulseSplit_get(swigCPtr, this);
  }

  public void setM_maxVolume(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_maxVolume_set(swigCPtr, this, value);
  }

  public float getM_maxVolume() {
    return gdxBulletJNI.SoftBodyConfigData_m_maxVolume_get(swigCPtr, this);
  }

  public void setM_timeScale(float value) {
    gdxBulletJNI.SoftBodyConfigData_m_timeScale_set(swigCPtr, this, value);
  }

  public float getM_timeScale() {
    return gdxBulletJNI.SoftBodyConfigData_m_timeScale_get(swigCPtr, this);
  }

  public void setM_velocityIterations(int value) {
    gdxBulletJNI.SoftBodyConfigData_m_velocityIterations_set(swigCPtr, this, value);
  }

  public int getM_velocityIterations() {
    return gdxBulletJNI.SoftBodyConfigData_m_velocityIterations_get(swigCPtr, this);
  }

  public void setM_positionIterations(int value) {
    gdxBulletJNI.SoftBodyConfigData_m_positionIterations_set(swigCPtr, this, value);
  }

  public int getM_positionIterations() {
    return gdxBulletJNI.SoftBodyConfigData_m_positionIterations_get(swigCPtr, this);
  }

  public void setM_driftIterations(int value) {
    gdxBulletJNI.SoftBodyConfigData_m_driftIterations_set(swigCPtr, this, value);
  }

  public int getM_driftIterations() {
    return gdxBulletJNI.SoftBodyConfigData_m_driftIterations_get(swigCPtr, this);
  }

  public void setM_clusterIterations(int value) {
    gdxBulletJNI.SoftBodyConfigData_m_clusterIterations_set(swigCPtr, this, value);
  }

  public int getM_clusterIterations() {
    return gdxBulletJNI.SoftBodyConfigData_m_clusterIterations_get(swigCPtr, this);
  }

  public void setM_collisionFlags(int value) {
    gdxBulletJNI.SoftBodyConfigData_m_collisionFlags_set(swigCPtr, this, value);
  }

  public int getM_collisionFlags() {
    return gdxBulletJNI.SoftBodyConfigData_m_collisionFlags_get(swigCPtr, this);
  }

  public SoftBodyConfigData() {
    this(gdxBulletJNI.new_SoftBodyConfigData(), true);
  }

}
